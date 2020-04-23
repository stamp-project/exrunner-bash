/*

 * Mon Apr 20 10:07:58 UTC 2020
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
      BigDecimal[] bigDecimalArray0 = new BigDecimal[3];
      BigDecimal bigDecimal0 = BigMatrixImpl.ONE;
      bigDecimalArray0[0] = bigDecimal0;
      BigDecimal bigDecimal1 = BigMatrixImpl.ONE;
      bigDecimalArray0[1] = bigDecimal1;
      BigDecimal bigDecimal2 = BigMatrixImpl.ZERO;
      bigDecimalArray0[2] = bigDecimal2;
      BigMatrixImpl bigMatrixImpl0 = new BigMatrixImpl(bigDecimalArray0);
      BigDecimal[] bigDecimalArray1 = new BigDecimal[1];
      bigDecimal2.divideAndRemainder(bigDecimal0);
      bigDecimalArray1[0] = bigDecimal0;
      // Undeclared exception!
      bigMatrixImpl0.operate(bigDecimalArray1);
  }
}
