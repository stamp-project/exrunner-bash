/*

 * Tue Apr 21 07:09:08 UTC 2020
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
      int int0 = 3;
      CharSequence charSequence0 = mock(CharSequence.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(charSequence0).toString();
      CharSequence charSequence1 = mock(CharSequence.class, new ViolatedAssumptionAnswer());
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) charSequence0;
      objectArray0[1] = (Object) charSequence0;
      objectArray0[2] = (Object) charSequence0;
      objectArray0[3] = (Object) charSequence0;
      objectArray0[4] = (Object) charSequence1;
      String string0 = null;
      StringUtils.join(objectArray0, (String) null, 2573, (-1038));
      // Undeclared exception!
      StringUtils.join(objectArray0, "java.text.Normalizer");
  }
}
