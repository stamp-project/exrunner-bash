/*

 * Tue Apr 21 13:07:51 UTC 2020
 */

package org.joda.time.base;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.Hours;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.ReadablePartial;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseSingleFieldPeriod_ESTest extends BaseSingleFieldPeriod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Hours hours0 = Hours.FIVE;
      int int0 = (-1151);
      hours0.toPeriod();
      BuddhistChronology.getInstance();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      BuddhistChronology.getInstance();
      LocalTime localTime0 = new LocalTime((DateTimeZone) fixedDateTimeZone0);
      JulianChronology.getInstanceUTC();
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      copticChronology0.withUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((long) (-300), (Chronology) copticChronology0);
      LocalDateTime localDateTime1 = new LocalDateTime((-1527L), (DateTimeZone) fixedDateTimeZone0);
      LocalDateTime localDateTime2 = localDateTime1.minusWeeks((-1));
      localDateTime0.withWeekOfWeekyear(1);
      copticChronology0.get((ReadablePartial) localTime0, (-120L));
      BaseSingleFieldPeriod.between(localDateTime2, localDateTime1, hours0);
      // Undeclared exception!
      Minutes.minutesBetween((ReadablePartial) localDateTime0, (ReadablePartial) localDateTime1);
  }
}
