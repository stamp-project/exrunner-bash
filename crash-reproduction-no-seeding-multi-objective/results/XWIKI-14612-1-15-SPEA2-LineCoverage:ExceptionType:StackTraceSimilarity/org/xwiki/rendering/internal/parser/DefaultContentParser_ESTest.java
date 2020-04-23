/*

 * Mon Apr 20 19:14:13 UTC 2020
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
import org.xwiki.component.internal.WikiComponentManager;
import org.xwiki.context.Execution;
import org.xwiki.rendering.internal.parser.DefaultContentParser;
import org.xwiki.rendering.internal.parser.confluence.ConfluenceParser;
import org.xwiki.rendering.internal.parser.creole.CreoleParser;
import org.xwiki.rendering.internal.parser.html.HTMLParser;
import org.xwiki.rendering.internal.parser.xwiki20.XWiki20Parser;
import org.xwiki.rendering.syntax.Syntax;
import org.xwiki.xml.html.HTMLCleaner;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DefaultContentParser_ESTest extends DefaultContentParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultContentParser defaultContentParser0 = new DefaultContentParser();
      XWiki20Parser xWiki20Parser0 = new XWiki20Parser();
      ConfluenceParser confluenceParser0 = new ConfluenceParser();
      CreoleParser creoleParser0 = new CreoleParser();
      confluenceParser0.getImageReferenceParser();
      Injector.inject(creoleParser0, (Class<?>) CreoleParser.class, "imageReferenceParser", (Object) null);
      HTMLParser hTMLParser0 = new HTMLParser();
      HTMLCleaner hTMLCleaner0 = mock(HTMLCleaner.class, new ViolatedAssumptionAnswer());
      Injector.inject(hTMLParser0, (Class<?>) HTMLParser.class, "htmlCleaner", (Object) hTMLCleaner0);
      Execution execution0 = mock(Execution.class, new ViolatedAssumptionAnswer());
      WikiComponentManager wikiComponentManager0 = new WikiComponentManager();
      Syntax syntax0 = Syntax.XWIKI_2_1;
      // Undeclared exception!
      defaultContentParser0.parse("", syntax0);
  }
}
