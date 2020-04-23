/*

 * Mon Apr 20 11:36:47 UTC 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.lowagie.text.ListItem;
import com.lowagie.text.pdf.PdfName;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.Marker;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XYPlot xYPlot0 = new XYPlot();
      ValueAxis valueAxis0 = mock(ValueAxis.class, new ViolatedAssumptionAnswer());
      xYPlot0.getDataRange(valueAxis0);
      Marker marker0 = mock(Marker.class, new ViolatedAssumptionAnswer());
      xYPlot0.addDomainMarker(marker0);
      ValueAxis valueAxis1 = mock(ValueAxis.class, new ViolatedAssumptionAnswer());
      xYPlot0.getDataRange(valueAxis1);
      boolean boolean0 = false;
      xYPlot0.setDomainMinorGridlinesVisible(false);
      ListItem listItem0 = new ListItem();
      PdfName pdfName0 = PdfName.CHARPROCS;
      TimeSeries timeSeries0 = new TimeSeries(pdfName0, "a<X){c1xH;w)3M", "V F8");
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries0);
      double double0 = 0.0;
      double double1 = Double.POSITIVE_INFINITY;
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, Double.POSITIVE_INFINITY, "Incorrect segment type in ");
      XYPlot xYPlot1 = new XYPlot(timeSeriesCollection0, cyclicNumberAxis0, cyclicNumberAxis0, (XYItemRenderer) null);
  }
}
