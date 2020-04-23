/*

 * Tue Apr 21 06:16:11 UTC 2020
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
      String[] stringArray0 = new String[9];
      stringArray0[0] = "N,ef+%VBZ^{n";
      stringArray0[1] = "";
      String string0 = "ClassNotFoundException occurred during 1.6 backcompat code";
      stringArray0[2] = "ClassNotFoundException occurred during 1.6 backcompat code";
      stringArray0[3] = "N,ef+%VBZ^{n";
      stringArray0[4] = "N,ef+%VBZ^{n";
      stringArray0[5] = "N,ef+%VBZ^{n";
      stringArray0[6] = "N,ef+%VBZ^{n";
      stringArray0[7] = "]";
      StringUtils.contains("", "");
      Locale locale0 = Locale.CANADA;
      Locale locale1 = Locale.TRADITIONAL_CHINESE;
      locale0.getDisplayVariant(locale1);
      String string1 = "\\E&iw=W8";
      // Undeclared exception!
      StringUtils.replaceEach("ClassNotFoundException occurred during 1.6 backcompat code", stringArray0, stringArray0);
  }
}
