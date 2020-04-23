/*

 * Mon Apr 20 15:57:03 UTC 2020
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
      String string0 = "6W^f vL/5fXU;;Th";
      baseClass0.setCustomMapping("6W^f vL/5fXU;;Th");
      int int0 = (-7);
      baseClass0.addUsersField("6W^f vL/5fXU;;Th", "6W^f vL/5fXU;;Th", (-7));
      TextAreaClass.EditorType textAreaClass_EditorType0 = TextAreaClass.EditorType.WYSIWYG;
      TextAreaClass.ContentType textAreaClass_ContentType0 = TextAreaClass.ContentType.WIKI_TEXT;
      // Undeclared exception!
      baseClass0.addTextAreaField("6W^f vL/5fXU;;Th", "6W^f vL/5fXU;;Th", (-7), (-7), textAreaClass_EditorType0, textAreaClass_ContentType0);
  }
}
