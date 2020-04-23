/*

 * Mon Apr 20 10:09:07 UTC 2020
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigDecimal;
import org.apache.commons.math.linear.BigMatrix;
import org.apache.commons.math.linear.BigMatrixImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BigMatrixImpl_ESTest extends BigMatrixImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BigDecimal[][] bigDecimalArray0 = new BigDecimal[1][8];
      BigDecimal[] bigDecimalArray1 = new BigDecimal[2];
      BigDecimal bigDecimal0 = BigMatrixImpl.ONE;
      bigDecimalArray1[0] = bigDecimal0;
      BigDecimal bigDecimal1 = BigDecimal.ONE;
      bigDecimalArray1[1] = bigDecimal1;
      bigDecimalArray0[0] = bigDecimalArray1;
      BigMatrixImpl bigMatrixImpl0 = new BigMatrixImpl(bigDecimalArray0, true);
      bigMatrixImpl0.getRoundingMode();
      BigMatrix bigMatrix0 = bigMatrixImpl0.transpose();
      bigMatrixImpl0.multiply(bigMatrix0);
      bigMatrixImpl0.transpose();
      BigDecimal[][] bigDecimalArray2 = new BigDecimal[3][3];
      bigDecimalArray2[0] = bigDecimalArray1;
      bigDecimalArray2[1] = bigDecimalArray1;
      bigDecimalArray2[2] = bigDecimalArray1;
      BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl(bigDecimalArray2, true);
      bigMatrixImpl0.getRoundingMode();
      bigMatrix0.transpose();
      bigMatrixImpl0.multiply(bigMatrix0);
      bigMatrixImpl1.transpose();
      BigMatrixImpl bigMatrixImpl2 = new BigMatrixImpl(bigDecimalArray1);
      // Undeclared exception!
      bigMatrixImpl1.operate(bigDecimalArray1);
  }
}
