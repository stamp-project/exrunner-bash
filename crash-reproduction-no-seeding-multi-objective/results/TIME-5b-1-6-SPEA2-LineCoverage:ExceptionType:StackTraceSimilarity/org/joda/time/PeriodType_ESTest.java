/*

 * Wed Apr 22 19:39:11 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.PeriodType;
import org.joda.time.Weeks;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class PeriodType_ESTest extends PeriodType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PeriodType periodType0 = PeriodType.millis();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTime dateTime0 = new DateTime(dateTimeZone0);
      Weeks weeks0 = Weeks.TWO;
      int int0 = 0;
      int[] intArray0 = new int[9];
      intArray0[0] = 0;
      intArray0[1] = 0;
      intArray0[2] = 4;
      intArray0[3] = 4;
      intArray0[4] = 0;
      intArray0[5] = (-17);
      intArray0[7] = 4;
      intArray0[8] = 4;
      // Undeclared exception!
      periodType0.setIndexedField(weeks0, 4, intArray0, 4);
  }
}
