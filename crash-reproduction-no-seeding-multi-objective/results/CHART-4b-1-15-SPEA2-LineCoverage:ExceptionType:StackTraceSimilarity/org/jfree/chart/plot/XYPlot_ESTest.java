/*

 * Mon Apr 20 11:43:13 UTC 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.SimpleTimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.LogAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.StackedXYAreaRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.time.TimeSeriesCollection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XYPlot xYPlot0 = new XYPlot();
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-951), "M;0j~e~~,4WP");
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection();
      LogAxis logAxis0 = new LogAxis();
      StackedXYAreaRenderer stackedXYAreaRenderer0 = new StackedXYAreaRenderer((-951));
      XYPlot xYPlot1 = new XYPlot(timeSeriesCollection0, logAxis0, logAxis0, (XYItemRenderer) null);
  }
}
