/*

 * Tue Apr 21 13:10:20 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.ReadablePartial;
import org.joda.time.TestLocalDate_Basics;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Days_ESTest extends Days_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Days.parseDays((String) null);
      String string0 = "";
      TestLocalDate_Basics testLocalDate_Basics0 = new TestLocalDate_Basics("");
      TestLocalDate_Basics.MockInstant testLocalDate_Basics_MockInstant0 = testLocalDate_Basics0.new MockInstant();
      testLocalDate_Basics_MockInstant0.getChronology();
      LocalDate localDate0 = new LocalDate((-1302L), (DateTimeZone) null);
      localDate0.plusWeeks((-918));
      int int0 = 23;
      localDate0.withDayOfMonth(23);
      // Undeclared exception!
      Days.daysBetween((ReadablePartial) testLocalDate_Basics_MockInstant0, (ReadablePartial) localDate0);
  }
}
