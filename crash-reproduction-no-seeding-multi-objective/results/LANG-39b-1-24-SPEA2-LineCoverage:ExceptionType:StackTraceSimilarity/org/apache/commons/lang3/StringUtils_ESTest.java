/*

 * Tue Apr 21 06:17:45 UTC 2020
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
      StringUtils.substring("IllegalArgumentException occurred during 1.6 backcompat code", 3);
      StringUtils.splitPreserveAllTokens("IllegalArgumentException occurred during 1.6 backcompat code", "pw7A $>Q,>#+P", 3);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "IllegalArgumentException occurred during 1.6 backcompat code";
      stringArray0[1] = "pw7A $>Q,>#+P";
      stringArray0[2] = "pw7A $>Q,>#+P";
      stringArray0[3] = "5Q93tm6J";
      stringArray0[4] = "IllegalArgumentException occurred during 1.6 backcompat code";
      stringArray0[5] = "egalArgumentException occurred during 1.6 backcompat code";
      // Undeclared exception!
      StringUtils.replaceEach("pw7A $>Q,>#+P", stringArray0, stringArray0);
  }
}
