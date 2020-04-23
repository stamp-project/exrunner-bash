/*

 * Mon Apr 20 11:07:26 UTC 2020
 */

package org.apache.commons.math3.geometry.partitioning;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D;
import org.apache.commons.math3.geometry.euclidean.threed.Plane;
import org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet;
import org.apache.commons.math3.geometry.euclidean.threed.RotationOrder;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.Line;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.euclidean.twod.SubLine;
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
      IntervalsSet intervalsSet0 = new IntervalsSet();
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      double[] doubleArray0 = new double[0];
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      intervalsSet0.getSup();
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      Vector3D vector3D0 = rotationOrder0.getA3();
      Plane plane0 = new Plane(vector3D0, vector3D0);
      PolyhedronsSet polyhedronsSet0 = plane0.wholeSpace();
      polyhedronsSet0.translate(vector3D0);
      PolygonsSet polygonsSet0 = new PolygonsSet();
      Euclidean3D euclidean3D0 = Euclidean3D.getInstance();
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(euclidean3D0);
      Line line0 = new Line(vector2D0, 0.0);
      IntervalsSet intervalsSet1 = new IntervalsSet();
      SubLine subLine0 = new SubLine(line0, intervalsSet1);
      bSPTree0.split(subLine0);
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree0);
      // Undeclared exception!
      polygonsSet1.getSize();
  }
}
