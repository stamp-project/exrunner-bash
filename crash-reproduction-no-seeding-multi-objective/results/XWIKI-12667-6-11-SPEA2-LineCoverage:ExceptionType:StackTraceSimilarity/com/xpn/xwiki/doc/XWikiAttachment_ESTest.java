/*

 * Mon Apr 20 13:24:44 UTC 2020
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
      XWikiAttachment xWikiAttachment0 = new XWikiAttachment();
      XWikiDocument xWikiDocument0 = mock(XWikiDocument.class, new ViolatedAssumptionAnswer());
      doReturn((DocumentReference) null).when(xWikiDocument0).getDocumentReference();
      xWikiAttachment0.setDoc(xWikiDocument0);
      xWikiAttachment0.getAttachment_content();
      xWikiAttachment0.getRCSVersion();
      XWikiDocument xWikiDocument1 = mock(XWikiDocument.class, new ViolatedAssumptionAnswer());
      XWikiContext xWikiContext0 = null;
      XWikiAttachment xWikiAttachment1 = new XWikiAttachment(xWikiDocument1, "._[G7*");
      xWikiAttachment1.getVersion();
      // Undeclared exception!
      xWikiAttachment0.getMimeType((XWikiContext) null);
  }
}
