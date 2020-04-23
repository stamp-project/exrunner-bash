/*

 * Mon Apr 20 11:51:27 UTC 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.DeviationRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.time.TimeSeriesCollection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection();
      DeviationRenderer deviationRenderer0 = new DeviationRenderer(true, false);
      XYPlot xYPlot0 = new XYPlot(timeSeriesCollection0, (ValueAxis) null, (ValueAxis) null, deviationRenderer0);
      xYPlot0.setDomainPannable(false);
      XYPlot xYPlot1 = new XYPlot(timeSeriesCollection0, (ValueAxis) null, (ValueAxis) null, (XYItemRenderer) null);
      // Undeclared exception!
      xYPlot1.getDataRange((ValueAxis) null);
  }
}
