/*

 * Mon Apr 20 11:40:12 UTC 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Paint;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.axis.AxisSpace;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.general.DefaultValueDataset;
import org.jfree.data.xy.XYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn("", "", "").when(xYDataset0).toString();
      doReturn(1625).when(xYDataset0).getSeriesCount();
      doReturn(1764, (-1), (-3908), (-1), (-3908)).when(xYDataset0).getItemCount(anyInt());
      doReturn((double)1625, (double)(-3908), (-4.0), (double)1764, 0.0).when(xYDataset0).getYValue(anyInt() , anyInt());
      ValueAxis valueAxis0 = mock(ValueAxis.class, new ViolatedAssumptionAnswer());
      ValueAxis valueAxis1 = null;
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset();
      ThermometerPlot thermometerPlot0 = new ThermometerPlot(defaultValueDataset0);
      ValueAxis valueAxis2 = thermometerPlot0.getRangeAxis();
      XYPlot xYPlot0 = new XYPlot(xYDataset0, valueAxis0, valueAxis2, (XYItemRenderer) null);
      Paint paint0 = xYPlot0.getRangeCrosshairPaint();
      xYPlot0.setRangeMinorGridlinePaint(paint0);
      xYPlot0.getInsets();
      xYPlot0.getFixedDomainAxisSpace();
      xYPlot0.setBackgroundImageAlignment((-3344));
      xYPlot0.setNoDataMessage("6-nLo3Yc+3E");
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      combinedDomainXYPlot0.setFixedRangeAxisSpace((AxisSpace) null, false);
      combinedDomainXYPlot0.getRangeCrosshairValue();
      // Undeclared exception!
      xYPlot0.getDataRange(valueAxis2);
  }
}
