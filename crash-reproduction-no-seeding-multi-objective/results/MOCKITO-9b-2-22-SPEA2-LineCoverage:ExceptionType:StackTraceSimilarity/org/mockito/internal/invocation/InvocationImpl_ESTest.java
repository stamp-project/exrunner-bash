/*

 * Tue Apr 21 12:54:27 UTC 2020
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
import org.mockito.invocation.StubInfo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class InvocationImpl_ESTest extends InvocationImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      boolean boolean0 = true;
      boolean boolean1 = true;
      MockitoMethod mockitoMethod0 = mock(MockitoMethod.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(mockitoMethod0).isAbstract();
      doReturn(true).when(mockitoMethod0).isVarArgs();
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) "%/u1 4yMg!<6";
      objectArray0[1] = (Object) mockitoMethod0;
      RealMethod realMethod0 = mock(RealMethod.class, new ViolatedAssumptionAnswer());
      InvocationImpl invocationImpl0 = new InvocationImpl("%/u1 4yMg!<6", mockitoMethod0, objectArray0, (-1199), realMethod0);
      invocationImpl0.markVerified();
      StubInfo stubInfo0 = mock(StubInfo.class, new ViolatedAssumptionAnswer());
      invocationImpl0.markStubbed(stubInfo0);
      MockitoMethod mockitoMethod1 = mock(MockitoMethod.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(mockitoMethod1).isVarArgs();
      Object[] objectArray1 = new Object[6];
      objectArray1[0] = (Object) stubInfo0;
      objectArray1[1] = (Object) invocationImpl0;
      objectArray1[2] = (Object) mockitoMethod0;
      objectArray1[3] = (Object) mockitoMethod1;
      objectArray1[5] = (Object) invocationImpl0;
      RealMethod realMethod1 = mock(RealMethod.class, new ViolatedAssumptionAnswer());
      InvocationImpl invocationImpl1 = new InvocationImpl(objectArray0[0], mockitoMethod1, objectArray1, (-1199), realMethod1);
      try { 
        invocationImpl0.callRealMethod();
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
