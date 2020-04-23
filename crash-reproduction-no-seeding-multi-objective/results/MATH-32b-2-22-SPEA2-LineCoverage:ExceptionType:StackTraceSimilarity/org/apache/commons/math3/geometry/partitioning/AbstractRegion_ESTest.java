/*

 * Mon Apr 20 11:19:03 UTC 2020
 */

package org.apache.commons.math3.geometry.partitioning;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint;
import org.apache.commons.math3.geometry.euclidean.oned.SubOrientedPoint;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.Hyperplane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractRegion_ESTest extends AbstractRegion_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IntervalsSet intervalsSet0 = new IntervalsSet();
      intervalsSet0.getSize();
      intervalsSet0.getSize();
      intervalsSet0.getBarycenter();
      Hyperplane<Euclidean1D>[] hyperplaneArray0 = (Hyperplane<Euclidean1D>[]) Array.newInstance(Hyperplane.class, 2);
      Vector1D vector1D0 = Vector1D.ONE;
      OrientedPoint orientedPoint0 = new OrientedPoint(vector1D0, true);
      SubOrientedPoint subOrientedPoint0 = new SubOrientedPoint(orientedPoint0, intervalsSet0);
      OrientedPoint orientedPoint1 = orientedPoint0.copySelf();
      SubOrientedPoint subOrientedPoint1 = orientedPoint1.wholeHyperplane();
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(subOrientedPoint1);
      orientedPoint1.wholeHyperplane();
      bSPTree0.getParent();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet0.getSize();
  }
}
