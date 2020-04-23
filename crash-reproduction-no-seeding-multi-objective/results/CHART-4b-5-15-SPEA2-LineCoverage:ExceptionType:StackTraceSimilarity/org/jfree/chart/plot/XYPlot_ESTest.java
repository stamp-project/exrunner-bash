/*

 * Mon Apr 20 11:42:42 UTC 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Font;
import java.awt.geom.Point2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.AbstractRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.xy.VectorSeriesCollection;
import org.jfree.data.xy.XYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn("#K{L$qWOyfm8G", "item").when(xYDataset0).toString();
      ValueAxis valueAxis0 = mock(ValueAxis.class, new ViolatedAssumptionAnswer());
      XYPlot xYPlot0 = new XYPlot(xYDataset0, valueAxis0, valueAxis0, (XYItemRenderer) null);
      XYPlot xYPlot1 = new XYPlot();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
      xYPlot1.zoomDomainAxes(0.05, plotRenderingInfo0, (Point2D) null, true);
      double double0 = 1.0E-6;
      Font font0 = AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
      Font.getFont(";hIoZ>", font0);
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("Empty list not permitted.");
      XYPlot xYPlot2 = new XYPlot(vectorSeriesCollection0, numberAxis3D0, numberAxis3D0, (XYItemRenderer) null);
  }
}
