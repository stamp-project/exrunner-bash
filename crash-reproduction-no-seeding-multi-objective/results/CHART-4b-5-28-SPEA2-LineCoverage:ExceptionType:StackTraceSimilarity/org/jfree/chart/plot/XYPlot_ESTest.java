/*

 * Mon Apr 20 11:49:59 UTC 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.axis.LogAxis;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.statistics.SimpleHistogramDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ValueAxis valueAxis0 = mock(ValueAxis.class, new ViolatedAssumptionAnswer());
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      LogAxis logAxis0 = new LogAxis();
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("YG=");
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset("ObjStm");
      XYPlot xYPlot0 = new XYPlot(simpleHistogramDataset0, numberAxis3D0, valueAxis0, (XYItemRenderer) null);
  }
}
