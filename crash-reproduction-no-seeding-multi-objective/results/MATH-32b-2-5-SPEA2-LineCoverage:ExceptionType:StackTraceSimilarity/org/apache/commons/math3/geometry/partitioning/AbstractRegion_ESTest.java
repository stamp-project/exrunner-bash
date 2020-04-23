/*

 * Mon Apr 20 10:59:27 UTC 2020
 */

package org.apache.commons.math3.geometry.partitioning;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D;
import org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractRegion_ESTest extends AbstractRegion_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      boolean boolean0 = true;
      LinkedList<SubHyperplane<Euclidean3D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean3D>>();
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet();
      Boolean boolean1 = new Boolean(true);
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      BSPTree.LeafMerger<Euclidean1D> bSPTree_LeafMerger0 = (BSPTree.LeafMerger<Euclidean1D>) mock(BSPTree.LeafMerger.class, new ViolatedAssumptionAnswer());
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(polyhedronsSet0);
      PolygonsSet polygonsSet0 = new PolygonsSet();
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree0);
      BSPTree<Euclidean2D> bSPTree1 = new BSPTree<Euclidean2D>(vector3D0);
      polygonsSet0.buildNew(bSPTree1);
      // Undeclared exception!
      polygonsSet1.getSize();
  }
}
