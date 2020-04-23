/*

 * Mon Apr 20 13:34:46 UTC 2020
 */

package com.xpn.xwiki.doc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.doc.XWikiAttachment;
import com.xpn.xwiki.doc.XWikiAttachmentContent;
import com.xpn.xwiki.doc.XWikiDocument;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.model.reference.DocumentReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XWikiAttachment_ESTest extends XWikiAttachment_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XWikiAttachment xWikiAttachment0 = new XWikiAttachment();
      xWikiAttachment0.getAuthorReference();
      XWikiDocument xWikiDocument0 = mock(XWikiDocument.class, new ViolatedAssumptionAnswer());
      doReturn((DocumentReference) null).when(xWikiDocument0).getDocumentReference();
      doReturn("", "p}5:8OtHboe.>Io{").when(xWikiDocument0).toString();
      XWikiAttachment xWikiAttachment1 = new XWikiAttachment(xWikiDocument0, (String) null);
      xWikiAttachment1.getFilesize();
      xWikiAttachment1.clone();
      xWikiAttachment1.getDoc();
      xWikiAttachment1.setAttachment_content((XWikiAttachmentContent) null);
      xWikiAttachment1.getAuthor();
      xWikiAttachment1.getComment();
      xWikiAttachment1.getMimeType();
      // Undeclared exception!
      xWikiAttachment1.getReference();
  }
}
