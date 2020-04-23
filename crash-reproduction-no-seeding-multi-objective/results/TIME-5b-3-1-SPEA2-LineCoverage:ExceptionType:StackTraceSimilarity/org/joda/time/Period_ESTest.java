/*

 * Wed Apr 22 19:38:17 UTC 2020
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
      int int0 = 0;
      int int1 = 3886;
      Period period0 = new Period(7, 0, 7, 7, 0, 0, 7, 3886);
      PeriodType periodType0 = PeriodType.days();
      PeriodType periodType1 = periodType0.withDaysRemoved();
      // Undeclared exception!
      period0.normalizedStandard(periodType1);
  }
}
