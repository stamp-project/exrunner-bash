/*

 * Tue Apr 21 13:06:15 UTC 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.MockZone;
import org.joda.time.Months;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.IslamicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseChronology_ESTest extends BaseChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GregorianChronology.getInstanceUTC();
      LocalTime.fromMillisOfDay((-1603L));
      Months months0 = Months.NINE;
      MockZone mockZone0 = new MockZone(2629746000L, 0, (-692));
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_INDIAN;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) mockZone0, islamicChronology_LeapYearPatternType0);
      islamicChronology0.getMaxYear();
      BuddhistChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((-2837835L), (DateTimeZone) mockZone0);
      localDateTime0.weekOfWeekyear();
      // Undeclared exception!
      islamicChronology0.set(localDateTime0, (-1L));
  }
}
