/*

 * Wed Apr 22 19:38:55 UTC 2020
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
      int int0 = 53;
      Period period0 = new Period((-51), 53, 287, 1000, (-51), (-51), 1000, 287);
      PeriodType periodType0 = PeriodType.dayTime();
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }
}
