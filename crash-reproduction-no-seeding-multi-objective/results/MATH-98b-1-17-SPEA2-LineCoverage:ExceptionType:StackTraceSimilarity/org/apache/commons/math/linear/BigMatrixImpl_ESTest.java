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
      BigDecimal[] bigDecimalArray0 = new BigDecimal[1];
      BigDecimal[][] bigDecimalArray1 = new BigDecimal[1][1];
      BigDecimal[] bigDecimalArray2 = new BigDecimal[1];
      BigDecimal bigDecimal0 = BigMatrixImpl.ONE;
      bigDecimalArray2[0] = bigDecimal0;
      bigDecimalArray1[0] = bigDecimalArray2;
      BigMatrixImpl bigMatrixImpl0 = new BigMatrixImpl(bigDecimalArray1);
      BigDecimal[] bigDecimalArray3 = bigMatrixImpl0.operate(bigDecimalArray2);
      BigDecimal[] bigDecimalArray4 = new BigDecimal[4];
      bigDecimalArray4[0] = bigDecimal0;
      bigDecimalArray4[1] = bigDecimal0;
      bigDecimalArray4[2] = bigDecimal0;
      bigDecimalArray4[3] = bigDecimal0;
      BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl(bigDecimalArray4);
      // Undeclared exception!
      bigMatrixImpl1.operate(bigDecimalArray3);
  }
}
