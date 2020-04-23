/*

 * Tue Apr 21 13:06:28 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import junit.framework.TestCase;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.ReadablePartial;
import org.joda.time.TestYearMonthDay_Basics;
import org.joda.time.YearMonth;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Days_ESTest extends Days_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth(0L);
      Days.daysBetween((ReadablePartial) yearMonth0, (ReadablePartial) yearMonth0);
      int[] intArray0 = new int[5];
      TestYearMonthDay_Basics testYearMonthDay_Basics0 = new TestYearMonthDay_Basics("o=}");
      TestYearMonthDay_Basics.MockInstant testYearMonthDay_Basics_MockInstant0 = testYearMonthDay_Basics0.new MockInstant();
      TestCase.assertTrue("o=}", true);
      LocalDate localDate0 = new LocalDate(2345L);
      localDate0.withFields((ReadablePartial) null);
      localDate0.plusYears(122);
      LocalDate localDate1 = localDate0.plusMonths((-4));
      // Undeclared exception!
      Days.daysBetween((ReadablePartial) testYearMonthDay_Basics_MockInstant0, (ReadablePartial) localDate1);
  }
}
