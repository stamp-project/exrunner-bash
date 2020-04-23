/*

 * Mon Apr 20 15:54:42 UTC 2020
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
      baseClass0.addDBTreeListField("x?$'Bcn|hZ|m`", "x?$'Bcn|hZ|m`", "x?$'Bcn|hZ|m`");
      String string0 = "_J&3HK0h<i;r<1g";
      baseClass0.addTimezoneField("}L$", "x?$'Bcn|hZ|m`", 4);
      String string1 = "OG/7jah$gzU";
      TextAreaClass.EditorType textAreaClass_EditorType0 = TextAreaClass.EditorType.PURE_TEXT;
      TextAreaClass.ContentType textAreaClass_ContentType0 = TextAreaClass.ContentType.PURE_TEXT;
      // Undeclared exception!
      baseClass0.addTextAreaField("x?$'Bcn|hZ|m`", "x?$'Bcn|hZ|m`", 4, 4, textAreaClass_EditorType0, textAreaClass_ContentType0);
  }
}
