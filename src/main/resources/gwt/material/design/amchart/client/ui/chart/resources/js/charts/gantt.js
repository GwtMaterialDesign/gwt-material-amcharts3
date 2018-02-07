(function () {
    var b = window.AmCharts;
    b.AmGanttChart = b.Class({
        inherits: b.AmSerialChart,
        construct: function (a) {
            this.type = "gantt";
            b.AmGanttChart.base.construct.call(this, a);
            this.cname = "AmGanttChart";
            this.period = "ss";
            this.maxZoomFactor = 1E6
        },
        initChart: function () {
            this.dataChanged && this.processGanttData();
            b.AmGanttChart.base.initChart.call(this)
        },
        parseData: function () {
            b.AmSerialChart.base.parseData.call(this);
            this.parseSerialData(this.ganttDataProvider)
        },
        processGanttData: function () {
            var a;
            this.graphs = [];
            var v =
                this.dataProvider;
            this.ganttDataProvider = [];
            var z = this.categoryField,
                C = this.startField,
                D = this.endField,
                E = this.durationField,
                F = this.startDateField,
                G = this.endDateField,
                w = this.colorField,
                q = b.extractPeriod(this.period),
                f = q.period,
                q = q.count,
                r = this.dataDateFormat,
                t = b.getDate(this.startDate, r, "fff");
            this.categoryAxis.gridPosition = "start";
            a = this.valueAxis;
            this.valueAxes = [a];
            var A;
            "date" == a.type && (A = !0);
            a.minimumDate && (a.minimumDate = b.getDate(a.minimumDate, r, f));
            a.maximumDate && (a.maximumDate = b.getDate(a.maximumDate,
                r, f));
            isNaN(a.minimum) || (a.minimumDate = b.changeDate(new Date(t), f, a.minimum, !0, !0));
            isNaN(a.maximum) || (a.maximumDate = b.changeDate(new Date(t), f, a.maximum, !0, !0));
            if (v)
                for (a = 0; a < v.length; a++) {
                    var e = v[a],
                        l = {};
                    l[z] = e[z];
                    var x = e[this.segmentsField],
                        u;
                    this.ganttDataProvider.push(l);
                    e = e[w];
                    this.colors[a] || (this.colors[a] = b.randomColor());
                    if (x)
                        for (var g = 0; g < x.length; g++) {
                            var d = x[g],
                                c = d[C],
                                h = d[D],
                                m = d[E];
                            isNaN(c) && (c = u);
                            isNaN(m) || (h = c + m);
                            var m = "start_" + a + "_" + g,
                                y = "end_" + a + "_" + g;
                            l[m] = c;
                            l[y] = h;
                            var n = "lineColor color alpha fillColors description bullet customBullet bulletSize bulletConfig url labelColor dashLength pattern gap className".split(" "),
                                k, p;
                            for (p in n) k = n[p] + "Field", (u = this.graph[k]) && void 0 !== d[u] && (l[n[p] + "_" + a + "_" + g] = d[u]);
                            u = h;
                            if (A) {
                                k = b.getDate(d[F], r, f);
                                var B = b.getDate(d[G], r, f);
                                t && (isNaN(c) || (k = b.changeDate(b.newDate(t, "fff"), f, c * q, !0, !0)), isNaN(h) || (B = b.changeDate(b.newDate(t, "fff"), f, h * q, !0, !0)));
                                l[m] = k.getTime();
                                l[y] = B.getTime()
                            }
                            h = {};
                            b.copyProperties(d, h);
                            c = {};
                            b.copyProperties(this.graph, c, !0);
                            for (p in n) k = n[p] + "Field", this.graph[k] && (c[k] = n[p] + "_" + a + "_" + g);
                            c.customData = h;
                            c.segmentData = d;
                            c.labelFunction = this.graph.labelFunction;
                            c.balloonFunction = this.graph.balloonFunction;
                            c.customBullet = this.graph.customBullet;
                            c.type = "column";
                            c.openField = m;
                            c.valueField = y;
                            c.clustered = !1;
                            d[w] && (e = d[w]);
                            c.columnWidth = d[this.columnWidthField];
                            void 0 === e && (e = this.colors[a]);
                            (d = this.brightnessStep) && (e = b.adjustLuminosity(e, g * d / 100));
                            void 0 === this.graph.lineColor && (c.lineColor = e);
                            void 0 === this.graph.fillColors && (c.fillColors = e);
                            this.graphs.push(c)
                        }
                }
        }
    })
})();