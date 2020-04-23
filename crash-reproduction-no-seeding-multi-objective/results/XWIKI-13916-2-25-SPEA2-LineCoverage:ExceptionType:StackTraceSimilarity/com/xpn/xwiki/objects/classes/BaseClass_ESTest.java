/*

 * Mon Apr 20 16:14:17 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.classes.BaseClass;
import com.xpn.xwiki.objects.classes.TextAreaClass;
import com.xpn.xwiki.objects.meta.TimezoneMetaClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TimezoneMetaClass timezoneMetaClass0 = new TimezoneMetaClass();
      TextAreaClass.EditorType textAreaClass_EditorType0 = TextAreaClass.EditorType.WYSIWYG;
      TextAreaClass.ContentType textAreaClass_ContentType0 = TextAreaClass.ContentType.WIKI_TEXT;
      Boolean boolean0 = new Boolean("Error instanciating property class");
      timezoneMetaClass0.addGroupsField((String) null, "Error instanciating property class");
      BaseClass baseClass0 = timezoneMetaClass0.clone();
      String string0 = "";
      timezoneMetaClass0.addTextAreaField("", (String) null, (-783), 60, textAreaClass_EditorType0, textAreaClass_ContentType0);
      TextAreaClass.ContentType textAreaClass_ContentType1 = TextAreaClass.ContentType.WIKI_TEXT;
      // Undeclared exception!
      baseClass0.addTextAreaField((String) null, "<unknown>", (-1717986916), (-1908874351), textAreaClass_EditorType0, textAreaClass_ContentType1);
  }
}
