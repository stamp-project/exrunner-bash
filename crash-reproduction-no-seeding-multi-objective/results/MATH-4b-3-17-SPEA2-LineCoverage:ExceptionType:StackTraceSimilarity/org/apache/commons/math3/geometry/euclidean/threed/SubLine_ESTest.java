/*

 * Tue Apr 21 06:20:05 UTC 2020
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
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      Vector3D vector3D0 = rotationOrder0.getA1();
      Vector3D vector3D1 = new Vector3D(2131.649487454243, (-1154.6279363459541));
      Vector3D vector3D2 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn(vector3D1, vector3D0, vector3D1).when(vector3D2).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      SubLine subLine0 = new SubLine(vector3D0, vector3D2);
      Vector3D vector3D3 = new Vector3D(0.0, vector3D1, 2131.649487454243, vector3D1);
      SubLine subLine1 = new SubLine(vector3D3, vector3D1);
      boolean boolean0 = true;
      // Undeclared exception!
      subLine1.intersection(subLine0, true);
  }
}
