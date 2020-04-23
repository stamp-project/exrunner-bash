/*

 * Tue Apr 21 10:33:44 UTC 2020
 */

package org.apache.commons.math.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.distribution.BetaDistributionImpl;
import org.apache.commons.math.distribution.FDistributionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractContinuousDistribution_ESTest extends AbstractContinuousDistribution_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BetaDistributionImpl betaDistributionImpl0 = new BetaDistributionImpl(259.267694294, (-1.0));
      betaDistributionImpl0.setBeta(208.0);
      betaDistributionImpl0.cumulativeProbability((-1.0), 4078.0983719417);
      betaDistributionImpl0.cumulativeProbability((-1455.01504893), 278.79336955);
      betaDistributionImpl0.cumulativeProbability(208.0);
      BetaDistributionImpl betaDistributionImpl1 = new BetaDistributionImpl(259.267694294, 3.6899182659531625E-6);
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(3.6899182659531625E-6, 3.6899182659531625E-6);
      // Undeclared exception!
      fDistributionImpl0.inverseCumulativeProbability(1.0E-6);
  }
}
