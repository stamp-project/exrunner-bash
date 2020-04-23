/*

 * Mon Apr 20 11:39:44 UTC 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.sql.Connection;
import java.text.DateFormat;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.labels.StandardXYZToolTipGenerator;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYShapeRenderer;
import org.jfree.data.jdbc.JDBCXYDataset;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.time.TimeTableXYDataset;
import org.jfree.data.xy.VectorSeriesCollection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 8886;
      AxisLocation axisLocation0 = AxisLocation.BOTTOM_OR_RIGHT;
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      TimeSeries timeSeries0 = new TimeSeries("", "[]0 d\n", "");
      TimeZone timeZone0 = TimeZone.getTimeZone("[]0 d\n");
      TimeSeries timeSeries1 = new TimeSeries("");
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries1, timeZone0);
      NumberAxis numberAxis0 = new NumberAxis();
      DateFormat dateFormat0 = DateFormat.getInstance();
      StandardXYZToolTipGenerator standardXYZToolTipGenerator0 = new StandardXYZToolTipGenerator("'x|^L*xImJH|", dateFormat0, dateFormat0, dateFormat0);
      TimeTableXYDataset timeTableXYDataset0 = new TimeTableXYDataset();
      XYShapeRenderer xYShapeRenderer0 = new XYShapeRenderer();
      JDBCXYDataset jDBCXYDataset0 = new JDBCXYDataset((Connection) null);
      XYPlot xYPlot0 = new XYPlot(jDBCXYDataset0, numberAxis0, (ValueAxis) null, (XYItemRenderer) null);
  }
}
