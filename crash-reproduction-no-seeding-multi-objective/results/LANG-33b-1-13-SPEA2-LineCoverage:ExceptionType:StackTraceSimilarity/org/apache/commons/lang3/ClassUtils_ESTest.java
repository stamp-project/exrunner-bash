/*

 * Mon Apr 20 11:50:17 UTC 2020
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.apache.commons.lang3.ClassUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class ClassUtils_ESTest extends ClassUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      boolean boolean0 = true;
      Boolean boolean1 = Boolean.valueOf(true);
      String string0 = "B";
      ClassUtils.getPackageCanonicalName((Object) boolean1, "B");
      LinkedList<Class<String>> linkedList0 = new LinkedList<Class<String>>();
      String string1 = "";
      ClassUtils.getShortCanonicalName("");
      Class<Integer> class0 = Integer.class;
      ClassUtils.getPackageCanonicalName(class0);
      ClassUtils.getPackageCanonicalName((Object) "java.lang", "");
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) "B";
      objectArray0[1] = (Object) "java.lang";
      objectArray0[1] = (Object) "";
      objectArray0[3] = (Object) "java.lang";
      objectArray0[4] = (Object) "java.lang";
      objectArray0[5] = (Object) "java.lang";
      // Undeclared exception!
      ClassUtils.toClass(objectArray0);
  }
}
