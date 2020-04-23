/*

 * Tue Apr 21 13:04:04 UTC 2020
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
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.MonthDay;
import org.joda.time.ReadablePartial;
import org.joda.time.TestLocalTime_Basics;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Days_ESTest extends Days_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((-1072L), (-1072L)).when(dateTimeZone0).convertUTCToLocal(anyLong());
      MonthDay monthDay0 = new MonthDay(dateTimeZone0);
      TestLocalTime_Basics testLocalTime_Basics0 = new TestLocalTime_Basics("=?@fY^.");
      TestLocalTime_Basics.MockInstant testLocalTime_Basics_MockInstant0 = testLocalTime_Basics0.new MockInstant();
      Chronology chronology0 = testLocalTime_Basics_MockInstant0.getChronology();
      Chronology chronology1 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(chronology0).when(chronology1).withUTC();
      MonthDay monthDay1 = new MonthDay(monthDay0, chronology1);
      // Undeclared exception!
      Days.daysBetween((ReadablePartial) monthDay1, (ReadablePartial) monthDay0);
  }
}
