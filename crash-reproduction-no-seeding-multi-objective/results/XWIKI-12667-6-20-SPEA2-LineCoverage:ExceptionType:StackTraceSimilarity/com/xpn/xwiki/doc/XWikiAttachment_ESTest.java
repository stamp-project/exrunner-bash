/*

 * Mon Apr 20 13:33:57 UTC 2020
 */

package com.xpn.xwiki.doc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.doc.XWikiAttachment;
import com.xpn.xwiki.doc.XWikiDocument;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.model.internal.reference.PathStringEntityReferenceSerializer;
import org.xwiki.model.reference.DocumentReference;
import org.xwiki.wiki.descriptor.WikiDescriptor;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XWikiAttachment_ESTest extends XWikiAttachment_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PathStringEntityReferenceSerializer pathStringEntityReferenceSerializer0 = new PathStringEntityReferenceSerializer();
      WikiDescriptor wikiDescriptor0 = new WikiDescriptor("ao=_(-", "ao=_(-");
      DocumentReference documentReference0 = wikiDescriptor0.getMainPageReference();
      XWikiDocument xWikiDocument0 = mock(XWikiDocument.class, new ViolatedAssumptionAnswer());
      doReturn(documentReference0).when(xWikiDocument0).getDocumentReference();
      XWikiAttachment xWikiAttachment0 = new XWikiAttachment(xWikiDocument0, (String) null);
      xWikiAttachment0.setMetaDataDirty(true);
      xWikiAttachment0.getAuthor();
      wikiDescriptor0.setOwnerId("@Z");
      // Undeclared exception!
      xWikiAttachment0.getMimeType((XWikiContext) null);
  }
}
