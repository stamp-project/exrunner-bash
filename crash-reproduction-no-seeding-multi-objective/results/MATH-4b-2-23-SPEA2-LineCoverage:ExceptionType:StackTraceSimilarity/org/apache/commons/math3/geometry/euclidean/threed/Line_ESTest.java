/*

 * Tue Apr 21 06:20:25 UTC 2020
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
      Vector3D vector3D0 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn(0.167).when(vector3D0).dotProduct(nullable(org.apache.commons.math3.geometry.Vector.class));
      Vector3D vector3D1 = Vector3D.POSITIVE_INFINITY;
      Vector3D vector3D2 = new Vector3D((-0.9961479317121176), vector3D1);
      Vector3D vector3D3 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn(vector3D2).when(vector3D3).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      Line line0 = new Line(vector3D0, vector3D3);
      line0.intersection(line0);
      // Undeclared exception!
      line0.toSubSpace((Vector<Euclidean3D>) null);
  }
}
