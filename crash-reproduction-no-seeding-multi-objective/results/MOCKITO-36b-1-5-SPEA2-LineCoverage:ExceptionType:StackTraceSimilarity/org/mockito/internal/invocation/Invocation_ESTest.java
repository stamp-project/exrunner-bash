/*

 * Mon Apr 20 11:51:26 UTC 2020
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
import org.mockito.internal.invocation.Invocation;
import org.mockito.internal.invocation.MockitoMethod;
import org.mockito.internal.invocation.realmethod.RealMethod;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Invocation_ESTest extends Invocation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockitoMethod mockitoMethod0 = mock(MockitoMethod.class, new ViolatedAssumptionAnswer());
      doReturn("CU%U3P`54>I", "CU%U3P`54>I").when(mockitoMethod0).toString();
      doReturn(true, false, true).when(mockitoMethod0).isVarArgs();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) mockitoMethod0;
      Integer integer0 = Integer.getInteger("CU%U3P`54>I", 1525);
      RealMethod realMethod0 = mock(RealMethod.class, new ViolatedAssumptionAnswer());
      doReturn(integer0).when(realMethod0).invoke(any() , any(java.lang.Object[].class));
      Invocation invocation0 = new Invocation("CU%U3P`54>I", mockitoMethod0, objectArray0, 1525, realMethod0);
      MockitoMethod mockitoMethod1 = invocation0.getMethod();
      Object object0 = new Object();
      Invocation invocation1 = new Invocation(object0, mockitoMethod1, objectArray0, 705, (RealMethod) null);
      Object object1 = new Object();
      invocation0.getMethod();
      invocation0.getArguments();
      Invocation invocation2 = new Invocation(object1, mockitoMethod1, objectArray0, 705, (RealMethod) null);
      invocation0.callRealMethod();
      invocation2.getMock();
      try { 
        invocation1.callRealMethod();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.internal.invocation.Invocation", e);
      }
  }
}
