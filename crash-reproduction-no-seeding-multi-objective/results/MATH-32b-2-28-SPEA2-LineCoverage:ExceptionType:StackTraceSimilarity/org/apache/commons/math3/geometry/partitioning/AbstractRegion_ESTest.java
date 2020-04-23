/*

 * Mon Apr 20 11:28:00 UTC 2020
 */

package org.apache.commons.math3.geometry.partitioning;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint;
import org.apache.commons.math3.geometry.euclidean.oned.SubOrientedPoint;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.BoundarySizeVisitor;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractRegion_ESTest extends AbstractRegion_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IntervalsSet intervalsSet0 = new IntervalsSet();
      BoundarySizeVisitor<Euclidean3D> boundarySizeVisitor0 = new BoundarySizeVisitor<Euclidean3D>();
      Boolean boolean0 = new Boolean(false);
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      Object object0 = new Object();
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>();
      BSPTree<Euclidean2D> bSPTree1 = bSPTree0.copySelf();
      bSPTree1.getCut();
      Vector1D vector1D0 = new Vector1D(Double.POSITIVE_INFINITY);
      OrientedPoint orientedPoint0 = new OrientedPoint(vector1D0, false);
      OrientedPoint orientedPoint1 = orientedPoint0.copySelf();
      SubOrientedPoint subOrientedPoint0 = orientedPoint1.wholeHyperplane();
      BSPTree<Euclidean2D> bSPTree2 = new BSPTree<Euclidean2D>((SubHyperplane<Euclidean2D>) null, bSPTree0, bSPTree1, subOrientedPoint0);
      Boolean boolean1 = new Boolean(false);
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      PolygonsSet polygonsSet1 = new PolygonsSet(bSPTree2);
      // Undeclared exception!
      polygonsSet1.getSize();
  }
}
