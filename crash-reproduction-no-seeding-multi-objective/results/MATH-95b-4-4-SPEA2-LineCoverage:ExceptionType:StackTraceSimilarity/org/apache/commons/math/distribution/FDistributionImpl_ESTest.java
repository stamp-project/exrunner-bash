/*

 * Tue Apr 21 10:32:58 UTC 2020
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
      double double0 = 694.3840261;
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(Double.POSITIVE_INFINITY, 3975.72068100225);
      fDistributionImpl0.getInitialDomain(694.3840261);
      fDistributionImpl0.getNumeratorDegreesOfFreedom();
      FDistributionImpl fDistributionImpl1 = new FDistributionImpl(1.0005033066389295, 1.0005033066389295);
      FDistributionImpl fDistributionImpl2 = new FDistributionImpl(1151.82468292, 91.45634101208);
      // Undeclared exception!
      fDistributionImpl1.inverseCumulativeProbability(0.5);
  }
}
