/*

 * Mon Apr 20 11:33:32 UTC 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.PolarPlot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.xy.XYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "";
      int int0 = (-3033);
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn("", "", "").when(xYDataset0).toString();
      doReturn((-3033)).when(xYDataset0).getSeriesCount();
      PolarPlot polarPlot0 = new PolarPlot();
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("");
      polarPlot0.getDataRange(numberAxis3D0);
      ValueAxis valueAxis0 = mock(ValueAxis.class, new ViolatedAssumptionAnswer());
      XYItemRenderer xYItemRenderer0 = mock(XYItemRenderer.class, new ViolatedAssumptionAnswer());
      XYPlot xYPlot0 = new XYPlot(xYDataset0, valueAxis0, numberAxis3D0, (XYItemRenderer) null);
  }
}
