/*

 * Tue Apr 21 10:05:34 UTC 2020
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
      double double0 = 6.283185307179586;
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(6.283185307179586, 6.283185307179586, (-1674));
      double double1 = 1695.281911295907;
      PoissonDistributionImpl poissonDistributionImpl1 = new PoissonDistributionImpl(1695.281911295907);
      poissonDistributionImpl0.cumulativeProbability((-951));
      PoissonDistributionImpl poissonDistributionImpl2 = new PoissonDistributionImpl(1695.281911295907);
      PoissonDistributionImpl poissonDistributionImpl3 = new PoissonDistributionImpl((-685.466296));
  }
}
