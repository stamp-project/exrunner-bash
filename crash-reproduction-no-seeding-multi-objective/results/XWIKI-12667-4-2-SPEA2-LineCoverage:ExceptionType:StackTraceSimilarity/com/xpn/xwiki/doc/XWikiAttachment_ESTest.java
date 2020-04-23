/*

 * Mon Apr 20 13:15:32 UTC 2020
 */

package com.xpn.xwiki.doc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.doc.XWikiAttachment;
import com.xpn.xwiki.doc.XWikiDocument;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.model.reference.DocumentReference;
import org.xwiki.model.reference.LocalDocumentReference;
import org.xwiki.model.reference.WikiReference;
import org.xwiki.wiki.descriptor.WikiDescriptor;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XWikiAttachment_ESTest extends XWikiAttachment_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Locale locale0 = Locale.getDefault();
      LocalDocumentReference localDocumentReference0 = new LocalDocumentReference(")l+%sZjjRW+", "Unable to initialize Struts ActionServlet due to an unexpected exception or error thrown, so marking the servlet as unavailable.  Most likely, this is due to an incorrect or missing library dependency.", locale0);
      WikiDescriptor wikiDescriptor0 = new WikiDescriptor("Unable to initialize Struts ActionServlet due to an unexpected exception or error thrown, so marking the servlet as unavailable.  Most likely, this is due to an incorrect or missing library dependency.", (String) null);
      WikiReference wikiReference0 = new WikiReference("Unable to initialize Struts ActionServlet due to an unexpected exception or error thrown, so marking the servlet as unavailable.  Most likely, this is due to an incorrect or missing library dependency.");
      DocumentReference documentReference0 = new DocumentReference(localDocumentReference0, wikiReference0);
      XWikiDocument xWikiDocument0 = mock(XWikiDocument.class, new ViolatedAssumptionAnswer());
      doReturn(documentReference0, documentReference0).when(xWikiDocument0).getDocumentReference();
      XWikiAttachment xWikiAttachment0 = new XWikiAttachment(xWikiDocument0, "");
      XWikiContext xWikiContext0 = new XWikiContext();
      // Undeclared exception!
      xWikiAttachment0.resetMimeType(xWikiContext0);
  }
}
