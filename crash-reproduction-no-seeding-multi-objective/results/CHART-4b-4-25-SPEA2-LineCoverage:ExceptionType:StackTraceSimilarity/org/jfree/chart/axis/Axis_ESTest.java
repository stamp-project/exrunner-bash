/*

 * Mon Apr 20 11:48:26 UTC 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.statistics.SimpleHistogramDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Axis_ESTest extends Axis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(2637.78517894, 2637.78517894);
      cyclicNumberAxis0.getPlot();
      String string0 = "~";
      String string1 = "\u00B0K";
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset("\u00B0K");
      XYItemRenderer xYItemRenderer0 = null;
      XYPlot xYPlot0 = new XYPlot(simpleHistogramDataset0, cyclicNumberAxis0, cyclicNumberAxis0, (XYItemRenderer) null);
  }
}
