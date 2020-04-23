/*

 * Mon Apr 20 11:32:44 UTC 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.SymbolAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.xy.DefaultXYZDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      DefaultXYZDataset defaultXYZDataset0 = new DefaultXYZDataset();
      String[] stringArray0 = new String[4];
      stringArray0[0] = ") should be in the range 0 to 3.";
      stringArray0[1] = ") should be in the range 0 to 3.";
      stringArray0[2] = ") should be in the range 0 to 3.";
      stringArray0[3] = ") should be in the range 0 to 3.";
      SymbolAxis symbolAxis0 = new SymbolAxis(") should be in the range 0 to 3.", stringArray0);
      DateAxis dateAxis0 = new DateAxis(") should be in the range 0 to 3.", timeZone0, locale0);
      XYPlot xYPlot0 = new XYPlot(defaultXYZDataset0, symbolAxis0, dateAxis0, (XYItemRenderer) null);
  }
}
