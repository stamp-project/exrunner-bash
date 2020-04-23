/*

 * Mon Apr 20 16:16:18 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.objects.classes.BaseClass;
import com.xpn.xwiki.objects.classes.TextAreaClass;
import com.xpn.xwiki.objects.meta.LevelsMetaClass;
import com.xpn.xwiki.objects.meta.NumberMetaClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BaseClass baseClass0 = new BaseClass();
      LevelsMetaClass levelsMetaClass0 = new LevelsMetaClass();
      baseClass0.getValidationScript();
      NumberMetaClass numberMetaClass0 = new NumberMetaClass();
      String string0 = "@&JAx}";
      int int0 = (-1820);
      TextAreaClass.EditorType textAreaClass_EditorType0 = TextAreaClass.EditorType.TEXT;
      baseClass0.toString();
      XWikiContext xWikiContext0 = new XWikiContext();
      numberMetaClass0.getFieldList();
      levelsMetaClass0.getRelativeXClassReference();
      TextAreaClass.ContentType textAreaClass_ContentType0 = TextAreaClass.ContentType.PURE_TEXT;
      // Undeclared exception!
      levelsMetaClass0.addTextAreaField("cache", "@&JAx}", (-587), 0, textAreaClass_EditorType0, textAreaClass_ContentType0);
  }
}
