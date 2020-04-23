/*

 * Mon Apr 20 20:56:38 UTC 2020
 */

package com.xpn.xwiki.doc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.doc.XWikiDocument;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.suigeneris.jrcs.diff.Revision;
import org.suigeneris.jrcs.diff.delta.Delta;
import org.xwiki.model.reference.DocumentReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XWikiDocument_ESTest extends XWikiDocument_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Locale locale0 = null;
      DocumentReference documentReference0 = mock(DocumentReference.class, new ViolatedAssumptionAnswer());
      doReturn((Locale) null).when(documentReference0).getLocale();
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      Locale locale1 = Locale.getDefault(locale_Category0);
      XWikiDocument xWikiDocument0 = new XWikiDocument(documentReference0, locale1);
      String string0 = "";
      Delta delta0 = null;
      Revision revision0 = mock(Revision.class, new ViolatedAssumptionAnswer());
      doReturn((Delta) null, (Delta) null, (Delta) null, (Delta) null).when(revision0).getDelta(anyInt());
      doReturn(2166, 2166, 2166, 2166, (-4524)).when(revision0).size();
      xWikiDocument0.getDeltas(revision0);
      XWikiContext xWikiContext0 = new XWikiContext();
      XWikiContext xWikiContext1 = xWikiContext0.clone();
      XWikiContext xWikiContext2 = xWikiContext1.clone();
      // Undeclared exception!
      xWikiDocument0.getTranslationList(xWikiContext2);
  }
}
