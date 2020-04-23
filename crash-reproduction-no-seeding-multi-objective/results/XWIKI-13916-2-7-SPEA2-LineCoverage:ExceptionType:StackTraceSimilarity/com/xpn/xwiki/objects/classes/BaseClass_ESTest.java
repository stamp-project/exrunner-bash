/*

 * Mon Apr 20 15:52:22 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.objects.classes.BaseClass;
import com.xpn.xwiki.objects.classes.TextAreaClass;
import com.xpn.xwiki.web.XWikiResponse;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.model.reference.DocumentReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DocumentReference documentReference0 = mock(DocumentReference.class, new ViolatedAssumptionAnswer());
      XWikiContext xWikiContext0 = new XWikiContext();
      xWikiContext0.put(documentReference0, documentReference0);
      BaseClass baseClass0 = new BaseClass();
      String string0 = ".";
      baseClass0.addDateField((String) null, ".", (String) null);
      baseClass0.getNameField();
      baseClass0.getFloatValue("");
      baseClass0.addUsersField("", "I");
      TextAreaClass.EditorType textAreaClass_EditorType0 = TextAreaClass.EditorType.PURE_TEXT;
      xWikiContext0.getResponse();
      xWikiContext0.setResponse((XWikiResponse) null);
      TextAreaClass.ContentType textAreaClass_ContentType0 = TextAreaClass.ContentType.PURE_TEXT;
      // Undeclared exception!
      baseClass0.addTextAreaField("", "I", 804, (-1909), textAreaClass_EditorType0, textAreaClass_ContentType0);
  }
}
