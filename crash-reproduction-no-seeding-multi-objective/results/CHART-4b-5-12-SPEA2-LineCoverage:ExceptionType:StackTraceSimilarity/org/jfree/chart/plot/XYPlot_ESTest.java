/*

 * Mon Apr 20 11:40:28 UTC 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import javax.swing.plaf.metal.MetalToolBarUI;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.util.Layer;
import org.jfree.data.xy.DefaultTableXYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      locale0.getExtensionKeys();
      MetalToolBarUI metalToolBarUI0 = new MetalToolBarUI();
      metalToolBarUI0.getFloatingColor();
      Layer layer0 = Layer.FOREGROUND;
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset(false);
      NumberAxis numberAxis0 = new NumberAxis();
      XYPlot xYPlot0 = new XYPlot(defaultTableXYDataset0, numberAxis0, numberAxis0, (XYItemRenderer) null);
  }
}
