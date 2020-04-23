/*

 * Mon Apr 20 16:16:08 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.objects.meta.ComputedFieldMetaClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ComputedFieldMetaClass computedFieldMetaClass0 = new ComputedFieldMetaClass();
      XWikiContext xWikiContext0 = new XWikiContext();
      XWikiContext xWikiContext1 = new XWikiContext();
      computedFieldMetaClass0.newCustomClassInstance(xWikiContext1);
      String string0 = null;
      computedFieldMetaClass0.addDBTreeListField("validationMessage", (String) null, "Adding transfer from %s for segments %s");
      // Undeclared exception!
      computedFieldMetaClass0.addTextAreaField("disabled", "Adding transfer from %s for segments %s", (-1879048189), (-2013265918), "v2E@tkY=$IkCEDm", (String) null);
  }
}
