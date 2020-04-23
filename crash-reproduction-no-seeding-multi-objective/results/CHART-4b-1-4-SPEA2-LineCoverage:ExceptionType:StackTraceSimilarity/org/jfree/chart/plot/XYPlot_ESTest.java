/*

 * Mon Apr 20 11:37:38 UTC 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.labels.StandardXYToolTipGenerator;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.time.DynamicTimeSeriesCollection;
import org.jfree.data.time.FixedMillisecond;
import org.jfree.data.time.TimePeriodValuesCollection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XYPlot xYPlot0 = new XYPlot();
      xYPlot0.setDomainMinorGridlinesVisible(true);
      AxisLocation axisLocation0 = mock(AxisLocation.class, new ViolatedAssumptionAnswer());
      xYPlot0.setRangeAxisLocation(axisLocation0);
      xYPlot0.getRangeZeroBaselineStroke();
      int int0 = 5;
      FixedMillisecond fixedMillisecond0 = new FixedMillisecond(5);
      DynamicTimeSeriesCollection dynamicTimeSeriesCollection0 = new DynamicTimeSeriesCollection(5, 5, fixedMillisecond0);
      DynamicTimeSeriesCollection dynamicTimeSeriesCollection1 = new DynamicTimeSeriesCollection(1, (-1), fixedMillisecond0);
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-1), 1.0E-100, "");
      StandardXYToolTipGenerator.getTimeSeriesInstance();
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection();
      XYItemRenderer xYItemRenderer0 = null;
      XYPlot xYPlot1 = new XYPlot(timePeriodValuesCollection0, cyclicNumberAxis0, cyclicNumberAxis0, (XYItemRenderer) null);
  }
}
