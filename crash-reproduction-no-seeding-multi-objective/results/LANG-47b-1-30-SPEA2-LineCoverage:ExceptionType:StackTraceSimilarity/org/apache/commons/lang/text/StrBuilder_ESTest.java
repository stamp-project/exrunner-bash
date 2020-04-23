/*

 * Tue Apr 21 06:16:00 UTC 2020
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
      int int0 = 3835;
      String string0 = "ib";
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.deleteAll("ib");
      char char0 = '\u0085';
      StrBuilder strBuilder1 = strBuilder0.appendln('\u0085');
      // Undeclared exception!
      strBuilder1.appendFixedWidthPadLeft((Object) null, 3835, '\u0085');
  }
}
