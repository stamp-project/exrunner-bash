/*

 * Mon Apr 20 11:49:05 UTC 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.lowagie.text.ListItem;
import com.lowagie.text.Paragraph;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.util.Date;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.axis.AxisSpace;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.axis.SegmentedTimeline;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.util.Layer;
import org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset;
import org.jfree.data.time.Year;
import org.jfree.data.xy.XYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn("x'%2V]", "x'%2V]").when(xYDataset0).toString();
      ValueAxis valueAxis0 = mock(ValueAxis.class, new ViolatedAssumptionAnswer());
      ValueAxis valueAxis1 = null;
      SegmentedTimeline segmentedTimeline0 = SegmentedTimeline.newFifteenMinuteTimeline();
      Date date0 = segmentedTimeline0.getDate((-899L));
      Year year0 = new Year(date0);
      Locale locale0 = Locale.ITALIAN;
      PeriodAxis periodAxis0 = new PeriodAxis("", year0, year0, segmentedTimeline0.DEFAULT_TIME_ZONE, locale0);
      periodAxis0.getRange();
      ListItem listItem0 = new ListItem(4022.9F);
      Paragraph paragraph0 = new Paragraph(listItem0);
      XYItemRenderer xYItemRenderer0 = mock(XYItemRenderer.class, new ViolatedAssumptionAnswer());
      XYPlot xYPlot0 = new XYPlot(xYDataset0, valueAxis0, (ValueAxis) null, xYItemRenderer0);
      Layer layer0 = mock(Layer.class, new ViolatedAssumptionAnswer());
      xYPlot0.getRangeMarkers(layer0);
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      locale0.getDisplayCountry();
      xYPlot0.setRangePannable(false);
      Paint paint0 = xYPlot0.getDomainCrosshairPaint();
      xYPlot0.getRangeMinorGridlinePaint();
      xYPlot0.getDomainGridlineStroke();
      xYPlot0.getFixedDomainAxisSpace();
      xYPlot0.setFixedRangeAxisSpace((AxisSpace) null);
      xYPlot0.getDomainAxisEdge();
      xYPlot0.setDomainZeroBaselinePaint(paint0);
      DefaultBoxAndWhiskerXYDataset defaultBoxAndWhiskerXYDataset0 = new DefaultBoxAndWhiskerXYDataset(date0);
      XYPlot xYPlot1 = new XYPlot(defaultBoxAndWhiskerXYDataset0, periodAxis0, (ValueAxis) null, (XYItemRenderer) null);
  }
}
