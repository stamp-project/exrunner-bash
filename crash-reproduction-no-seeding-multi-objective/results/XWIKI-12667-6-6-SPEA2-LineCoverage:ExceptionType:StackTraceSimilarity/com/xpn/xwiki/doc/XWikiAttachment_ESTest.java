/*

 * Mon Apr 20 13:19:54 UTC 2020
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
      doReturn((DocumentReference) null).when(xWikiDocument0).getDocumentReference();
      String string0 = "~y*a8;RK{M_B~";
      XWikiAttachment xWikiAttachment0 = new XWikiAttachment(xWikiDocument0, "");
      xWikiAttachment0.setDocId(3357L);
      xWikiAttachment0.getVersion();
      xWikiAttachment0.setComment("~y*a8;RK{M_B~");
      xWikiAttachment0.setMetaDataDirty(false);
      // Undeclared exception!
      xWikiAttachment0.getMimeType((XWikiContext) null);
  }
}
