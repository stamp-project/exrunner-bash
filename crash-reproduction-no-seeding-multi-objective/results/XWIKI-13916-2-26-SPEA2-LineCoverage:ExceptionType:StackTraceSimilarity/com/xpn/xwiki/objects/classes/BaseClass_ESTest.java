/*

 * Mon Apr 20 16:15:34 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.objects.classes.TextAreaClass;
import com.xpn.xwiki.objects.meta.NumberMetaClass;
import com.xpn.xwiki.web.PrepareEditForm;
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
      XWikiContext xWikiContext1 = xWikiContext0.clone();
      XWikiContext xWikiContext2 = xWikiContext1.clone();
      PrepareEditForm prepareEditForm0 = new PrepareEditForm();
      xWikiContext2.setForm(prepareEditForm0);
      xWikiContext2.clone();
      NumberMetaClass numberMetaClass0 = new NumberMetaClass();
      String string0 = ".Sya79A)x@$]q1";
      numberMetaClass0.addDBListField("39)-\"oe{^bSDVV*;aEp", "QVtZbSPn#*", 14, true, true, ".Sya79A)x@$]q1");
      String string1 = "zwYyir`TcZD#$&SM0/";
      TextAreaClass.EditorType textAreaClass_EditorType0 = TextAreaClass.EditorType.TEXT;
      TextAreaClass.ContentType textAreaClass_ContentType0 = TextAreaClass.ContentType.WIKI_TEXT;
      // Undeclared exception!
      numberMetaClass0.addTextAreaField("39)-\"oe{^bSDVV*;aEp", "'[", (-2431), 120, textAreaClass_EditorType0, textAreaClass_ContentType0);
  }
}
