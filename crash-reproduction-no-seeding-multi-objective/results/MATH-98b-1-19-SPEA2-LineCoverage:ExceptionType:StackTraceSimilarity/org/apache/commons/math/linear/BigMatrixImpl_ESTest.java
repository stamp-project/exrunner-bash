/*

 * Mon Apr 20 10:09:09 UTC 2020
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
      BigMatrixImpl bigMatrixImpl0 = new BigMatrixImpl();
      BigDecimal[] bigDecimalArray0 = new BigDecimal[0];
      BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl(bigDecimalArray0);
      BigDecimal[][] bigDecimalArray1 = new BigDecimal[9][8];
      bigDecimalArray1[0] = bigDecimalArray0;
      bigDecimalArray1[1] = bigDecimalArray0;
      bigDecimalArray1[2] = bigDecimalArray0;
      bigDecimalArray1[3] = bigDecimalArray0;
      bigDecimalArray1[4] = bigDecimalArray0;
      bigDecimalArray1[5] = bigDecimalArray0;
      bigDecimalArray1[6] = bigDecimalArray0;
      bigDecimalArray1[7] = bigDecimalArray0;
      bigDecimalArray1[8] = bigDecimalArray0;
      bigMatrixImpl1.data = bigDecimalArray1;
      // Undeclared exception!
      bigMatrixImpl1.operate(bigDecimalArray0);
  }
}
