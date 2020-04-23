/*

 * Tue Apr 21 06:15:09 UTC 2020
 */

package org.apache.commons.lang.text;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang.text.StrBuilder;
import org.apache.commons.lang.text.StrMatcher;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class StrBuilder_ESTest extends StrBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder((-1));
      StrBuilder strBuilder1 = strBuilder0.append(0.0F);
      StrMatcher strMatcher0 = mock(StrMatcher.class, new ViolatedAssumptionAnswer());
      doReturn((-587), (-914), (-1)).when(strMatcher0).isMatch(any(char[].class) , anyInt() , anyInt() , anyInt());
      String string0 = null;
      strBuilder0.replaceFirst(strMatcher0, (String) null);
      StrBuilder strBuilder2 = strBuilder1.deleteAll('_');
      int int0 = 32;
      // Undeclared exception!
      strBuilder2.appendFixedWidthPadLeft((Object) null, 32, '_');
  }
}
