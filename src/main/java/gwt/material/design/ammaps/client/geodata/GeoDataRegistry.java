package gwt.material.design.ammaps.client.geodata;

import com.google.gwt.resources.client.TextResource;

import java.util.HashMap;
import java.util.Map;

public class GeoDataRegistry {

    private static Map<String, TextResource> map = new HashMap<>();

    public static void register(String name, TextResource resource) {
        map.put(name, resource);
    }

    public static void unregister(String name) {
        map.remove(map.get(name));
    }

    public static void unregisterAll() {
        map.keySet().forEach(s -> unregister(s));
    }

    public static boolean contains(String name) {
        return map.containsKey(name);
    }

    public static TextResource get(String name) {
        return map.get(name);
    }
}
