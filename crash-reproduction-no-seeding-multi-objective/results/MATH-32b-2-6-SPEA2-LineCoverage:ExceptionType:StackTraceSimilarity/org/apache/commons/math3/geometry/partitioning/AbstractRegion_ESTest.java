/*

 * Mon Apr 20 11:01:47 UTC 2020
 */

package org.apache.commons.math3.geometry.partitioning;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D;
import org.apache.commons.math3.geometry.euclidean.threed.Plane;
import org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractRegion_ESTest extends AbstractRegion_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean3D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean3D>>();
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(linkedList0);
      Vector3D vector3D0 = Vector3D.MINUS_K;
      Plane plane0 = new Plane(vector3D0, vector3D0);
      Plane plane1 = new Plane(plane0);
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(vector3D0);
      BSPTree<Euclidean2D> bSPTree1 = bSPTree0.copySelf();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree1);
      // Undeclared exception!
      polygonsSet0.getSize();
  }
}
