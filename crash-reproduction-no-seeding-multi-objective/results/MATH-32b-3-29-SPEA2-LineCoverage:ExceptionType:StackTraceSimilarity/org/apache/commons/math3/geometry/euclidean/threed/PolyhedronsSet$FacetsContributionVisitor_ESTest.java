/*

 * Mon Apr 20 11:29:51 UTC 2020
 */

package org.apache.commons.math3.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D;
import org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet;
import org.apache.commons.math3.geometry.euclidean.threed.Rotation;
import org.apache.commons.math3.geometry.euclidean.threed.RotationOrder;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class PolyhedronsSet$FacetsContributionVisitor_ESTest extends PolyhedronsSet$FacetsContributionVisitor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BSPTree<Euclidean3D> bSPTree0 = new BSPTree<Euclidean3D>();
      bSPTree0.getParent();
      BSPTree.LeafMerger<Euclidean3D> bSPTree_LeafMerger0 = (BSPTree.LeafMerger<Euclidean3D>) mock(BSPTree.LeafMerger.class, new ViolatedAssumptionAnswer());
      doReturn(bSPTree0).when(bSPTree_LeafMerger0).merge(nullable(org.apache.commons.math3.geometry.partitioning.BSPTree.class) , nullable(org.apache.commons.math3.geometry.partitioning.BSPTree.class) , nullable(org.apache.commons.math3.geometry.partitioning.BSPTree.class) , anyBoolean() , anyBoolean());
      BSPTree<Euclidean3D> bSPTree1 = bSPTree0.merge((BSPTree<Euclidean3D>) null, bSPTree_LeafMerger0);
      Vector3D vector3D0 = new Vector3D(2439.13799005923, 1479.6920653, (-7.800414592973399E-9));
      Vector3D vector3D1 = new Vector3D(2664.19694522871, vector3D0);
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet((-7.800414592973399E-9), 51.0401409652799, (-7.800414592973399E-9), 2439.13799005923, (-3186.7), 1115.84);
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
      Vector3D vector3D2 = rotationOrder0.getA1();
      bSPTree1.getCell(vector3D2);
      Rotation rotation0 = new Rotation(rotationOrder0, 2621.0, 2439.13799005923, 2664.19694522871);
      PolyhedronsSet polyhedronsSet1 = polyhedronsSet0.rotate(vector3D1, rotation0);
      PolyhedronsSet polyhedronsSet2 = polyhedronsSet1.translate(vector3D0);
      // Undeclared exception!
      polyhedronsSet2.getSize();
  }
}
