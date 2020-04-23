/*

 * Wed Apr 22 19:41:58 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.TestInterval_Basics;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class PeriodType_ESTest extends PeriodType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PeriodType periodType0 = PeriodType.years();
      TestInterval_Basics testInterval_Basics0 = new TestInterval_Basics("ks65T/6");
      TestInterval_Basics.MockInterval testInterval_Basics_MockInterval0 = testInterval_Basics0.new MockInterval();
      Period period0 = testInterval_Basics_MockInterval0.toPeriod();
      int[] intArray0 = new int[4];
      intArray0[0] = 6;
      int int0 = (-1176);
      intArray0[1] = (-1176);
      intArray0[2] = 6;
      period0.getPeriodType();
      intArray0[3] = 6;
      // Undeclared exception!
      periodType0.setIndexedField(period0, 6, intArray0, 10000);
  }
}
