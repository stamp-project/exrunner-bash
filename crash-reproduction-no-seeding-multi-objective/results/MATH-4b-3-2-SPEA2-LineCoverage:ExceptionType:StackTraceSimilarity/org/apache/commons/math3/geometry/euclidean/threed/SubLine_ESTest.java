/*

 * Tue Apr 21 06:18:54 UTC 2020
 */

package org.apache.commons.math3.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
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
      Vector3D vector3D0 = Vector3D.NaN;
      SubLine subLine0 = new SubLine(vector3D0, vector3D0);
      IntervalsSet intervalsSet0 = new IntervalsSet();
      Line line0 = new Line(vector3D0, vector3D0);
      Line line1 = new Line(line0);
      SubLine subLine1 = new SubLine(line1, intervalsSet0);
      subLine0.getSegments();
      subLine1.getSegments();
      SubLine subLine2 = line1.wholeLine();
      // Undeclared exception!
      subLine2.intersection(subLine1, false);
  }
}
