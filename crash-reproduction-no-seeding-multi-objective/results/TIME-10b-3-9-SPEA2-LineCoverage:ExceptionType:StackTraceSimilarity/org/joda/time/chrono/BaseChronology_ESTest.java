/*

 * Tue Apr 21 13:03:26 UTC 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import java.util.GregorianCalendar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseChronology_ESTest extends BaseChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(0, (-1), 0);
      Date date0 = gregorianCalendar0.getGregorianChange();
      LocalTime localTime0 = LocalTime.fromDateFields(date0);
      iSOChronology0.set(localTime0, 0);
      GregorianCalendar gregorianCalendar1 = new GregorianCalendar(0, (-1), 3691, 57, 2255);
      LocalDate localDate0 = new LocalDate((long) 0, (Chronology) iSOChronology0);
      LocalDate localDate1 = localDate0.plusMonths(2255);
      localDate1.plusYears(555);
      JulianChronology.getInstance();
      IslamicChronology.getInstanceUTC();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      // Undeclared exception!
      ethiopicChronology0.set(localDate0, 918518400000L);
  }
}
