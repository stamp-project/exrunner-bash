/*

 * Tue Apr 21 06:16:15 UTC 2020
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
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      stringArray0[1] = "Jzo`ZaJ=9la58XZ";
      stringArray0[2] = "Jzo`ZaJ=9la58XZ";
      stringArray0[3] = "R/eA";
      stringArray0[5] = "Jzo`ZaJ=9la58XZ";
      stringArray0[6] = "Jzo`ZaJ=9la58XZ";
      // Undeclared exception!
      StringUtils.replaceEach("Jzo`ZaJ=9la58XZ", stringArray0, stringArray0);
  }
}
