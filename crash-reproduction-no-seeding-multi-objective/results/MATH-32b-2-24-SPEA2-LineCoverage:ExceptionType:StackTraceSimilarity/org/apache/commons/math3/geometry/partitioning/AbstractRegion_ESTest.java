/*

 * Mon Apr 20 11:20:52 UTC 2020
 */

package org.apache.commons.math3.geometry.partitioning;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.Line;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.euclidean.twod.Segment;
import org.apache.commons.math3.geometry.euclidean.twod.SubLine;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractRegion_ESTest extends AbstractRegion_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Euclidean1D.getInstance();
      Vector2D vector2D0 = new Vector2D(210.82, 210.82);
      Line line0 = new Line(vector2D0, vector2D0);
      Segment segment0 = new Segment(vector2D0, vector2D0, line0);
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(vector2D0);
      SubLine subLine0 = line0.wholeHyperplane();
      BSPTree<Euclidean2D> bSPTree1 = bSPTree0.split(subLine0);
      bSPTree1.getMinus();
      Vector2D vector2D1 = new Vector2D(210.82, 0.0);
      Vector2D vector2D2 = Vector2D.NEGATIVE_INFINITY;
      Vector2D vector2D3 = new Vector2D(210.82, vector2D2);
      Vector2D vector2D4 = new Vector2D(1.0, vector2D2, 210.82, vector2D1, 771.2559872142231, vector2D2);
      Line line1 = new Line(vector2D3, vector2D4);
      Segment segment1 = new Segment(vector2D4, vector2D0, line0);
      BSPTree<Euclidean2D> bSPTree2 = new BSPTree<Euclidean2D>(bSPTree0);
      line1.wholeHyperplane();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree2);
      // Undeclared exception!
      polygonsSet0.getSize();
  }
}
