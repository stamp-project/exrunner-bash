/*

 * Tue Apr 21 07:17:38 UTC 2020
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.ParseException;
import java.util.Date;
import org.apache.commons.lang3.time.DateUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DateUtils_ESTest extends DateUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "8lSO";
      stringArray0[1] = "8lSO";
      stringArray0[2] = "-6";
      Date date0 = new Date();
      String[] stringArray1 = new String[0];
      try { 
        DateUtils.parseDate("Could not find ceiling of for type: ", stringArray1);
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unable to parse the date: Could not find ceiling of for type: 
         //
         verifyException("org.apache.commons.lang3.time.DateUtils", e);
      }
  }
}
