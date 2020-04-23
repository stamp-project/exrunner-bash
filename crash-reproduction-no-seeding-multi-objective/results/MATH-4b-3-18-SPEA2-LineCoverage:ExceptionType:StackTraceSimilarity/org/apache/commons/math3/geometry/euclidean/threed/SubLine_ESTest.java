/*

 * Tue Apr 21 06:20:08 UTC 2020
 */

package org.apache.commons.math3.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.Vector;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D;
import org.apache.commons.math3.geometry.euclidean.threed.Line;
import org.apache.commons.math3.geometry.euclidean.threed.Plane;
import org.apache.commons.math3.geometry.euclidean.threed.RotationOrder;
import org.apache.commons.math3.geometry.euclidean.threed.SubLine;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class SubLine_ESTest extends SubLine_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YXY;
      rotationOrder0.getA2();
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Vector3D vector3D1 = Vector3D.NaN;
      vector3D0.subtract((-3064.40769218), (Vector<Euclidean3D>) vector3D1);
      Vector3D vector3D2 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      Plane plane0 = new Plane(vector3D0, vector3D0, vector3D0);
      Plane plane1 = new Plane(plane0);
      Line line0 = plane1.intersection(plane0);
      SubLine subLine0 = line0.wholeLine();
      IntervalsSet intervalsSet0 = new IntervalsSet((-1.0), 0.0);
      SubLine subLine1 = new SubLine(line0, intervalsSet0);
      // Undeclared exception!
      subLine0.intersection(subLine1, true);
  }
}
