/*

 * Mon Apr 20 19:19:19 UTC 2020
 */

package org.xwiki.rendering.internal.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import javax.inject.Provider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.xwiki.bridge.DocumentAccessBridge;
import org.xwiki.component.embed.EmbeddableComponentManager;
import org.xwiki.component.internal.AbstractEntityComponentManager;
import org.xwiki.component.internal.DocumentComponentManager;
import org.xwiki.component.internal.RootComponentManager;
import org.xwiki.component.internal.UserComponentManager;
import org.xwiki.component.internal.multi.AbstractGenericComponentManager;
import org.xwiki.component.internal.multi.ComponentManagerManager;
import org.xwiki.context.Execution;
import org.xwiki.model.reference.EntityReference;
import org.xwiki.model.reference.EntityReferenceSerializer;
import org.xwiki.model.reference.WikiReference;
import org.xwiki.rendering.internal.parser.DefaultContentParser;
import org.xwiki.rendering.syntax.Syntax;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DefaultContentParser_ESTest extends DefaultContentParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultContentParser defaultContentParser0 = new DefaultContentParser();
      RootComponentManager rootComponentManager0 = new RootComponentManager();
      UserComponentManager userComponentManager0 = new UserComponentManager();
      DocumentAccessBridge documentAccessBridge0 = mock(DocumentAccessBridge.class, new ViolatedAssumptionAnswer());
      Injector.inject(userComponentManager0, (Class<?>) UserComponentManager.class, "documentAccessBridge", (Object) documentAccessBridge0);
      EmbeddableComponentManager embeddableComponentManager0 = new EmbeddableComponentManager();
      Injector.inject(userComponentManager0, (Class<?>) UserComponentManager.class, "documentComponentManager", (Object) embeddableComponentManager0);
      EntityReferenceSerializer<Object> entityReferenceSerializer0 = (EntityReferenceSerializer<Object>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      Injector.inject(userComponentManager0, (Class<?>) UserComponentManager.class, "referenceSerializer", (Object) entityReferenceSerializer0);
      Execution execution0 = mock(Execution.class, new ViolatedAssumptionAnswer());
      Injector.inject(userComponentManager0, (Class<?>) AbstractEntityComponentManager.class, "execution", (Object) execution0);
      EntityReferenceSerializer<DocumentComponentManager> entityReferenceSerializer1 = (EntityReferenceSerializer<DocumentComponentManager>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      Injector.inject(userComponentManager0, (Class<?>) AbstractEntityComponentManager.class, "serializer", (Object) entityReferenceSerializer1);
      ComponentManagerManager componentManagerManager0 = mock(ComponentManagerManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(userComponentManager0, (Class<?>) AbstractGenericComponentManager.class, "componentManagerManager", (Object) componentManagerManager0);
      Injector.validateBean(userComponentManager0, (Class<?>) UserComponentManager.class);
      Injector.inject(rootComponentManager0, (Class<?>) RootComponentManager.class, "rootComponentManager", (Object) userComponentManager0);
      Injector.validateBean(rootComponentManager0, (Class<?>) RootComponentManager.class);
      Provider<RootComponentManager> provider0 = (Provider<RootComponentManager>) mock(Provider.class, new ViolatedAssumptionAnswer());
      doReturn(rootComponentManager0).when(provider0).get();
      Injector.inject(defaultContentParser0, (Class<?>) DefaultContentParser.class, "componentManagerProvider", (Object) provider0);
      EntityReferenceSerializer<Integer> entityReferenceSerializer2 = (EntityReferenceSerializer<Integer>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultContentParser0, (Class<?>) DefaultContentParser.class, "serializer", (Object) entityReferenceSerializer2);
      Injector.validateBean(defaultContentParser0, (Class<?>) DefaultContentParser.class);
      String string0 = "lKax[qxlN/UMBif";
      Locale locale0 = Locale.CHINA;
      WikiReference wikiReference0 = new WikiReference("lKax[qxlN/UMBif");
      Syntax syntax0 = Syntax.XDOMXML_CURRENT;
      // Undeclared exception!
      defaultContentParser0.parse("\" because: ", syntax0, (EntityReference) wikiReference0);
  }
}
