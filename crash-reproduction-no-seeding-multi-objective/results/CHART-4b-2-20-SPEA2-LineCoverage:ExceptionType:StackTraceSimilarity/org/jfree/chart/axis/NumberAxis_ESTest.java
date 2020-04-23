/*

 * Mon Apr 20 11:45:56 UTC 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.lowagie.text.pdf.PdfWriter;
import com.lowagie.text.pdf.Type3Font;
import java.awt.Rectangle;
import javax.swing.JLayeredPane;
import javax.swing.plaf.basic.BasicTreeUI;
import javax.swing.plaf.metal.MetalTreeUI;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.TickUnits;
import org.jfree.chart.labels.HighLowItemLabelGenerator;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.CandlestickRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.statistics.SimpleHistogramDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class NumberAxis_ESTest extends NumberAxis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TickUnits tickUnits0 = new TickUnits();
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      numberAxis3D0.setPositiveArrowVisible(true);
      Type3Font type3Font0 = new Type3Font((PdfWriter) null, true);
      numberAxis3D0.autoAdjustRange();
      MetalTreeUI metalTreeUI0 = new MetalTreeUI();
      BasicTreeUI.NodeDimensionsHandler basicTreeUI_NodeDimensionsHandler0 = metalTreeUI0.new NodeDimensionsHandler();
      Integer integer0 = JLayeredPane.DEFAULT_LAYER;
      Rectangle rectangle0 = null;
      int int0 = (-177);
      SimpleHistogramDataset simpleHistogramDataset0 = new SimpleHistogramDataset(integer0);
      HighLowItemLabelGenerator highLowItemLabelGenerator0 = new HighLowItemLabelGenerator();
      CandlestickRenderer candlestickRenderer0 = new CandlestickRenderer(284.882);
      candlestickRenderer0.getSeriesURLGenerator((-177));
      XYPlot xYPlot0 = new XYPlot(simpleHistogramDataset0, numberAxis3D0, numberAxis3D0, (XYItemRenderer) null);
  }
}
