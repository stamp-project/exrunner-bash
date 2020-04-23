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
      StringUtils.substringBetween("", "java.specification.version", "W>=^s");
      StringUtils.contains("", "");
      String[] stringArray0 = new String[4];
      stringArray0[0] = "W>=^s";
      stringArray0[3] = null;
      stringArray0[2] = "+0fxV8)!EG<D%=.ps@";
      StringUtils.startsWithAny((String) null, stringArray0);
      StringUtils.getCommonPrefix(stringArray0);
      StringUtils.startsWithAny("", stringArray0);
      // Undeclared exception!
      StringUtils.replaceEach("W>=^s", stringArray0, stringArray0);
  }
}
