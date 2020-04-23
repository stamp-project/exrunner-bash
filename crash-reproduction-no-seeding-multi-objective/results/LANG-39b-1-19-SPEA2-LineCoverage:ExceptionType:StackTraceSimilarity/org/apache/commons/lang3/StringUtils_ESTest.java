/*

 * Tue Apr 21 06:17:26 UTC 2020
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
      StringUtils.substringBetween("UzkVBG721m\u0001", "UzkVBG721m\u0001", "UzkVBG721m\u0001");
      String[] stringArray0 = new String[9];
      stringArray0[0] = null;
      stringArray0[1] = null;
      stringArray0[2] = "pxPu`q-+iP_!rAy";
      stringArray0[3] = "pxPu`q-+iP_!rAy";
      stringArray0[4] = null;
      stringArray0[5] = "pxPu`q-+iP_!rAy";
      stringArray0[6] = "UzkVBG721m\u0001";
      stringArray0[7] = "UzkVBG721m\u0001";
      stringArray0[8] = "pxPu`q-+iP_!rAy";
      // Undeclared exception!
      StringUtils.replaceEach("pxPu`q-+iP_!rAy", stringArray0, stringArray0);
  }
}
