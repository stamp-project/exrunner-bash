/*

 * Mon Apr 20 16:14:23 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.classes.BaseClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BaseClass baseClass0 = new BaseClass();
      String string0 = null;
      baseClass0.getLongValue((String) null);
      int int0 = (-2401);
      String string1 = "instance was not in a valid state";
      String string2 = "\"AK Thzw";
      baseClass0.addDBTreeListField((String) null, "defaulteditsheet", (-2401), false, "defaulteditsheet");
      // Undeclared exception!
      baseClass0.addTextAreaField((String) null, "", (-2401), (-2401), "instance was not in a valid state", "\"AK Thzw");
  }
}
