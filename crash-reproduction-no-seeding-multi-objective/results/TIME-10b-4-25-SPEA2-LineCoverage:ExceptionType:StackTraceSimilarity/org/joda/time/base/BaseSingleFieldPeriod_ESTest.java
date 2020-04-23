/*

 * Tue Apr 21 13:10:55 GMT+00:00 2020
 */

package org.joda.time.base;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.Hours;
import org.joda.time.LocalDate;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.chrono.EthiopicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseSingleFieldPeriod_ESTest extends BaseSingleFieldPeriod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      DateTimeZone dateTimeZone1 = null;
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      LocalDate.now((Chronology) ethiopicChronology0);
      Hours hours0 = Hours.TWO;
      LocalDate localDate0 = LocalDate.now((Chronology) ethiopicChronology0);
      Hours hours1 = Hours.TWO;
      Date date0 = new Date((-1L));
      LocalDate localDate1 = LocalDate.fromDateFields(date0);
      // Undeclared exception!
      BaseSingleFieldPeriod.between(localDate0, localDate1, hours0);
  }
}
