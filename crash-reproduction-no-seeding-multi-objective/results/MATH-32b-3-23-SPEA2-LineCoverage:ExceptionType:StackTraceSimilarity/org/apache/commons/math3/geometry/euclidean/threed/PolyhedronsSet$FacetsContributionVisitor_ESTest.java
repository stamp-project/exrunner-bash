/*

 * Mon Apr 20 11:21:10 UTC 2020
 */

package org.apache.commons.math3.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet;
import org.apache.commons.math3.geometry.euclidean.threed.RotationOrder;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class PolyhedronsSet$FacetsContributionVisitor_ESTest extends PolyhedronsSet$FacetsContributionVisitor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = (-3.4028234663852886E38);
      double double1 = 0.0;
      double double2 = 731.524614;
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet((-3.4028234663852886E38), 2593.118266791, 0.0, 2593.118266791, (-3.4028234663852886E38), 731.524614);
      RotationOrder rotationOrder0 = RotationOrder.YZX;
      Vector3D vector3D0 = rotationOrder0.getA1();
      Vector3D vector3D1 = new Vector3D((-3.4028234663852886E38), vector3D0, 731.524614, vector3D0, (-3.4028234663852886E38), vector3D0);
      polyhedronsSet0.translate(vector3D1);
      // Undeclared exception!
      polyhedronsSet0.getBarycenter();
  }
}
