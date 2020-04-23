/*

 * Tue Apr 21 06:19:20 UTC 2020
 */

package org.apache.commons.math3.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.geometry.euclidean.threed.Line;
import org.apache.commons.math3.geometry.euclidean.threed.RotationOrder;
import org.apache.commons.math3.geometry.euclidean.threed.SubLine;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class SubLine_ESTest extends SubLine_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      Vector3D vector3D0 = rotationOrder0.getA3();
      Vector3D vector3D1 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn((-1877.301503103504)).when(vector3D1).dotProduct(nullable(org.apache.commons.math3.geometry.Vector.class));
      doReturn(vector3D0).when(vector3D1).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      Line line0 = null;
      IntervalsSet intervalsSet0 = new IntervalsSet((BSPTree<Euclidean1D>) null);
      SubLine subLine0 = new SubLine((Line) null, intervalsSet0);
      Vector3D vector3D2 = Vector3D.ZERO;
      Vector1D vector1D0 = Vector1D.ONE;
      Line line1 = new Line(vector3D1, vector3D1);
      SubLine subLine1 = new SubLine(line1, intervalsSet0);
      Vector3D vector3D3 = Vector3D.NEGATIVE_INFINITY;
      SubLine subLine2 = new SubLine(vector3D2, vector3D3);
      // Undeclared exception!
      subLine2.intersection(subLine1, true);
  }
}
