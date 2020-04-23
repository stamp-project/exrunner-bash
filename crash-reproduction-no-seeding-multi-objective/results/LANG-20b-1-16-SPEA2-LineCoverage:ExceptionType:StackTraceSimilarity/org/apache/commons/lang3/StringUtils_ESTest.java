/*

 * Tue Apr 21 07:06:52 UTC 2020
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.StringUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class StringUtils_ESTest extends StringUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CharSequence charSequence0 = mock(CharSequence.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(charSequence0).toString();
      CharSequence[] charSequenceArray0 = new CharSequence[6];
      charSequenceArray0[1] = charSequence0;
      // Undeclared exception!
      StringUtils.join((Object[]) charSequenceArray0, "-No~)-!=$gv~$", 1, 19);
  }
}
