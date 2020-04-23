/*

 * Wed Apr 22 19:41:13 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.Duration;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableDuration;
import org.joda.time.Seconds;
import org.joda.time.TestDuration_Basics;
import org.joda.time.TestLocalDate_Basics;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Duration duration0 = Duration.standardDays(0L);
      TestDuration_Basics testDuration_Basics0 = new TestDuration_Basics("era");
      TestDuration_Basics.MockDuration testDuration_Basics_MockDuration0 = testDuration_Basics0.new MockDuration((-4L));
      Duration duration1 = testDuration_Basics_MockDuration0.toDuration();
      Duration duration2 = duration0.plus((ReadableDuration) duration1);
      TestLocalDate_Basics testLocalDate_Basics0 = new TestLocalDate_Basics("DurationField[");
      TestLocalDate_Basics.MockInstant testLocalDate_Basics_MockInstant0 = testLocalDate_Basics0.new MockInstant();
      Chronology chronology0 = testLocalDate_Basics_MockInstant0.getChronology();
      Period period0 = duration2.toPeriod(chronology0);
      Seconds seconds0 = Seconds.standardSecondsIn(period0);
      PeriodType periodType0 = seconds0.getPeriodType();
      Period period1 = new Period(0L, periodType0);
      int int0 = 256;
      // Undeclared exception!
      period1.withYears(256);
  }
}
