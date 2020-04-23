/*

 * Mon Apr 20 10:09:46 UTC 2020
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
      BigDecimal[][] bigDecimalArray0 = new BigDecimal[8][8];
      BigDecimal bigDecimal0 = BigMatrixImpl.ONE;
      BigDecimal bigDecimal1 = BigDecimal.TEN;
      BigDecimal bigDecimal2 = new BigDecimal(0.0);
      BigDecimal bigDecimal3 = new BigDecimal(590L);
      BigDecimal bigDecimal4 = BigMatrixImpl.ONE;
      BigDecimal bigDecimal5 = BigMatrixImpl.ZERO;
      bigDecimal3.doubleValue();
      BigDecimal bigDecimal6 = bigDecimal3.add(bigDecimal0);
      BigDecimal[] bigDecimalArray1 = new BigDecimal[1];
      bigDecimalArray1[0] = bigDecimal6;
      BigDecimal bigDecimal7 = new BigDecimal(0L);
      BigDecimal bigDecimal8 = new BigDecimal((-744));
      BigDecimal bigDecimal9 = BigDecimal.TEN;
      BigDecimal[][] bigDecimalArray2 = new BigDecimal[4][0];
      bigDecimalArray2[0] = bigDecimalArray1;
      bigDecimalArray2[1] = bigDecimalArray1;
      bigDecimalArray2[2] = bigDecimalArray1;
      bigDecimalArray2[3] = bigDecimalArray1;
      BigMatrixImpl bigMatrixImpl0 = new BigMatrixImpl(bigDecimalArray2);
      // Undeclared exception!
      bigMatrixImpl0.operate(bigDecimalArray1);
  }
}
