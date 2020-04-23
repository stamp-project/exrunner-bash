/*

 * Tue Apr 21 05:54:37 UTC 2020
 */

package com.xpn.xwiki.doc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.doc.XWikiAttachment;
import com.xpn.xwiki.doc.XWikiDocument;
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
      WikiDescriptor wikiDescriptor0 = new WikiDescriptor("jKLrA", "Initial state transfer timed out for cache %s on %s");
      DocumentReference documentReference0 = wikiDescriptor0.getMainPageReference();
      XWikiDocument xWikiDocument0 = mock(XWikiDocument.class, new ViolatedAssumptionAnswer());
      doReturn(documentReference0).when(xWikiDocument0).getDocumentReference();
      doReturn("Z`4kJmmJ[-{y5W5l=(").when(xWikiDocument0).getFullName();
      XWikiAttachment xWikiAttachment0 = new XWikiAttachment(xWikiDocument0, "");
      xWikiAttachment0.getComment();
      xWikiAttachment0.setMimeType("");
      xWikiAttachment0.getId();
      xWikiAttachment0.setVersion("");
      xWikiAttachment0.setAuthor("");
      xWikiAttachment0.getFilesize();
      xWikiAttachment0.setFilename("");
      xWikiAttachment0.getFilesize();
      // Undeclared exception!
      xWikiAttachment0.getReference();
  }
}
