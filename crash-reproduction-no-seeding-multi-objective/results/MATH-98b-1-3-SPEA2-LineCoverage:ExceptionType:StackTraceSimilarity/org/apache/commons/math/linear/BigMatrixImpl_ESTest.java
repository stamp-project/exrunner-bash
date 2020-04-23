/*

 * Mon Apr 20 10:07:57 UTC 2020
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
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      bigDecimalArray0[0] = bigDecimal0;
      BigMatrixImpl bigMatrixImpl0 = new BigMatrixImpl(bigDecimalArray0);
      bigMatrixImpl0.isSquare();
      BigDecimal bigDecimal1 = new BigDecimal(0L);
      BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl(bigDecimalArray0);
      BigDecimal[] bigDecimalArray1 = new BigDecimal[6];
      BigDecimal bigDecimal2 = BigDecimal.TEN;
      bigDecimalArray1[0] = bigDecimal2;
      bigDecimalArray1[1] = bigDecimal1;
      bigDecimalArray1[2] = bigDecimal0;
      bigDecimalArray1[3] = bigDecimal1;
      BigDecimal bigDecimal3 = new BigDecimal(0L);
      bigDecimalArray1[4] = bigDecimal3;
      bigDecimalArray1[5] = bigDecimal0;
      bigMatrixImpl1.isSquare();
      bigMatrixImpl0.operate(bigDecimalArray0);
      BigMatrixImpl bigMatrixImpl2 = new BigMatrixImpl(bigDecimalArray1);
      BigMatrixImpl bigMatrixImpl3 = new BigMatrixImpl(96, 428);
      BigDecimal bigDecimal4 = BigMatrixImpl.ZERO;
      BigDecimal bigDecimal5 = new BigDecimal(428);
      BigDecimal bigDecimal6 = BigDecimal.TEN;
      // Undeclared exception!
      bigMatrixImpl2.operate(bigDecimalArray0);
  }
}
