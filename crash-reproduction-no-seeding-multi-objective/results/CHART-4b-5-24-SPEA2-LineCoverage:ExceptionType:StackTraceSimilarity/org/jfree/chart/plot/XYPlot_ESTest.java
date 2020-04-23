/*

 * Mon Apr 20 11:47:13 UTC 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.BasicStroke;
import java.awt.Paint;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.plot.Marker;
import org.jfree.chart.plot.ValueMarker;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.DefaultPolarItemRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.util.Layer;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.XYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("");
      XYPlot xYPlot0 = new XYPlot((XYDataset) null, numberAxis3D0, numberAxis3D0, (XYItemRenderer) null);
      int int0 = (-1625);
      DefaultPolarItemRenderer defaultPolarItemRenderer0 = new DefaultPolarItemRenderer();
      Paint paint0 = defaultPolarItemRenderer0.getItemOutlinePaint((-11534511), 43, true);
      BasicStroke basicStroke0 = (BasicStroke)XYPlot.DEFAULT_CROSSHAIR_STROKE;
      ValueMarker valueMarker0 = new ValueMarker(7.0, paint0, basicStroke0);
      Layer layer0 = Layer.FOREGROUND;
      xYPlot0.removeDomainMarker((-1625), (Marker) valueMarker0, layer0, true);
      xYPlot0.getDrawingSupplier();
      xYPlot0.setRenderer(1, (XYItemRenderer) null);
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection();
      XYPlot xYPlot1 = new XYPlot(timeSeriesCollection0, numberAxis3D0, numberAxis3D0, (XYItemRenderer) null);
  }
}
