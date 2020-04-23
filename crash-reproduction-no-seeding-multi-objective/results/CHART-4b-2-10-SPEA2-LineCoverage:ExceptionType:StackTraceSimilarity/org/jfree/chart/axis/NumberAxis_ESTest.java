/*

 * Mon Apr 20 11:40:23 UTC 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.geom.Rectangle2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.time.TimePeriodValues;
import org.jfree.data.time.TimePeriodValuesCollection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class NumberAxis_ESTest extends NumberAxis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis("");
      numberAxis0.autoAdjustRange();
      numberAxis0.setAutoTickUnitSelection(false);
      numberAxis0.setUpperMargin(20000.0);
      byte byte0 = (byte)23;
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      numberAxis0.getMarkerBand();
      combinedRangeCategoryPlot0.setRangeZeroBaselineVisible(true);
      double double0 = 20000.0;
      numberAxis0.setPlot(combinedRangeCategoryPlot0);
      Rectangle2D rectangle2D0 = null;
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection((TimePeriodValues) null);
      XYPlot xYPlot0 = new XYPlot(timePeriodValuesCollection0, numberAxis0, numberAxis0, (XYItemRenderer) null);
  }
}
