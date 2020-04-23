/*

 * Tue Apr 21 06:17:34 UTC 2020
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
      String[] stringArray0 = new String[5];
      stringArray0[0] = "UNs3#8p*ocK{Wzs.X6I";
      stringArray0[1] = "UNs3#8p*ocK{Wzs.X6I";
      String[] stringArray1 = new String[9];
      stringArray1[0] = "UNs3#8p*ocK{Wzs.X6I";
      stringArray1[1] = "UNs3#8p*ocK{Wzs.X6I";
      stringArray1[2] = "UNs3#8p*ocK{Wzs.X6I";
      stringArray1[3] = "UNs3#8p*ocK{Wzs.X6I";
      stringArray1[4] = "UNs3#8p*ocK{Wzs.X6I";
      stringArray1[5] = "UNs3#8p*ocK{Wzs.X6I";
      stringArray1[6] = "UNs3#8p*ocK{Wzs.X6I";
      stringArray1[7] = "UNs3#8p*ocK{Wzs.X6I";
      stringArray1[8] = "UNs3#8p*ocK{Wzs.X6I";
      StringUtils.replaceEach("UNs3#8p*ocK{Wzs.X6I", stringArray1, stringArray1);
      StringUtils.splitByCharacterTypeCamelCase("UNs3#8p*ocK{Wzs.X6I");
      // Undeclared exception!
      StringUtils.replaceEach("UNs3#8p*ocK{Wzs.X6I", stringArray0, stringArray0);
  }
}
