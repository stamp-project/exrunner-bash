/*

 * Wed Apr 22 19:39:17 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.TestDuration_Basics;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class PeriodType_ESTest extends PeriodType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PeriodType periodType0 = PeriodType.hours();
      TestDuration_Basics testDuration_Basics0 = new TestDuration_Basics("fh.");
      TestDuration_Basics.MockDuration testDuration_Basics_MockDuration0 = testDuration_Basics0.new MockDuration(0L);
      Period period0 = testDuration_Basics_MockDuration0.toPeriod();
      int[] intArray0 = new int[9];
      intArray0[0] = 0;
      intArray0[1] = (-950);
      intArray0[2] = 1903;
      intArray0[3] = 0;
      intArray0[4] = 0;
      intArray0[5] = 1731;
      intArray0[6] = 0;
      intArray0[7] = 0;
      intArray0[8] = (-70);
      // Undeclared exception!
      periodType0.setIndexedField(period0, 0, intArray0, (-950));
  }
}
