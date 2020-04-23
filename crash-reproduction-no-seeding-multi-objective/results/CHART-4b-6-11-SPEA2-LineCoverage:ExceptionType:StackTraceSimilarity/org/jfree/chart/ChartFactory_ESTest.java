/*

 * Mon Apr 20 11:39:10 UTC 2020
 */

package org.jfree.chart;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.MatrixSeriesCollection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class ChartFactory_ESTest extends ChartFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "YF/=,";
      String string1 = "\\w/";
      MatrixSeriesCollection matrixSeriesCollection0 = new MatrixSeriesCollection();
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot();
      PlotOrientation plotOrientation0 = combinedDomainCategoryPlot0.getOrientation();
      boolean boolean0 = false;
      // Undeclared exception!
      ChartFactory.createScatterPlot("YF/=,", "w/", "w/", matrixSeriesCollection0, plotOrientation0, true, false, false);
  }
}
