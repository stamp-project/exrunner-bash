/*

 * Tue Apr 21 06:19:42 UTC 2020
 */

package org.apache.commons.math3.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.Vector;
import org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D;
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
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Vector3D vector3D1 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      Vector3D vector3D2 = Vector3D.crossProduct(vector3D0, vector3D0);
      Line line0 = new Line(vector3D2, vector3D2);
      vector3D0.subtract(2805536.6779454486, (Vector<Euclidean3D>) vector3D2);
      Vector3D vector3D3 = new Vector3D(0.0, 0.0);
      double double0 = 3.141592653489793;
      Vector3D vector3D4 = new Vector3D((-336.75), vector3D0, 3.141592653489793, vector3D1);
      Vector3D vector3D5 = null;
      Vector3D vector3D6 = Vector3D.MINUS_I;
      Line line1 = new Line(vector3D4, vector3D6);
      line0.closestPoint(line1);
      vector3D0.dotProduct((Vector<Euclidean3D>) vector3D2);
      Vector3D vector3D7 = Vector3D.ZERO;
      // Undeclared exception!
      line0.getAbscissa((Vector3D) null);
  }
}
