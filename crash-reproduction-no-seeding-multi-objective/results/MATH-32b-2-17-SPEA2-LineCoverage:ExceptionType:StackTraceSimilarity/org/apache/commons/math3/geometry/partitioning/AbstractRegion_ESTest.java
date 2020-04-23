/*

 * Mon Apr 20 11:13:53 UTC 2020
 */

package org.apache.commons.math3.geometry.partitioning;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D;
import org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.euclidean.twod.SubLine;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.Hyperplane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractRegion_ESTest extends AbstractRegion_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Hyperplane<Euclidean1D>[] hyperplaneArray0 = (Hyperplane<Euclidean1D>[]) Array.newInstance(Hyperplane.class, 2);
      BSPTree<Euclidean3D> bSPTree0 = new BSPTree<Euclidean3D>();
      BSPTree<Euclidean3D> bSPTree1 = new BSPTree<Euclidean3D>();
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet();
      BSPTree<Euclidean1D> bSPTree2 = new BSPTree<Euclidean1D>();
      Vector2D vector2D0 = Vector2D.NaN;
      IntervalsSet intervalsSet0 = new IntervalsSet();
      IntervalsSet intervalsSet1 = intervalsSet0.buildNew(bSPTree2);
      BSPTree<Euclidean2D> bSPTree3 = new BSPTree<Euclidean2D>();
      BSPTree<Euclidean2D> bSPTree4 = bSPTree3.copySelf();
      Vector2D vector2D1 = Vector2D.ZERO;
      bSPTree4.setAttribute(intervalsSet1);
      SubLine subLine0 = new SubLine(vector2D0, vector2D1);
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree4);
      bSPTree4.split(subLine0);
      PolygonsSet polygonsSet1 = new PolygonsSet(bSPTree4);
      // Undeclared exception!
      polygonsSet1.getSize();
  }
}
