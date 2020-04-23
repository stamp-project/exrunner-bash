/*

 * Mon Apr 20 11:23:06 UTC 2020
 */

package org.apache.commons.math3.geometry.partitioning;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D;
import org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.Line;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.euclidean.twod.Segment;
import org.apache.commons.math3.geometry.euclidean.twod.SubLine;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractRegion_ESTest extends AbstractRegion_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet();
      polyhedronsSet0.getBoundarySize();
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 0.0;
      Vector2D vector2D0 = new Vector2D(doubleArray0);
      Line line0 = new Line(vector2D0, 0.0);
      Segment segment0 = new Segment(vector2D0, vector2D0, line0);
      SubLine subLine0 = new SubLine(segment0);
      Euclidean3D euclidean3D0 = Euclidean3D.getInstance();
      Euclidean2D euclidean2D0 = euclidean3D0.getSubSpace();
      Euclidean2D euclidean2D1 = Euclidean2D.getInstance();
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn("^O}`O^HL", "^O}`O^HL", "^O}`O^HL", "", "p}{U1!NiG").when(bSPTree0).toString();
      doReturn("^O}`O^HL", line0, euclidean2D0, euclidean2D1).when(bSPTree0).getAttribute();
      doReturn(subLine0, subLine0, subLine0, subLine0).when(bSPTree0).getCut();
      polyhedronsSet0.getTree(false);
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      polygonsSet0.getBoundarySize();
      polygonsSet0.getBoundarySize();
      // Undeclared exception!
      polygonsSet0.getSize();
  }
}
