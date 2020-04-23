/*

 * Mon Apr 20 11:47:53 UTC 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.annotations.CategoryPointerAnnotation;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.statistics.HistogramDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class NumberAxis_ESTest extends NumberAxis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      numberAxis0.autoAdjustRange();
      numberAxis0.autoAdjustRange();
      Graphics2D graphics2D0 = null;
      String string0 = "";
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("", "", (-911.6754574), (-911.6754574));
      categoryPointerAnnotation0.getFont();
      HistogramDataset histogramDataset0 = new HistogramDataset();
      XYPlot xYPlot0 = new XYPlot(histogramDataset0, numberAxis0, numberAxis0, (XYItemRenderer) null);
  }
}
