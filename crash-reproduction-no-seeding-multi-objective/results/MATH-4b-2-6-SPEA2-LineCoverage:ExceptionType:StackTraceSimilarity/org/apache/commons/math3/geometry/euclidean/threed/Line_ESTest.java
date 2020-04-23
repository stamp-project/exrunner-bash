/*

 * Tue Apr 21 06:19:14 UTC 2020
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
      Vector3D vector3D0 = Vector3D.MINUS_J;
      vector3D0.scalarMultiply((-1.0));
      Vector3D vector3D1 = new Vector3D(2.714167597449607E7, vector3D0, 0.9285714285714286, vector3D0, 0.9285714285714286, vector3D0);
      Vector3D vector3D2 = Vector3D.NaN;
      Vector3D vector3D3 = new Vector3D((-1319.7178820005604), vector3D1, (-318.0), vector3D1, 1.0, vector3D2, 2648.11, vector3D0);
      Line line0 = new Line(vector3D2, vector3D2);
      Line line1 = new Line(vector3D3, vector3D0);
      line1.toSubSpace(vector3D1);
      line1.distance(vector3D2);
      Vector3D vector3D4 = Vector3D.MINUS_J;
      Line line2 = line1.revert();
      line2.closestPoint(line0);
      Vector3D vector3D5 = Vector3D.PLUS_K;
      line1.reset(vector3D5, vector3D0);
      line2.contains(vector3D5);
      line2.intersection(line0);
      Line line3 = new Line(vector3D2, vector3D0);
      line3.pointAt(2362.27369);
      line0.revert();
      // Undeclared exception!
      line1.toSubSpace((Vector<Euclidean3D>) null);
  }
}
