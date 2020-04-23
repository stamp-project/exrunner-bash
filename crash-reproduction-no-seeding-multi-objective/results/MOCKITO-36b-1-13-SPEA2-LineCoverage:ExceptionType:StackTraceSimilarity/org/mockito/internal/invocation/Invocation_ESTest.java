/*

 * Mon Apr 20 11:51:47 UTC 2020
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
import org.mockito.internal.creation.MockitoMethodProxy;
import org.mockito.internal.invocation.Invocation;
import org.mockito.internal.invocation.MockitoMethod;
import org.mockito.internal.invocation.realmethod.FilteredCGLIBProxyRealMethod;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Invocation_ESTest extends Invocation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockitoMethod mockitoMethod0 = mock(MockitoMethod.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(mockitoMethod0).isVarArgs();
      int int0 = 0;
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) mockitoMethod0;
      objectArray0[1] = (Object) mockitoMethod0;
      objectArray0[2] = (Object) mockitoMethod0;
      objectArray0[3] = (Object) "B@:J`CRjY";
      Object object0 = new Object();
      objectArray0[4] = object0;
      objectArray0[5] = (Object) mockitoMethod0;
      objectArray0[6] = (Object) "B@:J`CRjY";
      FilteredCGLIBProxyRealMethod filteredCGLIBProxyRealMethod0 = new FilteredCGLIBProxyRealMethod((MockitoMethodProxy) null);
      Invocation invocation0 = new Invocation("B@:J`CRjY", mockitoMethod0, objectArray0, 0, filteredCGLIBProxyRealMethod0);
      invocation0.markVerifiedInOrder();
      try { 
        invocation0.callRealMethod();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod", e);
      }
  }
}
