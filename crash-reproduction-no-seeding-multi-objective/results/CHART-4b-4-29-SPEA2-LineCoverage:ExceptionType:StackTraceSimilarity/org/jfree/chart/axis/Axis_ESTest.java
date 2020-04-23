/*

 * Mon Apr 20 11:53:45 GMT+00:00 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.xy.VectorSeriesCollection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Axis_ESTest extends Axis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CategoryPlot categoryPlot0 = new CategoryPlot();
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      NumberAxis3D numberAxis3D1 = new NumberAxis3D();
      VectorSeriesCollection vectorSeriesCollection1 = new VectorSeriesCollection();
      XYPlot xYPlot0 = new XYPlot(vectorSeriesCollection1, numberAxis3D1, numberAxis3D0, (XYItemRenderer) null);
  }
}
