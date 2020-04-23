/*

 * Tue Apr 21 12:55:19 UTC 2020
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
      Object object0 = new Object();
      MockitoMethod mockitoMethod0 = mock(MockitoMethod.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(mockitoMethod0).isAbstract();
      doReturn(false).when(mockitoMethod0).isVarArgs();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = object0;
      int int0 = 0;
      StubInfo stubInfo0 = mock(StubInfo.class, new ViolatedAssumptionAnswer());
      RealMethod realMethod0 = mock(RealMethod.class, new ViolatedAssumptionAnswer());
      InvocationImpl invocationImpl0 = new InvocationImpl(realMethod0, mockitoMethod0, objectArray0, 0, realMethod0);
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
