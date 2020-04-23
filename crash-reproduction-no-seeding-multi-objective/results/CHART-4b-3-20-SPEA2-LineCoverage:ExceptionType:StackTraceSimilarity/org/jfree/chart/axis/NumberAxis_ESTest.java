/*

 * Mon Apr 20 11:46:24 UTC 2020
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
import org.jfree.data.xy.CategoryTableXYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class NumberAxis_ESTest extends NumberAxis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TickUnits tickUnits0 = new TickUnits();
      String string0 = "lN";
      NumberAxis numberAxis0 = new NumberAxis("lN");
      numberAxis0.isPositiveArrowVisible();
      numberAxis0.isTickMarksVisible();
      numberAxis0.isTickLabelsVisible();
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      categoryTableXYDataset0.getDomainLowerBound(true);
      XYPlot xYPlot0 = new XYPlot(categoryTableXYDataset0, numberAxis0, numberAxis0, (XYItemRenderer) null);
  }
}
