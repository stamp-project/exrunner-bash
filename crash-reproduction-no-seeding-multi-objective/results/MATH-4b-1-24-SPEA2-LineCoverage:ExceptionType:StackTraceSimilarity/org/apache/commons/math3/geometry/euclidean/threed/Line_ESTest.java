/*

 * Tue Apr 21 06:20:25 UTC 2020
 */

package org.apache.commons.math3.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.euclidean.threed.Line;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Line_ESTest extends Line_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_I;
      Vector3D vector3D1 = new Vector3D(187.33868903136855, vector3D0, 3.141592653489793, vector3D0, 1.0, vector3D0, 187.33868903136855, vector3D0);
      Vector3D vector3D2 = new Vector3D(3.141592653489793, vector3D1, (-2757.9), vector3D0, 1.0, vector3D0);
      Vector3D vector3D3 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(vector3D3).dotProduct(nullable(org.apache.commons.math3.geometry.Vector.class));
      doReturn(vector3D2).when(vector3D3).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      Line line0 = new Line(vector3D3, vector3D3);
      Vector3D vector3D4 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn((Vector3D) null).when(vector3D4).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      // Undeclared exception!
      line0.getAbscissa(vector3D4);
  }
}
