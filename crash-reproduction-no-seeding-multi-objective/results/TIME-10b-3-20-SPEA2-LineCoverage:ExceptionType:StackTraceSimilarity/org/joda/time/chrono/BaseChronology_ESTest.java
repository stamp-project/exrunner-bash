/*

 * Tue Apr 21 13:06:29 UTC 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.Hours;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.MonthDay;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseChronology_ESTest extends BaseChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateTime dateTime0 = new DateTime(0L, (DateTimeZone) fixedDateTimeZone0);
      Instant instant0 = new Instant();
      Instant instant1 = instant0.minus(0L);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      MonthDay monthDay0 = new MonthDay(instant1, islamicChronology0);
      Hours hours0 = Hours.hoursBetween((ReadablePartial) monthDay0, (ReadablePartial) monthDay0);
      Duration duration0 = hours0.toStandardDuration();
      Instant instant2 = instant1.plus((ReadableDuration) duration0);
      Instant instant3 = instant2.plus(898L);
      Chronology chronology0 = instant3.getChronology();
      chronology0.set(monthDay0, 898L);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(chronology0, fixedDateTimeZone0);
      Chronology chronology1 = zonedChronology0.withUTC();
      LocalDate localDate0 = new LocalDate(0L, chronology1);
      LocalDateTime localDateTime0 = new LocalDateTime((-1L));
      LocalDateTime localDateTime1 = localDateTime0.withPeriodAdded(hours0, 2054114793);
      localDateTime1.dayOfMonth();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_15_BASED;
      islamicChronology_LeapYearPatternType0.isLeapYear(2054114793);
      IslamicChronology.getInstance((DateTimeZone) fixedDateTimeZone0, islamicChronology_LeapYearPatternType0);
      // Undeclared exception!
      islamicChronology0.set(localDateTime1, (-1857L));
  }
}
