/*

 * Tue Apr 21 06:16:48 UTC 2020
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.StringUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class StringUtils_ESTest extends StringUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StringUtils.lastIndexOf("", 'd', 0);
      StringUtils.substringBetween("", "<W%1zYU\"p^7=e-", "BC,aw(/");
      StringUtils.length((String) null);
      StringUtils.isEmpty((CharSequence) null);
      StringUtils.leftPad("<W%1zYU\"p^7=e-", 0, 'e');
      StringUtils.substringAfterLast((String) null, "");
      StringUtils.abbreviate("<W%1zYU\"p^7=e-", (-1), 5);
      StringUtils.mid("<W%1zYU\"p^7=e-", 0, 5);
      StringUtils.substringBetween("m?0&oY", (String) null);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "byte";
      stringArray0[1] = null;
      stringArray0[2] = null;
      stringArray0[3] = "<W...";
      stringArray0[4] = null;
      stringArray0[5] = "m?0&oY";
      // Undeclared exception!
      StringUtils.replaceEach("byte", stringArray0, stringArray0);
  }
}
