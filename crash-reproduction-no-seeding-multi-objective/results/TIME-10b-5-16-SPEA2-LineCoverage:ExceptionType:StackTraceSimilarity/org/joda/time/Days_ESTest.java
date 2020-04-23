/*

 * Tue Apr 21 14:04:57 BST 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Days;
import org.joda.time.LocalDateTime;
import org.joda.time.Partial;
import org.joda.time.ReadablePartial;
import org.joda.time.TestDateMidnight_Basics;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Days_ESTest extends Days_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime();
      Days days0 = Days.SIX;
      days0.toPeriod();
      Days.daysBetween((ReadablePartial) localDateTime0, (ReadablePartial) localDateTime0);
      days0.toStandardSeconds();
      Partial partial0 = new Partial(localDateTime0);
      partial0.getFormatter();
      String string0 = "D";
      TestDateMidnight_Basics testDateMidnight_Basics0 = new TestDateMidnight_Basics("P");
      int[] intArray0 = new int[7];
      intArray0[0] = 3778;
      intArray0[1] = 5;
      intArray0[2] = 3778;
      intArray0[3] = 5;
      intArray0[4] = 5;
      intArray0[5] = 3778;
      intArray0[6] = 5;
      Partial partial1 = new Partial(partial0, intArray0);
      // Undeclared exception!
      Days.daysBetween((ReadablePartial) localDateTime0, (ReadablePartial) partial1);
  }
}
