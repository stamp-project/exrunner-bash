/*

 * Mon Apr 20 13:44:12 UTC 2020
 */

package com.xpn.xwiki.doc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.doc.XWikiAttachment;
import com.xpn.xwiki.doc.XWikiDocument;
import com.xpn.xwiki.internal.XWikiContextProvider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.model.reference.DocumentReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XWikiAttachment_ESTest extends XWikiAttachment_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "\\wdFu}KsvM4qsi1fjHQ";
      DocumentReference documentReference0 = new DocumentReference("{xx>{1Tuv5W''sPEC", "!,#XF&m#C=a|xP]gE@", "wdFu}KsvM4qsi1fjHQ");
      XWikiDocument xWikiDocument0 = mock(XWikiDocument.class, new ViolatedAssumptionAnswer());
      doReturn(documentReference0, documentReference0).when(xWikiDocument0).getDocumentReference();
      XWikiAttachment xWikiAttachment0 = new XWikiAttachment(xWikiDocument0, "");
      xWikiAttachment0.setFilesize(799);
      XWikiContextProvider xWikiContextProvider0 = new XWikiContextProvider();
      xWikiAttachment0.incrementVersion();
      xWikiAttachment0.getAttachment_archive();
      XWikiContext xWikiContext0 = new XWikiContext();
      xWikiContext0.clone();
      // Undeclared exception!
      xWikiAttachment0.getMimeType(xWikiContext0);
  }
}
