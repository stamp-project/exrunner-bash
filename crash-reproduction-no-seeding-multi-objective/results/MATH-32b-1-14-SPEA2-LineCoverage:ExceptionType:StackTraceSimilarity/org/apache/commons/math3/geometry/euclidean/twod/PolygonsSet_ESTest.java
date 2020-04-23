/*

 * Mon Apr 20 11:09:14 UTC 2020
 */

package org.apache.commons.math3.geometry.euclidean.twod;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.apache.commons.math3.geometry.Vector;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.Line;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.euclidean.twod.SubLine;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.Hyperplane;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class PolygonsSet_ESTest extends PolygonsSet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      PolygonsSet polygonsSet0 = new PolygonsSet(linkedList0);
      Vector2D vector2D0 = Vector2D.ZERO;
      Line line0 = new Line(vector2D0, 2090.466974341);
      SubLine subLine0 = line0.wholeHyperplane();
      SubHyperplane<Euclidean2D> subHyperplane0 = polygonsSet0.intersection(subLine0);
      Hyperplane<Euclidean2D> hyperplane0 = (Hyperplane<Euclidean2D>) mock(Hyperplane.class, new ViolatedAssumptionAnswer());
      doReturn(subHyperplane0).when(hyperplane0).wholeHyperplane();
      Vector2D vector2D1 = Vector2D.NaN;
      Vector2D vector2D2 = new Vector2D(1902.023643448916, vector2D0, 1902.023643448916, vector2D1, (-1418.02802), vector2D1, 0.06666666666666667, vector2D0);
      vector2D0.add(2090.466974341, (Vector<Euclidean2D>) vector2D2);
      polygonsSet0.side(hyperplane0);
      PolygonsSet polygonsSet1 = new PolygonsSet(linkedList0);
      polygonsSet0.computeGeometricalProperties();
      Object object0 = new Object();
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(line0, object0).when(bSPTree0).getAttribute();
      doReturn(subHyperplane0, subHyperplane0).when(bSPTree0).getCut();
      PolygonsSet polygonsSet2 = polygonsSet1.buildNew(bSPTree0);
      // Undeclared exception!
      polygonsSet2.getSize();
  }
}
