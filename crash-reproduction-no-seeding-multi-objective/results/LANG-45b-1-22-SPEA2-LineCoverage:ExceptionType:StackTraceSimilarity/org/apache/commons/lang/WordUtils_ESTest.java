/*

 * Tue Apr 21 07:26:21 UTC 2020
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
      String string0 = "BeLE[@#2eW:Wo7^UqY";
      WordUtils.swapCase("BeLE[@#2eW:Wo7^UqY");
      WordUtils.capitalize("bEle[@#2Ew:wO7^uQy");
      String string1 = "";
      // Undeclared exception!
      WordUtils.abbreviate("0Z_r)~m", (-3095), (-1977), "");
  }
}
