/*

 * Tue Apr 21 10:03:28 UTC 2020
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
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(9.223372036854776E18);
      double double0 = 50.017;
      double double1 = (-1950.4999460975034);
      int int0 = 0;
      PoissonDistributionImpl poissonDistributionImpl1 = new PoissonDistributionImpl(50.017, (-1950.4999460975034), 0);
      poissonDistributionImpl1.sample();
      int int1 = 1560;
      PoissonDistributionImpl poissonDistributionImpl2 = new PoissonDistributionImpl(33, (-3268.172095), 1560);
      PoissonDistributionImpl poissonDistributionImpl3 = new PoissonDistributionImpl((-3268.172095));
  }
}
