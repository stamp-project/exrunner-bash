/*

 * Tue Apr 21 06:19:46 UTC 2020
 */

package org.apache.commons.math3.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
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
      Vector3D vector3D1 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn(vector3D0, (Vector3D) null).when(vector3D1).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      Vector3D vector3D2 = Vector3D.ZERO;
      Line line0 = new Line(vector3D2, vector3D0);
      Line line1 = new Line(vector3D2, vector3D1);
      Vector1D vector1D0 = Vector1D.NaN;
      Vector1D vector1D1 = new Vector1D(3716.52, vector1D0, 1794.6155162, vector1D0, 3716.52, vector1D0);
      vector3D0.getSpace();
      Vector1D vector1D2 = new Vector1D(0.0, vector1D0, 3716.52, vector1D1, 1794.6155162, vector1D1, 57.2957763671875, vector1D1);
      vector1D2.negate();
      line1.toSpace(vector1D2);
      Line line2 = new Line(vector3D1, vector3D1);
  }
}
