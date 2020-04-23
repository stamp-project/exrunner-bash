/*

 * Mon Apr 20 11:39:53 UTC 2020
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
import org.jfree.data.xy.CategoryTableXYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Axis_ESTest extends Axis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "Ou-Tt";
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      NumberAxis numberAxis0 = new NumberAxis();
      XYPlot xYPlot0 = new XYPlot(categoryTableXYDataset0, numberAxis0, numberAxis0, (XYItemRenderer) null);
  }
}
