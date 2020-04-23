/*

 * Tue Apr 21 06:19:38 UTC 2020
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
      Vector3D vector3D0 = Vector3D.NaN;
      double double0 = (-3822.981121834687);
      Vector3D vector3D1 = new Vector3D(0.0, vector3D0, (-3822.981121834687), vector3D0, 1294.9907180972, vector3D0);
      Vector3D vector3D2 = new Vector3D(0.0, vector3D1, 0.0, vector3D1);
      Vector3D vector3D3 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(vector3D3).dotProduct(nullable(org.apache.commons.math3.geometry.Vector.class));
      doReturn(vector3D2).when(vector3D3).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      Line line0 = new Line(vector3D3, vector3D3);
      line0.distance(vector3D1);
      Line line1 = new Line(vector3D1, vector3D2);
      Vector3D vector3D4 = line0.closestPoint(line1);
      line1.wholeLine();
      Line line2 = line1.revert();
      Line line3 = new Line(vector3D4, vector3D2);
      line1.intersection(line3);
      line2.isSimilarTo(line1);
      line1.intersection(line0);
      Line line4 = new Line(line0);
      // Undeclared exception!
      line4.toSubSpace((Vector<Euclidean3D>) null);
  }
}
