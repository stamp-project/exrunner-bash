/*

 * Mon Apr 20 10:57:46 UTC 2020
 */

package org.apache.commons.math3.geometry.partitioning;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.geom.AffineTransform;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.threed.Plane;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.Line;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.partitioning.AbstractRegion;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.Transform;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractRegion_ESTest extends AbstractRegion_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet();
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(polygonsSet0);
      float float0 = 0.0F;
      double double0 = 0.0;
      AffineTransform affineTransform0 = AffineTransform.getRotateInstance((double) 0.0F, (double) 0.0F, 0.0, (double) 0.0F);
      Transform<Euclidean2D, Euclidean1D> transform0 = Line.getTransform(affineTransform0);
      AbstractRegion<Euclidean2D, Euclidean1D> abstractRegion0 = polygonsSet0.applyTransform(transform0);
      abstractRegion0.getBarycenter();
      Vector3D vector3D0 = Vector3D.MINUS_I;
      Plane plane0 = new Plane(vector3D0);
      Vector3D vector3D1 = Vector3D.crossProduct(vector3D0, vector3D0);
      Vector2D vector2D0 = plane0.toSubSpace(vector3D1);
      vector2D0.getNorm();
      PolygonsSet polygonsSet1 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet1.getSize();
  }
}
