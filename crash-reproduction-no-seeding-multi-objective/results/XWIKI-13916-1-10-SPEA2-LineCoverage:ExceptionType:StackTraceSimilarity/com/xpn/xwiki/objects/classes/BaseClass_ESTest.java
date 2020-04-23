/*

 * Mon Apr 20 15:54:51 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.objects.classes.BaseClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BaseClass baseClass0 = new BaseClass();
      baseClass0.addTimezoneField("PaintType", "", 1691);
      baseClass0.addUsersField("classType", "p^", true);
      XWikiContext xWikiContext0 = new XWikiContext();
      baseClass0.newCustomClassInstance(xWikiContext0);
      // Undeclared exception!
      baseClass0.addTextAreaField("PaintType", "Vlo~", (-1073741823), 2043, "", "");
  }
}
