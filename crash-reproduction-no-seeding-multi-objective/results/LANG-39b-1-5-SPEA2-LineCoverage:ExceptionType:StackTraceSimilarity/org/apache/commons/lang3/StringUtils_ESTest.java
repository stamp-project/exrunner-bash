/*

 * Tue Apr 21 06:16:24 UTC 2020
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
      StringUtils.swapCase("8/ZZ(Iv!t\"_");
      StringUtils.trimToNull("8/ZZ(Iv!t\"_");
      StringUtils.swapCase((String) null);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "8/zz(iV!T\"_";
      stringArray0[1] = "vEp";
      stringArray0[2] = "vEp";
      stringArray0[3] = null;
      stringArray0[4] = null;
      stringArray0[5] = null;
      stringArray0[6] = null;
      String string0 = "\\u0";
      stringArray0[7] = string0;
      stringArray0[8] = "8/ZZ(Iv!t\"_";
      // Undeclared exception!
      StringUtils.replaceEach("vEp", stringArray0, stringArray0);
  }
}
