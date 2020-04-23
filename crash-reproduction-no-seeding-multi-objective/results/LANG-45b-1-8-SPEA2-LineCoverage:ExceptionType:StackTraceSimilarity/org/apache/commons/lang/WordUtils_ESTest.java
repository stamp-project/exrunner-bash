/*

 * Tue Apr 21 07:26:04 UTC 2020
 */

package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang.WordUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class WordUtils_ESTest extends WordUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 1;
      boolean boolean0 = false;
      WordUtils.wrap("", 1, "", false);
      WordUtils.abbreviate("", 1, 48, "8}&y_*zR\"j`~*H|a}N");
      WordUtils wordUtils0 = new WordUtils();
      char[] charArray0 = new char[2];
      charArray0[0] = 'w';
      charArray0[1] = 'C';
      WordUtils.capitalize("path.separator", charArray0);
      String string0 = "LINUX";
      int int1 = 2915;
      String string1 = null;
      // Undeclared exception!
      WordUtils.abbreviate("LINUX", 48, 2915, (String) null);
  }
}
