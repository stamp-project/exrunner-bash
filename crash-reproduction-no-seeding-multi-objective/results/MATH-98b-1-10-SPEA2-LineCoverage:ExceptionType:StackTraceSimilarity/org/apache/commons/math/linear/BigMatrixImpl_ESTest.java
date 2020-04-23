/*

 * Mon Apr 20 10:08:57 UTC 2020
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigDecimal;
import java.math.MathContext;
import org.apache.commons.math.linear.BigMatrixImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BigMatrixImpl_ESTest extends BigMatrixImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BigDecimal[] bigDecimalArray0 = new BigDecimal[1];
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      MathContext mathContext0 = new MathContext(430);
      BigDecimal bigDecimal1 = new BigDecimal(1, mathContext0);
      bigDecimal1.toEngineeringString();
      bigDecimalArray0[0] = bigDecimal0;
      BigDecimal bigDecimal2 = BigDecimal.TEN;
      BigDecimal[][] bigDecimalArray1 = new BigDecimal[3][3];
      bigDecimalArray1[0] = bigDecimalArray0;
      bigDecimalArray1[1] = bigDecimalArray0;
      bigDecimalArray1[2] = bigDecimalArray0;
      BigMatrixImpl bigMatrixImpl0 = new BigMatrixImpl(bigDecimalArray1);
      bigMatrixImpl0.setScale(430);
      // Undeclared exception!
      bigMatrixImpl0.operate(bigDecimalArray0);
  }
}
