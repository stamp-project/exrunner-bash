/*

 * Tue Apr 21 06:19:38 UTC 2020
 */

package org.apache.commons.math3.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.geometry.euclidean.threed.Line;
import org.apache.commons.math3.geometry.euclidean.threed.SubLine;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class SubLine_ESTest extends SubLine_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      Vector1D vector1D0 = Vector1D.NEGATIVE_INFINITY;
      Vector1D vector1D1 = Vector1D.ZERO;
      Vector1D vector1D2 = new Vector1D((-1197.0), vector1D0, (-1197.0), vector1D1, 0.0, vector1D0);
      Vector1D vector1D3 = new Vector1D(0.0, vector1D0, 1.2599210498948732, vector1D1, (-1197.0), vector1D0, 1383.029034708, vector1D2);
      Line line0 = new Line(vector3D0, vector3D0);
      SubLine subLine0 = new SubLine(line0, (IntervalsSet) null);
      Vector3D vector3D1 = Vector3D.NaN;
      SubLine subLine1 = line0.wholeLine();
      // Undeclared exception!
      subLine0.intersection(subLine1, true);
  }
}
