/*

 * Mon Apr 20 11:34:30 UTC 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.xy.VectorSeriesCollection;
import org.jfree.data.xy.XYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "";
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-1827.0), "OT5ou`+R2)\"Fy9Q");
      DateAxis dateAxis0 = new DateAxis("");
      XYItemRenderer xYItemRenderer0 = null;
      XYPlot xYPlot0 = new XYPlot(vectorSeriesCollection0, cyclicNumberAxis0, dateAxis0, (XYItemRenderer) null);
  }
}
