/*

 * Mon Apr 20 11:36:11 UTC 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.statistics.HistogramDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HistogramDataset histogramDataset0 = new HistogramDataset();
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-1131.36), (-999.94728));
      CyclicNumberAxis cyclicNumberAxis1 = new CyclicNumberAxis(127.7381, (-999.94728));
      String string0 = "FREQUENCY";
      NumberAxis3D numberAxis3D1 = new NumberAxis3D("ZOOM_RESET_DOMAIN");
      XYPlot xYPlot0 = new XYPlot(histogramDataset0, numberAxis3D1, numberAxis3D1, (XYItemRenderer) null);
  }
}
