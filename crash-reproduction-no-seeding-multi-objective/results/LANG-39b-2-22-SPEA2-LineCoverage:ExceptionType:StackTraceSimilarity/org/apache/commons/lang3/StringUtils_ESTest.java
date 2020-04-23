/*

 * Tue Apr 21 06:17:47 UTC 2020
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
      int int0 = 0;
      StringUtils.ordinalIndexOf("VG", "VG", 0);
      Object[] objectArray0 = new Object[3];
      Object object0 = new Object();
      objectArray0[1] = (Object) "VG";
      objectArray0[2] = (Object) "VG";
      char char0 = 'R';
      StringUtils.join(objectArray0, 'R', 0, 0);
      StringUtils.indexOf("", "@r_Y/Aa]");
      String[] stringArray0 = new String[5];
      stringArray0[0] = "@r_Y/Aa]";
      stringArray0[1] = "";
      stringArray0[2] = "";
      objectArray0[1] = (Object) "";
      stringArray0[4] = "@LJ{v";
      // Undeclared exception!
      StringUtils.replaceEach("@LJ{v", stringArray0, stringArray0);
  }
}
