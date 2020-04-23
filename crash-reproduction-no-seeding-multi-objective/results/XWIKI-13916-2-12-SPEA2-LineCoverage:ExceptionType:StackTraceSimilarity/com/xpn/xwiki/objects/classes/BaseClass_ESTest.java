/*

 * Mon Apr 20 15:57:54 UTC 2020
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
      baseClass0.getFieldList();
      baseClass0.hasExternalCustomMapping();
      baseClass0.getOwnerDocument();
      baseClass0.setPrettyName("z~_GxY$tJM");
      String string0 = null;
      String string1 = "fI^PbY3Qn5<O/";
      baseClass0.addNumberField((String) null, "z~_GxY$tJM", 13010, "fI^PbY3Qn5<O/");
      String string2 = "?fj$j";
      int int0 = (-1793);
      baseClass0.addDateField("fI^PbY3Qn5<O/", (String) null, "?fj$j", (-1793));
      baseClass0.clone();
      baseClass0.getField("z~_GxY$tJM");
      TextAreaClass.EditorType textAreaClass_EditorType0 = TextAreaClass.EditorType.PURE_TEXT;
      TextAreaClass.ContentType textAreaClass_ContentType0 = TextAreaClass.ContentType.PURE_TEXT;
      // Undeclared exception!
      baseClass0.addTextAreaField((String) null, "z~_GxY$tJM", (-1), 13010, textAreaClass_EditorType0, textAreaClass_ContentType0);
  }
}
