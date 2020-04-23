/*

 * Tue Apr 21 07:26:03 UTC 2020
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
      char[] charArray0 = new char[1];
      charArray0[0] = '\\';
      WordUtils.initials("R", charArray0);
      WordUtils wordUtils0 = new WordUtils();
      WordUtils.uncapitalize(":x#7Y@w]:|");
      WordUtils.uncapitalize("R", charArray0);
      // Undeclared exception!
      WordUtils.abbreviate("R", 4, 4, "R");
  }
}
