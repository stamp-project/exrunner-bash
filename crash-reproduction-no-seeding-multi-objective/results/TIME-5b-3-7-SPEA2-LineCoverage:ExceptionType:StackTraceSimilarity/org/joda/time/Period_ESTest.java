/*

 * Wed Apr 22 19:39:37 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Months;
import org.joda.time.Period;
import org.joda.time.TestBasePartial;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TestBasePartial.MockPartial testBasePartial_MockPartial0 = new TestBasePartial.MockPartial();
      Months months0 = Months.ELEVEN;
      months0.getPeriodType();
      Period period0 = Period.ZERO;
      int int0 = (-950);
      // Undeclared exception!
      period0.plusWeeks((-950));
  }
}
