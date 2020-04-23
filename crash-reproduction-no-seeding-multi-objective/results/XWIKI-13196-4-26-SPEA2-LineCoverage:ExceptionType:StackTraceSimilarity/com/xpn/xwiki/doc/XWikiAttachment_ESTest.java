/*

 * Tue Apr 21 06:03:09 UTC 2020
 */

package com.xpn.xwiki.doc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.doc.XWikiAttachment;
import com.xpn.xwiki.doc.XWikiAttachmentArchive;
import com.xpn.xwiki.doc.XWikiDocument;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.model.reference.DocumentReference;
import org.xwiki.model.reference.LocalDocumentReference;
import org.xwiki.wiki.descriptor.WikiDescriptor;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XWikiAttachment_ESTest extends XWikiAttachment_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      LocalDocumentReference localDocumentReference0 = new LocalDocumentReference("uF8j&&)`", "uF8j&&)`", locale0);
      WikiDescriptor wikiDescriptor0 = new WikiDescriptor("uF8j&&)`", "uF8j&&)`");
      WikiDescriptor wikiDescriptor1 = wikiDescriptor0.clone();
      wikiDescriptor1.getReference();
      DocumentReference documentReference0 = wikiDescriptor0.getMainPageReference();
      XWikiDocument xWikiDocument0 = mock(XWikiDocument.class, new ViolatedAssumptionAnswer());
      doReturn(documentReference0).when(xWikiDocument0).getDocumentReference();
      XWikiAttachment xWikiAttachment0 = new XWikiAttachment(xWikiDocument0, "");
      XWikiAttachmentArchive xWikiAttachmentArchive0 = mock(XWikiAttachmentArchive.class, new ViolatedAssumptionAnswer());
      xWikiAttachment0.setAttachment_archive(xWikiAttachmentArchive0);
      XWikiContext xWikiContext0 = null;
      // Undeclared exception!
      xWikiAttachment0.isImage((XWikiContext) null);
  }
}
