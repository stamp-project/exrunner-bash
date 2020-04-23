/*

 * Mon Apr 20 11:09:58 UTC 2020
 */

package org.apache.commons.math3.geometry.partitioning;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D;
import org.apache.commons.math3.geometry.euclidean.threed.Plane;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractRegion_ESTest extends AbstractRegion_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.POSITIVE_INFINITY;
      BSPTree.LeafMerger<Euclidean1D> bSPTree_LeafMerger0 = (BSPTree.LeafMerger<Euclidean1D>) mock(BSPTree.LeafMerger.class, new ViolatedAssumptionAnswer());
      vector1D0.toString();
      IntervalsSet intervalsSet0 = new IntervalsSet();
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      BSPTree<Euclidean3D> bSPTree0 = new BSPTree<Euclidean3D>();
      BSPTree<Euclidean2D> bSPTree1 = new BSPTree<Euclidean2D>(vector1D0);
      Plane plane0 = new Plane(vector3D0, vector3D0);
      Plane plane1 = new Plane(plane0);
      plane0.wholeHyperplane();
      BSPTree<Euclidean2D> bSPTree2 = new BSPTree<Euclidean2D>((Object) null);
      BSPTree.LeafMerger<Euclidean2D> bSPTree_LeafMerger1 = (BSPTree.LeafMerger<Euclidean2D>) mock(BSPTree.LeafMerger.class, new ViolatedAssumptionAnswer());
      doReturn(bSPTree1).when(bSPTree_LeafMerger1).merge(nullable(org.apache.commons.math3.geometry.partitioning.BSPTree.class) , nullable(org.apache.commons.math3.geometry.partitioning.BSPTree.class) , nullable(org.apache.commons.math3.geometry.partitioning.BSPTree.class) , anyBoolean() , anyBoolean());
      bSPTree1.merge(bSPTree2, bSPTree_LeafMerger1);
      Euclidean3D.getInstance();
      Vector1D vector1D1 = Vector1D.ONE;
      Vector2D vector2D0 = new Vector2D(938.778, 0.0);
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree1);
      polygonsSet0.getBoundarySize();
      // Undeclared exception!
      polygonsSet0.getSize();
  }
}
