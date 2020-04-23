/*

 * Tue Apr 21 06:17:35 UTC 2020
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
      String[] stringArray0 = new String[5];
      stringArray0[1] = "?p|ggpL/1V=M@1PRBow";
      StringUtils.equals((String) null, (String) null);
      StringUtils.contains(stringArray0[0], "IllegalArgumentException occurred during 1.6 backcompat codeIllegalArgumentException occurred during 1.6 backcompat code");
      String string0 = "user.home";
      int int0 = StringUtils.INDEX_NOT_FOUND;
      StringUtils.splitByCharacterTypeCamelCase("Search and Replace array lengths don't match: ");
      // Undeclared exception!
      StringUtils.replaceEach("?p|ggpL/1V=M@1PRBow", stringArray0, stringArray0);
  }
}
