/*

 * Mon Apr 20 15:58:16 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.classes.TextAreaClass;
import com.xpn.xwiki.objects.meta.TextAreaMetaClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TextAreaMetaClass textAreaMetaClass0 = new TextAreaMetaClass();
      String string0 = "";
      textAreaMetaClass0.getLongValue("");
      textAreaMetaClass0.getOwnerDocument();
      textAreaMetaClass0.setDefaultViewSheet("");
      String string1 = "";
      textAreaMetaClass0.addUsersField("", "8Y#P|#[$$", (-836), true);
      String string2 = "defaultEditSheet";
      int int0 = 682;
      TextAreaClass.EditorType textAreaClass_EditorType0 = TextAreaClass.EditorType.PURE_TEXT;
      TextAreaClass.ContentType textAreaClass_ContentType0 = TextAreaClass.ContentType.VELOCITY_CODE;
      // Undeclared exception!
      textAreaMetaClass0.addTextAreaField("", "defaultEditSheet", 682, 489, textAreaClass_EditorType0, textAreaClass_ContentType0);
  }
}
