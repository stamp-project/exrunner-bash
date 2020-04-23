/*

 * Mon Apr 20 10:08:32 UTC 2020
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigDecimal;
import org.apache.commons.math.linear.BigMatrixImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BigMatrixImpl_ESTest extends BigMatrixImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BigDecimal bigDecimal0 = new BigDecimal(4704L);
      BigDecimal bigDecimal1 = BigMatrixImpl.ONE;
      BigDecimal bigDecimal2 = BigDecimal.ZERO;
      BigDecimal[][] bigDecimalArray0 = new BigDecimal[1][2];
      BigDecimal[] bigDecimalArray1 = new BigDecimal[4];
      bigDecimalArray1[0] = bigDecimal2;
      bigDecimalArray1[1] = bigDecimal2;
      bigDecimalArray1[2] = bigDecimal1;
      bigDecimalArray1[3] = bigDecimal1;
      bigDecimalArray0[0] = bigDecimalArray1;
      BigDecimal[][] bigDecimalArray2 = new BigDecimal[7][8];
      bigDecimalArray2[0] = bigDecimalArray1;
      bigDecimalArray2[1] = bigDecimalArray1;
      bigDecimalArray2[2] = bigDecimalArray1;
      BigDecimal bigDecimal3 = BigMatrixImpl.ONE;
      bigDecimal1.max(bigDecimal3);
      bigDecimalArray2[3] = bigDecimalArray1;
      bigDecimalArray2[4] = bigDecimalArray1;
      BigDecimal.valueOf(0L);
      bigDecimalArray2[5] = bigDecimalArray1;
      bigDecimalArray2[6] = bigDecimalArray1;
      BigMatrixImpl bigMatrixImpl0 = new BigMatrixImpl(bigDecimalArray2, true);
      // Undeclared exception!
      bigMatrixImpl0.operate(bigDecimalArray1);
  }
}
