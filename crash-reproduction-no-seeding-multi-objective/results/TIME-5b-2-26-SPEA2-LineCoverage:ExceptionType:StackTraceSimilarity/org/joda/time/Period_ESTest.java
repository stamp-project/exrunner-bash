/*

 * Wed Apr 22 19:42:06 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DurationFieldType;
import org.joda.time.Minutes;
import org.joda.time.Months;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.TestMutableDateTime_Basics;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Period period0 = Period.hours(0);
      Period period1 = Period.hours(0);
      Months months0 = Months.NINE;
      DurationFieldType durationFieldType0 = months0.getFieldType();
      period1.withFieldAdded(durationFieldType0, 2942);
      period0.minusMinutes(2942);
      int int0 = (-2820);
      Period.seconds((-2820));
      period1.negated();
      DateTime dateTime0 = new DateTime();
      DurationFieldType.months();
      DateTime dateTime1 = dateTime0.withFieldAdded(durationFieldType0, 10);
      Minutes minutes0 = Minutes.TWO;
      Minutes minutes1 = Minutes.minutes((-824));
      TestMutableDateTime_Basics testMutableDateTime_Basics0 = new TestMutableDateTime_Basics("^ai~^7uqmlvbRm");
      TestMutableDateTime_Basics.MockInstant testMutableDateTime_Basics_MockInstant0 = testMutableDateTime_Basics0.new MockInstant();
      Chronology chronology0 = testMutableDateTime_Basics_MockInstant0.getChronology();
      durationFieldType0.getField(chronology0);
      PeriodType periodType0 = minutes1.getPeriodType();
      Period period2 = new Period(dateTime1, dateTime1, periodType0);
      // Undeclared exception!
      period2.withYears(922);
  }
}
