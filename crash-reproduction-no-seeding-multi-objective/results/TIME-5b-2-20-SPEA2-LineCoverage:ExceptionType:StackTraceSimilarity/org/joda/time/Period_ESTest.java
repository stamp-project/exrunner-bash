/*

 * Wed Apr 22 19:41:29 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Minutes;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.Weeks;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[4];
      int int0 = 999;
      Weeks weeks0 = Weeks.THREE;
      Minutes minutes0 = weeks0.toStandardMinutes();
      PeriodType periodType0 = minutes0.getPeriodType();
      String string0 = ")";
      weeks0.toString();
      PeriodType.time();
      int int1 = 3;
      Period period0 = Period.years(3);
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }
}
