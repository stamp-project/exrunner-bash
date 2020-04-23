/*

 * Mon Apr 20 16:11:06 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.objects.classes.TextAreaClass;
import com.xpn.xwiki.objects.meta.NumberMetaClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NumberMetaClass numberMetaClass0 = new NumberMetaClass();
      XWikiContext xWikiContext0 = new XWikiContext();
      XWikiContext xWikiContext1 = xWikiContext0.clone();
      XWikiContext xWikiContext2 = xWikiContext1.clone();
      numberMetaClass0.getCustomMappingPropertyList(xWikiContext2);
      int int0 = 722;
      numberMetaClass0.addDateField("", "", "OyRv/e++n8f#ey?", 722);
      numberMetaClass0.addStaticListField("OyRv/e++n8f#ey?", "", 2139, false, "", "", "defaultViewSheet");
      TextAreaClass.ContentType textAreaClass_ContentType0 = TextAreaClass.ContentType.WIKI_TEXT;
      // Undeclared exception!
      numberMetaClass0.addTextAreaField("", "^h76K%-Kp", 0, 0, textAreaClass_ContentType0);
  }
}
