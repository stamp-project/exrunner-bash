/*

 * Tue Apr 21 10:03:42 UTC 2020
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
      double double0 = 2709.738742;
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(2709.738742);
      poissonDistributionImpl0.cumulativeProbability(1755);
      poissonDistributionImpl0.sample();
      poissonDistributionImpl0.getDomainUpperBound(0.5);
      poissonDistributionImpl0.reseedRandomGenerator(2631);
      poissonDistributionImpl0.probability(214);
      poissonDistributionImpl0.sample();
      poissonDistributionImpl0.getMean();
      poissonDistributionImpl0.inverseCumulativeProbability(0.5);
      PoissonDistributionImpl poissonDistributionImpl1 = new PoissonDistributionImpl((-3056.57374));
  }
}
