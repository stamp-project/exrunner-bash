/*

 * Mon Apr 20 10:09:52 UTC 2020
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import org.apache.commons.math.linear.BigMatrixImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BigMatrixImpl_ESTest extends BigMatrixImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BigDecimal[] bigDecimalArray0 = new BigDecimal[2];
      BigDecimal bigDecimal0 = BigDecimal.valueOf(1363L, (-289));
      bigDecimalArray0[0] = bigDecimal0;
      BigDecimal bigDecimal1 = BigMatrixImpl.ONE;
      bigDecimalArray0[1] = bigDecimal1;
      BigDecimal bigDecimal2 = BigDecimal.ONE;
      bigDecimal0.longValue();
      BigDecimal[][] bigDecimalArray1 = new BigDecimal[4][1];
      RoundingMode roundingMode0 = RoundingMode.HALF_DOWN;
      MathContext mathContext0 = new MathContext(21, roundingMode0);
      bigDecimal1.remainder(bigDecimal2, mathContext0);
      BigDecimal[] bigDecimalArray2 = new BigDecimal[2];
      bigDecimalArray2[0] = bigDecimal2;
      bigDecimalArray2[1] = bigDecimal0;
      bigDecimalArray1[0] = bigDecimalArray2;
      bigDecimalArray1[1] = bigDecimalArray0;
      bigDecimalArray1[2] = bigDecimalArray0;
      bigDecimalArray1[3] = bigDecimalArray0;
      BigMatrixImpl bigMatrixImpl0 = new BigMatrixImpl(bigDecimalArray1, true);
      // Undeclared exception!
      bigMatrixImpl0.operate(bigDecimalArray0);
  }
}
