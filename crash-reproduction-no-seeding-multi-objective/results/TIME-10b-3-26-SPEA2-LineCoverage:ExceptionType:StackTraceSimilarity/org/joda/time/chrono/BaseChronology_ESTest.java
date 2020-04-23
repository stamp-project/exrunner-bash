/*

 * Tue Apr 21 13:07:59 UTC 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.MockZone;
import org.joda.time.MonthDay;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseChronology_ESTest extends BaseChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      julianChronology0.weeks();
      MonthDay monthDay0 = new MonthDay((-1L));
      julianChronology0.set(monthDay0, 499L);
      julianChronology0.secondOfDay();
      julianChronology0.seconds();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      buddhistChronology0.years();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      islamicChronology0.millisOfSecond();
      julianChronology0.yearOfEra();
      DateMidnight dateMidnight0 = new DateMidnight(499L);
      MockZone mockZone0 = new MockZone(1036800499L, 235, 0);
      DateTime dateTime0 = dateMidnight0.toDateTime((DateTimeZone) mockZone0);
      DateTime dateTime1 = dateTime0.minusMinutes((-3618));
      dateTime1.toLocalDate();
      // Undeclared exception!
      islamicChronology0.set(monthDay0, (-1L));
  }
}
