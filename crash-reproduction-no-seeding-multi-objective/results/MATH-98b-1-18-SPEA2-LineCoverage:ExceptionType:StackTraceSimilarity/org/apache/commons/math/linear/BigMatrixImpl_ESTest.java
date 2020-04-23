/*

 * Mon Apr 20 10:09:14 UTC 2020
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
      BigDecimal[] bigDecimalArray0 = new BigDecimal[0];
      BigMatrixImpl bigMatrixImpl0 = new BigMatrixImpl(bigDecimalArray0);
      BigDecimal[] bigDecimalArray1 = new BigDecimal[2];
      BigDecimal bigDecimal0 = new BigDecimal(2178L);
      bigDecimalArray1[0] = bigDecimal0;
      BigDecimal bigDecimal1 = BigDecimal.ZERO;
      bigDecimalArray1[1] = bigDecimal1;
      BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl(bigDecimalArray1);
      BigDecimal[][] bigDecimalArray2 = new BigDecimal[3][6];
      bigDecimalArray2[0] = bigDecimalArray1;
      bigDecimalArray2[1] = bigDecimalArray1;
      BigDecimal[] bigDecimalArray3 = new BigDecimal[7];
      bigDecimalArray3[0] = bigDecimal0;
      bigDecimalArray3[1] = bigDecimal0;
      bigDecimalArray3[2] = bigDecimal0;
      bigDecimalArray3[3] = bigDecimal1;
      bigDecimalArray3[4] = bigDecimal1;
      bigDecimalArray3[5] = bigDecimal1;
      bigDecimalArray3[6] = bigDecimal0;
      bigDecimalArray2[2] = bigDecimalArray3;
      bigMatrixImpl1.data = bigDecimalArray2;
      // Undeclared exception!
      bigMatrixImpl1.operate(bigDecimalArray1);
  }
}
