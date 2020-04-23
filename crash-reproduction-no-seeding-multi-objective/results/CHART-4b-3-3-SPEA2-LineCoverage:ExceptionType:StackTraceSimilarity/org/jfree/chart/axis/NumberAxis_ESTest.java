/*

 * Mon Apr 20 11:36:20 UTC 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.LogarithmicAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.StackedXYBarRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.xy.XYSeriesCollection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class NumberAxis_ESTest extends NumberAxis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      numberAxis0.configure();
      numberAxis0.calculateVisibleTickCount();
      NumberAxis numberAxis1 = new NumberAxis();
      NumberTickUnit numberTickUnit0 = new NumberTickUnit((-104.4815900182));
      numberAxis1.setLabel("J_B'J0PAh");
      numberAxis1.getLabelPaint();
      NumberTickUnit numberTickUnit1 = new NumberTickUnit(1.0);
      numberAxis1.setTickUnit(numberTickUnit1);
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("J_B'J0PAh");
      logarithmicAxis0.setTickUnit(numberTickUnit1);
      XYSeriesCollection xYSeriesCollection0 = new XYSeriesCollection();
      StackedXYBarRenderer stackedXYBarRenderer0 = new StackedXYBarRenderer();
      XYPlot xYPlot0 = new XYPlot(xYSeriesCollection0, numberAxis1, numberAxis0, (XYItemRenderer) null);
  }
}
