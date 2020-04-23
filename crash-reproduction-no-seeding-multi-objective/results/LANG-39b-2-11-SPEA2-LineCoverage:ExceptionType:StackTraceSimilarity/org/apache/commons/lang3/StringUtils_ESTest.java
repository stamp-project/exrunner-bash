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
      String[] stringArray0 = new String[9];
      stringArray0[0] = "java.vm.specification.version";
      stringArray0[2] = "java.vm.specification.version";
      stringArray0[3] = "java.vm.specification.version";
      stringArray0[4] = "java.vm.specification.version";
      stringArray0[5] = "java.vm.specification.version";
      stringArray0[6] = "java.vm.specification.version";
      stringArray0[7] = "java.vm.specification.version";
      stringArray0[8] = "java.vm.specification.version";
      // Undeclared exception!
      StringUtils.replaceEach("java.vm.specification.version", stringArray0, stringArray0);
  }
}
