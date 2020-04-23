/*

 * Mon Apr 20 10:09:43 UTC 2020
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigDecimal;
import java.math.MathContext;
import org.apache.commons.math.linear.BigMatrixImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BigMatrixImpl_ESTest extends BigMatrixImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[][] stringArray0 = new String[0][9];
      BigDecimal bigDecimal0 = new BigDecimal(0L);
      MathContext mathContext0 = MathContext.DECIMAL128;
      BigDecimal bigDecimal1 = new BigDecimal(0.0);
      MathContext mathContext1 = MathContext.DECIMAL128;
      BigDecimal[] bigDecimalArray0 = new BigDecimal[1];
      bigDecimalArray0[0] = bigDecimal0;
      BigMatrixImpl bigMatrixImpl0 = new BigMatrixImpl(bigDecimalArray0);
      BigDecimal[] bigDecimalArray1 = bigMatrixImpl0.operate(bigDecimalArray0);
      BigDecimal[][] bigDecimalArray2 = new BigDecimal[7][0];
      bigDecimalArray2[0] = bigDecimalArray1;
      bigDecimalArray2[1] = bigDecimalArray0;
      bigDecimalArray2[2] = bigDecimalArray0;
      bigDecimalArray2[3] = bigDecimalArray1;
      bigDecimalArray2[4] = bigDecimalArray0;
      bigDecimalArray2[5] = bigDecimalArray0;
      bigDecimalArray2[6] = bigDecimalArray0;
      BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl(bigDecimalArray2, true);
      // Undeclared exception!
      bigMatrixImpl1.operate(bigDecimalArray0);
  }
}
