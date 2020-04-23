/*

 * Mon Apr 20 11:43:54 UTC 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.geom.RoundRectangle2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.LogarithmicAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.StandardXYItemRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.time.TimeTableXYDataset;
import org.jfree.data.xy.DefaultXYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TimeTableXYDataset timeTableXYDataset0 = new TimeTableXYDataset();
      ValueAxis valueAxis0 = mock(ValueAxis.class, new ViolatedAssumptionAnswer());
      StandardXYItemRenderer standardXYItemRenderer0 = new StandardXYItemRenderer(0);
      XYPlot xYPlot0 = new XYPlot(timeTableXYDataset0, valueAxis0, valueAxis0, standardXYItemRenderer0);
      xYPlot0.setRangeMinorGridlinesVisible(false);
      ValueAxis valueAxis1 = mock(ValueAxis.class, new ViolatedAssumptionAnswer());
      xYPlot0.getDataRange(valueAxis1);
      RoundRectangle2D.Float roundRectangle2D_Float0 = new RoundRectangle2D.Float();
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      xYPlot0.getDataRange(logarithmicAxis0);
      xYPlot0.getDomainCrosshairPaint();
      xYPlot0.getDomainMinorGridlineStroke();
      xYPlot0.clearDomainMarkers();
      xYPlot0.getRenderer((-828));
      xYPlot0.getDomainCrosshairStroke();
      DefaultXYDataset defaultXYDataset0 = new DefaultXYDataset();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, 2.5E-4, "org.jfree.chart.plot.LocalizationBundle");
      XYPlot xYPlot1 = new XYPlot(defaultXYDataset0, logarithmicAxis0, cyclicNumberAxis0, (XYItemRenderer) null);
  }
}
