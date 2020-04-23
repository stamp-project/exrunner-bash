/*

 * Tue Apr 21 06:20:43 UTC 2020
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
      doReturn((-1788.99536041)).when(vector3D1).dotProduct(nullable(org.apache.commons.math3.geometry.Vector.class));
      doReturn(vector3D0).when(vector3D1).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      Line line0 = new Line(vector3D1, vector3D1);
      Vector3D vector3D2 = line0.pointAt(0.0);
      Vector3D vector3D3 = line0.closestPoint(line0);
      line0.wholeLine();
      line0.isSimilarTo(line0);
      line0.toSubSpace(vector3D2);
      line0.reset(vector3D2, vector3D3);
      line0.contains(vector3D3);
      Vector3D vector3D4 = line0.getOrigin();
      Line line1 = line0.revert();
      line1.isSimilarTo(line0);
      line1.intersection(line0);
      line1.intersection(line0);
      line0.reset(vector3D4, vector3D4);
      Line line2 = new Line(vector3D2, vector3D3);
      line1.revert();
      line0.getOrigin();
      line2.toSubSpace(vector3D2);
      line2.distance(vector3D3);
      // Undeclared exception!
      line0.toSubSpace((Vector<Euclidean3D>) null);
  }
}
