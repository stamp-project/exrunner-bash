/*

 * Mon Apr 20 21:03:50 UTC 2020
 */

package com.xpn.xwiki.doc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.doc.XWikiAttachment;
import com.xpn.xwiki.doc.XWikiDocument;
import com.xpn.xwiki.web.XWikiServletResponse;
import com.xpn.xwiki.web.XWikiServletResponseStub;
import java.io.OutputStream;
import java.util.Locale;
import javax.servlet.http.HttpServletResponseWrapper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.model.reference.DocumentReference;
import org.xwiki.model.reference.EntityReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XWikiDocument_ESTest extends XWikiDocument_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XWikiServletResponseStub xWikiServletResponseStub0 = new XWikiServletResponseStub();
      XWikiServletResponse xWikiServletResponse0 = new XWikiServletResponse(xWikiServletResponseStub0);
      xWikiServletResponseStub0.setOutpuStream((OutputStream) null);
      HttpServletResponseWrapper httpServletResponseWrapper0 = new HttpServletResponseWrapper(xWikiServletResponse0);
      httpServletResponseWrapper0.getLocale();
      DocumentReference documentReference0 = mock(DocumentReference.class, new ViolatedAssumptionAnswer());
      doReturn((Locale) null).when(documentReference0).getLocale();
      doReturn((String) null, (String) null).when(documentReference0).toString();
      doReturn((String) null).when(documentReference0).getName();
      XWikiAttachment xWikiAttachment0 = mock(XWikiAttachment.class, new ViolatedAssumptionAnswer());
      XWikiDocument xWikiDocument0 = new XWikiDocument(documentReference0);
      xWikiDocument0.getCreationDate();
      XWikiContext xWikiContext0 = new XWikiContext();
      xWikiDocument0.getDisplayTitle((XWikiContext) null);
      xWikiContext0.getAuthorReference();
      xWikiDocument0.getXObject((EntityReference) null, true, xWikiContext0);
      xWikiDocument0.getParent();
      // Undeclared exception!
      xWikiDocument0.getTranslationList(xWikiContext0);
  }
}
