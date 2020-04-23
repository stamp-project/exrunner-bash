/*

 * Wed Apr 22 19:41:43 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearDay();
      PeriodType periodType1 = periodType0.withWeeksRemoved();
      PeriodType periodType2 = periodType1.withYearsRemoved();
      Period period0 = new Period(22345678L, periodType2);
      int int0 = (-1808);
      // Undeclared exception!
      period0.plusDays((-1808));
  }
}
