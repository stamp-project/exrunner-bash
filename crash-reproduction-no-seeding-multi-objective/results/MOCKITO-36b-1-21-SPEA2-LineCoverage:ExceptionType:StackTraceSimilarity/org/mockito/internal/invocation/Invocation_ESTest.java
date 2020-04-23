/*

 * Mon Apr 20 11:51:53 UTC 2020
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
      Object object0 = new Object();
      MockitoMethod mockitoMethod0 = mock(MockitoMethod.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(mockitoMethod0).isVarArgs();
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) mockitoMethod0;
      objectArray0[1] = object0;
      objectArray0[2] = object0;
      objectArray0[3] = (Object) mockitoMethod0;
      objectArray0[4] = object0;
      RealMethod realMethod0 = mock(RealMethod.class, new ViolatedAssumptionAnswer());
      Invocation invocation0 = new Invocation(object0, mockitoMethod0, objectArray0, 5002, realMethod0);
      Class<Object> class0 = Object.class;
      MockitoMethod mockitoMethod1 = mock(MockitoMethod.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(mockitoMethod1).getReturnType();
      doReturn(true).when(mockitoMethod1).isVarArgs();
      RealMethod realMethod1 = null;
      Invocation invocation1 = new Invocation(invocation0, mockitoMethod1, objectArray0, 0, (RealMethod) null);
      invocation1.equals((Object) null);
      invocation1.returnsPrimitive();
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
