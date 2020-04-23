/*

 * Wed Apr 22 19:38:05 UTC 2020
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
import org.joda.time.TestTimeOfDay_Basics;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 2444;
      Period.minutes(2444);
      String string0 = ",erN'~L2u<~nKQhaG\\<";
      TestTimeOfDay_Basics testTimeOfDay_Basics0 = new TestTimeOfDay_Basics(",erN'~L2u<~nKQhaG<");
      TestTimeOfDay_Basics.MockInstant testTimeOfDay_Basics_MockInstant0 = testTimeOfDay_Basics0.new MockInstant();
      Chronology chronology0 = testTimeOfDay_Basics_MockInstant0.getChronology();
      PeriodType periodType0 = PeriodType.seconds();
      Period period0 = new Period(2444, 0L, periodType0, chronology0);
      Period period1 = new Period();
      int int1 = (-1);
      // Undeclared exception!
      period0.withYears(2444);
  }
}
