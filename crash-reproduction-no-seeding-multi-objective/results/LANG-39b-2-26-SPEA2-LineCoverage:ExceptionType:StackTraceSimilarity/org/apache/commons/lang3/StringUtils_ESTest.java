/*

 * Tue Apr 21 06:17:55 UTC 2020
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
      StringUtils.replaceOnce("F'>p,4,R*_FqWbXe&Q", "F'>p,4,R*_FqWbXe&Q", "WC+Mrf_g6Ta");
      StringUtils.abbreviate((String) null, 13);
      String[] stringArray0 = new String[9];
      stringArray0[0] = null;
      stringArray0[1] = "F'>p,4,R*_FqWbXe&Q";
      stringArray0[2] = null;
      stringArray0[5] = "WC+Mrf_g6Ta";
      stringArray0[6] = "WC+Mrf_g6Ta";
      stringArray0[7] = "F'>p,4,R*_FqWbXe&Q";
      stringArray0[8] = "I";
      // Undeclared exception!
      StringUtils.replaceEach("I", stringArray0, stringArray0);
  }
}
