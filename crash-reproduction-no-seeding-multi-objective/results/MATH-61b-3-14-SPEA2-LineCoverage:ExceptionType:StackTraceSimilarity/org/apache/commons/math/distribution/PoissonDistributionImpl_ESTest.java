/*

 * Tue Apr 21 10:03:53 UTC 2020
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
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(746.913, 746.913);
      int int0 = 0;
      double double0 = 1.0E-12;
      PoissonDistributionImpl poissonDistributionImpl1 = new PoissonDistributionImpl(1.0E-12);
      poissonDistributionImpl1.probability(0);
      double double1 = (-2399.8241743306985);
      PoissonDistributionImpl poissonDistributionImpl2 = new PoissonDistributionImpl((-2399.8241743306985));
  }
}
