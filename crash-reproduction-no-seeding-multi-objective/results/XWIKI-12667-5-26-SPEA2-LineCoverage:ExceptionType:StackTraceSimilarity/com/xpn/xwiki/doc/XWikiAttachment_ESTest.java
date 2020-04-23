/*

 * Mon Apr 20 13:40:45 UTC 2020
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
import com.xpn.xwiki.util.XWikiStubContextProvider;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.xwiki.context.Execution;
import org.xwiki.model.reference.DocumentReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XWikiAttachment_ESTest extends XWikiAttachment_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte)50;
      byteArray0[3] = (byte) (-1);
      byteArray0[4] = (byte)1;
      byteArray0[6] = (byte) (-41);
      DocumentReference documentReference0 = new DocumentReference("+:te|", "j-J", "Before", "s(SsuAAw8(trsqg");
      XWikiContextProvider xWikiContextProvider0 = new XWikiContextProvider();
      XWikiStubContextProvider xWikiStubContextProvider0 = mock(XWikiStubContextProvider.class, new ViolatedAssumptionAnswer());
      Injector.inject(xWikiContextProvider0, (Class<?>) XWikiContextProvider.class, "contextProvider", (Object) xWikiStubContextProvider0);
      Execution execution0 = mock(Execution.class, new ViolatedAssumptionAnswer());
      Injector.inject(xWikiContextProvider0, (Class<?>) XWikiContextProvider.class, "execution", (Object) execution0);
      Locale locale0 = Locale.PRC;
      DocumentReference documentReference1 = new DocumentReference(documentReference0);
      Locale locale1 = Locale.TRADITIONAL_CHINESE;
      XWikiDocument xWikiDocument0 = new XWikiDocument(documentReference1, locale1);
      XWikiAttachment xWikiAttachment0 = new XWikiAttachment(xWikiDocument0, (String) null);
      xWikiAttachment0.getAuthor();
      // Undeclared exception!
      xWikiAttachment0.getMimeType((XWikiContext) null);
  }
}
