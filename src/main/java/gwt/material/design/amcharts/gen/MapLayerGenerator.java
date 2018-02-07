/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2018 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package gwt.material.design.amcharts.gen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.TimeZone;

public class MapLayerGenerator {

    public static void main(String[] args) throws IOException {
        generateMapLayerEnums();
        generateMapClientBundle();
    }

    protected static void generateMapLayerEnums() throws IOException {
        System.out.println("Generating MapLayer enum constants.");
        StringBuilder builder = new StringBuilder();
        String path = "src/main/resources/gwt/material/design/amcharts/client/ui/maps/resources/layers/";

        // Retrieve all js map files
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();

        if (!folder.isDirectory()) {
            throw new FileNotFoundException(folder.getAbsolutePath());
        }

        Arrays.sort(listOfFiles);

        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                String fileName = listOfFiles[i].getName();

                builder.append("\n    ").append(fileName.replaceAll("([^_A-Z])([A-Z])", "$1_$2").replace(".js", "").toUpperCase() +
                        "(\"" + fileName.replace(".js", "") + "\", MapLayerClientBundle.INSTANCE." + fileName.replace(".js", "Js") + "().getText())");

                if (i == listOfFiles.length - 1) {
                    builder.append(";\n");
                } else {
                    builder.append(",\n");
                }
            }
        }


        // Look for Template File
        File template = new File("src/main/java/gwt/material/design/amcharts/gen/TemplateMapLayer.txt");
        if (!template.isFile()) {
            throw new FileNotFoundException(template.getAbsolutePath());
        }

        //loading the template java file
        String templateString = new String(Files.readAllBytes(Paths.get(template.toURI())), "UTF-8");
        templateString = templateString.replace("${generationDate}", getDateAsISO8601()).replace("${mapLayers}", builder.toString());

        //time to write it to the destination
        File target = new File("src/main/java/gwt/material/design/amcharts/client/ui/maps/base/constants/MapLayer.java");
        Files.write(Paths.get(target.toURI()), templateString.getBytes("UTF-8"));

        System.out.println("Successfully generated MapLayer enum constants.");
    }

    protected static void generateMapClientBundle() throws IOException {
        System.out.println("Generating MapClientBundle.");
        StringBuilder builder = new StringBuilder();
        String path = "src/main/resources/gwt/material/design/amcharts/client/ui/maps/resources/layers/";

        // Retrieve all js map files
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();

        if (!folder.isDirectory()) {
            throw new FileNotFoundException(folder.getAbsolutePath());
        }

        Arrays.sort(listOfFiles);

        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {

                String fileName = listOfFiles[i].getName();

                builder.append("\n    ").append("@Source(\"layers/" + fileName + "\") " +
                        "\n    TextResource " + fileName.replace(".js", "Js") + "();\n\n");
            }
        }

        // Look for Template File
        File template = new File("src/main/java/gwt/material/design/amcharts/gen/TemplateClientBundle.txt");
        if (!template.isFile()) {
            throw new FileNotFoundException(template.getAbsolutePath());
        }

        //loading the template java file
        String templateString = new String(Files.readAllBytes(Paths.get(template.toURI())), "UTF-8");
        templateString = templateString.replace("${generationDate}", getDateAsISO8601()).replace("${mapLayers}", builder.toString());

        //time to write it to the destination
        File target = new File("src/main/java/gwt/material/design/amcharts/client/ui/maps/resources/MapLayerClientBundle.java");
        Files.write(Paths.get(target.toURI()), templateString.getBytes("UTF-8"));
        System.out.println("Successfully generated MapClientBundle.");
    }

    /*
     * Needed by the @Generated annotation
     */
    private static String getDateAsISO8601() {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        df.setTimeZone(tz);
        return df.format(new Date());
    }
}
