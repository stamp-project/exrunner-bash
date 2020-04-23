/*

 * Tue Apr 21 07:26:20 UTC 2020
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
      WordUtils.capitalizeFully("R");
      WordUtils wordUtils0 = new WordUtils();
      int int0 = (-1);
      // Undeclared exception!
      WordUtils.abbreviate("R", 38, (-1), "R");
  }
}
