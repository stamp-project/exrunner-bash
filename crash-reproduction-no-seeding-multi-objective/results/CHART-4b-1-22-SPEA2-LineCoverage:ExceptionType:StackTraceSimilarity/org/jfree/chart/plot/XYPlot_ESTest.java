/*

 * Mon Apr 20 11:46:22 UTC 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.xy.CategoryTableXYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XYPlot xYPlot0 = new XYPlot();
      int int0 = 1169;
      xYPlot0.clearDomainMarkers(1169);
      xYPlot0.getBackgroundAlpha();
      xYPlot0.getFixedLegendItems();
      xYPlot0.isDomainCrosshairLockedOnData();
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      DateAxis dateAxis0 = new DateAxis();
      XYPlot xYPlot1 = new XYPlot(categoryTableXYDataset0, dateAxis0, dateAxis0, (XYItemRenderer) null);
  }
}
