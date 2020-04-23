/*

 * Tue Apr 21 10:05:39 UTC 2020
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
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(1463.85223901895);
      poissonDistributionImpl0.normalApproximateProbability((-1));
      poissonDistributionImpl0.getDomainLowerBound(0.0);
      poissonDistributionImpl0.inverseCumulativeProbability(0.0);
      poissonDistributionImpl0.cumulativeProbability(0);
      poissonDistributionImpl0.getDomainUpperBound(0.5);
      poissonDistributionImpl0.sample();
      PoissonDistributionImpl poissonDistributionImpl1 = new PoissonDistributionImpl(0);
  }
}
