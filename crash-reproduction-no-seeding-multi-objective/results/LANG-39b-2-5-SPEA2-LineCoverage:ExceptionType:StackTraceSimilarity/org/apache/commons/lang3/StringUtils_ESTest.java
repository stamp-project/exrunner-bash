/*

 * Tue Apr 21 06:16:21 UTC 2020
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.lang3.StringUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class StringUtils_ESTest extends StringUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StringUtils.length((String) null);
      String string0 = StringUtils.lowerCase((String) null, (Locale) null);
      StringUtils.stripToNull((String) null);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      stringArray0[1] = null;
      stringArray0[2] = "Mac";
      stringArray0[3] = null;
      StringUtils.lastIndexOfAny("", stringArray0);
      StringUtils.replaceEach(string0, stringArray0, stringArray0);
      // Undeclared exception!
      StringUtils.replaceEach("Mac", stringArray0, stringArray0);
  }
}
