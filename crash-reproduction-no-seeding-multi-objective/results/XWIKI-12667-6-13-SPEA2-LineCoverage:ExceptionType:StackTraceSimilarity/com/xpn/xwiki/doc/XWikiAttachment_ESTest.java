/*

 * Mon Apr 20 13:27:00 UTC 2020
 */

package com.xpn.xwiki.doc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.doc.XWikiAttachment;
import com.xpn.xwiki.doc.XWikiDocument;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xwiki.model.reference.DocumentReference;
import org.xwiki.wiki.descriptor.WikiDescriptor;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XWikiAttachment_ESTest extends XWikiAttachment_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "Ttt&>s";
      WikiDescriptor wikiDescriptor0 = new WikiDescriptor("Ttt&>s", "Ttt&>s");
      DocumentReference documentReference0 = new DocumentReference("Ttt&>s", "Ttt&>s", "Ttt&>s", "Ttt&>s");
      XWikiDocument xWikiDocument0 = new XWikiDocument(documentReference0);
      XWikiAttachment xWikiAttachment0 = new XWikiAttachment(xWikiDocument0, (String) null);
      XWikiContext xWikiContext0 = null;
      // Undeclared exception!
      xWikiAttachment0.getMimeType((XWikiContext) null);
  }
}
