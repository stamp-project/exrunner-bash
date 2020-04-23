/*

 * Mon Apr 20 10:59:15 UTC 2020
 */

package org.apache.commons.math3.geometry.partitioning;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet;
import org.apache.commons.math3.geometry.euclidean.threed.RotationOrder;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.Hyperplane;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractRegion_ESTest extends AbstractRegion_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Hyperplane<Euclidean1D> hyperplane0 = (Hyperplane<Euclidean1D>) mock(Hyperplane.class, new ViolatedAssumptionAnswer());
      RotationOrder rotationOrder0 = RotationOrder.ZXZ;
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet();
      BSPTree<Euclidean1D> bSPTree0 = new BSPTree<Euclidean1D>();
      Euclidean1D euclidean1D0 = Euclidean1D.getInstance();
      bSPTree0.setAttribute(euclidean1D0);
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      PolygonsSet polygonsSet0 = new PolygonsSet();
      BSPTree<Euclidean2D> bSPTree1 = new BSPTree<Euclidean2D>(bSPTree0);
      polygonsSet0.copySelf();
      IntervalsSet intervalsSet0 = new IntervalsSet(bSPTree0);
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree1);
      // Undeclared exception!
      polygonsSet1.getSize();
  }
}
