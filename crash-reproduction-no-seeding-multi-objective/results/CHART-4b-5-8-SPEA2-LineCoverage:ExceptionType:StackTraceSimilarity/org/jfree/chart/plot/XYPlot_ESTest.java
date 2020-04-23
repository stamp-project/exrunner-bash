/*

 * Mon Apr 20 11:38:21 GMT 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.DateFormat;
import java.util.SimpleTimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.LogarithmicAxis;
import org.jfree.chart.axis.SegmentedTimeline;
import org.jfree.chart.labels.StandardXYZToolTipGenerator;
import org.jfree.chart.plot.CombinedRangeXYPlot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.gantt.XYTaskDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      XYTaskDataset xYTaskDataset0 = new XYTaskDataset(taskSeriesCollection0);
      LogarithmicAxis logarithmicAxis0 = new LogarithmicAxis("");
      DateFormat dateFormat0 = DateFormat.getInstance();
      StandardXYZToolTipGenerator standardXYZToolTipGenerator0 = new StandardXYZToolTipGenerator("", dateFormat0, dateFormat0, dateFormat0);
      CombinedRangeXYPlot combinedRangeXYPlot0 = new CombinedRangeXYPlot(logarithmicAxis0);
      combinedRangeXYPlot0.getRangeGridlineStroke();
      XYItemRenderer xYItemRenderer0 = null;
      combinedRangeXYPlot0.setRenderer((XYItemRenderer) null);
      CombinedRangeXYPlot combinedRangeXYPlot1 = new CombinedRangeXYPlot(logarithmicAxis0);
      CombinedRangeXYPlot combinedRangeXYPlot2 = new CombinedRangeXYPlot();
      combinedRangeXYPlot2.setParent(combinedRangeXYPlot1);
      combinedRangeXYPlot2.getRangeAxisIndex(logarithmicAxis0);
      combinedRangeXYPlot0.isDomainMinorGridlinesVisible();
      SimpleTimeZone simpleTimeZone0 = (SimpleTimeZone)SegmentedTimeline.NO_DST_TIME_ZONE;
      DateAxis dateAxis0 = new DateAxis(" out of bounds.", simpleTimeZone0);
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0, 0.0, "");
      XYPlot xYPlot0 = new XYPlot(xYTaskDataset0, cyclicNumberAxis0, dateAxis0, (XYItemRenderer) null);
  }
}
