/*

 * Tue Apr 21 06:18:03 UTC 2020
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Stack;
import org.apache.commons.lang3.StringUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class StringUtils_ESTest extends StringUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 16;
      StringUtils.indexOf("SecurityException occurred during 1.6 backcompat code", "", 16);
      String string0 = "^Oi>~)}%?Cw";
      Stack<Object> stack0 = new Stack<Object>();
      stack0.clone();
      stack0.listIterator();
      char char0 = 'P';
      String[] stringArray0 = new String[9];
      stringArray0[0] = "";
      stringArray0[1] = "SecurityException occurred during 1.6 backcompat code";
      stringArray0[2] = "o^4wt";
      stringArray0[3] = "SecurityException occurred during 1.6 backcompat code";
      stringArray0[5] = "SecurityException occurred during 1.6 backcompat code";
      stringArray0[8] = null;
      // Undeclared exception!
      StringUtils.replaceEach("o^4wt", stringArray0, stringArray0);
  }
}
