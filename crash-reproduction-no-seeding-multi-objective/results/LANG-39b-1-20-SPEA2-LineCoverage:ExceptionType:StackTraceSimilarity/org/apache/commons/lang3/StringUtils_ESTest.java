/*

 * Tue Apr 21 06:17:29 UTC 2020
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
      StringUtils.isNumericSpace((String) null);
      Object[] objectArray0 = new Object[3];
      objectArray0[0] = (Object) null;
      objectArray0[1] = (Object) null;
      objectArray0[2] = (Object) null;
      StringUtils.join(objectArray0, "java.text.Normalizer$Form");
      StringUtils.lastIndexOf("Index: ", 'R');
      String[] stringArray0 = new String[9];
      stringArray0[0] = "Index: ";
      stringArray0[1] = "o'ORj*]UXJ8(0k,odA";
      stringArray0[2] = "Index: ";
      stringArray0[3] = null;
      stringArray0[4] = "tsCVN[zE0~cUst0:4=C";
      stringArray0[5] = "tsCVN[zE0~cUst0:4=C";
      stringArray0[6] = "Index: ";
      stringArray0[7] = "className must not be null.";
      stringArray0[8] = null;
      // Undeclared exception!
      StringUtils.replaceEach("tsCVN[zE0~cUst0:4=C", stringArray0, stringArray0);
  }
}
