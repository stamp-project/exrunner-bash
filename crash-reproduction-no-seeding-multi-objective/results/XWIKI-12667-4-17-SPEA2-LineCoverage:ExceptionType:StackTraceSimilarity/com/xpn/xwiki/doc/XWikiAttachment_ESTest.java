/*

 * Mon Apr 20 13:30:45 UTC 2020
 */

package com.xpn.xwiki.doc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.doc.XWikiAttachment;
import com.xpn.xwiki.doc.XWikiAttachmentContent;
import com.xpn.xwiki.doc.XWikiDocument;
import com.xpn.xwiki.internal.xml.XMLWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.model.reference.DocumentReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XWikiAttachment_ESTest extends XWikiAttachment_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DocumentReference documentReference0 = new DocumentReference("Hi$", "Hi$", "binding null to parameter: ", "Can only merge schemas of the same type.");
      XWikiDocument xWikiDocument0 = mock(XWikiDocument.class, new ViolatedAssumptionAnswer());
      doReturn(documentReference0, documentReference0, documentReference0).when(xWikiDocument0).getDocumentReference();
      String string0 = "";
      XWikiAttachment xWikiAttachment0 = new XWikiAttachment(xWikiDocument0, "");
      xWikiAttachment0.getFilesize();
      XMLWriter xMLWriter0 = mock(XMLWriter.class, new ViolatedAssumptionAnswer());
      XWikiContext xWikiContext0 = new XWikiContext();
      xWikiAttachment0.toXML(xMLWriter0, true, true, xWikiContext0);
      xWikiAttachment0.getAuthor();
      xWikiAttachment0.isContentDirty();
      XWikiAttachmentContent xWikiAttachmentContent0 = new XWikiAttachmentContent(xWikiAttachment0);
      xWikiAttachment0.setAttachment_content(xWikiAttachmentContent0);
      // Undeclared exception!
      xWikiAttachment0.getReference();
  }
}
