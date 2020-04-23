/*

 * Mon Apr 20 10:08:05 UTC 2020
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
      BigDecimal[] bigDecimalArray0 = new BigDecimal[2];
      BigDecimal bigDecimal0 = new BigDecimal(111L);
      bigDecimalArray0[0] = bigDecimal0;
      BigDecimal bigDecimal1 = BigDecimal.ZERO;
      bigDecimalArray0[1] = bigDecimal1;
      BigMatrixImpl bigMatrixImpl0 = new BigMatrixImpl(bigDecimalArray0);
      bigMatrixImpl0.getRowDimension();
      BigDecimal[] bigDecimalArray1 = bigMatrixImpl0.preMultiply(bigDecimalArray0);
      // Undeclared exception!
      bigMatrixImpl0.operate(bigDecimalArray1);
  }
}
