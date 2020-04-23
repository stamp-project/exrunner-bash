/*

 * Wed Apr 22 19:38:57 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.PeriodType;
import org.joda.time.ReadablePeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class PeriodType_ESTest extends PeriodType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PeriodType periodType0 = PeriodType.hours();
      PeriodType periodType1 = periodType0.withMinutesRemoved();
      periodType1.toString();
      ReadablePeriod readablePeriod0 = null;
      int[] intArray0 = new int[5];
      intArray0[0] = 0;
      intArray0[1] = 0;
      intArray0[2] = 0;
      intArray0[3] = 0;
      int int0 = 59;
      intArray0[4] = 59;
      // Undeclared exception!
      periodType0.setIndexedField((ReadablePeriod) null, 0, intArray0, 0);
  }
}
