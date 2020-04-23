/*

 * Mon Apr 20 11:37:33 UTC 2020
 */

package org.jfree.chart;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.data.general.WaferMapDataset;
import org.jfree.data.time.TimeTableXYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class ChartFactory_ESTest extends ChartFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "";
      String string1 = "0]";
      TimeTableXYDataset timeTableXYDataset0 = new TimeTableXYDataset();
      ThermometerPlot thermometerPlot0 = new ThermometerPlot();
      PlotOrientation plotOrientation0 = thermometerPlot0.getOrientation();
      boolean boolean0 = true;
      ChartFactory.createXYLineChart("", "", "0]", timeTableXYDataset0, plotOrientation0, true, true, true);
      WaferMapDataset waferMapDataset0 = new WaferMapDataset((-592), 0);
      ChartFactory.createWaferMapChart("", waferMapDataset0, plotOrientation0, true, true, false);
      boolean boolean1 = true;
      // Undeclared exception!
      ChartFactory.createScatterPlot("", "", "0]", timeTableXYDataset0, plotOrientation0, true, true, false);
  }
}
