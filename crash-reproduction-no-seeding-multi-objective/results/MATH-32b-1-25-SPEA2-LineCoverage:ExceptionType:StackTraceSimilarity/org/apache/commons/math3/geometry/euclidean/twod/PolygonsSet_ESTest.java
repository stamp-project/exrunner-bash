/*

 * Mon Apr 20 11:21:09 UTC 2020
 */

package org.apache.commons.math3.geometry.euclidean.twod;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.Line;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.euclidean.twod.SubLine;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class PolygonsSet_ESTest extends PolygonsSet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Euclidean2D euclidean2D0 = Euclidean2D.getInstance();
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 574.48184960458;
      doubleArray0[1] = 574.48184960458;
      Vector2D vector2D0 = new Vector2D(doubleArray0);
      Vector2D vector2D1 = new Vector2D(574.48184960458, vector2D0, (-1.0), vector2D0, 1348.08832841748, vector2D0, (-1.0E-10), vector2D0);
      Line line0 = new Line(vector2D1, (-6.032174644509064E-23));
      Line line1 = new Line(line0);
      SubLine subLine0 = line1.wholeHyperplane();
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(euclidean2D0, line0).when(bSPTree0).getAttribute();
      doReturn(subLine0, subLine0).when(bSPTree0).getCut();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet0.computeGeometricalProperties();
  }
}
