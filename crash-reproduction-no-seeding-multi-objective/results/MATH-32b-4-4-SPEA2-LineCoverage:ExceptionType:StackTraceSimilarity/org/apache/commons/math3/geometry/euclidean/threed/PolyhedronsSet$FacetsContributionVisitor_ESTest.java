/*

 * Mon Apr 20 11:00:52 UTC 2020
 */

package org.apache.commons.math3.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D;
import org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet;
import org.apache.commons.math3.geometry.euclidean.threed.Rotation;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class PolyhedronsSet$FacetsContributionVisitor_ESTest extends PolyhedronsSet$FacetsContributionVisitor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BSPTree<Euclidean3D> bSPTree0 = new BSPTree<Euclidean3D>();
      Vector3D vector3D0 = Vector3D.PLUS_J;
      Vector3D vector3D1 = new Vector3D((-1743.913211402), vector3D0, (-380.549629200366), vector3D0, (-1743.913211402), vector3D0);
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet((-250.7900688700369), 1.633123935319537E16, (-686.6), 1.633123935319537E16, (-686.6), 1193.09536);
      Rotation rotation0 = Rotation.IDENTITY;
      PolyhedronsSet polyhedronsSet1 = polyhedronsSet0.rotate(vector3D1, rotation0);
      // Undeclared exception!
      polyhedronsSet1.getSize();
  }
}
