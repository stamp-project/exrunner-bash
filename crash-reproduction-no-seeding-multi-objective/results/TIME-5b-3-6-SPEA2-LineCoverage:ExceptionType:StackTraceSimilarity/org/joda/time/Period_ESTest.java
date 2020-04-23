/*

 * Wed Apr 22 21:39:26 CEST 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.Seconds;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Period period0 = new Period((-1082), (-909), (-1046), (-1082), (-2458), (-909), (-2458), 1000);
      PeriodType periodType0 = PeriodType.years();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      Seconds seconds0 = Seconds.standardSecondsIn(mutablePeriod0);
      PeriodType periodType1 = seconds0.getPeriodType();
      PeriodType periodType2 = periodType1.withMonthsRemoved();
      // Undeclared exception!
      period0.normalizedStandard(periodType2);
  }
}
