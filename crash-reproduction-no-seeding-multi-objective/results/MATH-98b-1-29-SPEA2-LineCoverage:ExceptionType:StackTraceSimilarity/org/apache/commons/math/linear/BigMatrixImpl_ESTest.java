/*

 * Mon Apr 20 10:09:56 UTC 2020
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
      BigDecimal[] bigDecimalArray0 = new BigDecimal[1];
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      BigDecimal[] bigDecimalArray1 = new BigDecimal[1];
      bigDecimalArray1[0] = bigDecimal0;
      BigMatrixImpl bigMatrixImpl0 = new BigMatrixImpl(bigDecimalArray1);
      BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl(bigDecimalArray1);
      BigDecimal[] bigDecimalArray2 = bigMatrixImpl0.operate(bigDecimalArray1);
      BigDecimal bigDecimal1 = BigDecimal.ZERO;
      BigMatrixImpl bigMatrixImpl2 = new BigMatrixImpl(bigDecimalArray1);
      BigDecimal[] bigDecimalArray3 = bigMatrixImpl1.operate(bigDecimalArray1);
      bigMatrixImpl2.setRoundingMode(3229);
      BigDecimal[] bigDecimalArray4 = bigMatrixImpl2.operate(bigDecimalArray3);
      bigMatrixImpl1.setRoundingMode(4324);
      BigDecimal bigDecimal2 = BigMatrixImpl.ZERO;
      BigDecimal bigDecimal3 = BigMatrixImpl.ONE;
      bigDecimal1.longValueExact();
      bigDecimal0.longValueExact();
      BigDecimal[][] bigDecimalArray5 = new BigDecimal[7][0];
      bigDecimalArray5[0] = bigDecimalArray3;
      bigDecimalArray5[1] = bigDecimalArray1;
      bigDecimalArray5[2] = bigDecimalArray4;
      bigDecimalArray5[3] = bigDecimalArray2;
      bigDecimalArray5[4] = bigDecimalArray0;
      bigDecimalArray5[5] = bigDecimalArray1;
      bigDecimalArray5[6] = bigDecimalArray0;
      BigMatrixImpl bigMatrixImpl3 = new BigMatrixImpl(bigDecimalArray5, true);
      bigMatrixImpl3.setRoundingMode((-637));
      // Undeclared exception!
      bigMatrixImpl3.operate(bigDecimalArray1);
  }
}
