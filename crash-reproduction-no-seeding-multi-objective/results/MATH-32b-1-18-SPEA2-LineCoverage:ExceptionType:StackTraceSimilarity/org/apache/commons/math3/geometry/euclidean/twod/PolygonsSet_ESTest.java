/*

 * Mon Apr 20 11:14:04 UTC 2020
 */

package org.apache.commons.math3.geometry.euclidean.twod;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint;
import org.apache.commons.math3.geometry.euclidean.oned.SubOrientedPoint;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.euclidean.twod.SubLine;
import org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.Hyperplane;
import org.apache.commons.math3.geometry.partitioning.Region;
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
      Object object0 = new Object();
      Hyperplane<Euclidean2D> hyperplane0 = null;
      Vector1D vector1D0 = Vector1D.ZERO;
      Vector1D vector1D1 = new Vector1D((-233.87746634), vector1D0, 0.0, vector1D0);
      OrientedPoint orientedPoint0 = new OrientedPoint(vector1D1, true);
      OrientedPoint orientedPoint1 = orientedPoint0.copySelf();
      SubOrientedPoint subOrientedPoint0 = orientedPoint1.wholeHyperplane();
      subOrientedPoint0.getRemainingRegion();
      SubLine subLine0 = new SubLine((Hyperplane<Euclidean2D>) null, (Region<Euclidean1D>) null);
      AbstractSubHyperplane<Euclidean2D, Euclidean1D> abstractSubHyperplane0 = subLine0.buildNew((Hyperplane<Euclidean2D>) null, (Region<Euclidean1D>) null);
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(object0, subOrientedPoint0).when(bSPTree0).getAttribute();
      doReturn(subLine0, abstractSubHyperplane0).when(bSPTree0).getCut();
      PolygonsSet polygonsSet1 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet1.computeGeometricalProperties();
  }
}
