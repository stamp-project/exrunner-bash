/*

 * Wed Apr 22 20:42:14 BST 2020
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
import org.joda.time.TestLocalDateTime_Basics;
import org.joda.time.TestMutableInterval_Basics;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TestMutableInterval_Basics testMutableInterval_Basics0 = new TestMutableInterval_Basics((String) null);
      PeriodType periodType0 = PeriodType.yearDayTime();
      TestLocalDateTime_Basics testLocalDateTime_Basics0 = new TestLocalDateTime_Basics("");
      TestLocalDateTime_Basics.MockInstant testLocalDateTime_Basics_MockInstant0 = testLocalDateTime_Basics0.new MockInstant();
      Chronology chronology0 = testLocalDateTime_Basics_MockInstant0.getChronology();
      Period period0 = new Period(0L, periodType0, chronology0);
      int int0 = 2;
      // Undeclared exception!
      period0.withYears((-2644));
  }
}
