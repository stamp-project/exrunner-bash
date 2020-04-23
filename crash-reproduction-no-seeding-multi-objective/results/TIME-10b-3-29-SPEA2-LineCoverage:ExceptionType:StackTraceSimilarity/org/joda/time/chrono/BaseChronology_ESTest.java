/*

 * Tue Apr 21 13:09:32 UTC 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.LocalDateTime;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseChronology_ESTest extends BaseChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = (-3903);
      JulianChronology.getInstanceUTC();
      CopticChronology.getInstance();
      Duration.standardDays((-3903));
      Duration duration0 = Duration.millis(21);
      duration0.minus((long) 292278993);
      int int1 = EthiopicChronology.EE;
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(218);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      Object object0 = new Object();
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      iSOChronology0.toString();
      DateMidnight dateMidnight0 = DateMidnight.now(dateTimeZone0);
      DateMidnight dateMidnight1 = dateMidnight0.plusMonths(168);
      int int2 = 7;
      LocalDateTime localDateTime0 = new LocalDateTime(dateMidnight1, dateTimeZone0);
      // Undeclared exception!
      islamicChronology0.set(localDateTime0, 218);
  }
}
