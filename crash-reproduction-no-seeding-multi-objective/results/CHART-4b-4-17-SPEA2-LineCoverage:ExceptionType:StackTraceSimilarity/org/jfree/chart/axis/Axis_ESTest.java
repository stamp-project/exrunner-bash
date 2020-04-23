/*

 * Mon Apr 20 11:43:24 UTC 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ModuloAxis;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.PolarItemRenderer;
import org.jfree.chart.renderer.category.StackedAreaRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYShapeRenderer;
import org.jfree.data.Range;
import org.jfree.data.xy.DefaultIntervalXYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Axis_ESTest extends Axis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "#uD{3HUKq&oHDQ!\"uux";
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("#uD{3HUKq&oHDQ!\"uux");
      boolean boolean0 = ValueAxis.DEFAULT_INVERTED;
      DefaultIntervalXYDataset defaultIntervalXYDataset0 = new DefaultIntervalXYDataset();
      PolarItemRenderer polarItemRenderer0 = null;
      StackedAreaRenderer stackedAreaRenderer0 = new StackedAreaRenderer(true);
      Range range0 = ValueAxis.DEFAULT_RANGE;
      ModuloAxis moduloAxis0 = new ModuloAxis("#uD{3HUKq&oHDQ!\"uux", range0);
      String string1 = "Q7 @Y- @Qx?<iE8.f";
      String string2 = "Tahoma";
      CategoryAxis categoryAxis0 = new CategoryAxis("Tahoma");
      XYShapeRenderer xYShapeRenderer0 = new XYShapeRenderer();
      XYPlot xYPlot0 = new XYPlot(defaultIntervalXYDataset0, moduloAxis0, numberAxis3D0, (XYItemRenderer) null);
  }
}
