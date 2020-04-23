/*

 * Tue Apr 21 13:09:09 UTC 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeZone;
import org.joda.time.MockPartial;
import org.joda.time.MonthDay;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseChronology_ESTest extends BaseChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      MockPartial mockPartial0 = new MockPartial();
      buddhistChronology0.set(mockPartial0, 0L);
      int int0 = (-629);
      int int1 = 2006;
      buddhistChronology0.hourOfHalfday();
      buddhistChronology0.weekyearOfCentury();
      buddhistChronology0.weeks();
      buddhistChronology0.yearOfEra();
      buddhistChronology0.dayOfYear();
      buddhistChronology0.yearOfEra();
      buddhistChronology0.centuryOfEra();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, fixedDateTimeZone0);
      zonedChronology0.getZone();
      MonthDay monthDay0 = new MonthDay((long) (-629));
      long long0 = (-46L);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      // Undeclared exception!
      ethiopicChronology0.set(monthDay0, 0L);
  }
}
