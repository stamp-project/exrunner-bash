/*

 * Mon Apr 20 10:10:01 UTC 2020
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.math.linear.BigMatrixImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BigMatrixImpl_ESTest extends BigMatrixImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BigDecimal[] bigDecimalArray0 = new BigDecimal[1];
      int[] intArray0 = new int[9];
      intArray0[0] = 1754;
      BigDecimal bigDecimal0 = new BigDecimal(1.0);
      BigMatrixImpl bigMatrixImpl0 = new BigMatrixImpl(bigDecimalArray0);
      BigDecimal[] bigDecimalArray1 = new BigDecimal[2];
      bigDecimalArray1[0] = bigDecimal0;
      bigDecimalArray1[1] = bigDecimal0;
      int int0 = (-1683);
      BigDecimal bigDecimal1 = new BigDecimal((-1683));
      BigDecimal bigDecimal2 = BigMatrixImpl.ZERO;
      BigDecimal bigDecimal3 = new BigDecimal(3145);
      BigInteger bigInteger0 = BigInteger.ZERO;
      BigDecimal bigDecimal4 = new BigDecimal(bigInteger0);
      BigDecimal bigDecimal5 = new BigDecimal(1288);
      BigDecimal bigDecimal6 = new BigDecimal((long) 1889);
      BigDecimal[][] bigDecimalArray2 = new BigDecimal[3][7];
      bigDecimalArray2[0] = bigDecimalArray1;
      bigDecimalArray2[1] = bigDecimalArray1;
      bigDecimalArray2[2] = bigDecimalArray1;
      BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl(bigDecimalArray2, true);
      BigMatrixImpl bigMatrixImpl2 = new BigMatrixImpl(bigDecimalArray2, true);
      // Undeclared exception!
      bigMatrixImpl2.operate(bigDecimalArray1);
  }
}
