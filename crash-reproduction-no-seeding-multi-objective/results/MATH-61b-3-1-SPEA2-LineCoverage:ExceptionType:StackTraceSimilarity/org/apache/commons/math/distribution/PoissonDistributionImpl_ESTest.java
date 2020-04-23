/*

 * Tue Apr 21 10:01:07 UTC 2020
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
      double double0 = 2542.657;
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(2542.657);
      poissonDistributionImpl0.getDomainUpperBound(2542.657);
      double double1 = 1.4456468917292502E-16;
      PoissonDistributionImpl poissonDistributionImpl1 = new PoissonDistributionImpl(2542.657, 1.4456468917292502E-16, Integer.MAX_VALUE);
      poissonDistributionImpl0.getDomainUpperBound(2542.657);
      poissonDistributionImpl0.sample();
      poissonDistributionImpl1.probability(Integer.MAX_VALUE);
      PoissonDistributionImpl poissonDistributionImpl2 = new PoissonDistributionImpl(1.125);
      PoissonDistributionImpl poissonDistributionImpl3 = new PoissonDistributionImpl((-2.356194490192345));
  }
}
