/*

 * Mon Apr 20 11:34:22 UTC 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.TickUnits;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class NumberAxis_ESTest extends NumberAxis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TickUnits tickUnits0 = new TickUnits();
      NumberAxis.createStandardTickUnits();
      String string0 = "l)7JK=D;N#z6\\4i;";
      NumberAxis numberAxis0 = new NumberAxis("l)7JK=D;N#z6\u0004i;");
      numberAxis0.autoAdjustRange();
      boolean boolean0 = true;
      numberAxis0.setPositiveArrowVisible(true);
      numberAxis0.getAutoTickIndex();
      XYSeries xYSeries0 = new XYSeries("l)7JK=D;N#z6\u0004i;", true);
      XYSeriesCollection xYSeriesCollection0 = new XYSeriesCollection(xYSeries0);
      XYPlot xYPlot0 = new XYPlot(xYSeriesCollection0, numberAxis0, numberAxis0, (XYItemRenderer) null);
  }
}
