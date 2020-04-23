/*

 * Mon Apr 20 11:52:29 UTC 2020
 */

package org.mockito.internal.invocation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mockito.internal.invocation.Invocation;
import org.mockito.internal.invocation.MockitoMethod;
import org.mockito.internal.invocation.realmethod.RealMethod;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Invocation_ESTest extends Invocation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockitoMethod mockitoMethod0 = mock(MockitoMethod.class, new ViolatedAssumptionAnswer());
      doReturn("39_*,dcbhC+SaswK", "39_*,dcbhC+SaswK", "Object newInstance(int, Object[])").when(mockitoMethod0).toString();
      doReturn(false).when(mockitoMethod0).isVarArgs();
      Object[] objectArray0 = new Object[8];
      objectArray0[1] = (Object) mockitoMethod0;
      objectArray0[2] = (Object) mockitoMethod0;
      objectArray0[3] = (Object) "39_*,dcbhC+SaswK";
      objectArray0[4] = (Object) mockitoMethod0;
      objectArray0[5] = (Object) "39_*,dcbhC+SaswK";
      objectArray0[6] = (Object) "39_*,dcbhC+SaswK";
      Invocation invocation0 = new Invocation(mockitoMethod0, mockitoMethod0, objectArray0, (-1805), (RealMethod) null);
      invocation0.argumentsToMatchers();
      try { 
        invocation0.callRealMethod();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.internal.invocation.Invocation", e);
      }
  }
}
