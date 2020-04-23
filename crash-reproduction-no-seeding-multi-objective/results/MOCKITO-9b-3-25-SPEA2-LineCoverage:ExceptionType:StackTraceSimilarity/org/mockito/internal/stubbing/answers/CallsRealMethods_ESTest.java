/*

 * Tue Apr 21 12:56:38 UTC 2020
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
import org.mockito.internal.invocation.realmethod.DefaultRealMethod;
import org.mockito.internal.stubbing.answers.CallsRealMethods;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class CallsRealMethods_ESTest extends CallsRealMethods_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CallsRealMethods callsRealMethods0 = new CallsRealMethods();
      MockitoMethodProxy mockitoMethodProxy0 = mock(MockitoMethodProxy.class, new ViolatedAssumptionAnswer());
      DefaultRealMethod defaultRealMethod0 = new DefaultRealMethod(mockitoMethodProxy0);
      MockitoMethod mockitoMethod0 = mock(MockitoMethod.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(mockitoMethod0).isAbstract();
      doReturn(true).when(mockitoMethod0).isVarArgs();
      Object[] objectArray0 = new Object[0];
      CallsRealMethods callsRealMethods1 = new CallsRealMethods();
      CallsRealMethods callsRealMethods2 = new CallsRealMethods();
      MockitoMethodProxy mockitoMethodProxy1 = mock(MockitoMethodProxy.class, new ViolatedAssumptionAnswer());
      DefaultRealMethod defaultRealMethod1 = new DefaultRealMethod(mockitoMethodProxy1);
      MockitoMethodProxy mockitoMethodProxy2 = mock(MockitoMethodProxy.class, new ViolatedAssumptionAnswer());
      MockitoMethodProxy mockitoMethodProxy3 = null;
      DefaultRealMethod defaultRealMethod2 = new DefaultRealMethod((MockitoMethodProxy) null);
      InvocationImpl invocationImpl0 = new InvocationImpl("K-h&%PBB", mockitoMethod0, objectArray0, 0, defaultRealMethod2);
      CallsRealMethods callsRealMethods3 = new CallsRealMethods();
      Object object0 = new Object();
      CallsRealMethods callsRealMethods4 = new CallsRealMethods();
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
