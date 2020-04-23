/*

 * Mon Apr 20 11:51:24 UTC 2020
 */

package org.mockito.internal.invocation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import java.sql.SQLFeatureNotSupportedException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.hamcrest.core.IsInstanceOf;
import org.junit.runner.RunWith;
import org.mockito.internal.invocation.Invocation;
import org.mockito.internal.invocation.MockitoMethod;
import org.mockito.internal.invocation.realmethod.RealMethod;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Invocation_ESTest extends Invocation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object object0 = new Object();
      Class<IsInstanceOf> class0 = IsInstanceOf.class;
      Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 7);
      Class<String> class1 = String.class;
      classArray0[0] = class1;
      Class<String> class2 = String.class;
      classArray0[1] = class2;
      Class<String> class3 = String.class;
      classArray0[2] = class3;
      Class<String> class4 = String.class;
      classArray0[3] = class4;
      Class<String> class5 = String.class;
      classArray0[4] = class5;
      Class<String> class6 = String.class;
      classArray0[5] = class6;
      Class<String> class7 = String.class;
      classArray0[6] = class7;
      MockitoMethod mockitoMethod0 = mock(MockitoMethod.class, new ViolatedAssumptionAnswer());
      doReturn("", "", "", "&/}!").when(mockitoMethod0).toString();
      doReturn(classArray0).when(mockitoMethod0).getExceptionTypes();
      doReturn(class0, class3, class0, class1).when(mockitoMethod0).getReturnType();
      doReturn(false, false).when(mockitoMethod0).isVarArgs();
      RealMethod realMethod0 = mock(RealMethod.class, new ViolatedAssumptionAnswer());
      Invocation invocation0 = new Invocation(object0, mockitoMethod0, (Object[]) null, 2619, realMethod0);
      invocation0.getRawArguments();
      MockitoMethod mockitoMethod1 = invocation0.getMethod();
      invocation0.returnsPrimitive();
      invocation0.getLocation();
      invocation0.getArguments();
      Class<Object> class8 = Object.class;
      invocation0.isValidReturnType(class8);
      Invocation invocation1 = new Invocation(mockitoMethod1, mockitoMethod1, (Object[]) null, 2619, (RealMethod) null);
      invocation0.equals(invocation1);
      invocation0.getMethod();
      invocation0.markVerifiedInOrder();
      invocation1.printMethodReturnType();
      invocation1.getMethod();
      SQLFeatureNotSupportedException sQLFeatureNotSupportedException0 = new SQLFeatureNotSupportedException();
      invocation1.isValidException(sQLFeatureNotSupportedException0);
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
