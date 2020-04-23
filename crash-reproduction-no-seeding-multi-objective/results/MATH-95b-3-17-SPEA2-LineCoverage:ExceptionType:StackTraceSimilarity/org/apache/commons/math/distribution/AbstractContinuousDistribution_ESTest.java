/*

 * Tue Apr 21 10:34:23 UTC 2020
 */

package org.apache.commons.math.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.distribution.FDistributionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractContinuousDistribution_ESTest extends AbstractContinuousDistribution_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(817.8, 20.0);
      double double0 = 1936.3182;
      FDistributionImpl fDistributionImpl1 = new FDistributionImpl(1936.3182, 1936.3182);
      fDistributionImpl1.setDenominatorDegreesOfFreedom(1.0);
      fDistributionImpl0.getDomainUpperBound(1.0);
      // Undeclared exception!
      fDistributionImpl1.inverseCumulativeProbability(1.0E-6);
  }
}
