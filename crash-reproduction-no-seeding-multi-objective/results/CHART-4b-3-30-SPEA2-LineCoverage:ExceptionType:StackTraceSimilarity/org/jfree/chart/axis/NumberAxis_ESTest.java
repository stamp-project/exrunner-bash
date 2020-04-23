/*

 * Mon Apr 20 11:52:58 UTC 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.geom.Rectangle2D;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.axis.PeriodAxisLabelInfo;
import org.jfree.chart.event.AxisChangeEvent;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.LookupPaintScale;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.title.PaintScaleLegend;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.data.xy.DefaultXYZDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class NumberAxis_ESTest extends NumberAxis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis("YEA`n");
      NumberAxis numberAxis1 = new NumberAxis();
      String string0 = ":gOjdr&7oZp";
      NumberTickUnit numberTickUnit0 = mock(NumberTickUnit.class, new ViolatedAssumptionAnswer());
      numberAxis1.setTickUnit(numberTickUnit0);
      Rectangle2D rectangle2D0 = mock(Rectangle2D.class, new ViolatedAssumptionAnswer());
      LookupPaintScale lookupPaintScale0 = new LookupPaintScale();
      PaintScaleLegend paintScaleLegend0 = new PaintScaleLegend(lookupPaintScale0, numberAxis0);
      RectangleInsets rectangleInsets0 = PeriodAxisLabelInfo.DEFAULT_INSETS;
      numberAxis0.setLabelInsets(rectangleInsets0);
      numberAxis1.valueToJava2D((-4488.7640227), rectangle2D0, (RectangleEdge) null);
      numberAxis1.configure();
      AxisChangeEvent axisChangeEvent0 = new AxisChangeEvent(numberAxis0);
      DefaultXYZDataset defaultXYZDataset0 = new DefaultXYZDataset();
      AxisChangeEvent axisChangeEvent1 = new AxisChangeEvent(numberAxis0);
      DefaultXYZDataset defaultXYZDataset1 = new DefaultXYZDataset();
      TimeZone.getDefault();
      XYPlot xYPlot0 = new XYPlot(defaultXYZDataset1, numberAxis1, numberAxis1, (XYItemRenderer) null);
  }
}
