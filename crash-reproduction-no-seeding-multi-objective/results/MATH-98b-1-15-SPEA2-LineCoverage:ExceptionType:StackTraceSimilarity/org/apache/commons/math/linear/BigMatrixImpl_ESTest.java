/*

 * Mon Apr 20 10:09:04 UTC 2020
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
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      BigDecimal bigDecimal1 = BigMatrixImpl.ZERO;
      BigDecimal[] bigDecimalArray0 = new BigDecimal[2];
      bigDecimalArray0[0] = bigDecimal1;
      bigDecimalArray0[1] = bigDecimal1;
      BigDecimal bigDecimal2 = new BigDecimal((-57.06448078960918));
      BigDecimal bigDecimal3 = BigMatrixImpl.ZERO;
      BigDecimal bigDecimal4 = new BigDecimal(460.1949815);
      BigDecimal bigDecimal5 = BigMatrixImpl.ZERO;
      BigDecimal bigDecimal6 = BigDecimal.TEN;
      BigDecimal bigDecimal7 = BigDecimal.ZERO;
      BigDecimal bigDecimal8 = BigDecimal.TEN;
      BigDecimal[][] bigDecimalArray1 = new BigDecimal[4][4];
      bigDecimalArray1[0] = bigDecimalArray0;
      bigDecimalArray1[1] = bigDecimalArray0;
      bigDecimalArray1[2] = bigDecimalArray0;
      bigDecimalArray1[3] = bigDecimalArray0;
      BigMatrixImpl bigMatrixImpl0 = new BigMatrixImpl(bigDecimalArray1, false);
      // Undeclared exception!
      bigMatrixImpl0.operate(bigDecimalArray0);
  }
}
