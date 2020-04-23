/*

 * Tue Apr 21 07:18:37 UTC 2020
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.ParseException;
import java.time.Clock;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.apache.commons.lang3.time.DateUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateUtils_ESTest extends DateUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Clock clock0 = Clock.systemDefaultZone();
      ZonedDateTime zonedDateTime0 = ZonedDateTime.now(clock0);
      GregorianCalendar gregorianCalendar0 = GregorianCalendar.from(zonedDateTime0);
      DateUtils.isSameDay((Calendar) gregorianCalendar0, (Calendar) gregorianCalendar0);
      String[] stringArray0 = new String[0];
      try { 
        DateUtils.parseDate("", stringArray0);
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unable to parse the date: 
         //
         verifyException("org.apache.commons.lang3.time.DateUtils", e);
      }
  }
}
