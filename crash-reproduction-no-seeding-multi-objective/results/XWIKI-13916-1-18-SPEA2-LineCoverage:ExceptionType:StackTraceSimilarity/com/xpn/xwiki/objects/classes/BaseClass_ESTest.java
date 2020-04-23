/*

 * Mon Apr 20 16:05:36 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.doc.XWikiDocument;
import com.xpn.xwiki.objects.classes.BaseClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BaseClass baseClass0 = new BaseClass();
      baseClass0.getCustomClass();
      baseClass0.getDisabledProperties();
      baseClass0.getName();
      baseClass0.get("");
      baseClass0.setOwnerDocument((XWikiDocument) null);
      String string0 = null;
      String string1 = "+#q";
      baseClass0.addDBListField((String) null, (String) null, 0, true, true, "+#q");
      // Undeclared exception!
      baseClass0.addTextAreaField((String) null, "", (-3101), (-376), "", "FX|IW?B<5");
  }
}
