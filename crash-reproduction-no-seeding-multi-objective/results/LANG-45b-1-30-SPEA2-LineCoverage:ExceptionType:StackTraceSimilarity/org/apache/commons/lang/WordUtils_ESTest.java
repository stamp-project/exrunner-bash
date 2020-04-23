/*

 * Tue Apr 21 07:26:31 UTC 2020
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
      WordUtils.initials("-70r");
      WordUtils wordUtils0 = new WordUtils();
      WordUtils.uncapitalize((String) null, (char[]) null);
      WordUtils.capitalize("", (char[]) null);
      WordUtils.swapCase("");
      WordUtils.swapCase("Caught a SecurityException reading the system property '");
      WordUtils.uncapitalize("5.1", (char[]) null);
      char[] charArray0 = new char[2];
      charArray0[0] = 'i';
      charArray0[1] = 'b';
      WordUtils.capitalize("", charArray0);
      WordUtils.swapCase((String) null);
      WordUtils.swapCase("Caught a SecurityException reading the system property '");
      // Undeclared exception!
      WordUtils.abbreviate("Minimum abbreviation width is 4", 1629, 93, "-70r");
  }
}
