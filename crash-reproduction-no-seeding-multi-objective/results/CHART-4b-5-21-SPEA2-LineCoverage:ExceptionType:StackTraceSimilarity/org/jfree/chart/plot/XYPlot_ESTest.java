/*

 * Mon Apr 20 11:46:07 UTC 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CombinedRangeXYPlot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.time.TimePeriodValuesCollection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection();
      ValueAxis valueAxis0 = mock(ValueAxis.class, new ViolatedAssumptionAnswer());
      XYPlot xYPlot0 = new XYPlot(timePeriodValuesCollection0, valueAxis0, valueAxis0, (XYItemRenderer) null);
      xYPlot0.configureDomainAxes();
      ValueAxis valueAxis1 = mock(ValueAxis.class, new ViolatedAssumptionAnswer());
      XYPlot xYPlot1 = new XYPlot(timePeriodValuesCollection0, valueAxis1, valueAxis1, (XYItemRenderer) null);
      boolean boolean0 = false;
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-142.08747035897), (-142.08747035897));
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot(cyclicNumberAxis0);
      combinedRangeXYPlot0.configureDomainAxes();
      XYPlot xYPlot2 = new XYPlot(timePeriodValuesCollection0, cyclicNumberAxis0, cyclicNumberAxis0, (XYItemRenderer) null);
  }
}
