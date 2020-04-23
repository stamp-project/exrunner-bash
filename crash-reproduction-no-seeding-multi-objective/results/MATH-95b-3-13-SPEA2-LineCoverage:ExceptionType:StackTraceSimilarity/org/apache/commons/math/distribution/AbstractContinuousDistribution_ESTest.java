/*

 * Tue Apr 21 10:34:07 UTC 2020
 */

package org.apache.commons.math.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.distribution.BetaDistributionImpl;
import org.apache.commons.math.distribution.CauchyDistributionImpl;
import org.apache.commons.math.distribution.NormalDistributionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractContinuousDistribution_ESTest extends AbstractContinuousDistribution_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BetaDistributionImpl betaDistributionImpl0 = new BetaDistributionImpl(1.0E-6, 1.0E-6);
      betaDistributionImpl0.inverseCumulativeProbability(1.0E-6);
      betaDistributionImpl0.cumulativeProbability(1.0E-6);
      CauchyDistributionImpl cauchyDistributionImpl0 = new CauchyDistributionImpl();
      betaDistributionImpl0.cumulativeProbability(1732.0309138, 2501.55);
      cauchyDistributionImpl0.setScale(330.40345212454);
      double double0 = 220.41;
      betaDistributionImpl0.inverseCumulativeProbability(1.0);
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl(1.932112172471301, 1.0E-6);
      normalDistributionImpl0.setMean((-1.7976931348623157E308));
      // Undeclared exception!
      normalDistributionImpl0.inverseCumulativeProbability(1.0E-6);
  }
}
