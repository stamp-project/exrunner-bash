/*

 * Tue Apr 21 06:18:50 UTC 2020
 */

package org.apache.commons.math3.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
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
      RotationOrder rotationOrder0 = RotationOrder.XZX;
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Vector3D vector3D1 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.25534194707870483).when(vector3D1).dotProduct(nullable(org.apache.commons.math3.geometry.Vector.class));
      doReturn(vector3D0, vector3D0, vector3D0, vector3D0).when(vector3D1).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      SubLine subLine0 = new SubLine(vector3D1, vector3D1);
      subLine0.getSegments();
      subLine0.getSegments();
      Vector3D vector3D2 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 356.6285).when(vector3D2).dotProduct(nullable(org.apache.commons.math3.geometry.Vector.class));
      doReturn(vector3D0, vector3D0, vector3D0, vector3D0).when(vector3D2).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      SubLine subLine1 = new SubLine(vector3D2, vector3D2);
      boolean boolean0 = true;
      // Undeclared exception!
      subLine1.intersection(subLine0, true);
  }
}
