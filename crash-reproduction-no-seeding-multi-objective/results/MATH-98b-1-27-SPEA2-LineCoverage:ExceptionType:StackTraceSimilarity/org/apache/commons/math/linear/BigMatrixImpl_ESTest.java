/*

 * Mon Apr 20 10:09:42 UTC 2020
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import org.apache.commons.math.linear.BigMatrixImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BigMatrixImpl_ESTest extends BigMatrixImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BigDecimal[] bigDecimalArray0 = new BigDecimal[1];
      BigInteger bigInteger0 = BigInteger.TEN;
      BigDecimal bigDecimal0 = new BigDecimal(bigInteger0);
      bigDecimalArray0[0] = bigDecimal0;
      BigDecimal bigDecimal1 = BigMatrixImpl.ONE;
      MathContext mathContext0 = MathContext.DECIMAL128;
      bigDecimal1.divideAndRemainder(bigDecimal0);
      bigInteger0.doubleValue();
      bigDecimal1.add(bigDecimal0, mathContext0);
      BigDecimal bigDecimal2 = BigDecimal.ONE;
      BigDecimal[][] bigDecimalArray1 = new BigDecimal[9][9];
      bigDecimalArray1[0] = bigDecimalArray0;
      bigDecimalArray1[1] = bigDecimalArray0;
      bigDecimalArray1[2] = bigDecimalArray0;
      bigDecimalArray1[3] = bigDecimalArray0;
      bigDecimalArray1[4] = bigDecimalArray0;
      bigDecimalArray1[5] = bigDecimalArray0;
      bigDecimalArray1[6] = bigDecimalArray0;
      bigDecimalArray1[7] = bigDecimalArray0;
      bigDecimalArray1[8] = bigDecimalArray0;
      BigMatrixImpl bigMatrixImpl0 = new BigMatrixImpl(bigDecimalArray1);
      bigMatrixImpl0.setRoundingMode(2213);
      // Undeclared exception!
      bigMatrixImpl0.operate(bigDecimalArray0);
  }
}
