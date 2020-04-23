/*

 * Wed Apr 22 19:42:16 UTC 2020
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
      PeriodType.dayTime();
      PeriodType periodType0 = PeriodType.hours();
      PeriodType periodType1 = PeriodType.years();
      PeriodType.months();
      periodType1.withMillisRemoved();
      DurationFieldType durationFieldType0 = DurationFieldType.YEARS_TYPE;
      periodType0.isSupported(durationFieldType0);
      Hours hours0 = Hours.SIX;
      int[] intArray0 = new int[0];
      // Undeclared exception!
      periodType0.setIndexedField(hours0, 0, intArray0, 0);
  }
}
