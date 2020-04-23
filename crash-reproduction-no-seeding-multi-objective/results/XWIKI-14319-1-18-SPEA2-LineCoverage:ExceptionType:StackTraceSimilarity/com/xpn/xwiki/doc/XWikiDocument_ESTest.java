/*

 * Mon Apr 20 20:58:31 UTC 2020
 */

package com.xpn.xwiki.doc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.doc.XWikiAttachment;
import com.xpn.xwiki.doc.XWikiDocument;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.model.reference.DocumentReference;
import org.xwiki.model.reference.SpaceReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XWikiDocument_ESTest extends XWikiDocument_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "LastModified";
      stringArray0[1] = "LastModified";
      stringArray0[2] = "LastModified";
      stringArray0[3] = "LastModified";
      stringArray0[4] = "LastModified";
      stringArray0[5] = "LastModified";
      stringArray0[6] = "LastModified";
      stringArray0[7] = "LastModified";
      SpaceReference spaceReference0 = new SpaceReference("LastModified", stringArray0);
      DocumentReference documentReference0 = mock(DocumentReference.class, new ViolatedAssumptionAnswer());
      doReturn((Locale) null).when(documentReference0).getLocale();
      XWikiDocument xWikiDocument0 = new XWikiDocument(documentReference0);
      XWikiAttachment xWikiAttachment0 = mock(XWikiAttachment.class, new ViolatedAssumptionAnswer());
      xWikiDocument0.removeAttachment(xWikiAttachment0, false);
      String string0 = XWikiDocument.SPACE_NAME_SEP;
      XWikiContext xWikiContext0 = new XWikiContext();
      // Undeclared exception!
      xWikiDocument0.getTranslationList(xWikiContext0);
  }
}
