/*

 * Mon Apr 20 15:55:35 UTC 2020
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
      baseClass0.getDateValue("class");
      baseClass0.addGroupsField("Ob6dvKav\"VUPt", "+", 1475);
      baseClass0.addGroupsField("relationalStorage", "SaQwKO!<t+Ug");
      TextAreaClass.EditorType textAreaClass_EditorType0 = TextAreaClass.EditorType.TEXT;
      TextAreaClass.ContentType textAreaClass_ContentType0 = TextAreaClass.ContentType.VELOCITY_CODE;
      int int0 = 416;
      // Undeclared exception!
      baseClass0.addTextAreaField("Ob6dvKav\"VUPt", "+", 416, (-2147483645), textAreaClass_EditorType0, textAreaClass_ContentType0);
  }
}
