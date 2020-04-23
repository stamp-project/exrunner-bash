/*

 * Mon Apr 20 10:09:46 UTC 2020
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
      BigMatrixImpl bigMatrixImpl0 = new BigMatrixImpl();
      int int0 = 8;
      BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl();
      bigMatrixImpl1.setRoundingMode(8);
      BigDecimal[] bigDecimalArray1 = new BigDecimal[1];
      BigInteger bigInteger0 = BigInteger.TEN;
      BigDecimal bigDecimal0 = new BigDecimal(bigInteger0);
      bigDecimalArray1[0] = bigDecimal0;
      BigMatrixImpl bigMatrixImpl2 = new BigMatrixImpl(bigDecimalArray1);
      bigMatrixImpl1.setRoundingMode(774);
      BigMatrixImpl bigMatrixImpl3 = new BigMatrixImpl(bigDecimalArray1);
      BigDecimal[][] bigDecimalArray2 = new BigDecimal[3][5];
      bigDecimalArray2[0] = bigDecimalArray1;
      bigDecimalArray2[1] = bigDecimalArray1;
      bigDecimalArray2[2] = bigDecimalArray1;
      BigMatrixImpl bigMatrixImpl4 = new BigMatrixImpl(bigDecimalArray2);
      // Undeclared exception!
      bigMatrixImpl4.operate(bigDecimalArray1);
  }
}
