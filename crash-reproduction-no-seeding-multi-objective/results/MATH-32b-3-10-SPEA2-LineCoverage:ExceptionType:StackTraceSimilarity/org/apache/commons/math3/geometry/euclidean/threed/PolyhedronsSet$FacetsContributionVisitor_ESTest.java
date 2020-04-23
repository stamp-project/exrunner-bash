/*

 * Mon Apr 20 11:08:07 UTC 2020
 */

package org.apache.commons.math3.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D;
import org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class PolyhedronsSet$FacetsContributionVisitor_ESTest extends PolyhedronsSet$FacetsContributionVisitor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BSPTree<Euclidean3D> bSPTree0 = new BSPTree<Euclidean3D>();
      BSPTreeVisitor<Euclidean3D> bSPTreeVisitor0 = (BSPTreeVisitor<Euclidean3D>) mock(BSPTreeVisitor.class, new ViolatedAssumptionAnswer());
      bSPTree0.visit(bSPTreeVisitor0);
      double double0 = (-1110.893882294);
      double double1 = (-507.5965);
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet((-1110.893882294), 362.21714, 362.21714, 3.4028234663852886E38, 1.0, 362.5878139783006);
      BSPTree<Euclidean3D> bSPTree1 = new BSPTree<Euclidean3D>();
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      polyhedronsSet0.checkPoint(vector3D0);
      bSPTree0.getParent();
      BSPTree<Euclidean3D> bSPTree2 = new BSPTree<Euclidean3D>();
      // Undeclared exception!
      polyhedronsSet0.getSize();
  }
}
