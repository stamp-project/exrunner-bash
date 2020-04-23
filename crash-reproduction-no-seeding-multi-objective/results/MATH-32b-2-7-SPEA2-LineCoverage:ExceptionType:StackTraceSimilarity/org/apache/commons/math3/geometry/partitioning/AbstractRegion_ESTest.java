/*

 * Mon Apr 20 11:02:35 UTC 2020
 */

package org.apache.commons.math3.geometry.partitioning;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.partitioning.AbstractRegion;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractRegion_ESTest extends AbstractRegion_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = (-1.0);
      double double1 = 1319.712816637;
      double double2 = 0.0;
      PolygonsSet polygonsSet0 = new PolygonsSet((-1.0), 1319.712816637, (-1.0), 0.0);
      Integer integer0 = new Integer(1383);
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(integer0);
      bSPTree0.getPlus();
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree0);
      AbstractRegion abstractRegion0 = polygonsSet1.copySelf();
      // Undeclared exception!
      abstractRegion0.getSize();
  }
}
