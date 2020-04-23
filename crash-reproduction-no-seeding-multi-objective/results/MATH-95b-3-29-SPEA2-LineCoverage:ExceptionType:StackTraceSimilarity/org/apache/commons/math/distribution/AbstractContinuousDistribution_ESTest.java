/*

 * Tue Apr 21 10:35:07 UTC 2020
 */

package org.apache.commons.math.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.distribution.NormalDistributionImpl;
import org.apache.commons.math.distribution.WeibullDistributionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractContinuousDistribution_ESTest extends AbstractContinuousDistribution_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      double double0 = 3347.08099;
      normalDistributionImpl0.setStandardDeviation(1.0E-8);
      normalDistributionImpl0.setMean((-1.7976931348623157E308));
      double double1 = 958.13558;
      WeibullDistributionImpl weibullDistributionImpl0 = new WeibullDistributionImpl(1.0E-8, 958.13558);
      weibullDistributionImpl0.getDomainUpperBound(1981.1148959987);
      // Undeclared exception!
      normalDistributionImpl0.inverseCumulativeProbability(1.0E-15);
  }
}
