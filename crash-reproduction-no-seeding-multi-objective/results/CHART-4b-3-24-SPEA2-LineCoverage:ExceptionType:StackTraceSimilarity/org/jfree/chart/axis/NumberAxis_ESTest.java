/*

 * Mon Apr 20 11:48:58 UTC 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.labels.StandardXYZToolTipGenerator;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.CandlestickRenderer;
import org.jfree.chart.renderer.xy.StackedXYAreaRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.urls.XYURLGenerator;
import org.jfree.data.RangeType;
import org.jfree.data.xy.DefaultXYZDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class NumberAxis_ESTest extends NumberAxis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      numberAxis3D0.configure();
      numberAxis3D0.configure();
      numberAxis3D0.configure();
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      Rectangle rectangle0 = new Rectangle();
      DefaultXYZDataset defaultXYZDataset0 = new DefaultXYZDataset();
      NumberAxis numberAxis0 = new NumberAxis();
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
      DecimalFormat decimalFormat0 = new DecimalFormat("0", decimalFormatSymbols0);
      RangeType rangeType0 = RangeType.FULL;
      numberAxis3D0.setRangeType(rangeType0);
      StandardXYZToolTipGenerator standardXYZToolTipGenerator0 = new StandardXYZToolTipGenerator("0", decimalFormat0, decimalFormat0, decimalFormat0);
      CandlestickRenderer candlestickRenderer0 = new CandlestickRenderer();
      candlestickRenderer0.getLegendItem(0, 1476395008);
      candlestickRenderer0.getSeriesURLGenerator(0);
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot(numberAxis3D0);
      numberAxis0.equals(combinedRangeCategoryPlot0);
      StackedXYAreaRenderer stackedXYAreaRenderer0 = new StackedXYAreaRenderer(0, standardXYZToolTipGenerator0, (XYURLGenerator) null);
      NumberAxis.createStandardTickUnits();
      XYPlot xYPlot0 = new XYPlot(defaultXYZDataset0, numberAxis0, numberAxis0, (XYItemRenderer) null);
  }
}
