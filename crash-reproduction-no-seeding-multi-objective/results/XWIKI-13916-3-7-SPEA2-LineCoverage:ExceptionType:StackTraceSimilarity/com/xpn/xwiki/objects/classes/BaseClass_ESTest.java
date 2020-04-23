/*

 * Mon Apr 20 15:51:47 UTC 2020
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
      TextAreaClass.ContentType textAreaClass_ContentType0 = TextAreaClass.ContentType.WIKI_TEXT;
      baseClass0.addTextAreaField("(y-!-;PwO2u", "", 15, 15, textAreaClass_ContentType0);
      baseClass0.setNameField("(y-!-;PwO2u");
      baseClass0.getDefaultViewSheet();
      baseClass0.getReference();
      baseClass0.removeField("");
      baseClass0.addDBListField("rj@nJ", "", 2810, true, true, "");
      baseClass0.addStaticListField("(y-!-;PwO2u", "cNiEjsr", 0, false, "(y-!-;PwO2u", (String) null);
      baseClass0.getCustomClass();
      baseClass0.addUsersField("(y-!-;PwO2u", "Uknown property type [{}]", 0);
      TextAreaClass.ContentType textAreaClass_ContentType1 = TextAreaClass.ContentType.WIKI_TEXT;
      // Undeclared exception!
      baseClass0.addTextAreaField("rj@nJ", "", 853, 2810, textAreaClass_ContentType1);
  }
}
