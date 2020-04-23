/*

 * Mon Apr 20 11:45:21 UTC 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.axis.AxisSpace;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.xy.DefaultXYZDataset;
import org.jfree.data.xy.XYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ValueAxis valueAxis0 = mock(ValueAxis.class, new ViolatedAssumptionAnswer());
      XYPlot xYPlot0 = new XYPlot((XYDataset) null, valueAxis0, valueAxis0, (XYItemRenderer) null);
      xYPlot0.setBackgroundImageAlignment((-3167));
      xYPlot0.getDomainAxisCount();
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) (-3167);
      doubleArray0[1] = (double) (-3167);
      doubleArray0[2] = (double) 1;
      xYPlot0.setFixedDomainAxisSpace((AxisSpace) null, false);
      xYPlot0.setRangeCrosshairLockedOnData(true);
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      DefaultXYZDataset defaultXYZDataset0 = new DefaultXYZDataset();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1);
      XYPlot xYPlot1 = new XYPlot(defaultXYZDataset0, cyclicNumberAxis0, cyclicNumberAxis0, (XYItemRenderer) null);
  }
}
