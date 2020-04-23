/*

 * Tue Apr 21 10:33:23 UTC 2020
 */

package org.apache.commons.math.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.distribution.FDistributionImpl;
import org.apache.commons.math.distribution.GammaDistributionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractContinuousDistribution_ESTest extends AbstractContinuousDistribution_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Double double0 = new Double((-278.12351098202487));
      GammaDistributionImpl gammaDistributionImpl0 = new GammaDistributionImpl(7.680599382182529, 2082.9);
      gammaDistributionImpl0.setAlpha(0.0022864073685797785);
      gammaDistributionImpl0.setBeta(0.39349525533129004);
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(7.680599382182529, 1.0);
      fDistributionImpl0.setNumeratorDegreesOfFreedom(1.0E-15);
      // Undeclared exception!
      fDistributionImpl0.inverseCumulativeProbability(0.12386);
  }
}
