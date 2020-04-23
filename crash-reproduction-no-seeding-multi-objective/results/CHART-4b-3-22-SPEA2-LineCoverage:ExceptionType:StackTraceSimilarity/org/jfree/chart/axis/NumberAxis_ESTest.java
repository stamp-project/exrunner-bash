/*

 * Mon Apr 20 11:48:06 UTC 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.xy.DefaultTableXYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class NumberAxis_ESTest extends NumberAxis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NumberAxis.createIntegerTickUnits();
      NumberAxis numberAxis0 = new NumberAxis();
      numberAxis0.setVerticalTickLabels(false);
      numberAxis0.getTickUnit();
      numberAxis0.getTickMarkInsideLength();
      numberAxis0.setMinorTickCount((-1));
      numberAxis0.getTickLabelPaint();
      numberAxis0.getAutoRangeMinimumSize();
      numberAxis0.isTickMarksVisible();
      numberAxis0.isVerticalTickLabels();
      numberAxis0.setMinorTickMarkInsideLength(0.0F);
      numberAxis0.getAxisLineStroke();
      numberAxis0.getDefaultAutoRange();
      numberAxis0.configure();
      NumberAxis numberAxis1 = new NumberAxis();
      numberAxis0.pan(1.0E-8);
      numberAxis0.setLowerBound((-1));
      String string0 = "DateTickMarkPosition.END";
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset();
      XYPlot xYPlot0 = new XYPlot(defaultTableXYDataset0, numberAxis1, numberAxis0, (XYItemRenderer) null);
  }
}
