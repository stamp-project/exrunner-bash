/*

 * Tue Apr 21 06:16:43 UTC 2020
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Iterator;
import java.util.TreeSet;
import org.apache.commons.lang3.StringUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class StringUtils_ESTest extends StringUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TreeSet<String> treeSet0 = new TreeSet<String>();
      Iterator<String> iterator0 = treeSet0.iterator();
      StringUtils.join(iterator0, "");
      StringUtils.upperCase("");
      String string0 = null;
      String string1 = StringUtils.leftPad("", 2900, (String) null);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "";
      stringArray0[1] = null;
      stringArray0[2] = null;
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = null;
      stringArray0[6] = "";
      stringArray0[7] = string1;
      // Undeclared exception!
      StringUtils.replaceEach(string1, stringArray0, stringArray0);
  }
}
