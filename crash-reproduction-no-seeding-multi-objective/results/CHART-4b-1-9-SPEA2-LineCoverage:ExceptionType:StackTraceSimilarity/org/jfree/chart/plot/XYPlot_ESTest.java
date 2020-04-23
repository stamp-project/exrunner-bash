/*

 * Mon Apr 20 11:39:16 UTC 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.SymbolAxis;
import org.jfree.chart.plot.Marker;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.ClusteredXYBarRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.YIntervalRenderer;
import org.jfree.chart.util.Layer;
import org.jfree.chart.util.SerialUtilities;
import org.jfree.data.xy.YIntervalSeriesCollection;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XYPlot xYPlot0 = new XYPlot();
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      xYPlot0.getDataRange(numberAxis3D0);
      Class<YIntervalRenderer> class0 = YIntervalRenderer.class;
      SerialUtilities.isSerializable(class0);
      xYPlot0.getRangeGridlinePaint();
      xYPlot0.isSubplot();
      Marker marker0 = null;
      Layer layer0 = Layer.BACKGROUND;
      xYPlot0.getRangeGridlinePaint();
      String[] stringArray0 = new String[7];
      stringArray0[0] = "qYHv__c 3U8i";
      stringArray0[1] = "qYHv__c 3U8i";
      stringArray0[2] = "qYHv__c 3U8i";
      stringArray0[3] = "qYHv__c 3U8i";
      stringArray0[4] = "qYHv__c 3U8i";
      stringArray0[5] = "qYHv__c 3U8i";
      stringArray0[6] = "qYHv__c 3U8i";
      SymbolAxis symbolAxis0 = new SymbolAxis("qYHv__c 3U8i", stringArray0);
      double double0 = 3.141592653589793;
      ClusteredXYBarRenderer clusteredXYBarRenderer0 = new ClusteredXYBarRenderer(3.141592653589793, true);
      YIntervalSeriesCollection yIntervalSeriesCollection0 = new YIntervalSeriesCollection();
      XYPlot xYPlot1 = new XYPlot(yIntervalSeriesCollection0, numberAxis3D0, symbolAxis0, (XYItemRenderer) null);
  }
}
