/*

 * Tue Apr 21 06:16:12 UTC 2020
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
      StringUtils.substringBefore("FJo[)=K", "FJo[)=K");
      StringUtils.containsAny("FJo[)=K", "");
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) "FJo[)=K";
      objectArray0[1] = (Object) "FJo[)=K";
      objectArray0[4] = (Object) "";
      objectArray0[3] = (Object) "";
      objectArray0[4] = (Object) "";
      objectArray0[5] = objectArray0[4];
      StringUtils.join((Object[]) null, "");
      String[] stringArray0 = new String[8];
      stringArray0[0] = null;
      stringArray0[1] = "FJo[)=K";
      stringArray0[2] = "java.awt.graphicsenv";
      stringArray0[3] = "FJo[)=K";
      stringArray0[4] = "";
      stringArray0[5] = "FJo[)=K";
      stringArray0[6] = null;
      stringArray0[7] = null;
      // Undeclared exception!
      StringUtils.replaceEach("java.awt.graphicsenv", stringArray0, stringArray0);
  }
}
