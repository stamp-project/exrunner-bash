/*

 * Tue Apr 21 13:00:51 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.Days;
import org.joda.time.LocalTime;
import org.joda.time.MonthDay;
import org.joda.time.ReadablePartial;
import org.joda.time.TestLocalDateTime_Basics;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Days_ESTest extends Days_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      TestLocalDateTime_Basics testLocalDateTime_Basics0 = new TestLocalDateTime_Basics("w%.U+&t");
      TestLocalDateTime_Basics.MockInstant testLocalDateTime_Basics_MockInstant0 = testLocalDateTime_Basics0.new MockInstant();
      testLocalDateTime_Basics_MockInstant0.getChronology();
      int[] intArray0 = new int[1];
      intArray0[0] = (-1298);
      Chronology chronology0 = testLocalDateTime_Basics_MockInstant0.getChronology();
      MonthDay monthDay0 = MonthDay.now(chronology0);
      MonthDay monthDay1 = new MonthDay();
      MonthDay monthDay2 = monthDay1.minusDays((-2811));
      Days days0 = Days.daysBetween((ReadablePartial) monthDay0, (ReadablePartial) monthDay2);
      days0.plus((-1444));
  }
}
