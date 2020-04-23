/*

 * Tue Apr 21 11:19:55 UTC 2020
 */

package org.mockito.exceptions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Method;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.exceptions.Reporter;
import org.mockito.internal.invocation.InvocationMatcher;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Reporter_ESTest extends Reporter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "8*[]V!$@!gE(2j/*";
      Object object0 = new Object();
      Method method0 = null;
      Object[] objectArray0 = new Object[4];
      objectArray0[1] = objectArray0[0];
      objectArray0[2] = (Object) "8*[]V!$@!gE(2j/*";
      Class<InvocationMatcher> class0 = InvocationMatcher.class;
      int int0 = 0;
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      reporter0.missingMethodInvocation();
  }
}
