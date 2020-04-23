/*

 * Wed Apr 22 19:40:08 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Months;
import org.joda.time.PeriodType;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class PeriodType_ESTest extends PeriodType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PeriodType periodType0 = PeriodType.millis();
      Months months0 = Months.NINE;
      int[] intArray0 = new int[8];
      intArray0[0] = 0;
      intArray0[1] = 0;
      intArray0[2] = 117;
      intArray0[3] = 117;
      intArray0[4] = 0;
      intArray0[5] = 117;
      PeriodType.yearWeekDayTime();
      intArray0[6] = 0;
      intArray0[7] = 117;
      // Undeclared exception!
      periodType0.setIndexedField(months0, 0, intArray0, 0);
  }
}
