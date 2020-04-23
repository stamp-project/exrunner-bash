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
      String string0 = "{2,l hm^1F|S\"\\m";
      int int0 = 1315;
      String string1 = "java.awt.graphicsenv";
      // Undeclared exception!
      WordUtils.abbreviate("{2,l hm^1F|S\"m", 1373, 1315, "java.awt.graphicsenv");
  }
}
