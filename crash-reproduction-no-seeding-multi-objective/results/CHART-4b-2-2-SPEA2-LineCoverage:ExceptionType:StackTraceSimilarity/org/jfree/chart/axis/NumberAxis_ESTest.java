/*

 * Mon Apr 20 11:33:53 UTC 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.BasicStroke;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.LogarithmicAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.StackedXYAreaRenderer2;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.gantt.XYTaskDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class NumberAxis_ESTest extends NumberAxis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis("1Ez^+@joO'h^");
      NumberAxis numberAxis1 = (NumberAxis)numberAxis0.clone();
      numberAxis0.autoAdjustRange();
      double double0 = 1.3333333333333333;
      numberAxis0.setFixedAutoRange(1.3333333333333333);
      numberAxis0.isAutoRange();
      numberAxis0.setInverted(true);
      BasicStroke basicStroke0 = (BasicStroke)numberAxis0.getTickMarkStroke();
      numberAxis1.setAxisLineStroke(basicStroke0);
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      numberAxis3D0.setFixedAutoRange(1.3333333333333333);
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1.3333333333333333, 1.3333333333333333, "1Ez^+@joO'h^");
      cyclicNumberAxis0.getMarkerBand();
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      numberAxis3D0.isAutoTickUnitSelection();
      cyclicNumberAxis0.setAutoRangeIncludesZero(false);
      numberAxis1.setMinorTickMarksVisible(false);
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      XYTaskDataset xYTaskDataset0 = new XYTaskDataset(taskSeriesCollection0);
      StackedXYAreaRenderer2 stackedXYAreaRenderer2_0 = new StackedXYAreaRenderer2();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      combinedDomainXYPlot0.getRendererForDataset(xYTaskDataset0);
      XYPlot xYPlot0 = new XYPlot(xYTaskDataset0, numberAxis0, logarithmicAxis0, (XYItemRenderer) null);
  }
}
