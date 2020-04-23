/*

 * Mon Apr 20 11:04:13 UTC 2020
 */

package org.apache.commons.math3.geometry.partitioning;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.Line;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
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
      Vector3D vector3D0 = Vector3D.PLUS_J;
      IntervalsSet intervalsSet0 = new IntervalsSet(0.0, 0.0);
      Vector2D vector2D0 = new Vector2D(0.0, (-834.8));
      Line line0 = new Line(vector2D0, 1.0);
      SubLine subLine0 = new SubLine(line0, intervalsSet0);
      PolygonsSet polygonsSet0 = new PolygonsSet(0.0, (-4.813899778443457E-9), 70.05852, 0.0);
      BSPTree<Euclidean2D> bSPTree0 = polygonsSet0.getTree(false);
      BSPTree<Euclidean2D> bSPTree1 = bSPTree0.copySelf();
      BSPTree<Euclidean2D> bSPTree2 = bSPTree1.getCell(vector2D0);
      polygonsSet0.getTree(true);
      BSPTree<Euclidean2D> bSPTree3 = new BSPTree<Euclidean2D>(subLine0, bSPTree2, bSPTree2, intervalsSet0);
      BSPTree<Euclidean2D> bSPTree4 = bSPTree2.copySelf();
      BSPTree<Euclidean2D> bSPTree5 = bSPTree4.split(subLine0);
      PolygonsSet polygonsSet1 = new PolygonsSet(bSPTree5);
      // Undeclared exception!
      polygonsSet1.getSize();
  }
}
