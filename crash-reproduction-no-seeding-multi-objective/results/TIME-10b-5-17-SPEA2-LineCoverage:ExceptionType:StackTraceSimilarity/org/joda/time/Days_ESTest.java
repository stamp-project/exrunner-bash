/*

 * Tue Apr 21 13:05:47 UTC 2020
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
import org.joda.time.TestYearMonth_Basics;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Days_ESTest extends Days_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = 65;
      intArray0[0] = 6;
      intArray0[2] = (-2736);
      TestYearMonth_Basics testYearMonth_Basics0 = new TestYearMonth_Basics("G}");
      TestYearMonth_Basics.MockYM testYearMonth_Basics_MockYM0 = testYearMonth_Basics0.new MockYM();
      Chronology chronology0 = testYearMonth_Basics_MockYM0.getChronology();
      Chronology chronology1 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(intArray0).when(chronology1).get(any(org.joda.time.ReadablePartial.class) , anyLong());
      doReturn(chronology0).when(chronology1).withUTC();
      MonthDay monthDay0 = MonthDay.now(chronology1);
      // Undeclared exception!
      Days.daysBetween((ReadablePartial) monthDay0, (ReadablePartial) monthDay0);
  }
}
