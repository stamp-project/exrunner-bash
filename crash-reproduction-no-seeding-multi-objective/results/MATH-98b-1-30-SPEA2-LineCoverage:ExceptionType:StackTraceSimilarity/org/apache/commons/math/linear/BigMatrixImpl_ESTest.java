/*

 * Mon Apr 20 10:09:49 UTC 2020
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
      BigDecimal[] bigDecimalArray0 = new BigDecimal[1];
      BigDecimal bigDecimal0 = BigMatrixImpl.ONE;
      bigDecimalArray0[0] = bigDecimal0;
      BigMatrixImpl bigMatrixImpl0 = new BigMatrixImpl(bigDecimalArray0);
      BigDecimal bigDecimal1 = BigDecimal.TEN;
      bigMatrixImpl0.getRowDimension();
      BigDecimal[] bigDecimalArray1 = bigMatrixImpl0.operate(bigDecimalArray0);
      BigMatrix bigMatrix0 = bigMatrixImpl0.multiply((BigMatrix) bigMatrixImpl0);
      BigDecimal[] bigDecimalArray2 = bigMatrixImpl0.solve(bigDecimalArray1);
      BigMatrix bigMatrix1 = bigMatrix0.inverse();
      bigMatrixImpl0.getDataAsDoubleArray();
      BigDecimal[][] bigDecimalArray3 = bigMatrixImpl0.getData();
      BigDecimal[] bigDecimalArray4 = new BigDecimal[8];
      bigDecimalArray4[0] = bigDecimal0;
      BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl(bigDecimalArray3, false);
      bigMatrix1.operate(bigDecimalArray2);
      bigMatrixImpl0.getTrace();
      BigDecimal[][] bigDecimalArray5 = new BigDecimal[4][7];
      bigDecimalArray5[0] = bigDecimalArray0;
      bigDecimalArray5[1] = bigDecimalArray0;
      bigDecimalArray5[2] = bigDecimalArray1;
      bigDecimalArray5[3] = bigDecimalArray2;
      BigMatrixImpl bigMatrixImpl2 = new BigMatrixImpl(bigDecimalArray5);
      // Undeclared exception!
      bigMatrixImpl2.operate(bigDecimalArray2);
  }
}
