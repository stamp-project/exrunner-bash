/*

 * Wed Apr 22 19:41:02 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Days;
import org.joda.time.PeriodType;
import org.joda.time.Seconds;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class PeriodType_ESTest extends PeriodType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PeriodType periodType0 = PeriodType.time();
      Days days0 = Days.THREE;
      days0.toStandardMinutes();
      int int0 = 0;
      int[] intArray0 = new int[4];
      intArray0[0] = 0;
      Seconds seconds0 = Seconds.MAX_VALUE;
      // Undeclared exception!
      periodType0.setIndexedField(seconds0, 0, intArray0, (-2387));
  }
}
