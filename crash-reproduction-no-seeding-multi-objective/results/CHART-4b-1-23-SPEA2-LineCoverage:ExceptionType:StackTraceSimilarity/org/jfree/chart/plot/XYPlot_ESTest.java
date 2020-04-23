/*

 * Mon Apr 20 11:47:43 UTC 2020
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
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.block.BlockContainer;
import org.jfree.chart.block.ColumnArrangement;
import org.jfree.chart.block.RectangleConstraint;
import org.jfree.chart.plot.Marker;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.title.Title;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.DefaultTableXYDataset;
import org.jfree.data.xy.XYBarDataset;
import org.jfree.data.xy.XYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      XYItemRenderer xYItemRenderer0 = mock(XYItemRenderer.class, new ViolatedAssumptionAnswer());
      XYPlot xYPlot0 = new XYPlot();
      Marker marker0 = mock(Marker.class, new ViolatedAssumptionAnswer());
      xYPlot0.removeDomainMarker(marker0);
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      RectangleInsets rectangleInsets0 = Title.DEFAULT_PADDING;
      ColumnArrangement columnArrangement0 = new ColumnArrangement();
      BlockContainer blockContainer0 = new BlockContainer(columnArrangement0);
      Graphics2D graphics2D1 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      RectangleConstraint rectangleConstraint0 = RectangleConstraint.NONE;
      columnArrangement0.arrange(blockContainer0, graphics2D1, rectangleConstraint0);
      TimeSeries timeSeries0 = new TimeSeries("Z!X,K", "", "");
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries0);
      XYBarDataset xYBarDataset0 = new XYBarDataset(timeSeriesCollection0, 0.0);
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset();
      XYPlot xYPlot1 = new XYPlot(defaultTableXYDataset0, (ValueAxis) null, (ValueAxis) null, (XYItemRenderer) null);
      xYPlot1.getOutlinePaint();
      xYPlot1.getAxisOffset();
      // Undeclared exception!
      xYPlot1.getDataRange((ValueAxis) null);
  }
}
