/*

 * Mon Apr 20 13:29:55 UTC 2020
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
import org.xwiki.wiki.descriptor.WikiDescriptor;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XWikiAttachment_ESTest extends XWikiAttachment_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WikiDescriptor wikiDescriptor0 = new WikiDescriptor("Failed to compare attachments", "Failed to compare attachments");
      DocumentReference documentReference0 = wikiDescriptor0.getMainPageReference();
      XWikiDocument xWikiDocument0 = mock(XWikiDocument.class, new ViolatedAssumptionAnswer());
      doReturn(documentReference0, documentReference0, documentReference0).when(xWikiDocument0).getDocumentReference();
      doReturn("Failed to compare attachments").when(xWikiDocument0).toString();
      XWikiAttachment xWikiAttachment0 = new XWikiAttachment(xWikiDocument0, "");
      xWikiAttachment0.apply(xWikiAttachment0);
      xWikiAttachment0.getAttachment_content();
      xWikiAttachment0.getFilename();
      xWikiAttachment0.getVersions();
      XWikiContext xWikiContext0 = new XWikiContext();
      XWikiContext xWikiContext1 = xWikiContext0.clone();
      xWikiContext1.getUserReference();
      Locale locale0 = Locale.GERMAN;
      DocumentReference documentReference1 = new DocumentReference(documentReference0, locale0);
      XWikiDocument xWikiDocument1 = new XWikiDocument(documentReference0, locale0);
      XWikiAttachment xWikiAttachment1 = new XWikiAttachment(xWikiDocument1, "N5]0qj5RC4#5z");
      XWikiContext xWikiContext2 = new XWikiContext();
      xWikiContext1.clone();
      // Undeclared exception!
      xWikiAttachment0.getMimeType(xWikiContext1);
  }
}
