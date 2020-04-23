/*

 * Tue Apr 21 07:26:00 UTC 2020
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
      String string0 = " ";
      char[] charArray0 = null;
      WordUtils.capitalizeFully(" ", (char[]) null);
      int int0 = 5;
      int int1 = 525;
      String string1 = "1.6";
      // Undeclared exception!
      WordUtils.abbreviate(" ", 5, 525, "1.6");
  }
}
