/*

 * Wed Apr 22 19:42:31 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class PeriodType_ESTest extends PeriodType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PeriodType periodType0 = PeriodType.months();
      int int0 = 473;
      Period period0 = Period.minutes(473);
      Period period1 = period0.withMonths(3);
      int[] intArray0 = new int[2];
      intArray0[0] = 473;
      intArray0[1] = 473;
      // Undeclared exception!
      periodType0.setIndexedField(period1, 3, intArray0, 0);
  }
}
