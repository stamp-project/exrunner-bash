/*

 * Mon Apr 20 11:36:46 UTC 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.labels.HighLowItemLabelGenerator;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.xy.VectorSeriesCollection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      String string0 = "1";
      NumberAxis numberAxis0 = new NumberAxis("1");
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(4.0, 4.0);
      int int0 = (-1);
      HighLowItemLabelGenerator highLowItemLabelGenerator0 = new HighLowItemLabelGenerator();
      XYPlot xYPlot0 = new XYPlot(vectorSeriesCollection0, cyclicNumberAxis0, cyclicNumberAxis0, (XYItemRenderer) null);
  }
}
