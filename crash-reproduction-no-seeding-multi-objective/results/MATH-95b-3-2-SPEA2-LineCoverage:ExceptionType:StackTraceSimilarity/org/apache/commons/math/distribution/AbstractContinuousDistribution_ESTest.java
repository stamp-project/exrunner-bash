/*

 * Tue Apr 21 10:32:49 UTC 2020
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
      double double0 = 144.541625;
      double double1 = 0.5;
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(144.541625, 0.5);
      // Undeclared exception!
      fDistributionImpl0.inverseCumulativeProbability(0.5);
  }
}
