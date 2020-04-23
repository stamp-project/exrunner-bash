/*

 * Tue Apr 21 12:45:33 UTC 2020
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
import org.mockito.internal.invocation.realmethod.CleanTraceRealMethod;
import org.mockito.internal.invocation.realmethod.RealMethod;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class InvocationImpl_ESTest extends InvocationImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object object0 = new Object();
      MockitoMethod mockitoMethod0 = mock(MockitoMethod.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(mockitoMethod0).isAbstract();
      doReturn(false).when(mockitoMethod0).isVarArgs();
      Object[] objectArray0 = null;
      int int0 = 2977;
      MockitoMethod mockitoMethod1 = mock(MockitoMethod.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(mockitoMethod1).isVarArgs();
      RealMethod realMethod0 = null;
      InvocationImpl invocationImpl0 = new InvocationImpl(object0, mockitoMethod1, (Object[]) null, 2977, (RealMethod) null);
      CleanTraceRealMethod cleanTraceRealMethod0 = new CleanTraceRealMethod((RealMethod) null);
      InvocationImpl invocationImpl1 = new InvocationImpl(object0, mockitoMethod0, (Object[]) null, 2977, cleanTraceRealMethod0);
      invocationImpl1.isIgnoredForVerification();
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
