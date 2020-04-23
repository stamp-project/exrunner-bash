/*

 * Mon Apr 20 21:00:15 UTC 2020
 */

package com.xpn.xwiki.doc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.doc.XWikiDocument;
import com.xpn.xwiki.objects.BaseObject;
import com.xpn.xwiki.web.XWikiServletResponseStub;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.model.reference.DocumentReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XWikiDocument_ESTest extends XWikiDocument_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XWikiServletResponseStub xWikiServletResponseStub0 = new XWikiServletResponseStub();
      xWikiServletResponseStub0.getLocale();
      DocumentReference documentReference0 = mock(DocumentReference.class, new ViolatedAssumptionAnswer());
      doReturn((Locale) null).when(documentReference0).getLocale();
      Locale locale0 = Locale.ENGLISH;
      XWikiDocument xWikiDocument0 = new XWikiDocument(documentReference0, locale0);
      ConcurrentHashMap<DocumentReference, List<BaseObject>> concurrentHashMap0 = new ConcurrentHashMap<DocumentReference, List<BaseObject>>();
      String string0 = "Failed to get linked documents";
      Boolean boolean0 = new Boolean("Failed to get linked documents");
      XWikiContext xWikiContext0 = null;
      // Undeclared exception!
      xWikiDocument0.getTranslationList((XWikiContext) null);
  }
}
