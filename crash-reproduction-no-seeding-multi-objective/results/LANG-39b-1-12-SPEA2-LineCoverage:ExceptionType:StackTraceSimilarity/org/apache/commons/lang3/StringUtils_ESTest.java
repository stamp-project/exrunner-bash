/*

 * Tue Apr 21 06:16:58 UTC 2020
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
      String string0 = null;
      StringUtils.defaultString((String) null, "aY}lwJ,?H3n{0ZL.j");
      int int0 = 1;
      StringUtils.abbreviate((String) null, 1);
      String string1 = "WU;3|sQP";
      String[] stringArray0 = new String[5];
      stringArray0[0] = "aY}lwJ,?H3n{0ZL.j";
      stringArray0[1] = "WU;3|sQP";
      stringArray0[2] = null;
      stringArray0[3] = "WU;3|sQP";
      stringArray0[4] = null;
      // Undeclared exception!
      StringUtils.replaceEach("WU;3|sQP", stringArray0, stringArray0);
  }
}
