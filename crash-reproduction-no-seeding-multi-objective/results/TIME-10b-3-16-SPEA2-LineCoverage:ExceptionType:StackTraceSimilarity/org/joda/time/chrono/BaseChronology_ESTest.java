/*

 * Tue Apr 21 13:04:59 UTC 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.MockZone;
import org.joda.time.YearMonth;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.IslamicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseChronology_ESTest extends BaseChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockZone mockZone0 = new MockZone(2760L, 3770, 3770);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) mockZone0);
      YearMonth yearMonth0 = new YearMonth((Chronology) islamicChronology0);
      islamicChronology0.set(yearMonth0, 2760L);
      DateMidnight dateMidnight0 = new DateMidnight((-184L));
      dateMidnight0.withMillis(3770);
      DateMidnight dateMidnight1 = new DateMidnight();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      ethiopicChronology0.getMinYear();
      LocalDate localDate0 = dateMidnight0.toLocalDate();
      localDate0.withYear(0);
      IslamicChronology islamicChronology1 = IslamicChronology.getInstance();
      // Undeclared exception!
      islamicChronology1.set(localDate0, 3770);
  }
}
