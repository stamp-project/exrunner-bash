/*

 * Tue Apr 21 12:53:02 UTC 2020
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
      Object object0 = new Object();
      MockitoMethod mockitoMethod0 = mock(MockitoMethod.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(mockitoMethod0).isVarArgs();
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) mockitoMethod0;
      objectArray0[1] = (Object) mockitoMethod0;
      objectArray0[2] = (Object) mockitoMethod0;
      objectArray0[3] = objectArray0[2];
      objectArray0[4] = (Object) mockitoMethod0;
      objectArray0[5] = objectArray0[4];
      objectArray0[6] = (Object) mockitoMethod0;
      RealMethod realMethod0 = mock(RealMethod.class, new ViolatedAssumptionAnswer());
      InvocationImpl invocationImpl0 = new InvocationImpl(object0, mockitoMethod0, objectArray0, 879, realMethod0);
      MockitoMethod mockitoMethod1 = mock(MockitoMethod.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(mockitoMethod1).isAbstract();
      doReturn(true).when(mockitoMethod1).isVarArgs();
      int int0 = 365;
      RealMethod realMethod1 = mock(RealMethod.class, new ViolatedAssumptionAnswer());
      InvocationImpl invocationImpl1 = new InvocationImpl(invocationImpl0, mockitoMethod1, objectArray0, 365, realMethod1);
      invocationImpl1.stubInfo();
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
