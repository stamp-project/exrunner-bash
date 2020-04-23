/*

 * Mon Apr 20 16:05:59 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.objects.classes.TextAreaClass;
import com.xpn.xwiki.objects.meta.DateMetaClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xwiki.model.reference.DocumentReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DocumentReference documentReference0 = new DocumentReference("(a'D!=f", "(a'D!=f", "customClass", (String) null);
      DateMetaClass dateMetaClass0 = new DateMetaClass();
      dateMetaClass0.getPropertyNames();
      dateMetaClass0.getFloatValue("8vL)+J,M\u0006Co1");
      dateMetaClass0.addTemplateField(" identified by ", " identified by ");
      dateMetaClass0.setNumber(0);
      dateMetaClass0.addDBTreeListField("8vL)+J,M\u0006Co1", "8(PoBR&-H+!qX]h^vJ", 0, true, "customClass");
      dateMetaClass0.addUsersField("", "8(PoBR&-H+!qX]h^vJ", true);
      dateMetaClass0.setName("{m\"wF0RS?MX>\f5b|");
      int int0 = 0;
      dateMetaClass0.addDBListField("{m\"wF0RS?MX>\f5b|", " identified by ", 0, true, true, (String) null);
      dateMetaClass0.setNumber(0);
      XWikiContext xWikiContext0 = new XWikiContext();
      XWikiContext xWikiContext1 = xWikiContext0.clone();
      XWikiContext xWikiContext2 = xWikiContext1.clone();
      dateMetaClass0.getCustomMappingPropertyList(xWikiContext2);
      TextAreaClass.ContentType textAreaClass_ContentType0 = TextAreaClass.ContentType.WIKI_TEXT;
      // Undeclared exception!
      dateMetaClass0.addTextAreaField("8vL)+J,M\u0006Co1", (String) null, 0, 8930, textAreaClass_ContentType0);
  }
}
