/*

 * Mon Apr 20 11:36:58 UTC 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.lowagie.text.pdf.PdfName;
import java.awt.Color;
import java.awt.Image;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.xy.CategoryTableXYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      categoryTableXYDataset0.getDomainOrder();
      NumberAxis numberAxis0 = new NumberAxis();
      int int0 = 0;
      PdfName pdfName0 = PdfName.TRANS;
      Color color0 = new Color(10096);
      Image image0 = JFreeChart.DEFAULT_BACKGROUND_IMAGE;
      PeriodAxis periodAxis0 = new PeriodAxis("L");
      XYPlot xYPlot0 = new XYPlot(categoryTableXYDataset0, numberAxis0, periodAxis0, (XYItemRenderer) null);
  }
}
