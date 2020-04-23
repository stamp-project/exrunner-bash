/*

 * Tue Apr 21 05:50:43 UTC 2020
 */

package com.xpn.xwiki.doc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.doc.XWikiAttachment;
import com.xpn.xwiki.doc.XWikiAttachmentContent;
import com.xpn.xwiki.doc.XWikiDocument;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xwiki.model.reference.DocumentReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XWikiAttachment_ESTest extends XWikiAttachment_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DocumentReference documentReference0 = new DocumentReference("}V>/", "}V>/", "}V>/");
      XWikiDocument xWikiDocument0 = new XWikiDocument(documentReference0);
      XWikiAttachment xWikiAttachment0 = new XWikiAttachment(xWikiDocument0, "");
      XWikiAttachmentContent xWikiAttachmentContent0 = new XWikiAttachmentContent(xWikiAttachment0);
      xWikiAttachment0.setAttachment_content(xWikiAttachmentContent0);
      // Undeclared exception!
      xWikiAttachment0.getReference();
  }
}
