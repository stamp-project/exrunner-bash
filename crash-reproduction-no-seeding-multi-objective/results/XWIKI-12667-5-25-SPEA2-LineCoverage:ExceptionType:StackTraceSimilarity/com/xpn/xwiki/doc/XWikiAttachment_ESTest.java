/*

 * Mon Apr 20 13:39:05 UTC 2020
 */

package com.xpn.xwiki.doc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.doc.XWikiAttachment;
import com.xpn.xwiki.doc.XWikiDocument;
import com.xpn.xwiki.internal.ReadOnlyXWikiContextProvider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.xwiki.context.Execution;
import org.xwiki.context.ExecutionContext;
import org.xwiki.model.reference.DocumentReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XWikiAttachment_ESTest extends XWikiAttachment_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XWikiDocument xWikiDocument0 = mock(XWikiDocument.class, new ViolatedAssumptionAnswer());
      doReturn((DocumentReference) null).when(xWikiDocument0).getDocumentReference();
      String string0 = "";
      XWikiAttachment xWikiAttachment0 = new XWikiAttachment(xWikiDocument0, "");
      XWikiDocument xWikiDocument1 = mock(XWikiDocument.class, new ViolatedAssumptionAnswer());
      XWikiAttachment xWikiAttachment1 = new XWikiAttachment(xWikiDocument1, "");
      xWikiAttachment1.apply(xWikiAttachment0);
      ReadOnlyXWikiContextProvider readOnlyXWikiContextProvider0 = new ReadOnlyXWikiContextProvider();
      Execution execution0 = mock(Execution.class, new ViolatedAssumptionAnswer());
      doReturn((ExecutionContext) null).when(execution0).getContext();
      Injector.inject(readOnlyXWikiContextProvider0, (Class<?>) ReadOnlyXWikiContextProvider.class, "execution", (Object) execution0);
      Injector.validateBean(readOnlyXWikiContextProvider0, (Class<?>) ReadOnlyXWikiContextProvider.class);
      readOnlyXWikiContextProvider0.get();
      // Undeclared exception!
      xWikiAttachment0.getMimeType((XWikiContext) null);
  }
}
