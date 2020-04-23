/*

 * Mon Apr 20 11:51:11 UTC 2020
 */

package org.mockito.internal.invocation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.hamcrest.core.IsInstanceOf;
import org.junit.runner.RunWith;
import org.mockito.cglib.proxy.MethodProxy;
import org.mockito.internal.creation.DelegatingMockitoMethodProxy;
import org.mockito.internal.invocation.Invocation;
import org.mockito.internal.invocation.MockitoMethod;
import org.mockito.internal.invocation.realmethod.FilteredCGLIBProxyRealMethod;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Invocation_ESTest extends Invocation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<String> class0 = String.class;
      IsInstanceOf isInstanceOf0 = new IsInstanceOf(class0);
      MockitoMethod mockitoMethod0 = mock(MockitoMethod.class, new ViolatedAssumptionAnswer());
      doReturn(class0).when(mockitoMethod0).getReturnType();
      doReturn(true).when(mockitoMethod0).isVarArgs();
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) class0;
      Object object0 = new Object();
      DelegatingMockitoMethodProxy delegatingMockitoMethodProxy0 = new DelegatingMockitoMethodProxy((MethodProxy) null);
      FilteredCGLIBProxyRealMethod filteredCGLIBProxyRealMethod0 = new FilteredCGLIBProxyRealMethod(delegatingMockitoMethodProxy0);
      Invocation invocation0 = new Invocation(object0, mockitoMethod0, objectArray0, 0, filteredCGLIBProxyRealMethod0);
      invocation0.getArguments();
      invocation0.printMethodReturnType();
      try { 
        invocation0.callRealMethod();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.internal.creation.AbstractMockitoMethodProxy", e);
      }
  }
}
