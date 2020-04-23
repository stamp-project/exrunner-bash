/*

 * Mon Apr 20 11:19:34 UTC 2020
 */

package org.apache.commons.math3.geometry.euclidean.twod;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.euclidean.twod.SubLine;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class PolygonsSet_ESTest extends PolygonsSet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      Euclidean2D euclidean2D0 = Euclidean2D.getInstance();
      Vector2D vector2D0 = Vector2D.ZERO;
      Euclidean2D.getInstance();
      Vector2D vector2D1 = new Vector2D(25.7672, vector2D0, 25.7672, vector2D0, 8602716.676982816, vector2D0, (-1028.4233504491958), vector2D0);
      SubLine subLine0 = new SubLine(vector2D1, vector2D0);
      BSPTree<Euclidean2D> bSPTree1 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(euclidean2D0, polygonsSet0).when(bSPTree1).getAttribute();
      doReturn(subLine0, subLine0).when(bSPTree1).getCut();
      PolygonsSet polygonsSet1 = new PolygonsSet(bSPTree1);
      // Undeclared exception!
      polygonsSet1.getSize();
  }
}
