/*

 * Tue Apr 21 06:17:09 UTC 2020
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
      StringUtils.isAllUpperCase((String) null);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "Strings must not be null";
      stringArray0[1] = "Strings must not be null";
      stringArray0[2] = "...";
      stringArray0[3] = "un9)\",Y-cg1";
      stringArray0[4] = "Strings must not be null";
      stringArray0[5] = "Strings must not be null";
      stringArray0[6] = "Strings must not be null";
      stringArray0[7] = null;
      stringArray0[8] = "un9)\",Y-cg1";
      // Undeclared exception!
      StringUtils.replaceEach("un9)\",Y-cg1", stringArray0, stringArray0);
  }
}
