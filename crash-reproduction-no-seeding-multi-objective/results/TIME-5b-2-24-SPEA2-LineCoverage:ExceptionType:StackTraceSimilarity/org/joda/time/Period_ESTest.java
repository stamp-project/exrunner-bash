/*

 * Wed Apr 22 19:41:52 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.MutableDateTime;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PeriodType periodType0 = PeriodType.dayTime();
      Period period0 = new Period(168L, (-2798L), periodType0);
      MutableDateTime.now();
      PeriodType periodType1 = PeriodType.dayTime();
      Period period1 = new Period((-2798L), (-23L), periodType1);
      int int0 = 9;
      // Undeclared exception!
      period1.minusMinutes(9);
  }
}
