/*

 * Mon Apr 20 11:14:55 UTC 2020
 */

package org.apache.commons.math3.geometry.partitioning;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.function.UnaryOperator;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D;
import org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet;
import org.apache.commons.math3.geometry.euclidean.threed.Rotation;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractRegion_ESTest extends AbstractRegion_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Euclidean3D.getInstance();
      LinkedList<SubHyperplane<Euclidean3D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean3D>>();
      UnaryOperator<SubHyperplane<Euclidean3D>> unaryOperator0 = UnaryOperator.identity();
      linkedList0.replaceAll(unaryOperator0);
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(linkedList0);
      Rotation rotation0 = Rotation.IDENTITY;
      PolyhedronsSet polyhedronsSet1 = new PolyhedronsSet();
      Vector1D vector1D0 = new Vector1D(0.0);
      PolygonsSet polygonsSet0 = new PolygonsSet();
      Object object0 = new Object();
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(polyhedronsSet1);
      bSPTree0.getMinus();
      bSPTree0.insertInTree((BSPTree<Euclidean2D>) null, true);
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree0);
      // Undeclared exception!
      polygonsSet1.getSize();
  }
}
