/*

 * Wed Apr 22 19:41:10 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Months;
import org.joda.time.PeriodType;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class PeriodType_ESTest extends PeriodType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PeriodType periodType0 = PeriodType.days();
      periodType0.indexOf((DurationFieldType) null);
      periodType0.getName();
      Duration duration0 = new Duration(604800000L);
      periodType0.withWeeksRemoved();
      PeriodType periodType1 = PeriodType.hours();
      periodType1.withSecondsRemoved();
      PeriodType.yearDay();
      Months months0 = Months.EIGHT;
      int[] intArray0 = new int[9];
      intArray0[0] = 1398;
      intArray0[1] = 808;
      intArray0[2] = 1;
      intArray0[3] = (-1);
      intArray0[4] = 808;
      intArray0[5] = (-1);
      intArray0[6] = 1;
      intArray0[7] = 1;
      intArray0[8] = 1;
      // Undeclared exception!
      periodType1.setIndexedField(months0, 1, intArray0, (-1));
  }
}
