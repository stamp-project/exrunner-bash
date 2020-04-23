/*

 * Mon Apr 20 11:27:31 UTC 2020
 */

package org.apache.commons.math3.geometry.partitioning;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractRegion_ESTest extends AbstractRegion_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>();
      BSPTree<Euclidean2D> bSPTree1 = bSPTree0.copySelf();
      bSPTree0.setAttribute(bSPTree1);
      bSPTree0.insertInTree(bSPTree1, false);
      BSPTree<Euclidean2D> bSPTree2 = new BSPTree<Euclidean2D>();
      BSPTree<Euclidean2D> bSPTree3 = bSPTree0.copySelf();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree3);
      // Undeclared exception!
      polygonsSet0.getSize();
  }
}
