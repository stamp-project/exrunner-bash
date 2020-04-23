/*

 * Mon Apr 20 11:22:15 UTC 2020
 */

package org.apache.commons.math3.geometry.euclidean.twod;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.Vector;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D;
import org.apache.commons.math3.geometry.euclidean.threed.Plane;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.Line;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.euclidean.twod.SubLine;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class PolygonsSet_ESTest extends PolygonsSet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_J;
      Vector3D vector3D1 = new Vector3D((-1636.4682251755005), vector3D0, 3.4028234663852886E38, vector3D0);
      Plane plane0 = new Plane(vector3D1, vector3D0);
      Vector2D vector2D0 = plane0.toSubSpace(vector3D0);
      Vector2D vector2D1 = new Vector2D(3.4028234663852886E38, vector2D0);
      Vector2D vector2D2 = new Vector2D(5227.850496490001, vector2D1, 4.8554944278227516E7, vector2D1);
      Line line0 = new Line(vector2D1, 3.0);
      Vector1D vector1D0 = line0.toSubSpace(vector2D1);
      OrientedPoint orientedPoint0 = new OrientedPoint(vector1D0, false);
      Vector3D.distanceInf(vector3D0, vector3D1);
      IntervalsSet intervalsSet0 = orientedPoint0.wholeSpace();
      SubLine subLine0 = new SubLine(line0, intervalsSet0);
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(vector2D2, vector2D2, plane0).when(bSPTree0).getAttribute();
      doReturn(subLine0, subLine0, subLine0).when(bSPTree0).getCut();
      plane0.wholeSpace();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      vector3D0.dotProduct((Vector<Euclidean3D>) vector3D1);
      polygonsSet0.getTree(true);
      // Undeclared exception!
      polygonsSet0.computeGeometricalProperties();
  }
}
