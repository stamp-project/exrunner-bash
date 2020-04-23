/*

 * Tue Apr 21 06:14:51 UTC 2020
 */

package org.apache.commons.lang.text;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang.text.StrBuilder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class StrBuilder_ESTest extends StrBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder(977);
      StrBuilder strBuilder1 = strBuilder0.minimizeCapacity();
      char char0 = '$';
      StrBuilder strBuilder2 = strBuilder1.appendFixedWidthPadLeft((Object) "H&", (-950), '$');
      // Undeclared exception!
      strBuilder2.appendFixedWidthPadLeft((Object) null, 5, '$');
  }
}
