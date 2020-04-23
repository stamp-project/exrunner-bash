/*

 * Wed Apr 22 19:41:25 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Hours;
import org.joda.time.PeriodType;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class PeriodType_ESTest extends PeriodType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Hours hours0 = Hours.SIX;
      PeriodType periodType0 = hours0.getPeriodType();
      PeriodType periodType1 = periodType0.withYearsRemoved();
      periodType0.hashCode();
      periodType0.equals(periodType1);
      int int0 = 0;
      int[] intArray0 = new int[4];
      intArray0[0] = 0;
      intArray0[1] = 0;
      intArray0[2] = 0;
      intArray0[3] = 0;
      int int1 = 89;
      // Undeclared exception!
      periodType1.setIndexedField(hours0, 0, intArray0, 89);
  }
}
