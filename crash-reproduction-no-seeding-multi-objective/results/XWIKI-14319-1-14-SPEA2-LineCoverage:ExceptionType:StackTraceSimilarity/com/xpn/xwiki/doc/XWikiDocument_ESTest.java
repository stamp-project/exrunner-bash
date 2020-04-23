/*

 * Mon Apr 20 20:57:58 UTC 2020
 */

package com.xpn.xwiki.doc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.doc.XWikiDocument;
import java.util.Locale;
import org.apache.struts.chain.contexts.MockActionContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.model.reference.DocumentReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XWikiDocument_ESTest extends XWikiDocument_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockActionContext mockActionContext0 = new MockActionContext();
      mockActionContext0.getLocale();
      DocumentReference documentReference0 = mock(DocumentReference.class, new ViolatedAssumptionAnswer());
      doReturn((Locale) null).when(documentReference0).getLocale();
      XWikiDocument xWikiDocument0 = new XWikiDocument(documentReference0);
      String string0 = "";
      XWikiContext xWikiContext0 = new XWikiContext();
      xWikiContext0.keys();
      // Undeclared exception!
      xWikiDocument0.getTranslationList(xWikiContext0);
  }
}
