/*

 * Tue Apr 21 06:16:43 UTC 2020
 */

package org.apache.commons.lang.text;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang.text.StrBuilder;
import org.apache.commons.lang.text.StrMatcher;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class StrBuilder_ESTest extends StrBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder(101);
      StrBuilder strBuilder1 = strBuilder0.append((long) 101);
      strBuilder1.indexOf((StrMatcher) null);
      String string0 = "";
      strBuilder0.appendFixedWidthPadLeft((Object) "", 101, '\'');
      // Undeclared exception!
      strBuilder1.appendFixedWidthPadLeft((Object) null, 872, 's');
  }
}
