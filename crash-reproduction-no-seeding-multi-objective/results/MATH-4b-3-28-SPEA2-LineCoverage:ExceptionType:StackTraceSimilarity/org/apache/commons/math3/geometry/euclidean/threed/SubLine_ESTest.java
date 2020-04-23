/*

 * Tue Apr 21 06:20:46 UTC 2020
 */

package org.apache.commons.math3.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.euclidean.threed.Line;
import org.apache.commons.math3.geometry.euclidean.threed.Plane;
import org.apache.commons.math3.geometry.euclidean.threed.Segment;
import org.apache.commons.math3.geometry.euclidean.threed.SubLine;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class SubLine_ESTest extends SubLine_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = 752.417850738;
      Vector3D vector3D0 = Vector3D.NaN;
      double double1 = (-4448.0);
      Vector3D vector3D1 = new Vector3D(752.417850738, vector3D0, (-3749.80209239718), vector3D0, (-4448.0), vector3D0, (-4448.0), vector3D0);
      Plane plane0 = new Plane(vector3D1, vector3D1);
      Plane plane1 = new Plane(vector3D0);
      Line line0 = plane0.intersection(plane1);
      Segment segment0 = mock(Segment.class, new ViolatedAssumptionAnswer());
      doReturn(vector3D1).when(segment0).getEnd();
      doReturn(line0).when(segment0).getLine();
      doReturn(vector3D0).when(segment0).getStart();
      SubLine subLine0 = new SubLine(segment0);
      boolean boolean0 = true;
      // Undeclared exception!
      subLine0.intersection(subLine0, true);
  }
}
