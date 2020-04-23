/*

 * Mon Apr 20 10:08:58 UTC 2020
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
      double[][] doubleArray0 = new double[1][3];
      BigDecimal[] bigDecimalArray0 = new BigDecimal[1];
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      bigDecimalArray0[0] = bigDecimal0;
      BigMatrixImpl bigMatrixImpl0 = new BigMatrixImpl(bigDecimalArray0);
      BigDecimal[] bigDecimalArray1 = bigMatrixImpl0.operate(bigDecimalArray0);
      double[] doubleArray1 = new double[2];
      BigDecimal[][] bigDecimalArray2 = new BigDecimal[7][2];
      bigDecimalArray2[0] = bigDecimalArray0;
      bigDecimalArray2[1] = bigDecimalArray1;
      bigDecimalArray2[2] = bigDecimalArray0;
      bigDecimalArray2[3] = bigDecimalArray0;
      bigDecimalArray2[4] = bigDecimalArray0;
      bigDecimalArray2[5] = bigDecimalArray0;
      bigDecimalArray2[6] = bigDecimalArray0;
      BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl(bigDecimalArray2, true);
      BigMatrixImpl bigMatrixImpl2 = new BigMatrixImpl();
      BigDecimal bigDecimal1 = BigDecimal.TEN;
      BigDecimal bigDecimal2 = BigMatrixImpl.ZERO;
      BigMatrixImpl bigMatrixImpl3 = new BigMatrixImpl(bigDecimalArray2, false);
      // Undeclared exception!
      bigMatrixImpl3.operate(bigDecimalArray0);
  }
}
