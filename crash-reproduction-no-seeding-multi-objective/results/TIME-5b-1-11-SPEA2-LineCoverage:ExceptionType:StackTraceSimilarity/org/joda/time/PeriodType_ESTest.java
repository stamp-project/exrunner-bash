/*

 * Wed Apr 22 19:39:54 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DurationFieldType;
import org.joda.time.Minutes;
import org.joda.time.PeriodType;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class PeriodType_ESTest extends PeriodType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DurationFieldType durationFieldType0 = DurationFieldType.HALFDAYS_TYPE;
      int[] intArray0 = new int[8];
      DurationFieldType[] durationFieldTypeArray0 = new DurationFieldType[6];
      durationFieldTypeArray0[0] = durationFieldType0;
      durationFieldTypeArray0[1] = durationFieldType0;
      durationFieldTypeArray0[5] = durationFieldType0;
      durationFieldTypeArray0[4] = durationFieldType0;
      durationFieldTypeArray0[5] = durationFieldType0;
      PeriodType periodType0 = PeriodType.yearMonthDay();
      Minutes minutes0 = Minutes.ZERO;
      // Undeclared exception!
      periodType0.setIndexedField(minutes0, 2, intArray0, 3);
  }
}
