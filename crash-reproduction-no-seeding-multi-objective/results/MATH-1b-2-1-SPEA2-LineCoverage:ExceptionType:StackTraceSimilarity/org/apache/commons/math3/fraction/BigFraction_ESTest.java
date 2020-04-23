/*

 * Tue Apr 21 07:54:47 UTC 2020
 */

package org.apache.commons.math3.fraction;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.fraction.BigFraction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BigFraction_ESTest extends BigFraction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 37;
      BigFraction bigFraction0 = new BigFraction((-335.487), 37);
      bigFraction0.longValue();
      BigFraction bigFraction1 = bigFraction0.add(bigFraction0);
      bigFraction1.bigDecimalValue((-2909), 0);
      BigFraction bigFraction2 = new BigFraction((double) (-2909), 37);
  }
}
