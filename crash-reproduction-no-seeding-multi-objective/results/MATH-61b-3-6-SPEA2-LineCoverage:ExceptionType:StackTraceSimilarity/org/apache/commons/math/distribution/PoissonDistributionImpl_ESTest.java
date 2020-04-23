/*

 * Tue Apr 21 10:02:38 UTC 2020
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
      double double0 = 2494.925608667;
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(2494.925608667);
      double double1 = 1704.7584183;
      poissonDistributionImpl0.getDomainLowerBound(1704.7584183);
      double double2 = 0.0;
      PoissonDistributionImpl poissonDistributionImpl1 = new PoissonDistributionImpl(0.0);
  }
}
