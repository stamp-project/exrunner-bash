/*

 * Tue Apr 21 07:26:01 UTC 2020
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
      char[] charArray0 = null;
      WordUtils.uncapitalize((String) null);
      WordUtils.swapCase("@!.<NcsD[saBvQ$@oY");
      char[] charArray1 = new char[0];
      WordUtils.capitalizeFully((String) null);
      int int0 = 130;
      boolean boolean0 = true;
      WordUtils wordUtils0 = new WordUtils();
      WordUtils.wrap("@!.<NcsD[saBvQ$@oY", (-13), "", true);
      WordUtils.uncapitalize("@!.<nCSd[SAbVq$@Oy");
      WordUtils.capitalize("@!.<nCSd[SAbVq$@Oy");
      int int1 = (-2239);
      char[] charArray2 = null;
      WordUtils.capitalize("-", (char[]) null);
      // Undeclared exception!
      WordUtils.abbreviate("@!.<nCSd[SAbVq$@Oy", (-13), (-13), "@!.<NcsD[saBvQ$@oY");
  }
}
