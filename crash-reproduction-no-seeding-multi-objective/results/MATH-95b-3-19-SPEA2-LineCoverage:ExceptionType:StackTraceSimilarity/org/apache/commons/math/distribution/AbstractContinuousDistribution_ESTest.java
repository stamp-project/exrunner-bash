/*

 * Tue Apr 21 10:35:44 UTC 2020
 */

package org.apache.commons.math.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.distribution.CauchyDistributionImpl;
import org.apache.commons.math.distribution.NormalDistributionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractContinuousDistribution_ESTest extends AbstractContinuousDistribution_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CauchyDistributionImpl cauchyDistributionImpl0 = new CauchyDistributionImpl();
      Double double0 = new Double(1.0);
      double double1 = 1702.4349721694507;
      Double double2 = new Double(1.0);
      cauchyDistributionImpl0.cumulativeProbability((double) double2);
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl(4097.2152294170655, 1702.4349721694507);
      cauchyDistributionImpl0.cumulativeProbability(676.0);
      cauchyDistributionImpl0.inverseCumulativeProbability(1.0);
      normalDistributionImpl0.setStandardDeviation(Double.POSITIVE_INFINITY);
      // Undeclared exception!
      normalDistributionImpl0.inverseCumulativeProbability(0.9995291277307716);
  }
}
