/*

 * Tue Apr 21 06:18:00 UTC 2020
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
      String string0 = "N[QJj<5";
      StringUtils.isAlphanumeric("N[QJj<5");
      StringUtils.isAsciiPrintable("N[QJj<5");
      StringUtils.strip((String) null, "N[QJj<5");
      String[] stringArray0 = new String[0];
      StringUtils.stripAll(stringArray0, (String) null);
      StringUtils.endsWith("N[QJj<5", "N[QJj<5");
      StringUtils.stripAll(stringArray0);
      String string1 = "";
      StringUtils.indexOfAnyBut((String) null, "");
      String[] stringArray1 = new String[9];
      stringArray1[0] = "$?";
      stringArray1[1] = null;
      stringArray1[2] = null;
      stringArray1[3] = null;
      stringArray1[4] = "$?";
      stringArray1[5] = "";
      stringArray1[6] = "";
      stringArray1[7] = null;
      stringArray1[8] = null;
      // Undeclared exception!
      StringUtils.replaceEach("$?", stringArray1, stringArray1);
  }
}
