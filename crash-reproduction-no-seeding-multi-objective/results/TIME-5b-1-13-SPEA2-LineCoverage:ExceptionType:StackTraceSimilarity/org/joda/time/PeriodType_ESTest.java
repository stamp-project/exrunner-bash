/*

 * Wed Apr 22 19:40:12 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DurationFieldType;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.TestDateTime_Basics;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class PeriodType_ESTest extends PeriodType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PeriodType.yearMonthDay();
      PeriodType.millis();
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      DurationFieldType durationFieldType0 = DurationFieldType.years();
      periodType0.isSupported(durationFieldType0);
      PeriodType periodType1 = periodType0.withMonthsRemoved();
      PeriodType periodType2 = periodType0.withMillisRemoved();
      periodType1.getName();
      PeriodType.seconds();
      PeriodType periodType3 = PeriodType.yearDay();
      PeriodType periodType4 = periodType2.withHoursRemoved();
      PeriodType.yearMonthDay();
      PeriodType periodType5 = PeriodType.dayTime();
      periodType4.withHoursRemoved();
      periodType3.indexOf(durationFieldType0);
      periodType4.size();
      PeriodType periodType6 = periodType5.withMonthsRemoved();
      TestDateTime_Basics testDateTime_Basics0 = mock(TestDateTime_Basics.class, new ViolatedAssumptionAnswer());
      TestDateTime_Basics.MockInstant testDateTime_Basics_MockInstant0 = testDateTime_Basics0.new MockInstant();
      Chronology chronology0 = testDateTime_Basics_MockInstant0.getChronology();
      Period period0 = new Period((long) 0, chronology0);
      int[] intArray0 = new int[2];
      intArray0[0] = 0;
      intArray0[1] = 0;
      // Undeclared exception!
      periodType6.setIndexedField(period0, 0, intArray0, 0);
  }
}
