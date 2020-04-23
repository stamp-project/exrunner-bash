/*

 * Wed Apr 22 19:40:23 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.TestMutableDateTime_Basics;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Period_ESTest extends Period_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((long)2265).when(chronology0).getDateTimeMillis(anyInt() , anyInt() , anyInt() , anyInt() , anyInt() , anyInt() , anyInt());
      DateTime dateTime0 = new DateTime(2265, 2265, 2265, 2265, 2265, 2265, chronology0);
      PeriodType periodType0 = PeriodType.yearMonthDayTime();
      PeriodType periodType1 = periodType0.withYearsRemoved();
      TestMutableDateTime_Basics testMutableDateTime_Basics0 = new TestMutableDateTime_Basics("ACT");
      TestMutableDateTime_Basics.MockInstant testMutableDateTime_Basics_MockInstant0 = testMutableDateTime_Basics0.new MockInstant();
      Chronology chronology1 = testMutableDateTime_Basics_MockInstant0.getChronology();
      Period period0 = new Period((long) 2265, periodType1, chronology1);
      // Undeclared exception!
      period0.withYears(50);
  }
}
