/*

 * Mon Apr 20 11:15:57 UTC 2020
 */

package org.apache.commons.math3.geometry.partitioning;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D;
import org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.BoundarySizeVisitor;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractRegion_ESTest extends AbstractRegion_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BSPTree<Euclidean3D> bSPTree0 = new BSPTree<Euclidean3D>();
      bSPTree0.getCut();
      BSPTree<Euclidean3D> bSPTree1 = bSPTree0.split((SubHyperplane<Euclidean3D>) null);
      BSPTree<Euclidean3D> bSPTree2 = new BSPTree<Euclidean3D>();
      bSPTree2.split((SubHyperplane<Euclidean3D>) null);
      BSPTree<Euclidean3D> bSPTree3 = new BSPTree<Euclidean3D>();
      bSPTree2.insertInTree(bSPTree1, false);
      BSPTree<Euclidean3D> bSPTree4 = bSPTree1.getMinus();
      BoundarySizeVisitor<Euclidean3D> boundarySizeVisitor0 = new BoundarySizeVisitor<Euclidean3D>();
      bSPTree4.visit(boundarySizeVisitor0);
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(bSPTree1);
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      vector3D0.orthogonal();
      BSPTree<Euclidean2D> bSPTree5 = new BSPTree<Euclidean2D>();
      BSPTree<Euclidean2D> bSPTree6 = new BSPTree<Euclidean2D>(bSPTree4);
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree6);
      polygonsSet0.getTree(true);
      // Undeclared exception!
      polygonsSet0.getSize();
  }
}
