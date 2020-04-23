/*

 * Mon Apr 20 11:47:23 UTC 2020
 */

package org.jfree.chart;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.DefaultTableXYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class ChartFactory_ESTest extends ChartFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      boolean boolean0 = false;
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset(false);
      PlotOrientation plotOrientation0 = PlotOrientation.HORIZONTAL;
      boolean boolean1 = true;
      // Undeclared exception!
      ChartFactory.createScatterPlot("Fs!4:i8P+NQ|?b", "Series Title", "Series Title", defaultTableXYDataset0, plotOrientation0, false, false, true);
  }
}
