/*

 * Mon Apr 20 11:45:17 UTC 2020
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
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.FastScatterPlot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import org.jfree.data.xy.DefaultTableXYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset(false);
      ValueAxis valueAxis0 = mock(ValueAxis.class, new ViolatedAssumptionAnswer());
      int int0 = (-921);
      XYStepAreaRenderer xYStepAreaRenderer0 = new XYStepAreaRenderer((-921));
      XYPlot xYPlot0 = new XYPlot(defaultTableXYDataset0, valueAxis0, valueAxis0, xYStepAreaRenderer0);
      FastScatterPlot fastScatterPlot0 = new FastScatterPlot();
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      XYBoxAndWhiskerRenderer xYBoxAndWhiskerRenderer0 = new XYBoxAndWhiskerRenderer((-921));
      XYPlot xYPlot1 = new XYPlot(defaultTableXYDataset0, numberAxis3D0, numberAxis3D0, xYBoxAndWhiskerRenderer0);
      xYPlot1.getWeight();
      PeriodAxis periodAxis0 = new PeriodAxis("");
      XYPlot xYPlot2 = new XYPlot(defaultTableXYDataset0, numberAxis3D0, periodAxis0, (XYItemRenderer) null);
  }
}
