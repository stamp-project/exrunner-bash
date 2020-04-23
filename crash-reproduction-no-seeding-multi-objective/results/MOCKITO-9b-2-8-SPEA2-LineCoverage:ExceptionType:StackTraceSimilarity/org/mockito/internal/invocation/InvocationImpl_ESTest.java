/*

 * Tue Apr 21 12:46:02 UTC 2020
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
import org.mockito.exceptions.base.MockitoException;
import org.mockito.internal.invocation.InvocationImpl;
import org.mockito.internal.invocation.MockitoMethod;
import org.mockito.internal.invocation.realmethod.RealMethod;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class InvocationImpl_ESTest extends InvocationImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockitoMethod mockitoMethod0 = mock(MockitoMethod.class, new ViolatedAssumptionAnswer());
      doReturn("").when(mockitoMethod0).toString();
      doReturn(true).when(mockitoMethod0).isVarArgs();
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) mockitoMethod0;
      objectArray0[1] = (Object) mockitoMethod0;
      objectArray0[2] = null;
      objectArray0[3] = objectArray0[2];
      objectArray0[4] = null;
      objectArray0[5] = (Object) mockitoMethod0;
      objectArray0[6] = (Object) mockitoMethod0;
      objectArray0[7] = objectArray0[6];
      RealMethod realMethod0 = mock(RealMethod.class, new ViolatedAssumptionAnswer());
      InvocationImpl invocationImpl0 = new InvocationImpl((Object) null, mockitoMethod0, objectArray0, 0, realMethod0);
      MockitoMethod mockitoMethod1 = mock(MockitoMethod.class, new ViolatedAssumptionAnswer());
      doReturn(false, true).when(mockitoMethod1).isAbstract();
      doReturn(true).when(mockitoMethod1).isVarArgs();
      Object object0 = new Object();
      RealMethod realMethod1 = mock(RealMethod.class, new ViolatedAssumptionAnswer());
      doReturn(objectArray0[1]).when(realMethod1).invoke(any() , any(java.lang.Object[].class));
      InvocationImpl invocationImpl1 = new InvocationImpl(invocationImpl0, mockitoMethod1, objectArray0, 0, realMethod1);
      invocationImpl1.getSequenceNumber();
      invocationImpl1.getMock();
      invocationImpl0.getArguments();
      invocationImpl1.callRealMethod();
      invocationImpl0.ignoreForVerification();
      try { 
        invocationImpl1.callRealMethod();
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
