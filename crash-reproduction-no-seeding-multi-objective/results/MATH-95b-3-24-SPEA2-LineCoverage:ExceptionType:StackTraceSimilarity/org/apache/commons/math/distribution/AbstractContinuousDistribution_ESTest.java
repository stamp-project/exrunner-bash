/*

 * Tue Apr 21 10:34:42 UTC 2020
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
public class AbstractContinuousDistribution_ESTest extends AbstractContinuousDistribution_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(3350.4233304939, 3350.4233304939);
      fDistributionImpl0.inverseCumulativeProbability(1.0E-6);
      double double0 = (-859.978);
      FDistributionImpl fDistributionImpl1 = new FDistributionImpl(1.5, 0.5);
      fDistributionImpl0.inverseCumulativeProbability(2.1743961811521265E-4);
      // Undeclared exception!
      fDistributionImpl1.inverseCumulativeProbability(2.1743961811521265E-4);
  }
}
