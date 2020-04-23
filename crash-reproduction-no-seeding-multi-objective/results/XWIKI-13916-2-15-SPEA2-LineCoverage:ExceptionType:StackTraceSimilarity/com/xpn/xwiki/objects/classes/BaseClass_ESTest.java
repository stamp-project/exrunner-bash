/*

 * Mon Apr 20 16:02:02 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
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
      numberMetaClass0.flushCache();
      String string0 = "</unknown>";
      int int0 = 2;
      TextAreaClass.EditorType textAreaClass_EditorType0 = TextAreaClass.EditorType.WYSIWYG;
      boolean boolean0 = false;
      numberMetaClass0.addDBTreeListField("classType", "Kts#5`2E2yD", (-1879048190), false, "Kts#5`2E2yD");
      TextAreaClass.ContentType textAreaClass_ContentType0 = TextAreaClass.ContentType.PURE_TEXT;
      numberMetaClass0.getCustomClass();
      numberMetaClass0.getDefaultWeb();
      // Undeclared exception!
      numberMetaClass0.addTextAreaField("classType", "</unknown>", 2, (-1143), textAreaClass_EditorType0, textAreaClass_ContentType0);
  }
}
