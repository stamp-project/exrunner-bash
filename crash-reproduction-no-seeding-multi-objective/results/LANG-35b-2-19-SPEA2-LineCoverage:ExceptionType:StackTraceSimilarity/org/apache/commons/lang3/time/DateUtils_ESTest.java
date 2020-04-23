/*

 * Tue Apr 21 07:18:09 UTC 2020
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.ParseException;
import org.apache.commons.lang3.time.DateUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateUtils_ESTest extends DateUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[0] = "2@a";
      stringArray0[1] = "";
      stringArray0[2] = "2@a";
      stringArray0[3] = "2@a";
      stringArray0[4] = "2@a";
      stringArray0[5] = "2@a";
      stringArray0[6] = "2@a";
      stringArray0[7] = "2@a";
      stringArray0[8] = "2@a";
      try { 
        DateUtils.parseDate("2@a", stringArray0);
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unable to parse the date: 2@a
         //
         verifyException("org.apache.commons.lang3.time.DateUtils", e);
      }
  }
}
