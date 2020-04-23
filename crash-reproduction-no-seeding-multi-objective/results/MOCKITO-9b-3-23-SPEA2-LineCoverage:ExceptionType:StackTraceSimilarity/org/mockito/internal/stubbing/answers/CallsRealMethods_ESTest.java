/*

 * Tue Apr 21 12:55:22 UTC 2020
 */

package org.mockito.internal.stubbing.answers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Method;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.internal.invocation.InvocationImpl;
import org.mockito.internal.invocation.MockitoMethod;
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
      doReturn(callsRealMethods0).when(invocationOnMock0).callRealMethod();
      callsRealMethods0.answer(invocationOnMock0);
      CallsRealMethods callsRealMethods2 = new CallsRealMethods();
      CallsRealMethods callsRealMethods3 = new CallsRealMethods();
      CallsRealMethods callsRealMethods4 = new CallsRealMethods();
      CallsRealMethods callsRealMethods5 = new CallsRealMethods();
      CallsRealMethods callsRealMethods6 = new CallsRealMethods();
      CallsRealMethods callsRealMethods7 = new CallsRealMethods();
      Method method0 = null;
      MockitoMethod mockitoMethod0 = mock(MockitoMethod.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(mockitoMethod0).isAbstract();
      doReturn(true).when(mockitoMethod0).isVarArgs();
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) callsRealMethods4;
      CallsRealMethods callsRealMethods8 = new CallsRealMethods();
      InvocationImpl invocationImpl0 = new InvocationImpl(callsRealMethods6, mockitoMethod0, objectArray0, (-1919), (RealMethod) null);
      try { 
        callsRealMethods3.answer(invocationImpl0);
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
