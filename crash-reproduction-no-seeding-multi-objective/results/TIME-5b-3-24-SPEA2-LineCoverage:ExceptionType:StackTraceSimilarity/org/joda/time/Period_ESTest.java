/*

 * Wed Apr 22 19:41:52 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Days;
import org.joda.time.Period;
import org.joda.time.format.PeriodFormatter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Days days0 = Days.ZERO;
      days0.toStandardDuration();
      Period period0 = Period.hours((-488));
      PeriodFormatter periodFormatter0 = mock(PeriodFormatter.class, new ViolatedAssumptionAnswer());
      doReturn("O:1{").when(periodFormatter0).print(any(org.joda.time.ReadablePeriod.class));
      period0.toString(periodFormatter0);
      period0.getHours();
      period0.toPeriod();
      Period period1 = Period.minutes(0);
      period0.minusMinutes(0);
      int int0 = (-363);
      // Undeclared exception!
      period1.minusYears((-363));
  }
}
