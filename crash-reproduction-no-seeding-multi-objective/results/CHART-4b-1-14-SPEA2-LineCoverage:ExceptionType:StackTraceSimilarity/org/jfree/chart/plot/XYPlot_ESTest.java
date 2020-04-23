/*

 * Mon Apr 20 11:42:44 UTC 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.CyclicXYItemRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.data.xy.VectorSeriesCollection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XYPlot xYPlot0 = new XYPlot();
      ValueAxis valueAxis0 = mock(ValueAxis.class, new ViolatedAssumptionAnswer());
      xYPlot0.getDataRange(valueAxis0);
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      Rectangle2D.Double rectangle2D_Double0 = (Rectangle2D.Double)Plot.DEFAULT_LEGEND_ITEM_BOX;
      HistogramDataset histogramDataset0 = new HistogramDataset();
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("JAi6Q.ah?");
      NumberAxis numberAxis0 = new NumberAxis("JAi6Q.ah?");
      CyclicXYItemRenderer cyclicXYItemRenderer0 = new CyclicXYItemRenderer();
      XYPlot xYPlot1 = new XYPlot(histogramDataset0, numberAxis3D0, numberAxis0, cyclicXYItemRenderer0);
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      XYItemRenderer xYItemRenderer0 = null;
      XYPlot xYPlot2 = new XYPlot(histogramDataset0, numberAxis3D0, numberAxis0, (XYItemRenderer) null);
  }
}
