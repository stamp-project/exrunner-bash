/*

 * Mon Apr 20 10:11:09 UTC 2020
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
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      bigDecimalArray0[0] = bigDecimal0;
      BigMatrixImpl bigMatrixImpl0 = new BigMatrixImpl(bigDecimalArray0);
      BigDecimal[] bigDecimalArray1 = bigMatrixImpl0.solve(bigDecimalArray0);
      bigMatrixImpl0.getData();
      BigDecimal[] bigDecimalArray2 = bigMatrixImpl0.operate(bigDecimalArray1);
      BigDecimal[][] bigDecimalArray3 = bigMatrixImpl0.getDataRef();
      bigMatrixImpl0.getRowDimension();
      bigMatrixImpl0.subtract((BigMatrix) bigMatrixImpl0);
      BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl();
      BigDecimal[] bigDecimalArray4 = bigMatrixImpl0.operate(bigDecimalArray2);
      BigDecimal bigDecimal1 = BigMatrixImpl.ONE;
      BigMatrixImpl bigMatrixImpl2 = new BigMatrixImpl(bigDecimalArray3);
      bigMatrixImpl2.getScale();
      bigDecimal0.signum();
      BigDecimal[][] bigDecimalArray5 = new BigDecimal[7][5];
      bigDecimalArray5[0] = bigDecimalArray2;
      bigDecimalArray5[1] = bigDecimalArray2;
      bigDecimalArray5[2] = bigDecimalArray0;
      bigDecimalArray5[3] = bigDecimalArray2;
      bigDecimalArray5[4] = bigDecimalArray0;
      bigDecimalArray5[5] = bigDecimalArray4;
      bigDecimalArray5[6] = bigDecimalArray1;
      BigMatrixImpl bigMatrixImpl3 = new BigMatrixImpl(bigDecimalArray5, true);
      // Undeclared exception!
      bigMatrixImpl3.operate(bigDecimalArray2);
  }
}
