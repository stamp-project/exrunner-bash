/*

 * Tue Apr 21 10:02:29 UTC 2020
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
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(0.5000000000042687, 0.5000000000042687);
      int int0 = 1447;
      PoissonDistributionImpl poissonDistributionImpl1 = new PoissonDistributionImpl(0.5000000000042687, 0.5000000000042687, 1447);
      poissonDistributionImpl1.reseedRandomGenerator((-2073L));
      PoissonDistributionImpl poissonDistributionImpl2 = new PoissonDistributionImpl(0.5000000000042687);
      poissonDistributionImpl0.probability((-2073L));
      poissonDistributionImpl0.getDomainUpperBound(0.5000000000042687);
      poissonDistributionImpl1.cumulativeProbability(1447);
      PoissonDistributionImpl poissonDistributionImpl3 = new PoissonDistributionImpl(0.5000000000042687, Integer.MAX_VALUE, 2313);
      PoissonDistributionImpl poissonDistributionImpl4 = new PoissonDistributionImpl((-1.0), (-1.0), 1447);
  }
}
