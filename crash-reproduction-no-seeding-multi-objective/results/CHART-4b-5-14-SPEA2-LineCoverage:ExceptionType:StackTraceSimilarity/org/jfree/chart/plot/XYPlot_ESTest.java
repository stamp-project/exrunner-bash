/*

 * Mon Apr 20 11:42:13 UTC 2020
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
import org.jfree.chart.axis.LogAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.xy.DefaultWindDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultWindDataset defaultWindDataset0 = new DefaultWindDataset();
      ValueAxis valueAxis0 = mock(ValueAxis.class, new ViolatedAssumptionAnswer());
      LogAxis logAxis0 = new LogAxis("aZ;>_DCTa=:qx");
      XYItemRenderer xYItemRenderer0 = null;
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(10.0);
      XYPlot xYPlot0 = new XYPlot(defaultWindDataset0, cyclicNumberAxis0, valueAxis0, (XYItemRenderer) null);
  }
}
