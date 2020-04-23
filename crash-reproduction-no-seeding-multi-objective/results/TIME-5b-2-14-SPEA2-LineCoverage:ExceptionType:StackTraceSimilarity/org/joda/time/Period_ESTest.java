/*

 * Wed Apr 22 19:40:31 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.MonthDay;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.parse("");
      PeriodType periodType0 = PeriodType.days();
      Period period0 = new Period(monthDay0, monthDay0, periodType0);
      int int0 = (-1113);
      // Undeclared exception!
      period0.withYears((-1113));
  }
}
