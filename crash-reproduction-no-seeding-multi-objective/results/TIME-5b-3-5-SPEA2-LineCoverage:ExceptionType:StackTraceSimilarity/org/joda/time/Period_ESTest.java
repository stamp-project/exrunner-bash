/*

 * Wed Apr 22 19:39:15 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.TestBaseSingleFieldPeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Period period0 = new Period(6, (-2026), (-755), (-3385), (-3264), 1000, 6, (-3264));
      TestBaseSingleFieldPeriod.Single testBaseSingleFieldPeriod_Single0 = new TestBaseSingleFieldPeriod.Single(1);
      PeriodType periodType0 = testBaseSingleFieldPeriod_Single0.getPeriodType();
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }
}
