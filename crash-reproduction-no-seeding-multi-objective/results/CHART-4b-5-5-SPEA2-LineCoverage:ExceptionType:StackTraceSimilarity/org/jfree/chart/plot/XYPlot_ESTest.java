/*

 * Mon Apr 20 11:37:46 UTC 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.EventListener;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.StackedXYAreaRenderer2;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.xy.DefaultXYZDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultXYZDataset defaultXYZDataset0 = new DefaultXYZDataset();
      DateAxis dateAxis0 = new DateAxis();
      DateAxis dateAxis1 = new DateAxis();
      StackedXYAreaRenderer2 stackedXYAreaRenderer2_0 = new StackedXYAreaRenderer2();
      defaultXYZDataset0.hasListener((EventListener) null);
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      XYPlot xYPlot0 = new XYPlot(defaultXYZDataset0, numberAxis3D0, dateAxis0, (XYItemRenderer) null);
  }
}
