/*

 * Mon Apr 20 11:51:58 UTC 2020
 */

package org.mockito.internal.invocation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.sql.SQLDataException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLWarning;
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
      Integer integer0 = new Integer(1364);
      Integer integer1 = new Integer(1364);
      int[] intArray0 = new int[5];
      intArray0[0] = 1364;
      intArray0[1] = 1364;
      intArray0[2] = 1364;
      intArray0[3] = 5;
      intArray0[0] = 1364;
      SQLWarning sQLWarning0 = new SQLWarning();
      SQLDataException sQLDataException0 = new SQLDataException("2DR# 6(yp%", sQLWarning0);
      sQLDataException0.addSuppressed(sQLWarning0);
      SQLIntegrityConstraintViolationException sQLIntegrityConstraintViolationException0 = new SQLIntegrityConstraintViolationException("", sQLDataException0);
      Object object1 = new Object();
      Object[] objectArray0 = new Object[3];
      objectArray0[0] = (Object) "|OTdgH";
      objectArray0[1] = (Object) null;
      objectArray0[2] = (Object) "";
      Invocation invocation0 = new Invocation(object0, mockitoMethod0, objectArray0, 4587, (RealMethod) null);
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
