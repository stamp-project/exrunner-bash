/*

 * Tue Apr 21 10:32:39 UTC 2020
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
      double double0 = 0.5;
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(2761.39292705233, 0.5);
      fDistributionImpl0.setDenominatorDegreesOfFreedom(0.5);
      double double1 = 393.0;
      FDistributionImpl fDistributionImpl1 = new FDistributionImpl(1789.0, 393.0);
      FDistributionImpl fDistributionImpl2 = new FDistributionImpl(3.399464998481189E-5, 3.6899182659531625E-6);
      double double2 = 1.0;
      // Undeclared exception!
      fDistributionImpl0.inverseCumulativeProbability(3.399464998481189E-5);
  }
}
