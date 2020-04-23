/*

 * Mon Apr 20 19:16:35 UTC 2020
 */

package org.xwiki.rendering.internal.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.doc.XWikiDocument;
import java.util.concurrent.ConcurrentSkipListMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.xwiki.component.embed.EmbeddableComponentManager;
import org.xwiki.component.internal.ContextComponentManager;
import org.xwiki.component.internal.RootComponentManager;
import org.xwiki.context.Execution;
import org.xwiki.model.reference.EntityReference;
import org.xwiki.model.reference.LocalDocumentReference;
import org.xwiki.rendering.internal.parser.DefaultContentParser;
import org.xwiki.rendering.internal.parser.html.HTMLParser;
import org.xwiki.rendering.listener.WrappingListener;
import org.xwiki.rendering.syntax.Syntax;
import org.xwiki.rendering.util.IdGenerator;
import org.xwiki.xml.html.HTMLCleaner;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DefaultContentParser_ESTest extends DefaultContentParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultContentParser defaultContentParser0 = new DefaultContentParser();
      HTMLParser hTMLParser0 = new HTMLParser();
      HTMLCleaner hTMLCleaner0 = mock(HTMLCleaner.class, new ViolatedAssumptionAnswer());
      Injector.inject(hTMLParser0, (Class<?>) HTMLParser.class, "htmlCleaner", (Object) hTMLCleaner0);
      IdGenerator idGenerator0 = new IdGenerator();
      WrappingListener wrappingListener0 = new WrappingListener();
      ConcurrentSkipListMap<String, String> concurrentSkipListMap0 = new ConcurrentSkipListMap<String, String>();
      wrappingListener0.beginTable(concurrentSkipListMap0);
      IdGenerator idGenerator1 = new IdGenerator();
      hTMLParser0.createXWikiGeneratorListener(wrappingListener0, idGenerator1);
      ContextComponentManager contextComponentManager0 = new ContextComponentManager();
      Execution execution0 = mock(Execution.class, new ViolatedAssumptionAnswer());
      Injector.inject(contextComponentManager0, (Class<?>) ContextComponentManager.class, "execution", (Object) execution0);
      RootComponentManager rootComponentManager0 = new RootComponentManager();
      EmbeddableComponentManager embeddableComponentManager0 = new EmbeddableComponentManager();
      Syntax syntax0 = Syntax.JSPWIKI_1_0;
      LocalDocumentReference localDocumentReference0 = (LocalDocumentReference)XWikiDocument.COMMENTSCLASS_REFERENCE;
      // Undeclared exception!
      defaultContentParser0.parse("", syntax0, (EntityReference) localDocumentReference0);
  }
}
