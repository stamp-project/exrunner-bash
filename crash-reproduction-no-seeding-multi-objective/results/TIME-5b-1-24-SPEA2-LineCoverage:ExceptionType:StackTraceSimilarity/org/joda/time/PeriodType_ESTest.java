/*

 * Wed Apr 22 19:41:40 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.PeriodType;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class PeriodType_ESTest extends PeriodType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PeriodType periodType0 = PeriodType.days();
      DurationFieldType durationFieldType0 = DurationFieldType.MONTHS_TYPE;
      periodType0.isSupported(durationFieldType0);
      PeriodType periodType1 = periodType0.withMillisRemoved();
      PeriodType.standard();
      periodType1.indexOf(durationFieldType0);
      periodType1.withMinutesRemoved();
      PeriodType periodType2 = periodType0.withDaysRemoved();
      PeriodType periodType3 = periodType2.withHoursRemoved();
      periodType3.withYearsRemoved();
      PeriodType.days();
      PeriodType.seconds();
      periodType0.size();
      PeriodType.yearWeekDay();
      PeriodType.yearMonthDay();
      Hours hours0 = Hours.SIX;
      int[] intArray0 = new int[7];
      intArray0[0] = 1;
      intArray0[1] = (-1);
      intArray0[2] = (-1);
      intArray0[3] = 1;
      intArray0[4] = (-1);
      intArray0[5] = (-1);
      intArray0[6] = 1;
      // Undeclared exception!
      periodType3.setIndexedField(hours0, 1, intArray0, (-572));
  }
}
