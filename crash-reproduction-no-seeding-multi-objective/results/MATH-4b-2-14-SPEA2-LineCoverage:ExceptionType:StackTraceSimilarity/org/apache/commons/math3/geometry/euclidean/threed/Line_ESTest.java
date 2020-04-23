/*

 * Tue Apr 21 06:19:52 UTC 2020
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
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Line line0 = new Line(vector3D0, vector3D0);
      Vector3D vector3D1 = new Vector3D(4.467156385797435E13, vector3D0);
      Line line1 = new Line(line0);
      line0.distance(line1);
      Vector3D vector3D2 = line0.getOrigin();
      Vector3D vector3D3 = new Vector3D(Double.NaN, vector3D2, 0.0, vector3D2);
      Line line2 = new Line(vector3D0, vector3D3);
      line0.closestPoint(line2);
      Vector3D vector3D4 = Vector3D.PLUS_I;
      Vector3D vector3D5 = Vector3D.MINUS_K;
      line2.contains(vector3D5);
      Line line3 = new Line(vector3D4, vector3D5);
      // Undeclared exception!
      line1.toSubSpace((Vector<Euclidean3D>) null);
  }
}
