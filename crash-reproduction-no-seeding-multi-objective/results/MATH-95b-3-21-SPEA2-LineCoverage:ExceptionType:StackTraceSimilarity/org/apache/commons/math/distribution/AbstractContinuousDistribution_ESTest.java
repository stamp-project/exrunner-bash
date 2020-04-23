/*

 * Tue Apr 21 10:34:32 UTC 2020
 */

package org.apache.commons.math.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.distribution.GammaDistributionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractContinuousDistribution_ESTest extends AbstractContinuousDistribution_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = 3087.4373726426065;
      GammaDistributionImpl gammaDistributionImpl0 = new GammaDistributionImpl(1.7976931348623157E308, 3087.4373726426065);
      // Undeclared exception!
      gammaDistributionImpl0.inverseCumulativeProbability(0.9999857617909105);
  }
}
