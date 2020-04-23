/*

 * Wed Apr 22 19:39:04 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Duration;
import org.joda.time.Instant;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.Weeks;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Instant instant0 = new Instant(1462L);
      Duration duration0 = new Duration(0L, 0L);
      Weeks weeks0 = Weeks.MAX_VALUE;
      PeriodType periodType0 = weeks0.getPeriodType();
      Period period0 = new Period(instant0, duration0, periodType0);
      // Undeclared exception!
      period0.withYears(1264);
  }
}
