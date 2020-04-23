/*

 * Tue Apr 21 10:34:59 UTC 2020
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
      BetaDistributionImpl betaDistributionImpl0 = new BetaDistributionImpl(0.0, 0.0);
      betaDistributionImpl0.inverseCumulativeProbability(0.0);
      Double double0 = new Double(0.0);
      Double.min(0.0, 968.8448681904453);
      betaDistributionImpl0.setAlpha((-911.255336));
      betaDistributionImpl0.cumulativeProbability((double) double0, 1.0E-8);
      betaDistributionImpl0.inverseCumulativeProbability(Double.NaN);
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(3.399464998481189E-5, 3.399464998481189E-5);
      Double.min((-2827.4549), (-731.605274));
      BetaDistributionImpl betaDistributionImpl1 = new BetaDistributionImpl(1571.420622953917, (-522.171902));
      betaDistributionImpl0.setAlpha(751.286270608);
      // Undeclared exception!
      fDistributionImpl0.inverseCumulativeProbability(1.0E-8);
  }
}
