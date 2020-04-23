/*

 * Wed Apr 22 19:37:58 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.TestPeriod_Basics;
import org.joda.time.Years;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class PeriodType_ESTest extends PeriodType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PeriodType periodType0 = PeriodType.minutes();
      PeriodType periodType1 = PeriodType.standard();
      PeriodType periodType2 = periodType0.withDaysRemoved();
      PeriodType periodType3 = PeriodType.yearWeekDayTime();
      PeriodType periodType4 = periodType1.withDaysRemoved();
      PeriodType periodType5 = periodType3.withMonthsRemoved();
      periodType5.toString();
      int int0 = 4484;
      TestPeriod_Basics testPeriod_Basics0 = new TestPeriod_Basics("PeriodType[YearWeekDayTime]");
      TestPeriod_Basics.MockPeriod testPeriod_Basics_MockPeriod0 = testPeriod_Basics0.new MockPeriod(1788L);
      int[] intArray0 = new int[7];
      periodType3.withDaysRemoved();
      periodType4.withDaysRemoved();
      PeriodType.years();
      Years years0 = Years.THREE;
      Period period0 = Period.minutes(3592);
      // Undeclared exception!
      periodType2.setIndexedField(period0, 7, intArray0, (-1));
  }
}
