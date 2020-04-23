/*

 * Mon Apr 20 11:44:12 UTC 2020
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
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.general.DatasetGroup;
import org.jfree.data.general.PieDataset;
import org.jfree.data.xy.XYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class ChartFactory_ESTest extends ChartFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PiePlot piePlot0 = new PiePlot();
      piePlot0.getDatasetGroup();
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn((DatasetGroup) null).when(xYDataset0).getGroup();
      doReturn(3, 3).when(xYDataset0).getSeriesCount();
      doReturn(0, 0, 0, 0, 0).when(xYDataset0).getItemCount(anyInt());
      ChartFactory.createPolarChart("", xYDataset0, true, true, true);
      PieDataset pieDataset0 = mock(PieDataset.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = true;
      ChartFactory.createPieChart3D("A+i{](Q=", pieDataset0, true, true, true);
      XYDataset xYDataset1 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(3163).when(xYDataset1).getSeriesCount();
      doReturn(0, 0, 0, 0, 0).when(xYDataset1).getItemCount(anyInt());
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("", "", "A+i{](Q=", xYDataset1, plotOrientation0, true, false, true);
  }
}
