/*

 * Mon Apr 20 16:10:56 UTC 2020
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
      String string0 = "";
      baseClass0.getListValue("");
      String string1 = "' with the password provided. [Use getConnection( username, password ) ";
      String string2 = "";
      baseClass0.addUsersField("' with the password provided. [Use getConnection( username, password ) ", "");
      // Undeclared exception!
      baseClass0.addTextAreaField("' with the password provided. [Use getConnection( username, password ) ", "' with the password provided. [Use getConnection( username, password ) ", (-2806), (-2806), "", "customDisplay");
  }
}
