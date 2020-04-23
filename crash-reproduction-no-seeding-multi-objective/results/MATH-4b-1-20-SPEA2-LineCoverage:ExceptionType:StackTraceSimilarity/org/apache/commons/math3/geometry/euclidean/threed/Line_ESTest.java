/*

 * Tue Apr 21 06:20:14 UTC 2020
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
      Vector3D vector3D0 = Vector3D.NaN;
      Vector3D vector3D1 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn((-2480.4)).when(vector3D1).dotProduct(nullable(org.apache.commons.math3.geometry.Vector.class));
      doReturn(vector3D0).when(vector3D1).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      Line line0 = new Line(vector3D1, vector3D1);
      Vector3D vector3D2 = line0.pointAt(2.2250738585072014E-308);
      Vector3D vector3D3 = line0.getDirection();
      Line line1 = new Line(vector3D3, vector3D2);
      line1.distance(line0);
      Line line2 = new Line(line0);
      Line line3 = new Line(vector3D3, vector3D2);
      Line line4 = new Line(line1);
      Line line5 = new Line(line4);
      Line line6 = new Line(line5);
      line0.intersection(line6);
      line5.getAbscissa(vector3D3);
      line1.revert();
      line2.getAbscissa(vector3D2);
      // Undeclared exception!
      line2.getAbscissa((Vector3D) null);
  }
}
