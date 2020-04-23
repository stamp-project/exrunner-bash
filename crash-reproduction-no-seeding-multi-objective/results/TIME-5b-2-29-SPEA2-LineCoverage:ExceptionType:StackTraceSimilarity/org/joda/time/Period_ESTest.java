/*

 * Wed Apr 22 19:42:34 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Calendar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableDuration;
import org.joda.time.TestDateTime_Basics;
import org.joda.time.YearMonth;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ReadableDuration readableDuration0 = mock(ReadableDuration.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(readableDuration0).getMillis();
      TestDateTime_Basics testDateTime_Basics0 = new TestDateTime_Basics("/ta/ZL`GJ!2RuVOP,");
      TestDateTime_Basics.MockEqualsChronology testDateTime_Basics_MockEqualsChronology0 = testDateTime_Basics0.new MockEqualsChronology();
      testDateTime_Basics_MockEqualsChronology0.withUTC();
      TestDateTime_Basics testDateTime_Basics1 = new TestDateTime_Basics("/ta/ZL`GJ!2RuVOP,");
      TestDateTime_Basics.MockEqualsChronology testDateTime_Basics_MockEqualsChronology1 = testDateTime_Basics0.new MockEqualsChronology();
      testDateTime_Basics_MockEqualsChronology1.withUTC();
      Calendar calendar0 = Calendar.getInstance();
      YearMonth yearMonth0 = YearMonth.fromCalendarFields(calendar0);
      Interval interval0 = yearMonth0.toInterval();
      DateTime dateTime0 = interval0.getEnd();
      PeriodType periodType0 = PeriodType.weeks();
      Period period0 = new Period(readableDuration0, dateTime0, periodType0);
      // Undeclared exception!
      period0.withYears(4);
  }
}
