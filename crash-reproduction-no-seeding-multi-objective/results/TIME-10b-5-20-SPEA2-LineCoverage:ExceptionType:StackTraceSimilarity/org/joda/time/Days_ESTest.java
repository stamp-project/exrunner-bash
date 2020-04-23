/*

 * Tue Apr 21 14:07:51 BST 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.ReadablePartial;
import org.joda.time.TestLocalDate_Basics;
import org.joda.time.YearMonth;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Days_ESTest extends Days_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      TestLocalDate_Basics testLocalDate_Basics0 = new TestLocalDate_Basics("P\";[\"^T@fMG/T^fF");
      TestLocalDate_Basics.MockInstant testLocalDate_Basics_MockInstant0 = testLocalDate_Basics0.new MockInstant();
      Chronology chronology0 = testLocalDate_Basics_MockInstant0.getChronology();
      YearMonth yearMonth0 = new YearMonth((-1253L), chronology0);
      int[] intArray0 = new int[7];
      int int0 = 168;
      intArray0[0] = 168;
      intArray0[1] = (-2916);
      intArray0[2] = 419;
      intArray0[3] = (-1224);
      intArray0[4] = 7;
      intArray0[5] = 1;
      intArray0[6] = 503;
      YearMonth yearMonth1 = new YearMonth(yearMonth0, intArray0);
      Days days0 = Days.daysBetween((ReadablePartial) testLocalDate_Basics_MockInstant0, (ReadablePartial) localDate0);
      days0.getPeriodType();
      // Undeclared exception!
      Days.daysBetween((ReadablePartial) yearMonth1, (ReadablePartial) yearMonth1);
  }
}
