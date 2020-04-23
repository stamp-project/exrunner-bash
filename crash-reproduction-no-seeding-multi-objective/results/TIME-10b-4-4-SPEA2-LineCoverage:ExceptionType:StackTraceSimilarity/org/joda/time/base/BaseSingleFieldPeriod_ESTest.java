/*

 * Tue Apr 21 13:05:26 UTC 2020
 */

package org.joda.time.base;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.LocalDateTime;
import org.joda.time.Minutes;
import org.joda.time.MonthDay;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.chrono.EthiopicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseSingleFieldPeriod_ESTest extends BaseSingleFieldPeriod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      DateMidnight dateMidnight0 = new DateMidnight((Chronology) ethiopicChronology0);
      MonthDay monthDay0 = MonthDay.now();
      Seconds seconds0 = Seconds.secondsBetween((ReadablePartial) monthDay0, (ReadablePartial) monthDay0);
      Days days0 = seconds0.toStandardDays();
      BaseSingleFieldPeriod.between(monthDay0, monthDay0, days0);
      Weeks weeks0 = Weeks.TWO;
      Weeks weeks1 = seconds0.toStandardWeeks();
      Seconds seconds1 = Seconds.ZERO;
      seconds0.plus(seconds1);
      EthiopicChronology ethiopicChronology1 = EthiopicChronology.getInstance((DateTimeZone) null);
      LocalDateTime localDateTime0 = new LocalDateTime((-1555L));
      Weeks weeks2 = Weeks.TWO;
      Days days1 = weeks1.toStandardDays();
      Minutes minutes0 = days1.toStandardMinutes();
      Minutes.minutes((-1621));
      minutes0.toString();
      Seconds.parseSeconds("PT0M");
      LocalDateTime localDateTime1 = new LocalDateTime(313L, (Chronology) ethiopicChronology1);
      // Undeclared exception!
      BaseSingleFieldPeriod.between(localDateTime1, localDateTime0, weeks0);
  }
}
