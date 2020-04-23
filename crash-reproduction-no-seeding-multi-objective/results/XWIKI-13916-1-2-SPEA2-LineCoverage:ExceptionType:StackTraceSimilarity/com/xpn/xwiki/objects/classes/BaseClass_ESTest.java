/*

 * Mon Apr 20 15:46:32 UTC 2020
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
      int int0 = 250;
      baseClass0.addDBTreeListField("", "", "rF^(hNhqf8Vo<jKq8Aq");
      String string0 = "</>";
      // Undeclared exception!
      baseClass0.addTextAreaField("", "", 250, 250, "</>", "</>");
  }
}
