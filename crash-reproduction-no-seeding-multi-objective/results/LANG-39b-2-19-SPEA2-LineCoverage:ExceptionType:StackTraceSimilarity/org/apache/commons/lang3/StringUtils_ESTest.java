/*

 * Tue Apr 21 06:17:30 UTC 2020
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
      StringUtils.remove("IllegalArgumentException occurred during 1.6 backcompat code", "IllegalArgumentException occurred during 1.6 backcompat code");
      StringUtils.center("K-", 64, "K-");
      StringUtils.center("E", 53, 'c');
      StringUtils.repeat((String) null, 53);
      StringUtils.defaultIfEmpty("IllegalArgumentException occurred during 1.6 backcompat code", (String) null);
      StringUtils.isAlphanumericSpace("_");
      String[] stringArray0 = new String[8];
      stringArray0[0] = null;
      stringArray0[1] = null;
      stringArray0[2] = "E";
      stringArray0[3] = null;
      stringArray0[4] = "K-";
      stringArray0[5] = null;
      stringArray0[6] = "ccccccccccccccccccccccccccEcccccccccccccccccccccccccc";
      stringArray0[7] = "E";
      // Undeclared exception!
      StringUtils.replaceEach("K-", stringArray0, stringArray0);
  }
}
