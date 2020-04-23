/*

 * Mon Apr 20 16:18:33 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.classes.TextAreaClass;
import com.xpn.xwiki.objects.meta.DateMetaClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xwiki.model.reference.EntityReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateMetaClass dateMetaClass0 = new DateMetaClass();
      dateMetaClass0.getDefaultWeb();
      TextAreaClass.EditorType textAreaClass_EditorType0 = TextAreaClass.EditorType.PURE_TEXT;
      TextAreaClass.ContentType textAreaClass_ContentType0 = TextAreaClass.ContentType.PURE_TEXT;
      dateMetaClass0.addTextAreaField("", "", 1863, 1863, textAreaClass_EditorType0, textAreaClass_ContentType0);
      dateMetaClass0.setXClassReference((EntityReference) null);
      TextAreaClass.ContentType textAreaClass_ContentType1 = TextAreaClass.ContentType.PURE_TEXT;
      TextAreaClass.EditorType textAreaClass_EditorType1 = TextAreaClass.EditorType.WYSIWYG;
      TextAreaClass.ContentType textAreaClass_ContentType2 = TextAreaClass.ContentType.WIKI_TEXT;
      dateMetaClass0.addTextAreaField("6\"M{r+'ld", "class", 1863, 691, textAreaClass_EditorType1, textAreaClass_ContentType2);
      dateMetaClass0.addLevelsField("DocumentFragment", "6\"M{r+'ld", (-1879048189));
      dateMetaClass0.getListValue("V,b^^O08E7xdQh8");
      dateMetaClass0.addTextAreaField("85$@i>=h", "6\"M{r+'ld", (-1879048189), 691, textAreaClass_EditorType0, textAreaClass_ContentType1);
      // Undeclared exception!
      dateMetaClass0.addTemplateField("number", "85$@i>=h");
  }
}
