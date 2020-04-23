/*

 * Mon Apr 20 11:40:41 UTC 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.StackedXYAreaRenderer2;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.time.Quarter;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.TimePeriodValuesCollection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XYPlot xYPlot0 = new XYPlot();
      StackedXYAreaRenderer2 stackedXYAreaRenderer2_0 = new StackedXYAreaRenderer2();
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection();
      long long0 = (-182L);
      Date date0 = new Date((-182L));
      Quarter quarter0 = new Quarter(date0);
      RegularTimePeriod regularTimePeriod0 = quarter0.next();
      PeriodAxis periodAxis0 = new PeriodAxis("", regularTimePeriod0, regularTimePeriod0);
      XYPlot xYPlot1 = new XYPlot(timePeriodValuesCollection0, periodAxis0, periodAxis0, (XYItemRenderer) null);
  }
}
