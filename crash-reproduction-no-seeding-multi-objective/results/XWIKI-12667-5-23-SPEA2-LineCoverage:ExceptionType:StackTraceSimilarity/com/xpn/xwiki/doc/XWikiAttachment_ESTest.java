/*

 * Mon Apr 20 13:37:03 UTC 2020
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
import org.suigeneris.jrcs.rcs.Archive;
import org.suigeneris.jrcs.rcs.Version;
import org.xwiki.model.reference.DocumentReference;
import org.xwiki.model.reference.SpaceReference;
import org.xwiki.model.reference.WikiReference;
import org.xwiki.wiki.descriptor.WikiDescriptor;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XWikiAttachment_ESTest extends XWikiAttachment_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WikiDescriptor wikiDescriptor0 = new WikiDescriptor("07K]N%{xf-ht> Tx", "dte");
      WikiReference wikiReference0 = new WikiReference("dte");
      SpaceReference spaceReference0 = new SpaceReference("dte", wikiReference0);
      DocumentReference documentReference0 = new DocumentReference("dte", spaceReference0);
      XWikiDocument xWikiDocument0 = mock(XWikiDocument.class, new ViolatedAssumptionAnswer());
      doReturn(documentReference0).when(xWikiDocument0).getDocumentReference();
      doReturn("^.c]w/$").when(xWikiDocument0).toString();
      String string0 = "";
      XWikiAttachment xWikiAttachment0 = new XWikiAttachment(xWikiDocument0, "");
      Archive archive0 = mock(Archive.class, new ViolatedAssumptionAnswer());
      xWikiAttachment0.setArchive(archive0);
      xWikiAttachment0.getFilename();
      xWikiAttachment0.setRCSVersion((Version) null);
      xWikiAttachment0.setArchive("");
      xWikiAttachment0.clone();
      xWikiAttachment0.getArchive();
      // Undeclared exception!
      xWikiAttachment0.getMimeType((XWikiContext) null);
  }
}
