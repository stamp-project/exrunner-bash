/*

 * Mon Apr 20 11:40:58 UTC 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Polygon;
import java.awt.geom.Point2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.time.Week;
import org.jfree.data.time.Year;
import org.jfree.data.xy.XIntervalSeriesCollection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Axis_ESTest extends Axis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      CategoryPlot categoryPlot0 = new CategoryPlot();
      CombinedDomainXYPlot combinedDomainXYPlot1 = new CombinedDomainXYPlot();
      CategoryPlot categoryPlot1 = new CategoryPlot();
      Polygon polygon0 = new Polygon();
      Point2D.Double point2D_Double0 = new Point2D.Double();
      CategoryAxis categoryAxis0 = new CategoryAxis();
      XIntervalSeriesCollection xIntervalSeriesCollection0 = new XIntervalSeriesCollection();
      Year year0 = new Year(0);
      Week week0 = new Week((-1430), year0);
      week0.next();
      PeriodAxis periodAxis0 = new PeriodAxis("SWOP CGATS TR 0011995", week0, week0);
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      XYPlot xYPlot0 = new XYPlot(xIntervalSeriesCollection0, numberAxis3D0, numberAxis3D0, (XYItemRenderer) null);
  }
}
