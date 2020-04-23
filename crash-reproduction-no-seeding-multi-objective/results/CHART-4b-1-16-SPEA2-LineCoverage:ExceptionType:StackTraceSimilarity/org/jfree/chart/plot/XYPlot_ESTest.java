/*

 * Mon Apr 20 11:43:14 UTC 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.xy.DefaultXYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = (-35);
      DateAxis dateAxis0 = new DateAxis();
      DefaultXYDataset defaultXYDataset0 = new DefaultXYDataset();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-618.2917830437341), (-4070.48841), "o%y#*%)|QMi ");
      XYPlot xYPlot0 = new XYPlot(defaultXYDataset0, dateAxis0, cyclicNumberAxis0, (XYItemRenderer) null);
  }
}
