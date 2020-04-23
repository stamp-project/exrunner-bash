/*

 * Tue Apr 21 07:17:53 UTC 2020
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.ParseException;
import java.util.GregorianCalendar;
import org.apache.commons.lang3.time.DateUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateUtils_ESTest extends DateUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 2100;
      int int1 = 7;
      GregorianCalendar gregorianCalendar0 = new GregorianCalendar(0, 0, 2100, 7, 0);
      String[] stringArray0 = new String[0];
      try { 
        DateUtils.parseDate("I[&MO=M@l}M", stringArray0);
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unable to parse the date: I[&MO=M@l}M
         //
         verifyException("org.apache.commons.lang3.time.DateUtils", e);
      }
  }
}
