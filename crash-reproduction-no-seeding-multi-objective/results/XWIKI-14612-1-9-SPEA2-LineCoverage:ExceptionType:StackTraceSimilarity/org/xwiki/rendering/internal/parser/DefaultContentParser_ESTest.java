/*

 * Mon Apr 20 19:12:00 UTC 2020
 */

package org.xwiki.rendering.internal.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import javax.inject.Provider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.xwiki.component.embed.EmbeddableComponentManager;
import org.xwiki.context.Execution;
import org.xwiki.filter.xml.serializer.XMLSerializerFactory;
import org.xwiki.rendering.internal.parser.DefaultContentParser;
import org.xwiki.rendering.internal.parser.confluence.ConfluenceParser;
import org.xwiki.rendering.internal.parser.creole.CreoleParser;
import org.xwiki.rendering.internal.parser.html.HTMLParser;
import org.xwiki.rendering.internal.parser.jspwiki.JSPWikiParser;
import org.xwiki.rendering.internal.parser.twiki.TWikiParser;
import org.xwiki.rendering.syntax.Syntax;
import org.xwiki.xml.html.HTMLCleaner;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DefaultContentParser_ESTest extends DefaultContentParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultContentParser defaultContentParser0 = new DefaultContentParser();
      TWikiParser tWikiParser0 = new TWikiParser();
      ConfluenceParser confluenceParser0 = new ConfluenceParser();
      JSPWikiParser jSPWikiParser0 = new JSPWikiParser();
      HTMLParser hTMLParser0 = new HTMLParser();
      HTMLCleaner hTMLCleaner0 = mock(HTMLCleaner.class, new ViolatedAssumptionAnswer());
      Injector.inject(hTMLParser0, (Class<?>) HTMLParser.class, "htmlCleaner", (Object) hTMLCleaner0);
      Execution execution0 = mock(Execution.class, new ViolatedAssumptionAnswer());
      EmbeddableComponentManager embeddableComponentManager0 = new EmbeddableComponentManager();
      EmbeddableComponentManager embeddableComponentManager1 = new EmbeddableComponentManager();
      String string0 = null;
      confluenceParser0.getLinkReferenceParser();
      hTMLParser0.getLinkLabelParser();
      XMLSerializerFactory xMLSerializerFactory0 = mock(XMLSerializerFactory.class, new ViolatedAssumptionAnswer());
      Provider<CreoleParser> provider0 = (Provider<CreoleParser>) mock(Provider.class, new ViolatedAssumptionAnswer());
      Execution execution1 = mock(Execution.class, new ViolatedAssumptionAnswer());
      Syntax syntax0 = Syntax.HTML_4_01;
      // Undeclared exception!
      defaultContentParser0.parse("", syntax0);
  }
}
