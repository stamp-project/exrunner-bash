/*

 * Mon Apr 20 19:12:10 UTC 2020
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
import org.xwiki.bridge.DocumentAccessBridge;
import org.xwiki.component.embed.EmbeddableComponentManager;
import org.xwiki.component.internal.ContextComponentManager;
import org.xwiki.component.internal.ContextRootComponentManager;
import org.xwiki.component.internal.SpaceComponentManager;
import org.xwiki.component.internal.UserComponentManager;
import org.xwiki.component.internal.WikiComponentManager;
import org.xwiki.context.Execution;
import org.xwiki.model.reference.EntityReferenceSerializer;
import org.xwiki.rendering.block.XDOM;
import org.xwiki.rendering.internal.parser.DefaultContentParser;
import org.xwiki.rendering.internal.parser.creole.CreoleParser;
import org.xwiki.rendering.syntax.Syntax;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DefaultContentParser_ESTest extends DefaultContentParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultContentParser defaultContentParser0 = new DefaultContentParser();
      UserComponentManager userComponentManager0 = new UserComponentManager();
      DocumentAccessBridge documentAccessBridge0 = mock(DocumentAccessBridge.class, new ViolatedAssumptionAnswer());
      Injector.inject(userComponentManager0, (Class<?>) UserComponentManager.class, "documentAccessBridge", (Object) documentAccessBridge0);
      ContextRootComponentManager contextRootComponentManager0 = new ContextRootComponentManager();
      SpaceComponentManager spaceComponentManager0 = new SpaceComponentManager();
      Provider<CreoleParser> provider0 = (Provider<CreoleParser>) mock(Provider.class, new ViolatedAssumptionAnswer());
      Injector.inject(spaceComponentManager0, (Class<?>) SpaceComponentManager.class, "referenceProvider", (Object) provider0);
      WikiComponentManager wikiComponentManager0 = new WikiComponentManager();
      ContextComponentManager contextComponentManager0 = new ContextComponentManager();
      Execution execution0 = mock(Execution.class, new ViolatedAssumptionAnswer());
      Injector.inject(contextComponentManager0, (Class<?>) ContextComponentManager.class, "execution", (Object) execution0);
      EmbeddableComponentManager embeddableComponentManager0 = new EmbeddableComponentManager();
      Injector.inject(contextComponentManager0, (Class<?>) ContextComponentManager.class, "rootComponentManager", (Object) embeddableComponentManager0);
      Provider<UserComponentManager> provider1 = (Provider<UserComponentManager>) mock(Provider.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(provider1).get();
      Injector.inject(defaultContentParser0, (Class<?>) DefaultContentParser.class, "componentManagerProvider", (Object) provider1);
      EntityReferenceSerializer<XDOM> entityReferenceSerializer0 = (EntityReferenceSerializer<XDOM>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultContentParser0, (Class<?>) DefaultContentParser.class, "serializer", (Object) entityReferenceSerializer0);
      Injector.validateBean(defaultContentParser0, (Class<?>) DefaultContentParser.class);
      String string0 = "";
      Syntax syntax0 = mock(Syntax.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(syntax0).toIdString();
      // Undeclared exception!
      defaultContentParser0.parse("", syntax0);
  }
}
