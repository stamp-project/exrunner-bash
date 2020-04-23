/*

 * Tue Apr 21 06:20:24 UTC 2020
 */

package org.apache.commons.math3.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.Vector;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
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
      Vector3D vector3D1 = new Vector3D(5.865827662008209E-8, vector3D0, 5.865827662008209E-8, vector3D0, (-950.0), vector3D0, 0.0, vector3D0);
      Vector3D vector3D2 = new Vector3D(0.0, vector3D0, 0.0, vector3D1, 0.0, vector3D1);
      Line line0 = new Line(vector3D2, vector3D2);
      line0.distance(line0);
      Line line1 = new Line(vector3D1, vector3D0);
      line0.distance(line1);
      vector3D2.add(1.0, (Vector<Euclidean3D>) vector3D0);
      line0.distance(line0);
      Vector3D vector3D3 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(vector3D3).dotProduct(nullable(org.apache.commons.math3.geometry.Vector.class));
      Vector3D vector3D4 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn(vector3D0).when(vector3D4).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      Line line2 = new Line(vector3D3, vector3D4);
      line0.getAbscissa(vector3D0);
      line2.intersection(line0);
      line0.wholeLine();
      Vector<Euclidean1D> vector0 = (Vector<Euclidean1D>) mock(Vector.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      line0.toSubSpace((Vector<Euclidean3D>) null);
  }
}
