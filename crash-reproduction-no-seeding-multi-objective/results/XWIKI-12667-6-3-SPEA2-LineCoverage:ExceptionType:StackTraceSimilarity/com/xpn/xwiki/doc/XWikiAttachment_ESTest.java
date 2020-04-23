/*

 * Mon Apr 20 13:16:48 UTC 2020
 */

package com.xpn.xwiki.doc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.doc.XWikiAttachment;
import com.xpn.xwiki.doc.XWikiDocument;
import com.xpn.xwiki.doc.merge.MergeConfiguration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.suigeneris.jrcs.rcs.Archive;
import org.xwiki.model.reference.DocumentReference;
import org.xwiki.wiki.descriptor.WikiDescriptor;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XWikiAttachment_ESTest extends XWikiAttachment_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WikiDescriptor wikiDescriptor0 = new WikiDescriptor("|f", "|f");
      DocumentReference documentReference0 = wikiDescriptor0.getMainPageReference();
      XWikiDocument xWikiDocument0 = mock(XWikiDocument.class, new ViolatedAssumptionAnswer());
      doReturn(documentReference0, documentReference0).when(xWikiDocument0).getDocumentReference();
      String string0 = null;
      XWikiAttachment xWikiAttachment0 = new XWikiAttachment(xWikiDocument0, (String) null);
      xWikiAttachment0.getAuthor();
      MergeConfiguration mergeConfiguration0 = mock(MergeConfiguration.class, new ViolatedAssumptionAnswer());
      xWikiAttachment0.getArchive();
      xWikiAttachment0.setArchive((Archive) null);
      xWikiAttachment0.apply(xWikiAttachment0);
      XWikiContext xWikiContext0 = new XWikiContext();
      // Undeclared exception!
      xWikiAttachment0.getMimeType(xWikiContext0);
  }
}
