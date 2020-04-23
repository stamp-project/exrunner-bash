/*

 * Tue Apr 21 10:36:25 UTC 2020
 */

package org.apache.commons.math.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.distribution.FDistributionImpl;
import org.apache.commons.math.distribution.GammaDistributionImpl;
import org.apache.commons.math.distribution.NormalDistributionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractContinuousDistribution_ESTest extends AbstractContinuousDistribution_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(2197.98174, 885.4822240444006);
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl();
      Double double0 = new Double(885.4822240444006);
      Double double1 = new Double(1.0E-8);
      GammaDistributionImpl gammaDistributionImpl0 = new GammaDistributionImpl(1.0E-8, 885.4822240444006);
      Double double2 = new Double(1.0E-8);
      Double double3 = new Double(0.0);
      Double.min((-2776.04), 1.0E-8);
      gammaDistributionImpl0.inverseCumulativeProbability((double) double1);
      FDistributionImpl fDistributionImpl1 = new FDistributionImpl(885.4822240444006, 1.0E-6);
      fDistributionImpl0.getDenominatorDegreesOfFreedom();
      GammaDistributionImpl gammaDistributionImpl1 = new GammaDistributionImpl(1270.572571611349, 1231.0504339);
      double double4 = 20.0;
      // Undeclared exception!
      fDistributionImpl1.inverseCumulativeProbability(4.9E-324);
  }
}
