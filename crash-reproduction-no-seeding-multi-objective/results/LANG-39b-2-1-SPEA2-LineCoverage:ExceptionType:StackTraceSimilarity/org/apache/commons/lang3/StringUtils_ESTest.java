/*

 * Tue Apr 21 06:16:09 UTC 2020
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
      StringUtils.strip("", "Windows NT");
      String[] stringArray0 = new String[7];
      stringArray0[0] = "Windows NT";
      stringArray0[1] = "Windows NT";
      stringArray0[2] = "";
      StringUtils.join((Object[]) stringArray0, "Windows NT", (-1191), (-1191));
      StringUtils.repeat("Ed", "n2av7h(ll%9VvNM", 0);
      StringUtils.containsIgnoreCase("IllegalArgumentException occurred during 1.6 backcompat code", "<JyH");
      StringUtils.replaceEach("0Ocrpoi^0Ocrpoi^", stringArray0, stringArray0);
      // Undeclared exception!
      StringUtils.replaceEach("Windows NT", stringArray0, stringArray0);
  }
}
