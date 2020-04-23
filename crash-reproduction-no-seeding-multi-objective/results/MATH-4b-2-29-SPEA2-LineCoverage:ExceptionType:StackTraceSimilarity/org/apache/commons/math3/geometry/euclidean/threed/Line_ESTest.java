/*

 * Tue Apr 21 06:20:51 UTC 2020
 */

package org.apache.commons.math3.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.Vector;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D;
import org.apache.commons.math3.geometry.euclidean.threed.Line;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Line_ESTest extends Line_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_K;
      vector3D0.negate();
      Vector3D vector3D1 = Vector3D.PLUS_I;
      Vector1D vector1D0 = Vector1D.ZERO;
      Vector3D vector3D2 = Vector3D.PLUS_I;
      double double0 = 3506.0;
      Line line0 = new Line(vector3D0, vector3D2);
      line0.getOrigin();
      Line line1 = new Line(line0);
      line0.intersection(line1);
      // Undeclared exception!
      line0.toSubSpace((Vector<Euclidean3D>) null);
  }
}
