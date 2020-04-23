/*

 * Tue Apr 21 10:34:50 UTC 2020
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
      double double0 = 1.0005426743657024;
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0005426743657024, 1.0005426743657024);
      fDistributionImpl0.cumulativeProbability((-941.7193013), (-941.7193013));
      fDistributionImpl0.cumulativeProbability((-2209.3956870329), 0.9991267484523586);
      // Undeclared exception!
      fDistributionImpl0.inverseCumulativeProbability(0.5);
  }
}
