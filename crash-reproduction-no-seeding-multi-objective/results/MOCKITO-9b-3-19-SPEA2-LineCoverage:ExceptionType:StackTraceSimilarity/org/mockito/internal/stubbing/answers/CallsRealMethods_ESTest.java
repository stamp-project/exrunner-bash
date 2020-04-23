/*

 * Tue Apr 21 12:53:03 UTC 2020
 */

package org.mockito.internal.stubbing.answers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.internal.invocation.InvocationImpl;
import org.mockito.internal.invocation.MockitoMethod;
import org.mockito.internal.invocation.realmethod.CleanTraceRealMethod;
import org.mockito.internal.invocation.realmethod.RealMethod;
import org.mockito.internal.stubbing.answers.CallsRealMethods;
import org.mockito.invocation.InvocationOnMock;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class CallsRealMethods_ESTest extends CallsRealMethods_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CallsRealMethods callsRealMethods0 = new CallsRealMethods();
      MockitoMethod mockitoMethod0 = mock(MockitoMethod.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(mockitoMethod0).isAbstract();
      doReturn(false).when(mockitoMethod0).isVarArgs();
      Object object0 = new Object();
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) mockitoMethod0;
      objectArray0[1] = object0;
      objectArray0[2] = (Object) callsRealMethods0;
      objectArray0[4] = (Object) mockitoMethod0;
      objectArray0[5] = (Object) callsRealMethods0;
      objectArray0[6] = (Object) callsRealMethods0;
      objectArray0[7] = object0;
      InvocationOnMock invocationOnMock0 = mock(InvocationOnMock.class, new ViolatedAssumptionAnswer());
      Object object1 = new Object();
      objectArray0[8] = object1;
      CleanTraceRealMethod cleanTraceRealMethod0 = new CleanTraceRealMethod((RealMethod) null);
      InvocationImpl invocationImpl0 = new InvocationImpl(object0, mockitoMethod0, objectArray0, (-1), cleanTraceRealMethod0);
      try { 
        callsRealMethods0.answer(invocationImpl0);
        fail("Expecting exception: MockitoException");
      
      } catch(MockitoException e) {
         //
         // 
         // Cannot call abstract real method on java object!
         // Calling real methods is only possible when mocking non abstract method.
         //   //correct example:
         //   when(mockOfConcreteClass.nonAbstractMethod()).thenCallRealMethod();
         //
         verifyException("org.mockito.exceptions.Reporter", e);
      }
  }
}
