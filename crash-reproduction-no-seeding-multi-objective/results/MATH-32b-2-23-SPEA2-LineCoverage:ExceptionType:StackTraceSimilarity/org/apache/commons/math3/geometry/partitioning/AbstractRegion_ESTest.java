/*

 * Mon Apr 20 11:19:58 UTC 2020
 */

package org.apache.commons.math3.geometry.partitioning;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint;
import org.apache.commons.math3.geometry.euclidean.oned.SubOrientedPoint;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D;
import org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet;
import org.apache.commons.math3.geometry.euclidean.threed.Rotation;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.BoundaryAttribute;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractRegion_ESTest extends AbstractRegion_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet();
      BSPTree<Euclidean3D> bSPTree0 = new BSPTree<Euclidean3D>(polyhedronsSet0);
      polyhedronsSet0.buildNew(bSPTree0);
      polyhedronsSet0.getSize();
      Vector3D vector3D0 = new Vector3D(2864.0, 2864.0);
      Rotation rotation0 = new Rotation(vector3D0, vector3D0, vector3D0, vector3D0);
      Vector1D vector1D0 = Vector1D.POSITIVE_INFINITY;
      OrientedPoint orientedPoint0 = new OrientedPoint(vector1D0, true);
      SubOrientedPoint subOrientedPoint0 = orientedPoint0.wholeHyperplane();
      orientedPoint0.wholeSpace();
      subOrientedPoint0.side(orientedPoint0);
      BoundaryAttribute<Euclidean1D> boundaryAttribute0 = new BoundaryAttribute<Euclidean1D>(subOrientedPoint0, subOrientedPoint0);
      BSPTree<Euclidean1D> bSPTree1 = new BSPTree<Euclidean1D>(orientedPoint0);
      Vector1D vector1D1 = Vector1D.ONE;
      OrientedPoint orientedPoint1 = new OrientedPoint(vector1D1, false);
      SubOrientedPoint subOrientedPoint1 = orientedPoint0.wholeHyperplane();
      BoundaryAttribute<Euclidean1D> boundaryAttribute1 = new BoundaryAttribute<Euclidean1D>(subOrientedPoint1, subOrientedPoint1);
      BSPTree<Euclidean1D> bSPTree2 = new BSPTree<Euclidean1D>(boundaryAttribute1);
      IntervalsSet intervalsSet0 = new IntervalsSet(bSPTree1);
      Object object0 = new Object();
      BSPTree<Euclidean2D> bSPTree3 = new BSPTree<Euclidean2D>();
      Object object1 = new Object();
      BSPTree<Euclidean2D> bSPTree4 = new BSPTree<Euclidean2D>(orientedPoint1);
      BSPTree.LeafMerger<Euclidean2D> bSPTree_LeafMerger0 = (BSPTree.LeafMerger<Euclidean2D>) mock(BSPTree.LeafMerger.class, new ViolatedAssumptionAnswer());
      doReturn((BSPTree) null).when(bSPTree_LeafMerger0).merge(nullable(org.apache.commons.math3.geometry.partitioning.BSPTree.class) , nullable(org.apache.commons.math3.geometry.partitioning.BSPTree.class) , nullable(org.apache.commons.math3.geometry.partitioning.BSPTree.class) , anyBoolean() , anyBoolean());
      bSPTree4.merge(bSPTree3, bSPTree_LeafMerger0);
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree4);
      // Undeclared exception!
      polygonsSet0.getSize();
  }
}
