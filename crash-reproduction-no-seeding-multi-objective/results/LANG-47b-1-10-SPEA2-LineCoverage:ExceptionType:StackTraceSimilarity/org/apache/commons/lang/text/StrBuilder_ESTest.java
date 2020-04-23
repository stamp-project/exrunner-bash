/*

 * Tue Apr 21 06:15:02 UTC 2020
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
      StrBuilder strBuilder0 = new StrBuilder(0);
      strBuilder0.getNewLineText();
      strBuilder0.equals(strBuilder0);
      strBuilder0.leftString(0);
      StrMatcher strMatcher0 = mock(StrMatcher.class, new ViolatedAssumptionAnswer());
      strBuilder0.lastIndexOf(strMatcher0, 1701);
      strBuilder0.append(1146.9537944);
      // Undeclared exception!
      strBuilder0.appendFixedWidthPadLeft((Object) null, 1617, '~');
  }
}
