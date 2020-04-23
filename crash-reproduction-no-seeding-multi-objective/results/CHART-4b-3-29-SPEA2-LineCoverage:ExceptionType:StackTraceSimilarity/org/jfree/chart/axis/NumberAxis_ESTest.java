/*

 * Mon Apr 20 11:52:12 UTC 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.xy.VectorSeriesCollection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class NumberAxis_ESTest extends NumberAxis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NumberAxis.createIntegerTickUnits();
      NumberAxis.createStandardTickUnits();
      NumberAxis numberAxis0 = new NumberAxis("Ao0dq<s1a)l");
      numberAxis0.getLeftArrow();
      String string0 = "0.0";
      NumberTickUnit numberTickUnit0 = NumberAxis.DEFAULT_TICK_UNIT;
      boolean boolean0 = false;
      numberTickUnit0.toString();
      boolean boolean1 = true;
      numberAxis0.setTickUnit(numberTickUnit0, false, true);
      numberAxis0.configure();
      numberAxis0.getLabelAngle();
      numberAxis0.setNegativeArrowVisible(false);
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      XYPlot xYPlot0 = new XYPlot(vectorSeriesCollection0, numberAxis0, numberAxis0, (XYItemRenderer) null);
  }
}
