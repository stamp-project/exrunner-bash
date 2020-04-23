/*

 * Mon Apr 20 11:46:14 UTC 2020
 */

package org.jfree.chart;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.util.TableOrder;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.xy.XYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class ChartFactory_ESTest extends ChartFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "Argument 'd' outside valid range.";
      CategoryDataset categoryDataset0 = null;
      TableOrder tableOrder0 = mock(TableOrder.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = true;
      boolean boolean1 = false;
      boolean boolean2 = false;
      ChartFactory.createMultiplePieChart("Argument 'd' outside valid range.", (CategoryDataset) null, tableOrder0, true, false, false);
      String string1 = "";
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(xYDataset0).getSeriesCount();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("Argument 'd' outside valid range.", "", "", xYDataset0, plotOrientation0, false, false, true);
  }
}
