/*

 * Tue Apr 21 06:17:54 UTC 2020
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
      String[] stringArray0 = new String[24];
      stringArray0[0] = " :WVNgHjj";
      stringArray0[1] = " :WVNgHjj";
      stringArray0[2] = " :WVNgHjj";
      stringArray0[3] = " :WVNgHjj";
      stringArray0[4] = " :WVNgHjj";
      stringArray0[5] = " :WVNgHjj";
      stringArray0[6] = " :WVNgHjj";
      stringArray0[7] = " :WVNgHjj";
      stringArray0[8] = " :WVNgHjj";
      // Undeclared exception!
      StringUtils.replaceEach(" :WVNgHjj", stringArray0, stringArray0);
  }
}
