/*

 * Mon Apr 20 11:51:27 UTC 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.StackedXYBarRenderer;
import org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.xy.XIntervalSeriesCollection;
import org.jfree.data.xy.XYBarDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateAxis dateAxis0 = new DateAxis();
      XYBoxAndWhiskerRenderer xYBoxAndWhiskerRenderer0 = new XYBoxAndWhiskerRenderer();
      XIntervalSeriesCollection xIntervalSeriesCollection0 = new XIntervalSeriesCollection();
      XYBarDataset xYBarDataset0 = new XYBarDataset(xIntervalSeriesCollection0, (-17.92185122676577));
      DateAxis dateAxis1 = new DateAxis();
      StackedXYBarRenderer stackedXYBarRenderer0 = new StackedXYBarRenderer();
      XYPlot xYPlot0 = new XYPlot(xYBarDataset0, dateAxis1, dateAxis1, (XYItemRenderer) null);
  }
}
