/*

 * Mon Apr 20 11:45:34 UTC 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.sql.Connection;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.jdbc.JDBCXYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class NumberAxis_ESTest extends NumberAxis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis((String) null);
      numberAxis0.isVerticalTickLabels();
      numberAxis0.configure();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0F, (-2637.6), "0.00");
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCXYDataset jDBCXYDataset0 = new JDBCXYDataset(connection0);
      numberAxis0.isVerticalTickLabels();
      cyclicNumberAxis0.configure();
      cyclicNumberAxis0.zoomRange((-780.3680253844982), 0.0F);
      CyclicNumberAxis cyclicNumberAxis1 = new CyclicNumberAxis(0.0F, 0.0F, "");
      Connection connection1 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCXYDataset jDBCXYDataset1 = new JDBCXYDataset(connection1);
      XYPlot xYPlot0 = new XYPlot(jDBCXYDataset1, cyclicNumberAxis0, cyclicNumberAxis1, (XYItemRenderer) null);
  }
}
