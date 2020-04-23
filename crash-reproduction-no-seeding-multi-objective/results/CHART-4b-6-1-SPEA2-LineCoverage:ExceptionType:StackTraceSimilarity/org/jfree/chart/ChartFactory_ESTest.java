/*

 * Mon Apr 20 11:32:49 UTC 2020
 */

package org.jfree.chart;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.PolarPlot;
import org.jfree.data.general.DefaultKeyedValues2DDataset;
import org.jfree.data.xy.XIntervalSeriesCollection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class ChartFactory_ESTest extends ChartFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "";
      String string1 = "";
      DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
      PolarPlot polarPlot0 = new PolarPlot();
      PlotOrientation plotOrientation0 = polarPlot0.getOrientation();
      boolean boolean0 = true;
      ChartFactory.createStackedBarChart("", "", "", defaultKeyedValues2DDataset0, plotOrientation0, true, true, true);
      XIntervalSeriesCollection xIntervalSeriesCollection0 = new XIntervalSeriesCollection();
      boolean boolean1 = true;
      // Undeclared exception!
      ChartFactory.createScatterPlot("", "", "", xIntervalSeriesCollection0, plotOrientation0, true, true, true);
  }
}
