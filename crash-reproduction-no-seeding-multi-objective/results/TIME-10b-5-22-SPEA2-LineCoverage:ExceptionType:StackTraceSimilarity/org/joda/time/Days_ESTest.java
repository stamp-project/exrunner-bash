/*

 * Tue Apr 21 13:07:02 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import java.util.GregorianCalendar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Days;
import org.joda.time.MonthDay;
import org.joda.time.ReadablePartial;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Days_ESTest extends Days_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar();
      MonthDay monthDay0 = MonthDay.fromCalendarFields(gregorianCalendar0);
      int[] intArray0 = new int[7];
      intArray0[1] = 0;
      MonthDay monthDay1 = MonthDay.fromCalendarFields(gregorianCalendar0);
      Date date0 = new Date(798L);
      gregorianCalendar0.setGregorianChange(date0);
      int[] intArray1 = new int[2];
      intArray1[0] = 1;
      intArray1[1] = 0;
      MonthDay monthDay2 = new MonthDay(monthDay0, intArray1);
      // Undeclared exception!
      Days.daysBetween((ReadablePartial) monthDay2, (ReadablePartial) monthDay1);
  }
}
