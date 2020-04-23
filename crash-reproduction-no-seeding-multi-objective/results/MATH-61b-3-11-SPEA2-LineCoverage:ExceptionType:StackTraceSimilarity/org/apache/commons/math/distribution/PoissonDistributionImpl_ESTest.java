/*

 * Tue Apr 21 10:03:24 UTC 2020
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
      double double0 = 1451.224981197;
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(1451.224981197);
      PoissonDistributionImpl poissonDistributionImpl1 = new PoissonDistributionImpl(1451.224981197);
      PoissonDistributionImpl poissonDistributionImpl2 = new PoissonDistributionImpl(1451.224981197);
      PoissonDistributionImpl poissonDistributionImpl3 = new PoissonDistributionImpl((-488.7));
  }
}
