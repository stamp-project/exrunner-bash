/*

 * Tue Apr 21 10:04:50 UTC 2020
 */

package org.apache.commons.math.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.distribution.PoissonDistributionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class PoissonDistributionImpl_ESTest extends PoissonDistributionImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = 77.98910523685471;
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(77.98910523685471, 77.98910523685471);
      int int0 = 1211;
      PoissonDistributionImpl poissonDistributionImpl1 = new PoissonDistributionImpl(3.0, 3.0, 1211);
      PoissonDistributionImpl poissonDistributionImpl2 = new PoissonDistributionImpl(0.0, 1.0E-12);
  }
}
