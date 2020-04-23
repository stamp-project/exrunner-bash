/*

 * Tue Apr 21 10:03:19 UTC 2020
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
      double double0 = 0.40679654756615014;
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(0.40679654756615014);
      double double1 = (-4736.56978781);
      PoissonDistributionImpl poissonDistributionImpl1 = new PoissonDistributionImpl(0.40679654756615014, (-4736.56978781));
      double double2 = (-731.02654);
      int int0 = 3074;
      PoissonDistributionImpl poissonDistributionImpl2 = new PoissonDistributionImpl((-731.02654), 0.40679654756615014, 3074);
  }
}
