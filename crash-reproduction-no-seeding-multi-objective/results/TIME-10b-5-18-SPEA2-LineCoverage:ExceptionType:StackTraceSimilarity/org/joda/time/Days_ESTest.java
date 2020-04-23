/*

 * Tue Apr 21 13:05:47 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Days;
import org.joda.time.Hours;
import org.joda.time.MonthDay;
import org.joda.time.ReadablePartial;
import org.joda.time.Weeks;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Days_ESTest extends Days_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "org.joda.time.DateTimeZone.NameProvider";
      MonthDay monthDay0 = new MonthDay(128849018880000L);
      int[] intArray0 = new int[6];
      intArray0[1] = (-1448);
      intArray0[2] = 631;
      intArray0[3] = (-948);
      intArray0[4] = 0;
      intArray0[0] = 5;
      MonthDay monthDay1 = new MonthDay(monthDay0, intArray0);
      Hours.hours((-1448));
      Weeks weeks0 = Weeks.ZERO;
      monthDay1.minus(weeks0);
      // Undeclared exception!
      Days.daysBetween((ReadablePartial) monthDay1, (ReadablePartial) monthDay1);
  }
}
