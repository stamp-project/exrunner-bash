/*

 * Mon Apr 20 11:49:42 UTC 2020
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
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.xy.XYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "DR";
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn("DR", "DR").when(xYDataset0).toString();
      doReturn(7225).when(xYDataset0).getSeriesCount();
      doReturn(0, 0, 0, 0, 0).when(xYDataset0).getItemCount(anyInt());
      ValueAxis valueAxis0 = mock(ValueAxis.class, new ViolatedAssumptionAnswer());
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      XYItemRenderer xYItemRenderer0 = null;
      NumberAxis3D numberAxis3D1 = new NumberAxis3D();
      XYPlot xYPlot0 = new XYPlot(xYDataset0, numberAxis3D1, numberAxis3D0, (XYItemRenderer) null);
  }
}
