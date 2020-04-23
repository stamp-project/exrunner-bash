/*

 * Tue Apr 21 10:33:49 UTC 2020
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
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(Double.NaN, 57.15623566586292);
      fDistributionImpl0.inverseCumulativeProbability(1.0E-8);
      fDistributionImpl0.setDenominatorDegreesOfFreedom(1.0E-8);
      // Undeclared exception!
      fDistributionImpl0.inverseCumulativeProbability(Double.NaN);
  }
}
