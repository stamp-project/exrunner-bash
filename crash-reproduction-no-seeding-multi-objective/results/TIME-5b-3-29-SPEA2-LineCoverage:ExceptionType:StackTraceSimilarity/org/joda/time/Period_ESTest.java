/*

 * Wed Apr 22 19:42:36 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Duration;
import org.joda.time.Interval;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.TestInterval_Constructors;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TestInterval_Constructors testInterval_Constructors0 = new TestInterval_Constructors("WX");
      TestInterval_Constructors.MockInterval testInterval_Constructors_MockInterval0 = testInterval_Constructors0.new MockInterval();
      Duration duration0 = Duration.standardSeconds(63072000000L);
      Interval interval0 = new Interval(duration0, (ReadableInstant) null);
      Period period0 = interval0.toPeriod();
      int int0 = 9;
      Period period1 = period0.minusSeconds(9);
      PeriodType periodType0 = PeriodType.seconds();
      // Undeclared exception!
      period1.normalizedStandard(periodType0);
  }
}
