/*

 * Mon Apr 20 13:35:23 UTC 2020
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
import org.suigeneris.jrcs.rcs.Version;
import org.xwiki.model.reference.DocumentReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XWikiAttachment_ESTest extends XWikiAttachment_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XWikiContext xWikiContext0 = new XWikiContext();
      Version version0 = mock(Version.class, new ViolatedAssumptionAnswer());
      XWikiAttachment xWikiAttachment0 = new XWikiAttachment();
      DocumentReference documentReference0 = new DocumentReference(";#P|U5B", "@F,", ";#P|U5B", "si}N");
      XWikiDocument xWikiDocument0 = mock(XWikiDocument.class, new ViolatedAssumptionAnswer());
      doReturn(documentReference0, documentReference0).when(xWikiDocument0).getDocumentReference();
      xWikiAttachment0.setDoc(xWikiDocument0);
      XWikiContext xWikiContext1 = xWikiContext0.clone();
      // Undeclared exception!
      xWikiAttachment0.getMimeType(xWikiContext1);
  }
}
