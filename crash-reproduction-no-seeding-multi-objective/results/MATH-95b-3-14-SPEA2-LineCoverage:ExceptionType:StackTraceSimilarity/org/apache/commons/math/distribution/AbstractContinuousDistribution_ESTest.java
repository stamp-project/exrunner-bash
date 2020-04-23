/*

 * Tue Apr 21 10:34:02 UTC 2020
 */

package org.apache.commons.math.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.distribution.NormalDistributionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractContinuousDistribution_ESTest extends AbstractContinuousDistribution_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      normalDistributionImpl0.inverseCumulativeProbability(1.0E-15);
      NormalDistributionImpl normalDistributionImpl1 = new NormalDistributionImpl(1.0E-15, 1.0E-6);
      normalDistributionImpl1.setStandardDeviation(Double.POSITIVE_INFINITY);
      // Undeclared exception!
      normalDistributionImpl1.inverseCumulativeProbability(1.0E-6);
  }
}
