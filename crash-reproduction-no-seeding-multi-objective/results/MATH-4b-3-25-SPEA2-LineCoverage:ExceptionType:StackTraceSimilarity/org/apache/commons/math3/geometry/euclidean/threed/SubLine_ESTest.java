/*

 * Tue Apr 21 06:20:32 UTC 2020
 */

package org.apache.commons.math3.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.Vector;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D;
import org.apache.commons.math3.geometry.euclidean.threed.Line;
import org.apache.commons.math3.geometry.euclidean.threed.Segment;
import org.apache.commons.math3.geometry.euclidean.threed.SubLine;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class SubLine_ESTest extends SubLine_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      Vector3D vector3D1 = Vector3D.PLUS_I;
      Vector3D vector3D2 = Vector3D.crossProduct(vector3D0, vector3D1);
      Vector3D.distance(vector3D2, vector3D0);
      Line line0 = new Line(vector3D0, vector3D2);
      vector3D1.distance((Vector<Euclidean3D>) vector3D0);
      Vector3D vector3D3 = Vector3D.NEGATIVE_INFINITY;
      Vector3D.distanceInf(vector3D1, vector3D3);
      Vector3D.dotProduct(vector3D2, vector3D1);
      Segment segment0 = new Segment(vector3D2, vector3D0, line0);
      SubLine subLine0 = new SubLine(segment0);
      subLine0.getSegments();
      Vector1D vector1D0 = Vector1D.ONE;
      OrientedPoint orientedPoint0 = new OrientedPoint(vector1D0, false);
      subLine0.getSegments();
      OrientedPoint orientedPoint1 = orientedPoint0.copySelf();
      IntervalsSet intervalsSet0 = orientedPoint1.wholeSpace();
      SubLine subLine1 = new SubLine(line0, intervalsSet0);
      // Undeclared exception!
      subLine0.intersection(subLine1, true);
  }
}
