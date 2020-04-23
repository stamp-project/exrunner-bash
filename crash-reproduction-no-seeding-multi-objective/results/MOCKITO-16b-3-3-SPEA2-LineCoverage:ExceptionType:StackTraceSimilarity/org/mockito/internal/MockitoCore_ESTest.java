/*

 * Tue Apr 21 11:18:33 UTC 2020
 */

package org.mockito.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mockito.internal.MockitoCore;
import org.mockito.internal.creation.MockSettingsImpl;
import org.mockito.stubbing.Answer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class MockitoCore_ESTest extends MockitoCore_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockitoCore mockitoCore0 = new MockitoCore();
      Class<MockSettingsImpl> class0 = MockSettingsImpl.class;
      Answer<Object> answer0 = (Answer<Object>) mock(Answer.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      mockitoCore0.when(class0);
  }
}
