/*

 * Tue Apr 21 07:55:10 UTC 2020
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
      BigFraction bigFraction0 = new BigFraction((-1), (-1));
      bigFraction0.doubleValue();
      BigFraction bigFraction1 = BigFraction.TWO;
      bigFraction1.floatValue();
      int int0 = (-1);
      bigFraction1.getNumeratorAsInt();
      BigFraction bigFraction2 = new BigFraction(1730.409889584937, (-1));
      BigFraction bigFraction3 = new BigFraction(1.0, (-1));
  }
}
