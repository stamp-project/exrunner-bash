/*

 * Tue Apr 21 13:01:31 UTC 2020
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateTimeFieldType;
import org.joda.time.Duration;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Months;
import org.joda.time.chrono.BuddhistChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class PreciseDurationDateTimeField_ESTest extends PreciseDurationDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = mock(DateTimeFieldType.class, new ViolatedAssumptionAnswer());
      BuddhistChronology.getInstance();
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      Months months0 = Months.MIN_VALUE;
      LocalTime localTime1 = LocalTime.MIDNIGHT;
      Months months1 = Months.SEVEN;
      Locale locale0 = Locale.GERMAN;
      Date date0 = new Date();
      LocalDateTime localDateTime0 = LocalDateTime.fromDateFields(date0);
      Duration.standardDays(1L);
      localTime0.getValues();
      // Undeclared exception!
      localDateTime0.withDayOfMonth(1063);
  }
}
