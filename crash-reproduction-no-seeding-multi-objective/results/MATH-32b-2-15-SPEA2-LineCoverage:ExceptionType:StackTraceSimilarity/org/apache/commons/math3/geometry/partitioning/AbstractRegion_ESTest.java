/*

 * Mon Apr 20 11:11:10 UTC 2020
 */

package org.apache.commons.math3.geometry.partitioning;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.NumberFormat;
import java.util.Locale;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D;
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
      Locale locale0 = Locale.GERMAN;
      BSPTree<Euclidean1D> bSPTree0 = new BSPTree<Euclidean1D>();
      Euclidean3D euclidean3D0 = Euclidean3D.getInstance();
      Euclidean2D euclidean2D0 = euclidean3D0.getSubSpace();
      Euclidean2D.getInstance();
      bSPTree0.setAttribute(euclidean2D0);
      NumberFormat numberFormat0 = NumberFormat.getPercentInstance();
      BSPTree<Euclidean2D> bSPTree1 = new BSPTree<Euclidean2D>(numberFormat0);
      BSPTree<Euclidean2D> bSPTree2 = bSPTree1.copySelf();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree2);
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree1);
      polygonsSet1.getVertices();
      // Undeclared exception!
      polygonsSet1.getSize();
  }
}
