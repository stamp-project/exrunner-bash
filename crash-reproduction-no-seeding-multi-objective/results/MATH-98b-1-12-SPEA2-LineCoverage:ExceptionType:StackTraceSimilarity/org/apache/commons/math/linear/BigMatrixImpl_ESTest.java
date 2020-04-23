/*

 * Mon Apr 20 10:08:47 UTC 2020
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
      BigDecimal bigDecimal0 = new BigDecimal((-2332));
      bigDecimalArray0[0] = bigDecimal0;
      BigMatrixImpl bigMatrixImpl0 = new BigMatrixImpl(bigDecimalArray0);
      Object object0 = new Object();
      BigDecimal bigDecimal1 = BigMatrixImpl.ONE;
      BigDecimal bigDecimal2 = bigDecimal0.remainder(bigDecimal1);
      bigDecimal2.unscaledValue();
      bigMatrixImpl0.equals(object0);
      BigDecimal[] bigDecimalArray1 = bigMatrixImpl0.operate(bigDecimalArray0);
      bigMatrixImpl0.isSquare();
      bigMatrixImpl0.setScale((-2332));
      BigDecimal[] bigDecimalArray2 = bigMatrixImpl0.operate(bigDecimalArray1);
      BigDecimal[][] bigDecimalArray3 = new BigDecimal[7][9];
      bigDecimalArray3[0] = bigDecimalArray2;
      bigDecimalArray3[1] = bigDecimalArray0;
      bigDecimalArray3[2] = bigDecimalArray2;
      bigDecimalArray3[3] = bigDecimalArray1;
      bigDecimalArray3[4] = bigDecimalArray0;
      bigDecimalArray3[5] = bigDecimalArray2;
      bigDecimalArray3[6] = bigDecimalArray2;
      BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl(bigDecimalArray3);
      // Undeclared exception!
      bigMatrixImpl1.operate(bigDecimalArray2);
  }
}
