/*

 * Tue Apr 21 12:51:02 UTC 2020
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
      boolean boolean0 = true;
      MockitoMethod mockitoMethod0 = mock(MockitoMethod.class, new ViolatedAssumptionAnswer());
      doReturn(false, true).when(mockitoMethod0).isAbstract();
      doReturn(false).when(mockitoMethod0).isVarArgs();
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = null;
      objectArray0[1] = (Object) mockitoMethod0;
      objectArray0[2] = objectArray0[1];
      objectArray0[3] = objectArray0[2];
      Object object0 = new Object();
      RealMethod realMethod0 = mock(RealMethod.class, new ViolatedAssumptionAnswer());
      doReturn(objectArray0[0]).when(realMethod0).invoke(any() , any(java.lang.Object[].class));
      InvocationImpl invocationImpl0 = new InvocationImpl((Object) null, mockitoMethod0, objectArray0, 0, realMethod0);
      invocationImpl0.getSequenceNumber();
      invocationImpl0.isIgnoredForVerification();
      invocationImpl0.markVerified();
      invocationImpl0.hashCode();
      invocationImpl0.getArguments();
      invocationImpl0.isVerified();
      invocationImpl0.getRawArguments();
      invocationImpl0.callRealMethod();
      invocationImpl0.getSequenceNumber();
      invocationImpl0.getLocation();
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
