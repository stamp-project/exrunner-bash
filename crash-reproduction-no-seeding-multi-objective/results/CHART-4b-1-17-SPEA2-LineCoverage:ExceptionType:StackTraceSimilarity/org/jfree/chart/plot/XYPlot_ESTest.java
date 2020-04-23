/*

 * Mon Apr 20 11:43:47 UTC 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.lowagie.text.ChapterAutoNumber;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import javax.swing.text.DefaultStyledDocument;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.SegmentedTimeline;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.Marker;
import org.jfree.chart.plot.ValueMarker;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.DefaultPolarItemRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.general.DatasetGroup;
import org.jfree.data.time.DateRange;
import org.jfree.data.time.TimeSeriesCollection;
import org.junit.runner.RunWith;
import sun.util.calendar.ZoneInfo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          XYPlot xYPlot0 = new XYPlot();
          DatasetGroup datasetGroup0 = new DatasetGroup();
          ValueAxis valueAxis0 = mock(ValueAxis.class, new ViolatedAssumptionAnswer());
          xYPlot0.getDataRange(valueAxis0);
          ChartPanel chartPanel0 = new ChartPanel((JFreeChart) null);
          chartPanel0.getGraphicsConfiguration();
          DefaultStyledDocument defaultStyledDocument0 = new DefaultStyledDocument();
          DefaultPolarItemRenderer defaultPolarItemRenderer0 = new DefaultPolarItemRenderer();
          defaultPolarItemRenderer0.getItemFillPaint(1913, 1913, true);
          DateRange dateRange0 = DateAxis.DEFAULT_DATE_RANGE;
          ChapterAutoNumber chapterAutoNumber0 = new ChapterAutoNumber("n'FD/^,N&Y&");
          ZoneInfo zoneInfo0 = (ZoneInfo)SegmentedTimeline.DEFAULT_TIME_ZONE;
          TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection();
          XYPlot xYPlot1 = new XYPlot(timeSeriesCollection0, (ValueAxis) null, (ValueAxis) null, (XYItemRenderer) null);
          ValueMarker valueMarker0 = new ValueMarker(1913);
          xYPlot1.addDomainMarker((Marker) valueMarker0);
          // Undeclared exception!
          xYPlot1.getDataRange((ValueAxis) null);
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }
}
