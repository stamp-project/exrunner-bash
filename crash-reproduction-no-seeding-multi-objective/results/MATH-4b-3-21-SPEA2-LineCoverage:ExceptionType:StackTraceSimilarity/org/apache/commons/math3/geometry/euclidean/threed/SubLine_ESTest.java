/*

 * Tue Apr 21 06:20:20 UTC 2020
 */

package org.apache.commons.math3.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.euclidean.threed.Line;
import org.apache.commons.math3.geometry.euclidean.threed.Segment;
import org.apache.commons.math3.geometry.euclidean.threed.SubLine;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class SubLine_ESTest extends SubLine_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D(462.05852964555976, 4.0);
      Vector3D vector3D1 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn(462.05852964555976, (-285.13)).when(vector3D1).dotProduct(nullable(org.apache.commons.math3.geometry.Vector.class));
      doReturn(vector3D0, vector3D0, vector3D0, vector3D0).when(vector3D1).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      SubLine subLine0 = new SubLine(vector3D1, vector3D1);
      Line line0 = mock(Line.class, new ViolatedAssumptionAnswer());
      vector3D0.getNorm1();
      Vector2D vector2D0 = new Vector2D(0.0, 0.0);
      vector2D0.getNormInf();
      org.apache.commons.math3.geometry.euclidean.twod.Line line1 = new org.apache.commons.math3.geometry.euclidean.twod.Line(vector2D0, 0.0);
      Vector3D vector3D2 = Vector3D.NaN;
      Vector3D vector3D3 = Vector3D.POSITIVE_INFINITY;
      Vector3D vector3D4 = Vector3D.NaN;
      Line line2 = new Line(vector3D4, vector3D0);
      Segment segment0 = new Segment(vector3D4, vector3D3, line2);
      subLine0.getSegments();
      Segment segment1 = new Segment(vector3D4, vector3D0, line2);
      subLine0.getSegments();
      line2.reset(vector3D4, vector3D0);
      SubLine subLine1 = new SubLine(segment1);
      subLine0.getSegments();
      // Undeclared exception!
      subLine1.intersection(subLine0, true);
  }
}
