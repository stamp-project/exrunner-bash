/*

 * Mon Apr 20 11:44:12 UTC 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigInteger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.TickUnitSource;
import org.jfree.chart.plot.ThermometerPlot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.AbstractRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.gantt.XYTaskDataset;
import org.jfree.data.general.DefaultValueDataset;
import org.jfree.data.xy.XYSeriesCollection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class NumberAxis_ESTest extends NumberAxis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TickUnitSource tickUnitSource0 = NumberAxis.createStandardTickUnits();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-1.0));
      cyclicNumberAxis0.autoAdjustRange();
      BigInteger bigInteger0 = BigInteger.TEN;
      DefaultValueDataset defaultValueDataset0 = new DefaultValueDataset(bigInteger0);
      ThermometerPlot thermometerPlot0 = new ThermometerPlot();
      cyclicNumberAxis0.equals(tickUnitSource0);
      cyclicNumberAxis0.isAxisLineVisible();
      CyclicNumberAxis cyclicNumberAxis1 = new CyclicNumberAxis((-5.0));
      cyclicNumberAxis0.autoAdjustRange();
      BigInteger bigInteger1 = BigInteger.TEN;
      Double double0 = AbstractRenderer.ZERO;
      DefaultValueDataset defaultValueDataset1 = new DefaultValueDataset((Number) double0);
      XYSeriesCollection xYSeriesCollection0 = new XYSeriesCollection();
      BigInteger bigInteger2 = BigInteger.TEN;
      BigInteger bigInteger3 = BigInteger.ZERO;
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      XYTaskDataset xYTaskDataset0 = new XYTaskDataset(taskSeriesCollection0);
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("1vvJ</@P|1");
      XYPlot xYPlot0 = new XYPlot(xYTaskDataset0, cyclicNumberAxis1, cyclicNumberAxis0, (XYItemRenderer) null);
  }
}
