/*

 * Mon Apr 20 15:49:24 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.classes.BaseClass;
import com.xpn.xwiki.objects.classes.TextAreaClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BaseClass baseClass0 = new BaseClass();
      String string0 = "";
      baseClass0.getIntValue("");
      baseClass0.addTextField("", "", 0);
      baseClass0.getPrettyName();
      TextAreaClass.EditorType textAreaClass_EditorType0 = TextAreaClass.EditorType.TEXT;
      TextAreaClass.ContentType textAreaClass_ContentType0 = TextAreaClass.ContentType.PURE_TEXT;
      baseClass0.addTextAreaField("[o", "", 0, 67, textAreaClass_EditorType0, textAreaClass_ContentType0);
      baseClass0.hasInternalCustomMapping();
      String string1 = "";
      baseClass0.setNameField("");
      baseClass0.addDBTreeListField((String) null, "", 0, true, true, "");
      baseClass0.addTextField("", "", 0);
      String string2 = "";
      // Undeclared exception!
      baseClass0.addTemplateField("", "");
  }
}
