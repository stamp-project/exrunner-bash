/*

 * Tue Apr 21 13:07:51 UTC 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.Period;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseChronology_ESTest extends BaseChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeZone.getDefault();
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      iSOChronology0.minutes();
      iSOChronology0.getZone();
      iSOChronology0.days();
      iSOChronology0.weekOfWeekyear();
      iSOChronology0.secondOfDay();
      iSOChronology0.weekOfWeekyear();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      iSOChronology0.secondOfDay();
      LocalDate localDate0 = new LocalDate((long) (-1));
      Period period0 = new Period(localDate0, localDate0);
      islamicChronology0.get((ReadablePeriod) period0, 0L, 1020L);
      LocalDate localDate1 = localDate0.withWeekyear((-998));
      islamicChronology0.weekOfWeekyear();
      islamicChronology0.secondOfDay();
      IslamicChronology islamicChronology1 = IslamicChronology.getInstance();
      islamicChronology1.secondOfDay();
      LocalDate localDate2 = new LocalDate((-36540000L));
      localDate2.yearOfCentury();
      localDate1.withWeekyear((-998));
      // Undeclared exception!
      islamicChronology1.set(localDate2, 0L);
  }
}
