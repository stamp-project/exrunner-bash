/*

 * Tue Apr 21 10:04:47 UTC 2020
 */

package org.apache.commons.math.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.distribution.PoissonDistributionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class PoissonDistributionImpl_ESTest extends PoissonDistributionImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(6.283185307179586);
      int int0 = (-1685684224);
      poissonDistributionImpl0.normalApproximateProbability((-1685684224));
      double double0 = (-2242.547904);
      PoissonDistributionImpl poissonDistributionImpl1 = new PoissonDistributionImpl((-2242.547904));
  }
}
