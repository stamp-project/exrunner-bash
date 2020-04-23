/*

 * Mon Apr 20 11:50:13 UTC 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.lowagie.text.pdf.PdfName;
import java.util.SimpleTimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.LogAxis;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.DefaultIntervalXYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Axis_ESTest extends Axis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("zzG3n2m3]R(X");
      DefaultIntervalXYDataset defaultIntervalXYDataset0 = new DefaultIntervalXYDataset();
      NumberAxis3D numberAxis3D1 = new NumberAxis3D("NA'E\"xL9a`5dB5");
      PdfName pdfName0 = PdfName.XML;
      TimeSeries timeSeries0 = new TimeSeries(pdfName0, "zzG3n2m3]R(X", ",tJ2X*96\u0003");
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(12, "Null 'state' argument.");
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries0, simpleTimeZone0);
      LogAxis logAxis0 = new LogAxis();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(logAxis0);
      CombinedDomainXYPlot combinedDomainXYPlot1 = new CombinedDomainXYPlot();
      combinedDomainXYPlot1.getRenderer(12);
      XYPlot xYPlot0 = new XYPlot(defaultIntervalXYDataset0, numberAxis3D1, numberAxis3D1, (XYItemRenderer) null);
  }
}
