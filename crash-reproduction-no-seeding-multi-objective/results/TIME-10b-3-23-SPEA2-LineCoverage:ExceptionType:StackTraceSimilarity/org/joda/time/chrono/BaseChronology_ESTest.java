/*

 * Tue Apr 21 13:08:01 UTC 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Calendar;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.tz.UTCProvider;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseChronology_ESTest extends BaseChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      Days days0 = Days.MAX_VALUE;
      days0.toStandardWeeks();
      iSOChronology0.yearOfCentury();
      UTCProvider uTCProvider0 = new UTCProvider();
      String string0 = "Illegal pattern component: ";
      uTCProvider0.getZone("Illegal pattern component: ");
      AssembledChronology.Fields assembledChronology_Fields0 = new AssembledChronology.Fields();
      iSOChronology0.assemble(assembledChronology_Fields0);
      iSOChronology0.weekOfWeekyear();
      Calendar calendar0 = Calendar.getInstance();
      LocalDate localDate0 = LocalDate.fromCalendarFields(calendar0);
      TimeZone timeZone0 = TimeZone.getTimeZone("xe,P\naGj");
      Calendar.getInstance(timeZone0);
      LocalDate localDate1 = localDate0.minusMonths((-799));
      localDate1.getEra();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_INDIAN;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) null, islamicChronology_LeapYearPatternType0);
      islamicChronology0.getDaysInMonthMax();
      LocalDate localDate2 = localDate0.withDayOfMonth(30);
      // Undeclared exception!
      islamicChronology0.set(localDate2, 306783378L);
  }
}
