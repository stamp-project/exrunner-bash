/*

 * Wed Apr 22 19:39:29 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Days;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInterval;
import org.joda.time.TestMutableInterval_Constructors;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class PeriodType_ESTest extends PeriodType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PeriodType periodType0 = PeriodType.years();
      TestMutableInterval_Constructors testMutableInterval_Constructors0 = new TestMutableInterval_Constructors("");
      TestMutableInterval_Constructors.MockInterval testMutableInterval_Constructors_MockInterval0 = testMutableInterval_Constructors0.new MockInterval();
      testMutableInterval_Constructors_MockInterval0.toInterval();
      Days days0 = Days.daysIn((ReadableInterval) null);
      int[] intArray0 = new int[5];
      intArray0[0] = 4;
      intArray0[1] = 4;
      intArray0[2] = 1630;
      intArray0[3] = 3724;
      intArray0[4] = 4;
      // Undeclared exception!
      periodType0.setIndexedField(days0, 4, intArray0, 3724);
  }
}
