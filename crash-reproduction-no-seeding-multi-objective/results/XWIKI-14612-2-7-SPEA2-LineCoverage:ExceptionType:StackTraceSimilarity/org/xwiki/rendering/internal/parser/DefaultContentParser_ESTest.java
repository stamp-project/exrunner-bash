/*

 * Mon Apr 20 19:11:08 UTC 2020
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
import org.xwiki.component.internal.SpaceComponentManager;
import org.xwiki.model.reference.EntityReference;
import org.xwiki.model.reference.EntityReferenceSerializer;
import org.xwiki.rendering.internal.parser.DefaultContentParser;
import org.xwiki.rendering.internal.parser.creole.CreoleParser;
import org.xwiki.rendering.internal.parser.html.HTMLParser;
import org.xwiki.rendering.syntax.Syntax;
import org.xwiki.xml.html.HTMLCleaner;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DefaultContentParser_ESTest extends DefaultContentParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultContentParser defaultContentParser0 = new DefaultContentParser();
      Provider<Object> provider0 = (Provider<Object>) mock(Provider.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultContentParser0, (Class<?>) DefaultContentParser.class, "componentManagerProvider", (Object) provider0);
      EntityReferenceSerializer<CreoleParser> entityReferenceSerializer0 = (EntityReferenceSerializer<CreoleParser>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultContentParser0, (Class<?>) DefaultContentParser.class, "serializer", (Object) entityReferenceSerializer0);
      Injector.validateBean(defaultContentParser0, (Class<?>) DefaultContentParser.class);
      DefaultContentParser defaultContentParser1 = new DefaultContentParser();
      HTMLParser hTMLParser0 = new HTMLParser();
      HTMLCleaner hTMLCleaner0 = mock(HTMLCleaner.class, new ViolatedAssumptionAnswer());
      Injector.inject(hTMLParser0, (Class<?>) HTMLParser.class, "htmlCleaner", (Object) hTMLCleaner0);
      SpaceComponentManager spaceComponentManager0 = new SpaceComponentManager();
      Provider<EmbeddableComponentManager> provider1 = (Provider<EmbeddableComponentManager>) mock(Provider.class, new ViolatedAssumptionAnswer());
      Injector.inject(spaceComponentManager0, (Class<?>) SpaceComponentManager.class, "referenceProvider", (Object) provider1);
      Provider<HTMLParser> provider2 = (Provider<HTMLParser>) mock(Provider.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(provider2).get();
      Injector.inject(defaultContentParser1, (Class<?>) DefaultContentParser.class, "componentManagerProvider", (Object) provider2);
      EntityReferenceSerializer<String> entityReferenceSerializer1 = (EntityReferenceSerializer<String>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultContentParser1, (Class<?>) DefaultContentParser.class, "serializer", (Object) entityReferenceSerializer1);
      Injector.validateBean(defaultContentParser1, (Class<?>) DefaultContentParser.class);
      Syntax syntax0 = mock(Syntax.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(syntax0).toIdString();
      EntityReference entityReference0 = mock(EntityReference.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      defaultContentParser1.parse("", syntax0, entityReference0);
  }
}
