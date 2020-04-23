/*

 * Tue Apr 21 10:33:17 UTC 2020
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
      double double0 = 155.071;
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(155.071, 4.652362892704858E-5);
      fDistributionImpl0.cumulativeProbability(155.071);
      fDistributionImpl0.setNumeratorDegreesOfFreedom(4.652362892704858E-5);
      fDistributionImpl0.cumulativeProbability(155.071);
      fDistributionImpl0.setNumeratorDegreesOfFreedom(3.521647976899578E-4);
      // Undeclared exception!
      fDistributionImpl0.inverseCumulativeProbability(0.5000586610532151);
  }
}
