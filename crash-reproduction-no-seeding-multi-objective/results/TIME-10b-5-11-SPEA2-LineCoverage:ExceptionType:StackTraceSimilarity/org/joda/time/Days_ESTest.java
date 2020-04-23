/*

 * Tue Apr 21 13:03:34 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Days;
import org.joda.time.MonthDay;
import org.joda.time.ReadablePartial;
import org.joda.time.TestInstant_Basics;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Days_ESTest extends Days_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TestInstant_Basics testInstant_Basics0 = new TestInstant_Basics("~t[?}3;ahVi&");
      MonthDay monthDay0 = new MonthDay((-760L));
      int[] intArray0 = new int[8];
      intArray0[0] = 4;
      intArray0[1] = (-416);
      intArray0[2] = 4;
      intArray0[3] = (-253);
      intArray0[4] = (-416);
      intArray0[5] = (-416);
      intArray0[6] = (-416);
      intArray0[7] = (-416);
      MonthDay monthDay1 = new MonthDay(monthDay0, intArray0);
      // Undeclared exception!
      Days.daysBetween((ReadablePartial) monthDay1, (ReadablePartial) monthDay0);
  }
}
