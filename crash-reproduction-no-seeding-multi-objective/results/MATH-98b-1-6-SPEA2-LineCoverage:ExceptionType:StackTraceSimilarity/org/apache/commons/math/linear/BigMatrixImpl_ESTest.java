/*

 * Mon Apr 20 10:09:00 UTC 2020
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
      BigDecimal[][] bigDecimalArray0 = new BigDecimal[1][9];
      BigDecimal[] bigDecimalArray1 = new BigDecimal[3];
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      bigDecimalArray1[0] = bigDecimal0;
      BigDecimal bigDecimal1 = BigMatrixImpl.ONE;
      bigDecimalArray1[1] = bigDecimal1;
      BigDecimal bigDecimal2 = new BigDecimal(0.0);
      bigDecimal0.shortValueExact();
      bigDecimalArray1[2] = bigDecimal2;
      bigDecimalArray0[0] = bigDecimalArray1;
      BigMatrixImpl bigMatrixImpl0 = new BigMatrixImpl(bigDecimalArray0);
      bigMatrixImpl0.operate(bigDecimalArray1);
      BigDecimal bigDecimal3 = BigDecimal.TEN;
      BigDecimal bigDecimal4 = BigMatrixImpl.ONE;
      BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl(bigDecimalArray0);
      BigMatrixImpl bigMatrixImpl2 = new BigMatrixImpl(bigDecimalArray1);
      BigDecimal[] bigDecimalArray2 = new BigDecimal[1];
      bigDecimalArray2[0] = bigDecimal0;
      // Undeclared exception!
      bigMatrixImpl2.operate(bigDecimalArray2);
  }
}
