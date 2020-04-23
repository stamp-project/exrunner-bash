/*

 * Tue Apr 21 06:17:25 UTC 2020
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
      StringUtils.isAlphanumericSpace((String) null);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "ObpiI7 N";
      stringArray0[1] = "java.specification.vendor";
      stringArray0[3] = "ObpiI7 N";
      // Undeclared exception!
      StringUtils.replaceEach("ObpiI7 N", stringArray0, stringArray0);
  }
}
