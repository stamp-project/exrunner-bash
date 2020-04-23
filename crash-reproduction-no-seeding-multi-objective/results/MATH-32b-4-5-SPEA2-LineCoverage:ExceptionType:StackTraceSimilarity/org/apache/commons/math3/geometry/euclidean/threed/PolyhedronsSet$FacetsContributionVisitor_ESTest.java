/*

 * Mon Apr 20 11:02:54 UTC 2020
 */

package org.apache.commons.math3.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import org.apache.commons.math3.geometry.Vector;
import org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D;
import org.apache.commons.math3.geometry.euclidean.threed.Plane;
import org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet;
import org.apache.commons.math3.geometry.euclidean.threed.Rotation;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class PolyhedronsSet$FacetsContributionVisitor_ESTest extends PolyhedronsSet$FacetsContributionVisitor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Collection<SubHyperplane<Euclidean3D>> collection0 = null;
      double double0 = 808.5983641389108;
      double double1 = (-9.0);
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet((-9.0), 808.5983641389108, (-9.0), 808.5983641389108, (-9.0), 808.5983641389108);
      BSPTree<Euclidean3D> bSPTree0 = new BSPTree<Euclidean3D>();
      Vector3D vector3D0 = Vector3D.MINUS_I;
      Vector3D vector3D1 = new Vector3D(0.0, vector3D0, (-9.0), vector3D0);
      Vector3D vector3D2 = new Vector3D((-1523.0), vector3D1);
      Plane plane0 = new Plane(vector3D2);
      vector3D0.toString();
      BSPTree.LeafMerger<Euclidean3D> bSPTree_LeafMerger0 = (BSPTree.LeafMerger<Euclidean3D>) mock(BSPTree.LeafMerger.class, new ViolatedAssumptionAnswer());
      Vector3D vector3D3 = new Vector3D(3544.2949669147756, (-9.0));
      Rotation rotation0 = new Rotation(808.5983641389108, 3544.2949669147756, 3544.2949669147756, (-9.0), false);
      PolyhedronsSet polyhedronsSet1 = polyhedronsSet0.rotate(vector3D3, rotation0);
      Plane plane1 = new Plane(vector3D3, vector3D3);
      rotation0.getAxis();
      Plane plane2 = new Plane(vector3D2);
      plane2.getOffset((Vector<Euclidean3D>) vector3D3);
      Vector2D vector2D0 = new Vector2D(0.0, (-9.0));
      BSPTree<Euclidean2D> bSPTree1 = new BSPTree<Euclidean2D>(bSPTree0);
      bSPTree1.getMinus();
      BSPTree.LeafMerger<Euclidean2D> bSPTree_LeafMerger1 = (BSPTree.LeafMerger<Euclidean2D>) mock(BSPTree.LeafMerger.class, new ViolatedAssumptionAnswer());
      doReturn((BSPTree) null).when(bSPTree_LeafMerger1).merge(nullable(org.apache.commons.math3.geometry.partitioning.BSPTree.class) , nullable(org.apache.commons.math3.geometry.partitioning.BSPTree.class) , nullable(org.apache.commons.math3.geometry.partitioning.BSPTree.class) , anyBoolean() , anyBoolean());
      bSPTree1.merge((BSPTree<Euclidean2D>) null, bSPTree_LeafMerger1);
      BSPTree<Euclidean2D> bSPTree2 = bSPTree1.copySelf();
      bSPTree2.getMinus();
      // Undeclared exception!
      polyhedronsSet1.getBarycenter();
  }
}
