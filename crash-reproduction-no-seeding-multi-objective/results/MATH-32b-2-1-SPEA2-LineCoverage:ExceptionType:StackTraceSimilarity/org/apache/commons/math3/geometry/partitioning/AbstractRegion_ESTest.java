/*

 * Mon Apr 20 10:56:10 UTC 2020
 */

package org.apache.commons.math3.geometry.partitioning;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D;
import org.apache.commons.math3.geometry.euclidean.threed.Plane;
import org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet;
import org.apache.commons.math3.geometry.euclidean.threed.RotationOrder;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.Line;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractRegion_ESTest extends AbstractRegion_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      Vector3D vector3D0 = rotationOrder0.getA2();
      Plane plane0 = new Plane(vector3D0);
      Vector2D vector2D0 = plane0.toSubSpace(vector3D0);
      Line line0 = new Line(vector2D0, 79.423);
      Line line1 = new Line(line0);
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(vector3D0);
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet();
      BSPTree<Euclidean3D> bSPTree1 = new BSPTree<Euclidean3D>();
      BSPTree<Euclidean3D> bSPTree2 = bSPTree1.split((SubHyperplane<Euclidean3D>) null);
      Vector3D vector3D1 = Vector3D.PLUS_I;
      PolyhedronsSet polyhedronsSet1 = new PolyhedronsSet(bSPTree2);
      Vector3D vector3D2 = Vector3D.POSITIVE_INFINITY;
      polyhedronsSet1.translate(vector3D2);
      BSPTree<Euclidean2D> bSPTree3 = new BSPTree<Euclidean2D>(plane0);
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree3);
      // Undeclared exception!
      polygonsSet0.getSize();
  }
}
