/*

 * Mon Apr 20 13:28:56 UTC 2020
 */

package com.xpn.xwiki.doc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.doc.XWikiAttachment;
import com.xpn.xwiki.doc.XWikiDocument;
import com.xpn.xwiki.internal.XWikiContextProvider;
import com.xpn.xwiki.util.XWikiStubContextProvider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.xwiki.context.Execution;
import org.xwiki.context.ExecutionContext;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XWikiAttachment_ESTest extends XWikiAttachment_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XWikiDocument xWikiDocument0 = mock(XWikiDocument.class, new ViolatedAssumptionAnswer());
      String string0 = null;
      XWikiAttachment xWikiAttachment0 = new XWikiAttachment(xWikiDocument0, (String) null);
      XWikiContextProvider xWikiContextProvider0 = new XWikiContextProvider();
      XWikiStubContextProvider xWikiStubContextProvider0 = mock(XWikiStubContextProvider.class, new ViolatedAssumptionAnswer());
      Injector.inject(xWikiContextProvider0, (Class<?>) XWikiContextProvider.class, "contextProvider", (Object) xWikiStubContextProvider0);
      ExecutionContext executionContext0 = new ExecutionContext();
      Execution execution0 = mock(Execution.class, new ViolatedAssumptionAnswer());
      doReturn(executionContext0, (ExecutionContext) null).when(execution0).getContext();
      Injector.inject(xWikiContextProvider0, (Class<?>) XWikiContextProvider.class, "execution", (Object) execution0);
      Injector.validateBean(xWikiContextProvider0, (Class<?>) XWikiContextProvider.class);
      // Undeclared exception!
      xWikiContextProvider0.get();
  }
}
