/*

 * Mon Apr 20 11:40:59 UTC 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.axis.AxisState;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.data.xy.XYSeriesCollection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class NumberAxis_ESTest extends NumberAxis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AxisState axisState0 = new AxisState();
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      double[] doubleArray0 = new double[10];
      doubleArray0[1] = (-716.73);
      double[] doubleArray1 = new double[19];
      double[] doubleArray2 = new double[3];
      double[] doubleArray3 = new double[4];
      doubleArray3[0] = (-716.73);
      doubleArray3[1] = (-716.73);
      doubleArray3[2] = (-716.73);
      doubleArray3[3] = 0.0;
      double[] doubleArray4 = new double[8];
      doubleArray2[2] = 0.0;
      doubleArray0[0] = 0.0;
      doubleArray4[2] = (-716.73);
      PlotRenderingInfo plotRenderingInfo0 = mock(PlotRenderingInfo.class, new ViolatedAssumptionAnswer());
      XYSeriesCollection xYSeriesCollection0 = new XYSeriesCollection();
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.CANADA_FRENCH;
      DateAxis dateAxis0 = new DateAxis("Null 'yFormat' argument.", timeZone0, locale0);
      XYPlot xYPlot0 = new XYPlot(xYSeriesCollection0, numberAxis3D0, dateAxis0, (XYItemRenderer) null);
  }
}
