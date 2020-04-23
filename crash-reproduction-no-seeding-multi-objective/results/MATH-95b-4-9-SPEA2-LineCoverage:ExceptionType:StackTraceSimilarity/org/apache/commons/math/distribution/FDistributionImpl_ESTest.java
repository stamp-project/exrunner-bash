/*

 * Tue Apr 21 10:33:24 UTC 2020
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
      double double0 = 1.7976931348623157E308;
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.7976931348623157E308, 1.7976931348623157E308);
      fDistributionImpl0.getInitialDomain(1.7976931348623157E308);
      double double1 = 3052.1760421;
      fDistributionImpl0.setNumeratorDegreesOfFreedom(1.0);
      double double2 = 1.0;
      fDistributionImpl0.setDenominatorDegreesOfFreedom(1.0);
      // Undeclared exception!
      fDistributionImpl0.inverseCumulativeProbability(2.1743961811521265E-4);
  }
}
