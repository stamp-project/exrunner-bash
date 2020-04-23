/*

 * Mon Apr 20 10:08:38 UTC 2020
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
      BigDecimal[] bigDecimalArray0 = new BigDecimal[2];
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      bigDecimalArray0[0] = bigDecimal0;
      BigInteger bigInteger0 = BigInteger.TEN;
      BigDecimal bigDecimal1 = new BigDecimal(2626);
      BigDecimal bigDecimal2 = BigMatrixImpl.ZERO;
      BigMatrixImpl bigMatrixImpl0 = new BigMatrixImpl(bigDecimalArray0);
      BigDecimal[] bigDecimalArray1 = new BigDecimal[2];
      bigDecimalArray0[1] = bigDecimal0;
      BigInteger bigInteger1 = BigInteger.TEN;
      BigDecimal bigDecimal3 = new BigDecimal(1417);
      BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl(bigDecimalArray0);
      BigDecimal[] bigDecimalArray2 = new BigDecimal[1];
      BigDecimal bigDecimal4 = new BigDecimal(bigInteger0);
      bigDecimalArray2[0] = bigDecimal4;
      // Undeclared exception!
      bigMatrixImpl1.operate(bigDecimalArray2);
  }
}
