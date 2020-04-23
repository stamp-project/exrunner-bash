/*

 * Mon Apr 20 11:47:58 UTC 2020
 */

package org.jfree.chart;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.general.PieDataset;
import org.jfree.data.general.WaferMapDataset;
import org.jfree.data.xy.DefaultTableXYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class ChartFactory_ESTest extends ChartFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "%, Bright ";
      WaferMapDataset waferMapDataset0 = new WaferMapDataset(0, 0);
      NumberAxis numberAxis0 = new NumberAxis();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(numberAxis0);
      PlotOrientation plotOrientation0 = combinedDomainXYPlot0.getOrientation();
      ChartFactory.createWaferMapChart("%, Bright ", waferMapDataset0, plotOrientation0, true, true, true);
      String string1 = " (+100%)";
      PieDataset pieDataset0 = mock(PieDataset.class, new ViolatedAssumptionAnswer());
      ChartFactory.createRingChart(" (+100%)", pieDataset0, true, false, true);
      boolean boolean0 = true;
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset(true);
      boolean boolean1 = true;
      // Undeclared exception!
      ChartFactory.createScatterPlot("%, Bright ", " (+100%)", " (+100%)", defaultTableXYDataset0, plotOrientation0, true, true, true);
  }
}
