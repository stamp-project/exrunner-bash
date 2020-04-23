/*

 * Mon Apr 20 11:49:41 UTC 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.SimpleTimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.time.TimePeriodValues;
import org.jfree.data.time.TimePeriodValuesCollection;
import org.jfree.data.xy.XYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XYPlot xYPlot0 = new XYPlot();
      xYPlot0.setNotify(false);
      ValueAxis valueAxis0 = mock(ValueAxis.class, new ViolatedAssumptionAnswer());
      xYPlot0.getDataRange(valueAxis0);
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection((TimePeriodValues) null);
      xYPlot0.setDataset((XYDataset) timePeriodValuesCollection0);
      xYPlot0.getDatasetGroup();
      xYPlot0.getRendererCount();
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1, "{x%<#fT");
      DateAxis dateAxis0 = new DateAxis("jnT*iIII1|U|pv^).", simpleTimeZone0);
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      XYPlot xYPlot1 = new XYPlot(timePeriodValuesCollection0, dateAxis0, numberAxis3D0, (XYItemRenderer) null);
  }
}
