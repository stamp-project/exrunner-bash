/*

 * Mon Apr 20 11:15:02 UTC 2020
 */

package org.apache.commons.math3.geometry.partitioning;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
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
public class AbstractRegion_ESTest extends AbstractRegion_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object object0 = new Object();
      BSPTree<Euclidean1D> bSPTree0 = new BSPTree<Euclidean1D>(object0);
      BSPTree<Euclidean1D> bSPTree1 = new BSPTree<Euclidean1D>();
      IntervalsSet intervalsSet0 = new IntervalsSet(bSPTree1);
      intervalsSet0.buildNew(bSPTree0);
      double double0 = 1.0;
      Vector2D vector2D0 = Vector2D.NaN;
      Vector2D vector2D1 = new Vector2D((-2898.55363603096), vector2D0);
      Vector2D vector2D2 = new Vector2D(1.0, vector2D1, 1.0, vector2D1, 1.0, vector2D0, (-2898.55363603096), vector2D1);
      Vector2D vector2D3 = Vector2D.NEGATIVE_INFINITY;
      Line line0 = new Line(vector2D2, vector2D3);
      Line line1 = new Line(line0);
      IntervalsSet intervalsSet1 = new IntervalsSet(bSPTree0);
      SubLine subLine0 = new SubLine(line0, intervalsSet0);
      Object object1 = new Object();
      BSPTree<Euclidean2D> bSPTree2 = new BSPTree<Euclidean2D>(object1);
      SubLine subLine1 = line0.wholeHyperplane();
      BSPTree<Euclidean2D> bSPTree3 = new BSPTree<Euclidean2D>(subLine1, bSPTree2, bSPTree2, bSPTree1);
      BSPTree<Euclidean2D> bSPTree4 = bSPTree3.getMinus();
      BSPTree.LeafMerger<Euclidean2D> bSPTree_LeafMerger0 = (BSPTree.LeafMerger<Euclidean2D>) mock(BSPTree.LeafMerger.class, new ViolatedAssumptionAnswer());
      doReturn(bSPTree2).when(bSPTree_LeafMerger0).merge(nullable(org.apache.commons.math3.geometry.partitioning.BSPTree.class) , nullable(org.apache.commons.math3.geometry.partitioning.BSPTree.class) , nullable(org.apache.commons.math3.geometry.partitioning.BSPTree.class) , anyBoolean() , anyBoolean());
      BSPTree.LeafMerger<Euclidean2D> bSPTree_LeafMerger1 = (BSPTree.LeafMerger<Euclidean2D>) mock(BSPTree.LeafMerger.class, new ViolatedAssumptionAnswer());
      doReturn((BSPTree) null).when(bSPTree_LeafMerger1).merge(nullable(org.apache.commons.math3.geometry.partitioning.BSPTree.class) , nullable(org.apache.commons.math3.geometry.partitioning.BSPTree.class) , nullable(org.apache.commons.math3.geometry.partitioning.BSPTree.class) , anyBoolean() , anyBoolean());
      bSPTree3.merge(bSPTree2, bSPTree_LeafMerger1);
      bSPTree4.merge(bSPTree2, bSPTree_LeafMerger0);
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree2);
      // Undeclared exception!
      polygonsSet0.getSize();
  }
}
