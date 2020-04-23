/*

 * Tue Apr 21 13:07:09 UTC 2020
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
import org.joda.time.Days;
import org.joda.time.MonthDay;
import org.joda.time.ReadablePartial;
import org.joda.time.TestDateMidnight_Basics;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Days_ESTest extends Days_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[9];
      intArray0[0] = 6;
      intArray0[1] = (-1160);
      intArray0[2] = 4;
      int int0 = 2009;
      intArray0[3] = 2009;
      intArray0[4] = (-1808);
      intArray0[5] = 1440;
      intArray0[6] = (-1126);
      intArray0[7] = 2910;
      intArray0[8] = 14;
      TestDateMidnight_Basics testDateMidnight_Basics0 = new TestDateMidnight_Basics("q'5h#56CF_GRM<");
      TestDateMidnight_Basics.MockInstant testDateMidnight_Basics_MockInstant0 = testDateMidnight_Basics0.new MockInstant();
      Chronology chronology0 = testDateMidnight_Basics_MockInstant0.getChronology();
      Chronology chronology1 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(intArray0).when(chronology1).get(any(org.joda.time.ReadablePartial.class) , anyLong());
      doReturn(chronology0).when(chronology1).withUTC();
      MonthDay monthDay0 = MonthDay.now(chronology1);
      // Undeclared exception!
      Days.daysBetween((ReadablePartial) monthDay0, (ReadablePartial) monthDay0);
  }
}
