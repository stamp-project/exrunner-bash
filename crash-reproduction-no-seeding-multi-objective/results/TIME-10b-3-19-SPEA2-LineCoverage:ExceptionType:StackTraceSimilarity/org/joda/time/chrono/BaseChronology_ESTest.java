/*

 * Tue Apr 21 13:06:07 UTC 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Calendar;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.YearMonth;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseChronology_ESTest extends BaseChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      copticChronology0.hours();
      copticChronology0.days();
      copticChronology0.minuteOfHour();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      YearMonth yearMonth0 = new YearMonth((DateTimeZone) fixedDateTimeZone0);
      DateMidnight dateMidnight0 = new DateMidnight((-901L));
      Locale locale0 = Locale.ITALIAN;
      Calendar calendar0 = dateMidnight0.toCalendar(locale0);
      LocalDate localDate0 = LocalDate.fromCalendarFields(calendar0);
      localDate0.plusMonths(12);
      FixedDateTimeZone fixedDateTimeZone1 = (FixedDateTimeZone)DateTimeZone.UTC;
      YearMonth yearMonth1 = new YearMonth((DateTimeZone) fixedDateTimeZone0);
      DateMidnight dateMidnight1 = new DateMidnight(352L);
      Locale locale1 = Locale.ITALIAN;
      dateMidnight0.toCalendar(locale0);
      LocalDate.fromCalendarFields(calendar0);
      localDate0.plusMonths(15);
      // Undeclared exception!
      copticChronology0.set(localDate0, 38898367845L);
  }
}
