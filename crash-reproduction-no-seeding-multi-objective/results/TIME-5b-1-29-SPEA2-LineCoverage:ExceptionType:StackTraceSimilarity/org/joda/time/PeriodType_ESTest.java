/*

 * Wed Apr 22 19:42:24 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.PeriodType;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class PeriodType_ESTest extends PeriodType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PeriodType periodType0 = PeriodType.seconds();
      DurationFieldType durationFieldType0 = DurationFieldType.years();
      periodType0.indexOf(durationFieldType0);
      PeriodType periodType1 = PeriodType.dayTime();
      DurationFieldType durationFieldType1 = DurationFieldType.centuries();
      periodType1.indexOf(durationFieldType1);
      Hours hours0 = Hours.EIGHT;
      hours0.getPeriodType();
      PeriodType periodType2 = periodType0.withWeeksRemoved();
      periodType1.withSecondsRemoved();
      int[] intArray0 = new int[8];
      intArray0[0] = (-1);
      intArray0[1] = (-1);
      intArray0[2] = (-1);
      intArray0[3] = (-1);
      intArray0[4] = (-1);
      intArray0[5] = 0;
      intArray0[6] = 0;
      intArray0[7] = (-1);
      // Undeclared exception!
      periodType2.setIndexedField(hours0, 0, intArray0, (-1));
  }
}
