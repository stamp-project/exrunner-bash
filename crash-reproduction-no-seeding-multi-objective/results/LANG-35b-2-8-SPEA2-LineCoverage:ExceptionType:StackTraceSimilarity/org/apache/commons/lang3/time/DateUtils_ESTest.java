/*

 * Tue Apr 21 07:17:36 UTC 2020
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
      String[] stringArray0 = new String[7];
      stringArray0[0] = "GHQc[><nNdP&!o";
      stringArray0[1] = "GHQc[><nNdP&!o";
      stringArray0[2] = "GHQc[><nNdP&!o";
      stringArray0[3] = "GHQc[><nNdP&!o";
      stringArray0[4] = "GHQc[><nNdP&!o";
      String[] stringArray1 = new String[1];
      stringArray1[0] = "5u";
      try { 
        DateUtils.parseDate("5u", stringArray1);
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unable to parse the date: 5u
         //
         verifyException("org.apache.commons.lang3.time.DateUtils", e);
      }
  }
}
