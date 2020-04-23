/*

 * Tue Apr 21 10:33:11 UTC 2020
 */

package org.apache.commons.math.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.distribution.FDistributionImpl;
import org.apache.commons.math.distribution.TDistributionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractContinuousDistribution_ESTest extends AbstractContinuousDistribution_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = 0.0;
      Double double1 = new Double(0.0);
      Double double2 = new Double(2421.802302);
      double double3 = 2421.802302;
      TDistributionImpl tDistributionImpl0 = new TDistributionImpl(259.0678017628);
      Double double4 = new Double(2271.2);
      double double5 = 5.81496566278536;
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(5.81496566278536, 1.0);
      // Undeclared exception!
      fDistributionImpl0.inverseCumulativeProbability(4.9E-324);
  }
}
