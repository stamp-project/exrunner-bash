/*

 * Tue Apr 21 06:19:30 UTC 2020
 */

package org.apache.commons.math3.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
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
      Vector3D vector3D0 = Vector3D.NaN;
      Plane plane0 = new Plane(vector3D0);
      Vector3D vector3D1 = new Vector3D((-498.2772247848862), vector3D0, (-498.2772247848862), vector3D0, (-2055.9674935389), vector3D0, (-1221.304), vector3D0);
      Plane plane1 = new Plane(vector3D0, vector3D1, vector3D0);
      Line line0 = plane0.intersection(plane1);
      Line line1 = new Line(line0);
      line1.wholeLine();
      Segment segment0 = mock(Segment.class, new ViolatedAssumptionAnswer());
      IntervalsSet intervalsSet0 = new IntervalsSet();
      SubLine subLine0 = new SubLine(line0, intervalsSet0);
      SubLine subLine1 = new SubLine(vector3D0, vector3D1);
      boolean boolean0 = false;
      // Undeclared exception!
      subLine0.intersection(subLine1, false);
  }
}
