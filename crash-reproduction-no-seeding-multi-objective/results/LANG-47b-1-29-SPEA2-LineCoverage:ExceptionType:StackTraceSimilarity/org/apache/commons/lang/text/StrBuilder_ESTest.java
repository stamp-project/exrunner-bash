/*

 * Tue Apr 21 06:16:10 UTC 2020
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
      StrBuilder strBuilder0 = new StrBuilder();
      String string0 = "Windows NT";
      StrBuilder strBuilder1 = new StrBuilder("Windows NT");
      StrBuilder strBuilder2 = strBuilder0.appendFixedWidthPadLeft((Object) strBuilder1, 998, '#');
      int int0 = 549;
      char[] charArray0 = new char[2];
      charArray0[0] = '#';
      charArray0[1] = '#';
      strBuilder2.insert(549, charArray0);
      // Undeclared exception!
      strBuilder2.appendFixedWidthPadLeft((Object) null, 549, '');
  }
}
