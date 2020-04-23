/*

 * Tue Apr 21 07:27:19 UTC 2020
 */

package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang.BooleanUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BooleanUtils_ESTest extends BooleanUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer(0);
      String string0 = "";
      boolean[] booleanArray0 = new boolean[8];
      BooleanUtils.xor(booleanArray0);
      String string1 = "gl";
      BooleanUtils.toBooleanObject("KmJCqaq");
      BooleanUtils.toBoolean("t'69");
      String string2 = "ueBhfSVk7tW&{\";!}";
      // Undeclared exception!
      BooleanUtils.toBoolean("tru");
  }
}
