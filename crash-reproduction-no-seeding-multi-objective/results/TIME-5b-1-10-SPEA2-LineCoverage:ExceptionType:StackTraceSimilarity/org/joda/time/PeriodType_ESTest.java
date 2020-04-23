/*

 * Wed Apr 22 19:39:48 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Minutes;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.Seconds;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class PeriodType_ESTest extends PeriodType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PeriodType periodType0 = PeriodType.seconds();
      Minutes minutes0 = Minutes.minutes(0);
      Seconds seconds0 = minutes0.toStandardSeconds();
      int[] intArray0 = new int[7];
      intArray0[0] = 0;
      intArray0[1] = 0;
      intArray0[2] = 0;
      intArray0[3] = 0;
      intArray0[4] = 0;
      intArray0[5] = 0;
      intArray0[6] = 0;
      seconds0.equals(periodType0);
      PeriodType periodType1 = PeriodType.yearWeekDayTime();
      periodType1.withSecondsRemoved();
      periodType0.getFieldType(0);
      PeriodType.standard();
      PeriodType.MILLI_INDEX = (-1488);
      Period period0 = new Period(0, 0);
      // Undeclared exception!
      periodType0.setIndexedField(seconds0, 0, intArray0, 1651);
  }
}
