/*

 * Tue Apr 21 11:19:06 UTC 2020
 */

package org.mockito.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.internal.MockitoCore;
import org.mockito.internal.creation.MockSettingsImpl;
import org.mockito.internal.progress.ThreadSafeMockingProgress;
import org.mockito.internal.stubbing.ConsecutiveStubbing;
import org.mockito.internal.stubbing.InvocationContainerImpl;
import org.mockito.internal.verification.NoMoreInteractions;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class MockitoCore_ESTest extends MockitoCore_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      MockitoCore mockitoCore0 = new MockitoCore();
      ThreadSafeMockingProgress threadSafeMockingProgress0 = new ThreadSafeMockingProgress();
      NoMoreInteractions noMoreInteractions0 = new NoMoreInteractions();
      threadSafeMockingProgress0.verificationStarted(noMoreInteractions0);
      InvocationContainerImpl invocationContainerImpl0 = new InvocationContainerImpl(threadSafeMockingProgress0);
      threadSafeMockingProgress0.reset();
      ConsecutiveStubbing<MockSettingsImpl> consecutiveStubbing0 = new ConsecutiveStubbing<MockSettingsImpl>(invocationContainerImpl0);
      // Undeclared exception!
      mockitoCore0.when(consecutiveStubbing0);
  }
}
