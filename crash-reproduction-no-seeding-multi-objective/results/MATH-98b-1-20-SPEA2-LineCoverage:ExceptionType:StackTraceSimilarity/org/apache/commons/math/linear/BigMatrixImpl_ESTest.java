/*

 * Mon Apr 20 10:09:43 UTC 2020
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
      BigDecimal[] bigDecimalArray0 = new BigDecimal[4];
      BigDecimal bigDecimal0 = new BigDecimal(4883.696151802662);
      bigDecimalArray0[0] = bigDecimal0;
      BigDecimal bigDecimal1 = BigDecimal.TEN;
      BigDecimal bigDecimal2 = BigDecimal.ONE;
      BigDecimal bigDecimal3 = BigDecimal.TEN;
      BigDecimal bigDecimal4 = BigMatrixImpl.ONE;
      BigInteger bigInteger0 = BigInteger.ONE;
      BigDecimal bigDecimal5 = BigDecimal.TEN;
      bigDecimal4.abs();
      BigDecimal bigDecimal6 = BigDecimal.ONE;
      BigDecimal bigDecimal7 = BigDecimal.TEN;
      BigDecimal bigDecimal8 = BigMatrixImpl.ONE;
      BigDecimal[] bigDecimalArray1 = new BigDecimal[5];
      bigDecimalArray1[0] = bigDecimal2;
      bigDecimalArray1[1] = bigDecimal2;
      bigDecimalArray1[1] = bigDecimal4;
      bigDecimalArray1[3] = bigDecimal7;
      bigDecimalArray1[4] = bigDecimal3;
      BigMatrixImpl bigMatrixImpl0 = new BigMatrixImpl(bigDecimalArray1);
      BigDecimal[] bigDecimalArray2 = new BigDecimal[1];
      bigDecimalArray2[0] = bigDecimal6;
      // Undeclared exception!
      bigMatrixImpl0.operate(bigDecimalArray2);
  }
}
