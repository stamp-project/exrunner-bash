/*

 * Wed Apr 22 19:40:40 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DurationFieldType;
import org.joda.time.Minutes;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PeriodType periodType0 = PeriodType.days();
      PeriodType periodType1 = periodType0.withHoursRemoved();
      Period period0 = new Period(1180L, periodType1);
      Period period1 = period0.plusMinutes(0);
      period0.toStandardDuration();
      Period period2 = period1.plus(period0);
      Minutes minutes0 = Minutes.MIN_VALUE;
      DurationFieldType durationFieldType0 = minutes0.getFieldType();
      period2.isSupported(durationFieldType0);
      Period.millis((-1316));
      Period period3 = new Period((-1316), (-1316));
      // Undeclared exception!
      period1.withYears(37);
  }
}
