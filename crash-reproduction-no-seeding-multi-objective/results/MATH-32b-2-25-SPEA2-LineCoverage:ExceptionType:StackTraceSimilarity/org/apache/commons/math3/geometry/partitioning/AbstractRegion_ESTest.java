/*

 * Mon Apr 20 11:21:45 UTC 2020
 */

package org.apache.commons.math3.geometry.partitioning;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D;
import org.apache.commons.math3.geometry.euclidean.threed.Plane;
import org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet;
import org.apache.commons.math3.geometry.euclidean.threed.SubPlane;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.Region;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractRegion_ESTest extends AbstractRegion_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet();
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      polyhedronsSet0.translate(vector3D0);
      Plane plane0 = new Plane(vector3D0);
      Plane plane1 = new Plane(vector3D0, vector3D0, vector3D0);
      BSPTree<Euclidean3D> bSPTree0 = new BSPTree<Euclidean3D>();
      SubPlane subPlane0 = new SubPlane(plane1, (Region<Euclidean2D>) null);
      BSPTree<Euclidean3D> bSPTree1 = bSPTree0.split(subPlane0);
      BSPTree<Euclidean2D> bSPTree2 = new BSPTree<Euclidean2D>();
      bSPTree2.setAttribute(bSPTree1);
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree2);
      // Undeclared exception!
      polygonsSet0.getSize();
  }
}
