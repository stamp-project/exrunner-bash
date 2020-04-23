/*

 * Mon Apr 20 11:46:57 UTC 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.StackedXYAreaRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.xy.XYIntervalSeriesCollection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new XYIntervalSeriesCollection();
      ValueAxis valueAxis0 = null;
      StackedXYAreaRenderer stackedXYAreaRenderer0 = new StackedXYAreaRenderer();
      ValueAxis valueAxis1 = null;
      StackedXYAreaRenderer stackedXYAreaRenderer1 = null;
      XYPlot xYPlot0 = new XYPlot(xYIntervalSeriesCollection0, (ValueAxis) null, (ValueAxis) null, (XYItemRenderer) null);
      xYPlot0.getFixedRangeAxisSpace();
      // Undeclared exception!
      xYPlot0.getDataRange((ValueAxis) null);
  }
}
