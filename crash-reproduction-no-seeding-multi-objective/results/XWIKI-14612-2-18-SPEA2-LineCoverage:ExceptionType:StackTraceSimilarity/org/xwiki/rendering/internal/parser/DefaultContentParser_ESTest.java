/*

 * Mon Apr 20 19:15:40 UTC 2020
 */

package org.xwiki.rendering.internal.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.xwiki.bridge.DocumentAccessBridge;
import org.xwiki.component.internal.DocumentComponentManager;
import org.xwiki.component.internal.UserComponentManager;
import org.xwiki.model.reference.EntityReference;
import org.xwiki.rendering.internal.parser.DefaultContentParser;
import org.xwiki.rendering.internal.parser.confluence.ConfluenceParser;
import org.xwiki.rendering.internal.parser.docbook.DocBookParser;
import org.xwiki.rendering.internal.parser.html.HTMLParser;
import org.xwiki.rendering.syntax.Syntax;
import org.xwiki.xml.html.HTMLCleaner;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DefaultContentParser_ESTest extends DefaultContentParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultContentParser defaultContentParser0 = new DefaultContentParser();
      DocBookParser docBookParser0 = new DocBookParser();
      ConfluenceParser confluenceParser0 = new ConfluenceParser();
      HTMLParser hTMLParser0 = new HTMLParser();
      HTMLCleaner hTMLCleaner0 = mock(HTMLCleaner.class, new ViolatedAssumptionAnswer());
      Injector.inject(hTMLParser0, (Class<?>) HTMLParser.class, "htmlCleaner", (Object) hTMLCleaner0);
      UserComponentManager userComponentManager0 = new UserComponentManager();
      DocumentAccessBridge documentAccessBridge0 = mock(DocumentAccessBridge.class, new ViolatedAssumptionAnswer());
      Injector.inject(userComponentManager0, (Class<?>) UserComponentManager.class, "documentAccessBridge", (Object) documentAccessBridge0);
      DocumentComponentManager documentComponentManager0 = new DocumentComponentManager();
      String string0 = " n&3|<Gsp";
      Syntax syntax0 = null;
      // Undeclared exception!
      defaultContentParser0.parse(" n&3|<Gsp", (Syntax) null, (EntityReference) null);
  }
}
