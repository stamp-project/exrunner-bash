/*

 * Tue Apr 21 13:08:22 UTC 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.LocalDateTime;
import org.joda.time.Minutes;
import org.joda.time.Period;
import org.joda.time.ReadablePeriod;
import org.joda.time.Weeks;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.ISOChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseChronology_ESTest extends BaseChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      Days days0 = Days.MIN_VALUE;
      long long0 = (-1810L);
      ethiopicChronology0.get((ReadablePeriod) days0, (-670L), (-1810L));
      Weeks weeks0 = Weeks.ONE;
      Minutes minutes0 = Minutes.MIN_VALUE;
      minutes0.toStandardWeeks();
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      Period period0 = new Period(0L, (-1810L), iSOChronology0);
      period0.getMillis();
      ethiopicChronology0.get((ReadablePeriod) period0, (-670L));
      ethiopicChronology0.halfdays();
      TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDateTime localDateTime0 = new LocalDateTime((-1810L), dateTimeZone0);
      LocalDateTime localDateTime1 = localDateTime0.plusMillis(538);
      // Undeclared exception!
      ethiopicChronology0.set(localDateTime1, 858L);
  }
}
