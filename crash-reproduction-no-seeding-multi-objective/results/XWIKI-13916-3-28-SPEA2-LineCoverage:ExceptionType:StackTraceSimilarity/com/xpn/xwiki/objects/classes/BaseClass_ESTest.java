/*

 * Mon Apr 20 16:17:41 UTC 2020
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
      String string0 = "r)9D]x72g^T\\{b";
      baseClass0.addStaticListField("customMapping", "The property [%s] may not be null!", 3452, true, "5fng4b2=DL,mqX", "r)9D]x72g^T{b", (String) null);
      baseClass0.getCustomMapping();
      baseClass0.addTextField((String) null, "customMapping", 2539);
      baseClass0.addUsersField("CN%A=EM  (,^50", (String) null);
      TextAreaClass.ContentType textAreaClass_ContentType0 = TextAreaClass.ContentType.WIKI_TEXT;
      baseClass0.addTextAreaField("", (String) null, (-4879), 178, textAreaClass_ContentType0);
      TextAreaClass.ContentType textAreaClass_ContentType1 = TextAreaClass.ContentType.VELOCITY_CODE;
      // Undeclared exception!
      baseClass0.addTextAreaField("CN%A=EM  (,^50", "CN%A=EM  (,^50", (-208), (-208), textAreaClass_ContentType1);
  }
}
