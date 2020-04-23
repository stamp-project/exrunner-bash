/*

 * Mon Apr 20 16:06:25 UTC 2020
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
      baseClass0.addTextField("Korea1", "Korea1", 1);
      BaseClass baseClass1 = baseClass0.clone();
      TextAreaClass.EditorType textAreaClass_EditorType0 = TextAreaClass.EditorType.WYSIWYG;
      TextAreaClass.ContentType textAreaClass_ContentType0 = TextAreaClass.ContentType.PURE_TEXT;
      // Undeclared exception!
      baseClass1.addTextAreaField("Korea1", "Korea1", 7, 1, textAreaClass_EditorType0, textAreaClass_ContentType0);
  }
}
