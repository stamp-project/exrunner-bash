/*

 * Tue Apr 21 06:20:33 UTC 2020
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
      Vector3D vector3D0 = Vector3D.MINUS_K;
      Vector3D vector3D1 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn((-2101.2203229191546)).when(vector3D1).dotProduct(nullable(org.apache.commons.math3.geometry.Vector.class));
      doReturn(vector3D0).when(vector3D1).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      Line line0 = new Line(vector3D1, vector3D1);
      Vector3D vector3D2 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn(vector3D0).when(vector3D2).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      line0.getAbscissa(vector3D2);
      Vector3D vector3D3 = Vector3D.NEGATIVE_INFINITY;
      line0.distance(vector3D3);
      Line line1 = new Line(vector3D3, vector3D3);
      line0.distance(line1);
      Line line2 = new Line(line0);
      Vector1D vector1D0 = line2.toSubSpace(vector3D3);
      Vector3D vector3D4 = line1.toSpace(vector1D0);
      line0.reset(vector3D4, vector3D4);
      Vector3D vector3D5 = line0.getDirection();
      line1.reset(vector3D5, vector3D4);
      Vector3D vector3D6 = line0.pointAt(109.992631);
      Line line3 = new Line(line0);
      line3.distance(vector3D4);
      line0.distance(vector3D5);
      Line line4 = new Line(line3);
      Line line5 = new Line(vector3D3, vector3D4);
      line3.getDirection();
      Line line6 = new Line(vector3D5, vector3D6);
      line1.getAbscissa(vector3D4);
      Line line7 = new Line(line5);
      line7.intersection(line5);
      Line line8 = new Line(vector3D4, vector3D5);
      Line line9 = new Line(line7);
      line9.getAbscissa(vector3D6);
      line9.reset(vector3D3, vector3D6);
      line8.isSimilarTo(line5);
      line1.getDirection();
      line6.getDirection();
      // Undeclared exception!
      line6.getAbscissa((Vector3D) null);
  }
}
