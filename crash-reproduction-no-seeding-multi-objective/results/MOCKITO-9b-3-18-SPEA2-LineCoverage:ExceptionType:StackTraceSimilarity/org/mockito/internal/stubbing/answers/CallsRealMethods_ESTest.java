/*

 * Tue Apr 21 12:54:45 UTC 2020
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
import org.mockito.internal.creation.util.MockitoMethodProxy;
import org.mockito.internal.invocation.InvocationImpl;
import org.mockito.internal.invocation.MockitoMethod;
import org.mockito.internal.invocation.realmethod.CleanTraceRealMethod;
import org.mockito.internal.invocation.realmethod.DefaultRealMethod;
import org.mockito.internal.invocation.realmethod.RealMethod;
import org.mockito.internal.stubbing.answers.CallsRealMethods;
import org.mockito.invocation.InvocationOnMock;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class CallsRealMethods_ESTest extends CallsRealMethods_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CallsRealMethods callsRealMethods0 = new CallsRealMethods();
      CallsRealMethods callsRealMethods1 = new CallsRealMethods();
      InvocationOnMock invocationOnMock0 = mock(InvocationOnMock.class, new ViolatedAssumptionAnswer());
      CallsRealMethods callsRealMethods2 = new CallsRealMethods();
      InvocationOnMock invocationOnMock1 = mock(InvocationOnMock.class, new ViolatedAssumptionAnswer());
      doReturn(callsRealMethods1).when(invocationOnMock1).callRealMethod();
      Object object0 = callsRealMethods1.answer(invocationOnMock1);
      InvocationOnMock invocationOnMock2 = mock(InvocationOnMock.class, new ViolatedAssumptionAnswer());
      doReturn(object0).when(invocationOnMock2).callRealMethod();
      callsRealMethods1.answer(invocationOnMock2);
      MockitoMethod mockitoMethod0 = mock(MockitoMethod.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(mockitoMethod0).isAbstract();
      doReturn(true).when(mockitoMethod0).isVarArgs();
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) invocationOnMock0;
      Object object1 = new Object();
      Object object2 = new Object();
      CleanTraceRealMethod cleanTraceRealMethod0 = new CleanTraceRealMethod((RealMethod) null);
      InvocationImpl invocationImpl0 = new InvocationImpl(cleanTraceRealMethod0, mockitoMethod0, objectArray0, 2, cleanTraceRealMethod0);
      MockitoMethodProxy mockitoMethodProxy0 = mock(MockitoMethodProxy.class, new ViolatedAssumptionAnswer());
      DefaultRealMethod defaultRealMethod0 = new DefaultRealMethod(mockitoMethodProxy0);
      try { 
        callsRealMethods1.answer(invocationImpl0);
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
