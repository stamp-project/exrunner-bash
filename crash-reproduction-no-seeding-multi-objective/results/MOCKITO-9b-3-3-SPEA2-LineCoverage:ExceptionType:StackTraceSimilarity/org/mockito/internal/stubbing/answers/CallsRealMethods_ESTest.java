/*

 * Tue Apr 21 12:44:07 UTC 2020
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
import org.mockito.internal.invocation.realmethod.RealMethod;
import org.mockito.internal.stubbing.answers.CallsRealMethods;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class CallsRealMethods_ESTest extends CallsRealMethods_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CallsRealMethods callsRealMethods0 = new CallsRealMethods();
      CallsRealMethods callsRealMethods1 = new CallsRealMethods();
      Object object0 = new Object();
      MockitoMethodProxy mockitoMethodProxy0 = mock(MockitoMethodProxy.class, new ViolatedAssumptionAnswer());
      CleanTraceRealMethod cleanTraceRealMethod0 = new CleanTraceRealMethod(mockitoMethodProxy0);
      CleanTraceRealMethod cleanTraceRealMethod1 = new CleanTraceRealMethod((RealMethod) null);
      MockitoMethod mockitoMethod0 = mock(MockitoMethod.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(mockitoMethod0).isAbstract();
      doReturn(true).when(mockitoMethod0).isVarArgs();
      InvocationImpl invocationImpl0 = new InvocationImpl((Object) null, mockitoMethod0, (Object[]) null, 0, (RealMethod) null);
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
