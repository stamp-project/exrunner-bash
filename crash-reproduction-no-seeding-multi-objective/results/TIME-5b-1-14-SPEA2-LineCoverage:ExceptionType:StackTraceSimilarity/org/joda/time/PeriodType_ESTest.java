/*

 * Wed Apr 22 19:40:24 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Minutes;
import org.joda.time.PeriodType;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class PeriodType_ESTest extends PeriodType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PeriodType periodType0 = PeriodType.months();
      DurationFieldType durationFieldType0 = DurationFieldType.HOURS_TYPE;
      periodType0.isSupported(durationFieldType0);
      PeriodType.seconds();
      periodType0.withSecondsRemoved();
      Days days0 = Days.THREE;
      Minutes minutes0 = days0.toStandardMinutes();
      periodType0.withWeeksRemoved();
      Duration duration0 = minutes0.toStandardDuration();
      Duration duration1 = duration0.negated();
      Minutes minutes1 = duration1.toStandardMinutes();
      int[] intArray0 = new int[1];
      intArray0[0] = 0;
      PeriodType periodType1 = PeriodType.yearMonthDay();
      periodType1.withYearsRemoved();
      // Undeclared exception!
      periodType0.setIndexedField(minutes1, 0, intArray0, (-61));
  }
}
