/*

 * Tue Apr 21 06:17:44 UTC 2020
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
      StringUtils.left("1.2", 694);
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) "1.2";
      objectArray0[1] = (Object) "1.2";
      objectArray0[2] = (Object) "1.2";
      objectArray0[3] = (Object) "1.2";
      objectArray0[4] = (Object) "1.2";
      objectArray0[5] = (Object) "1.2";
      objectArray0[6] = (Object) "1.2";
      objectArray0[7] = (Object) "1.2";
      objectArray0[8] = (Object) "1.2";
      StringUtils.join(objectArray0, "1.2");
      StringUtils.equals("1.2", "1.21.21.21.21.21.21.21.21.21.21.21.21.21.21.21.21.2");
      StringUtils.substringBetween("[V@eo._6^~<vME<\"Dr|", "1.2");
      StringUtils.containsOnly("1.2", "");
      StringUtils.lastIndexOf("aR", '`', 694);
      String string0 = "he$^";
      String[] stringArray0 = new String[6];
      stringArray0[0] = "Minimum abbreviation width is 4";
      stringArray0[1] = "Minimum abbreviation width is 4";
      stringArray0[2] = "Minimum abbreviation width is 4";
      stringArray0[3] = "aR";
      stringArray0[4] = null;
      stringArray0[5] = "1.2";
      // Undeclared exception!
      StringUtils.replaceEach("aR", stringArray0, stringArray0);
  }
}
