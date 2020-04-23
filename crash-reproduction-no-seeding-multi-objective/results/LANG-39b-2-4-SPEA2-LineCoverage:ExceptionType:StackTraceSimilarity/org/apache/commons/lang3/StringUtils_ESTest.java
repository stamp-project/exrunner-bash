/*

 * Tue Apr 21 06:16:20 UTC 2020
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
      String string0 = null;
      StringUtils.indexOfAny((String) null, (String) null);
      StringUtils.lastIndexOf((String) null, (String) null, 0);
      String string1 = "[";
      StringUtils.chomp("[");
      StringUtils.lastIndexOf("[", "");
      Object[] objectArray0 = new Object[3];
      Object object0 = new Object();
      objectArray0[0] = object0;
      objectArray0[1] = (Object) "";
      objectArray0[2] = (Object) "[";
      StringUtils.join(objectArray0);
      StringUtils.lastIndexOf("", 'b');
      String string2 = "";
      StringUtils.strip("", "");
      StringUtils.contains("java.lang.Object@528217ae[", '(');
      StringUtils.join(objectArray0);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      stringArray0[1] = "[";
      stringArray0[2] = "java.lang.Object@528217ae[";
      stringArray0[3] = "";
      stringArray0[4] = "user.region";
      stringArray0[5] = "";
      stringArray0[6] = null;
      // Undeclared exception!
      StringUtils.replaceEach("user.region", stringArray0, stringArray0);
  }
}
