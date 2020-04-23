/*

 * Tue Apr 21 06:20:09 UTC 2020
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
      Vector3D vector3D0 = Vector3D.PLUS_I;
      Vector3D vector3D1 = Vector3D.POSITIVE_INFINITY;
      Line line0 = new Line(vector3D1, vector3D0);
      Vector3D vector3D2 = line0.getOrigin();
      line0.distance(line0);
      line0.getAbscissa(vector3D0);
      Vector3D vector3D3 = line0.getOrigin();
      Line line1 = new Line(line0);
      line0.distance(line1);
      line1.getAbscissa(vector3D2);
      Vector3D vector3D4 = Vector3D.MINUS_I;
      Line line2 = new Line(vector3D3, vector3D4);
      line2.distance(vector3D2);
      Vector1D vector1D0 = Vector1D.POSITIVE_INFINITY;
      Line line3 = new Line(vector3D1, vector3D4);
      Line line4 = new Line(line3);
      line4.toSpace(vector1D0);
      Line line5 = new Line(line3);
      line5.wholeLine();
      Vector3D vector3D5 = line1.getDirection();
      line3.toSubSpace(vector3D1);
      line5.getOrigin();
      line1.reset(vector3D2, vector3D5);
      line2.distance(line5);
      Line line6 = new Line(line3);
      Line line7 = new Line(line4);
      Vector3D vector3D6 = Vector3D.PLUS_K;
      // Undeclared exception!
      line1.toSubSpace((Vector<Euclidean3D>) null);
  }
}
