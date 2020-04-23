/*

 * Tue Apr 21 10:34:25 UTC 2020
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
public class FDistributionImpl_ESTest extends FDistributionImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = 2.0;
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(0.5, 2.0);
      fDistributionImpl0.cumulativeProbability(1183.45567158);
      fDistributionImpl0.cumulativeProbability(Double.POSITIVE_INFINITY);
      FDistributionImpl fDistributionImpl1 = new FDistributionImpl(0.9991567974140376, 2.0);
      fDistributionImpl0.getDomainUpperBound(0.5);
      fDistributionImpl0.getDomainLowerBound((-662.624990338));
      FDistributionImpl fDistributionImpl2 = new FDistributionImpl(782.536140097916, 0.5);
      fDistributionImpl2.getDenominatorDegreesOfFreedom();
      fDistributionImpl2.cumulativeProbability(1.7976931348623157E308);
      fDistributionImpl0.setDenominatorDegreesOfFreedom(2872.0);
      fDistributionImpl0.cumulativeProbability(2.0);
      fDistributionImpl0.setDenominatorDegreesOfFreedom(Double.NaN);
      // Undeclared exception!
      fDistributionImpl1.inverseCumulativeProbability(Double.NaN);
  }
}
