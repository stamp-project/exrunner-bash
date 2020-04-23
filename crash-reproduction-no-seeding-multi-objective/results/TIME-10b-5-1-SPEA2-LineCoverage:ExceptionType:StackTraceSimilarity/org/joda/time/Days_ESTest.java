/*

 * Tue Apr 21 14:03:16 BST 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Days;
import org.joda.time.MonthDay;
import org.joda.time.ReadablePartial;
import org.joda.time.TestMutableInterval_Updates;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Days_ESTest extends Days_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TestMutableInterval_Updates testMutableInterval_Updates0 = new TestMutableInterval_Updates("");
      Days days0 = Days.THREE;
      Date date0 = new Date();
      MonthDay monthDay0 = MonthDay.fromDateFields(date0);
      int[] intArray0 = new int[6];
      intArray0[0] = 6;
      intArray0[1] = 2008;
      intArray0[2] = 3390;
      intArray0[3] = (-3);
      intArray0[4] = 6;
      intArray0[5] = (-3);
      MonthDay monthDay1 = new MonthDay(monthDay0, intArray0);
      // Undeclared exception!
      Days.daysBetween((ReadablePartial) monthDay1, (ReadablePartial) monthDay1);
  }
}
