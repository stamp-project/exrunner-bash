/*

 * Mon Apr 20 13:40:46 UTC 2020
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
import org.xwiki.model.reference.DocumentReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XWikiAttachment_ESTest extends XWikiAttachment_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XWikiDocument xWikiDocument0 = mock(XWikiDocument.class, new ViolatedAssumptionAnswer());
      doReturn((DocumentReference) null, (DocumentReference) null, (DocumentReference) null).when(xWikiDocument0).getDocumentReference();
      doReturn((String) null).when(xWikiDocument0).toString();
      XWikiAttachment xWikiAttachment0 = new XWikiAttachment(xWikiDocument0, (String) null);
      xWikiAttachment0.getAttachment_archive();
      xWikiAttachment0.apply(xWikiAttachment0);
      xWikiAttachment0.getAuthor();
      xWikiAttachment0.getAttachment_content();
      xWikiAttachment0.setFilesize((-434));
      XWikiContext xWikiContext0 = new XWikiContext();
      xWikiContext0.put("XWiki.XWikiGuest", (Object) null);
      xWikiAttachment0.getVersions();
      xWikiAttachment0.getVersion();
      XWikiContext xWikiContext1 = xWikiContext0.clone();
      // Undeclared exception!
      xWikiAttachment0.getMimeType(xWikiContext1);
  }
}
