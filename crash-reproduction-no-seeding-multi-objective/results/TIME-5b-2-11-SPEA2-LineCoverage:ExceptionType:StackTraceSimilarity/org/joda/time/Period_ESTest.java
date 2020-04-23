/*

 * Wed Apr 22 19:39:58 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.Duration;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.TestMutableDateTime_Basics;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      TestMutableDateTime_Basics testMutableDateTime_Basics0 = new TestMutableDateTime_Basics("NoMillis");
      TestMutableDateTime_Basics.MockEqualsChronology testMutableDateTime_Basics_MockEqualsChronology0 = testMutableDateTime_Basics0.new MockEqualsChronology();
      Chronology chronology0 = testMutableDateTime_Basics_MockEqualsChronology0.withUTC();
      Period period0 = duration0.toPeriod(chronology0);
      PeriodType periodType0 = PeriodType.time();
      Period period1 = period0.withPeriodType(periodType0);
      int int0 = 393;
      // Undeclared exception!
      period1.withYears(393);
  }
}
