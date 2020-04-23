/*

 * Mon Apr 20 11:37:52 UTC 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Polygon;
import java.util.SimpleTimeZone;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.annotations.CategoryPointerAnnotation;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.util.Layer;
import org.jfree.data.xy.CategoryTableXYDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XYPlot_ESTest extends XYPlot_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object[] objectArray0 = new Object[30];
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(objectArray0, 2385);
      DefaultTableColumnModel defaultTableColumnModel0 = new DefaultTableColumnModel();
      SubCategoryAxis[] subCategoryAxisArray0 = new SubCategoryAxis[0];
      JList<SubCategoryAxis> jList0 = new JList<SubCategoryAxis>();
      ListSelectionModel listSelectionModel0 = defaultTableColumnModel0.getSelectionModel();
      int[] intArray0 = new int[5];
      intArray0[0] = 2385;
      intArray0[1] = 2385;
      intArray0[2] = 2385;
      intArray0[3] = 2385;
      Polygon polygon0 = new Polygon(intArray0, intArray0, 0);
      Boolean boolean0 = new Boolean(true);
      JTable jTable0 = new JTable(defaultTableModel0, defaultTableColumnModel0, listSelectionModel0);
      jTable0.getSelectionForeground();
      CategoryPointerAnnotation categoryPointerAnnotation0 = new CategoryPointerAnnotation("@r:k<K", 2385, (-3060.3527293142997), 828.590467841002);
      categoryPointerAnnotation0.getArrowStroke();
      Layer layer0 = Layer.FOREGROUND;
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(2385, "@r:k<K");
      DateAxis dateAxis0 = new DateAxis();
      dateAxis0.setMinorTickMarkInsideLength((-2461.7202F));
      XYPlot xYPlot0 = new XYPlot(categoryTableXYDataset0, dateAxis0, dateAxis0, (XYItemRenderer) null);
  }
}
