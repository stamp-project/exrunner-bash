/*

 * Tue Apr 21 10:35:00 UTC 2020
 */

package org.apache.commons.math.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.distribution.BetaDistributionImpl;
import org.apache.commons.math.distribution.ChiSquaredDistributionImpl;
import org.apache.commons.math.distribution.GammaDistributionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractContinuousDistribution_ESTest extends AbstractContinuousDistribution_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = 0.0;
      BetaDistributionImpl betaDistributionImpl0 = new BetaDistributionImpl(0.0, 0.0);
      betaDistributionImpl0.cumulativeProbability(0.9999920343027662, 178.5562938);
      betaDistributionImpl0.cumulativeProbability(0.0, 0.0);
      GammaDistributionImpl gammaDistributionImpl0 = new GammaDistributionImpl(1.0, Double.POSITIVE_INFINITY);
      ChiSquaredDistributionImpl chiSquaredDistributionImpl0 = new ChiSquaredDistributionImpl(1.0, gammaDistributionImpl0);
      double double1 = 1.0E-6;
      // Undeclared exception!
      chiSquaredDistributionImpl0.inverseCumulativeProbability(0.9996271377295831);
  }
}
