/*

 * Mon Apr 20 11:43:17 UTC 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.lowagie.text.pdf.PdfGState;
import com.lowagie.text.pdf.PdfName;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PdfName pdfName0 = PdfGState.BM_COLORDODGE;
      TimeSeries timeSeries0 = new TimeSeries(pdfName0);
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection();
      String string0 = null;
      NumberAxis3D numberAxis3D0 = new NumberAxis3D((String) null);
      XYPlot xYPlot0 = new XYPlot(timeSeriesCollection0, numberAxis3D0, numberAxis3D0, (XYItemRenderer) null);
  }
}
