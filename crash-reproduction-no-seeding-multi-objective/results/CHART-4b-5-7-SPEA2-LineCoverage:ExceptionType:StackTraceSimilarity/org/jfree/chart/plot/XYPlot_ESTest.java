/*

 * Mon Apr 20 11:37:26 UTC 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.SegmentedTimeline;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.time.Hour;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.DefaultXYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("");
      Date date0 = simpleDateFormat0.get2DigitYearStart();
      Hour hour0 = new Hour(date0);
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      Class<DefaultXYDataset> class0 = DefaultXYDataset.class;
      ParsePosition parsePosition0 = new ParsePosition(773);
      Date date1 = simpleDateFormat0.parse("M;M", parsePosition0);
      date0.after(date1);
      SimpleTimeZone simpleTimeZone0 = (SimpleTimeZone)SegmentedTimeline.NO_DST_TIME_ZONE;
      RegularTimePeriod.createInstance(class0, (Date) null, simpleTimeZone0);
      TimeZone timeZone0 = TimeZone.getTimeZone("M;M");
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries0, timeZone0);
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("M;M");
      XYPlot xYPlot0 = new XYPlot(timeSeriesCollection0, numberAxis3D0, numberAxis3D0, (XYItemRenderer) null);
  }
}
