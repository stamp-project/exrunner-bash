/*

 * Mon Apr 20 11:51:40 UTC 2020
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
      Integer integer0 = new Integer(45);
      Class<String> class0 = String.class;
      MockitoMethod mockitoMethod0 = mock(MockitoMethod.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(mockitoMethod0).getReturnType();
      doReturn(true).when(mockitoMethod0).isVarArgs();
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) objectArray0;
      Integer.compare(15, 15);
      objectArray0[1] = (Object) mockitoMethod0;
      objectArray0[4] = (Object) mockitoMethod0;
      objectArray0[3] = (Object) integer0;
      objectArray0[4] = (Object) integer0;
      Invocation invocation0 = new Invocation(integer0, mockitoMethod0, objectArray0, 0, (RealMethod) null);
      invocation0.isVoid();
      try { 
        invocation0.callRealMethod();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.internal.invocation.Invocation", e);
      }
  }
}
