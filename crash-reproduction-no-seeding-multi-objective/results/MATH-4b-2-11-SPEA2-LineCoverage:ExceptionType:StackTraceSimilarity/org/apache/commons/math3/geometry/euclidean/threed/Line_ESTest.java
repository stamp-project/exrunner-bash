/*

 * Tue Apr 21 06:19:40 UTC 2020
 */

package org.apache.commons.math3.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.Vector;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
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
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      Vector3D vector3D1 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn(2575.696141721).when(vector3D1).dotProduct(nullable(org.apache.commons.math3.geometry.Vector.class));
      doReturn(vector3D0).when(vector3D1).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      Line line0 = new Line(vector3D1, vector3D1);
      Vector3D vector3D2 = line0.getDirection();
      Vector1D vector1D0 = Vector1D.ONE;
      Vector1D vector1D1 = new Vector1D(0.0, vector1D0, 0.0, vector1D0, 300.9513300927884, vector1D0, (-439.3245898144493), vector1D0);
      Vector1D vector1D2 = new Vector1D(0.0, vector1D1, 0.0, vector1D0);
      Vector3D vector3D3 = line0.toSpace(vector1D2);
      Vector3D vector3D4 = line0.getDirection();
      Vector3D vector3D5 = line0.getDirection();
      line0.getAbscissa(vector3D4);
      Line line1 = new Line(line0);
      line0.closestPoint(line1);
      line0.toSubSpace(vector3D2);
      Line line2 = new Line(vector3D3, vector3D5);
      Vector3D vector3D6 = new Vector3D(0.0, (-171.93290423861));
      line2.toSubSpace(vector3D6);
      line2.intersection(line1);
      line0.getOrigin();
      line2.getAbscissa(vector3D0);
      // Undeclared exception!
      line2.toSubSpace((Vector<Euclidean3D>) null);
  }
}
