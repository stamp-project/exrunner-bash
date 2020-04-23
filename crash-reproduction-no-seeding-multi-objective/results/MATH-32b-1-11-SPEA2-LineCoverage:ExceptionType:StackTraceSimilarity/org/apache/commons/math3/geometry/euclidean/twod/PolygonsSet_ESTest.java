/*

 * Mon Apr 20 11:06:57 UTC 2020
 */

package org.apache.commons.math3.geometry.euclidean.twod;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.apache.commons.math3.geometry.Vector;
import org.apache.commons.math3.geometry.euclidean.threed.Plane;
import org.apache.commons.math3.geometry.euclidean.threed.RotationOrder;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.Line;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.euclidean.twod.Segment;
import org.apache.commons.math3.geometry.euclidean.twod.SubLine;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class PolygonsSet_ESTest extends PolygonsSet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      PolygonsSet polygonsSet0 = new PolygonsSet(linkedList0);
      polygonsSet0.computeGeometricalProperties();
      polygonsSet0.computeGeometricalProperties();
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      Vector3D vector3D0 = Vector3D.PLUS_I;
      Plane plane0 = new Plane(vector3D0);
      Vector2D vector2D1 = plane0.toSubSpace(vector3D0);
      Line line0 = new Line(vector2D1, 0.0);
      Line line1 = new Line(line0);
      Segment segment0 = new Segment(vector2D0, vector2D0, line1);
      SubLine subLine0 = new SubLine(segment0);
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(polygonsSet0, linkedList0).when(bSPTree0).getAttribute();
      doReturn(subLine0, subLine0).when(bSPTree0).getCut();
      vector2D1.distanceInf((Vector<Euclidean2D>) vector2D0);
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree0);
      double double0 = (-47.0);
      RotationOrder rotationOrder0 = RotationOrder.ZXY;
      Vector3D vector3D1 = rotationOrder0.getA2();
      Plane plane1 = new Plane(vector3D1);
      Vector2D vector2D2 = plane1.toSubSpace(vector3D1);
      Line line2 = new Line(vector2D2, vector2D2);
      polygonsSet0.side(line2);
      // Undeclared exception!
      polygonsSet1.computeGeometricalProperties();
  }
}
