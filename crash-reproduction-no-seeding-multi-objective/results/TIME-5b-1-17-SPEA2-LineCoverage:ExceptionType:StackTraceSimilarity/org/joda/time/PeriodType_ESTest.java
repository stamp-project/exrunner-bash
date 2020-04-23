/*

 * Wed Apr 22 19:40:46 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Months;
import org.joda.time.PeriodType;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class PeriodType_ESTest extends PeriodType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PeriodType periodType0 = PeriodType.days();
      PeriodType periodType1 = PeriodType.yearWeekDay();
      PeriodType periodType2 = periodType1.withMonthsRemoved();
      periodType2.toString();
      PeriodType.dayTime();
      periodType0.withHoursRemoved();
      PeriodType periodType3 = PeriodType.hours();
      periodType3.withWeeksRemoved();
      Months months0 = Months.ELEVEN;
      int int0 = (-134);
      int[] intArray0 = null;
      // Undeclared exception!
      periodType0.setIndexedField(months0, 0, (int[]) null, (-134));
  }
}
