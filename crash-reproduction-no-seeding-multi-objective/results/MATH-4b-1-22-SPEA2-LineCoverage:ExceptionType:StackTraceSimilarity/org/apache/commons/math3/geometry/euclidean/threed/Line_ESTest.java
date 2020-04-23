/*

 * Tue Apr 21 06:20:19 UTC 2020
 */

package org.apache.commons.math3.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.Vector;
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
      Vector3D vector3D0 = Vector3D.NaN;
      vector3D0.toString();
      Vector3D vector3D1 = new Vector3D(1.0, vector3D0, 1.0, vector3D0);
      vector3D1.normalize();
      vector3D0.toString();
      vector3D0.toString();
      vector3D0.add(5.118158446966051E19, (Vector<Euclidean3D>) vector3D1);
      double[] doubleArray0 = new double[9];
      Vector3D vector3D2 = Vector3D.NEGATIVE_INFINITY;
      Line line0 = new Line(vector3D0, vector3D0);
      // Undeclared exception!
      line0.toSubSpace((Vector<Euclidean3D>) null);
  }
}
