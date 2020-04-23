/*

 * Tue Apr 21 13:07:54 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.GregorianCalendar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
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
      MonthDay monthDay0 = MonthDay.now();
      int[] intArray0 = new int[8];
      intArray0[0] = 5;
      intArray0[1] = (-124);
      String string0 = "~G]|l0B[dQU";
      monthDay0.getChronology();
      TestDateMidnight_Basics testDateMidnight_Basics0 = new TestDateMidnight_Basics("~G]|l0B[dQU");
      TestDateMidnight_Basics.MockInstant testDateMidnight_Basics_MockInstant0 = testDateMidnight_Basics0.new MockInstant();
      Chronology chronology0 = testDateMidnight_Basics_MockInstant0.getChronology();
      MonthDay monthDay1 = new MonthDay(monthDay0, chronology0);
      MonthDay monthDay2 = MonthDay.now();
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar((-124), 4, 124);
      MonthDay monthDay3 = MonthDay.fromCalendarFields(gregorianCalendar0);
      MonthDay monthDay4 = new MonthDay(monthDay3, intArray0);
      // Undeclared exception!
      Days.daysBetween((ReadablePartial) monthDay4, (ReadablePartial) monthDay2);
  }
}
