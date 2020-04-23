/*

 * Wed Apr 22 19:39:53 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.TestBaseSingleFieldPeriod;
import org.joda.time.format.PeriodFormatter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Period period0 = Period.seconds(3108);
      PeriodFormatter periodFormatter0 = mock(PeriodFormatter.class, new ViolatedAssumptionAnswer());
      doReturn("--MM-dd").when(periodFormatter0).print(any(org.joda.time.ReadablePeriod.class));
      period0.toString(periodFormatter0);
      Period period1 = period0.withYears(3108);
      TestBaseSingleFieldPeriod.Single testBaseSingleFieldPeriod_Single0 = new TestBaseSingleFieldPeriod.Single(157);
      PeriodType periodType0 = testBaseSingleFieldPeriod_Single0.getPeriodType();
      PeriodType periodType1 = periodType0.withYearsRemoved();
      // Undeclared exception!
      period1.normalizedStandard(periodType1);
  }
}
