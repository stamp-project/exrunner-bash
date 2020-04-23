/*

 * Mon Apr 20 16:00:53 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.classes.BaseClass;
import com.xpn.xwiki.objects.classes.TextAreaClass;
import com.xpn.xwiki.objects.meta.DBTreeListMetaClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BaseClass baseClass0 = new BaseClass();
      baseClass0.safeget((String) null);
      baseClass0.getName();
      TextAreaClass.ContentType textAreaClass_ContentType0 = TextAreaClass.ContentType.WIKI_TEXT;
      baseClass0.addTextAreaField("", "_.!^", (-1352), (-1352), textAreaClass_ContentType0);
      baseClass0.getValidationScript();
      DBTreeListMetaClass dBTreeListMetaClass0 = new DBTreeListMetaClass();
      dBTreeListMetaClass0.addDBTreeListField("", (String) null, "");
      int int0 = 15;
      // Undeclared exception!
      dBTreeListMetaClass0.addTextAreaField("", "", 15, 15, textAreaClass_ContentType0);
  }
}
