/*

 * Mon Apr 20 11:44:53 UTC 2020
 */

package org.jfree.chart;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.SimpleTimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.axis.ExtendedCategoryAxis;
import org.jfree.chart.axis.SegmentedTimeline;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.time.TimeSeriesCollection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class ChartFactory_ESTest extends ChartFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = (SimpleTimeZone)SegmentedTimeline.NO_DST_TIME_ZONE;
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(simpleTimeZone0);
      ExtendedCategoryAxis extendedCategoryAxis0 = new ExtendedCategoryAxis("N2=T");
      CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(extendedCategoryAxis0);
      PlotOrientation plotOrientation0 = combinedDomainCategoryPlot0.getOrientation();
      // Undeclared exception!
      ChartFactory.createScatterPlot((String) null, (String) null, (String) null, timeSeriesCollection0, plotOrientation0, false, false, false);
  }
}
