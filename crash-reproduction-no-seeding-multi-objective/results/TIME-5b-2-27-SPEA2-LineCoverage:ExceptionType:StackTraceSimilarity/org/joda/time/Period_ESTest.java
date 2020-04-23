/*

 * Wed Apr 22 19:42:16 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.TestMutableDateTime_Basics;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 0;
      String string0 = "0 milliseconds";
      Integer.getInteger("0 milliseconds", (Integer) null);
      PeriodType periodType0 = PeriodType.dayTime();
      TestMutableDateTime_Basics testMutableDateTime_Basics0 = new TestMutableDateTime_Basics("0 milliseconds");
      TestMutableDateTime_Basics.MockInstant testMutableDateTime_Basics_MockInstant0 = testMutableDateTime_Basics0.new MockInstant();
      Chronology chronology0 = testMutableDateTime_Basics_MockInstant0.getChronology();
      Period period0 = new Period((Object) null, periodType0, chronology0);
      period0.getSeconds();
      Period period1 = period0.withMillis(0);
      testMutableDateTime_Basics0.testToDateTimeISO();
      // Undeclared exception!
      period1.withYears(0);
  }
}
