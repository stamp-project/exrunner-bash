/*

 * Mon Apr 20 11:10:25 UTC 2020
 */

package org.apache.commons.math3.geometry.euclidean.twod;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.Line;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.euclidean.twod.SubLine;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class PolygonsSet_ESTest extends PolygonsSet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet();
      polygonsSet0.computeGeometricalProperties();
      polygonsSet0.computeGeometricalProperties();
      Vector2D vector2D0 = Vector2D.NaN;
      Vector2D vector2D1 = new Vector2D(4662.54, vector2D0);
      Vector2D vector2D2 = new Vector2D(162.54, vector2D0, 4662.54, vector2D1, 162.54, vector2D1, 0.5403022766113281, vector2D0);
      Line line0 = new Line(vector2D2, vector2D0);
      Line line1 = new Line(line0);
      SubLine subLine0 = line1.wholeHyperplane();
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(polygonsSet0).when(bSPTree0).getAttribute();
      doReturn(subLine0, (SubHyperplane) null).when(bSPTree0).getCut();
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree0);
      // Undeclared exception!
      polygonsSet1.computeGeometricalProperties();
  }
}
