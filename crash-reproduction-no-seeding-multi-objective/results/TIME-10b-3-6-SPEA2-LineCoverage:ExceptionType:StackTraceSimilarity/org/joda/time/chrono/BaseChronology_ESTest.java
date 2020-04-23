/*

 * Tue Apr 21 13:02:10 UTC 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.ZonedChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseChronology_ESTest extends BaseChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      LocalDate localDate0 = new LocalDate((-1L));
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(9);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
      zonedChronology0.getZone();
      LocalDate localDate1 = new LocalDate((-1L), (Chronology) buddhistChronology0);
      LocalDate localDate2 = new LocalDate((-3256L), (Chronology) zonedChronology0);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      ethiopicChronology0.getYear(1800000L);
      EthiopicChronology.getInstanceUTC();
      // Undeclared exception!
      ethiopicChronology0.set(localDate2, 1800000L);
  }
}
