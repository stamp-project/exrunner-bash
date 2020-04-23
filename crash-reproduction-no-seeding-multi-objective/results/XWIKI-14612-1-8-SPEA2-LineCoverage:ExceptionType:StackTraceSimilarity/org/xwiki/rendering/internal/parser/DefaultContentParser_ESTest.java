/*

 * Mon Apr 20 19:11:15 UTC 2020
 */

package org.xwiki.rendering.internal.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import javax.inject.Provider;
import javax.swing.JLabel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.xwiki.bridge.DocumentAccessBridge;
import org.xwiki.component.embed.EmbeddableComponentManager;
import org.xwiki.component.internal.AbstractEntityComponentManager;
import org.xwiki.component.internal.DocumentComponentManager;
import org.xwiki.component.internal.UserComponentManager;
import org.xwiki.component.internal.WikiComponentManager;
import org.xwiki.component.internal.multi.AbstractGenericComponentManager;
import org.xwiki.component.internal.multi.ComponentManagerManager;
import org.xwiki.context.Execution;
import org.xwiki.model.reference.EntityReferenceSerializer;
import org.xwiki.rendering.internal.parser.DefaultContentParser;
import org.xwiki.rendering.internal.parser.xhtml.XHTMLParser;
import org.xwiki.rendering.syntax.Syntax;
import org.xwiki.rendering.xdomxmlcurrent.internal.parser.XDOMXMLParser;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DefaultContentParser_ESTest extends DefaultContentParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultContentParser defaultContentParser0 = new DefaultContentParser();
      UserComponentManager userComponentManager0 = new UserComponentManager();
      DocumentAccessBridge documentAccessBridge0 = mock(DocumentAccessBridge.class, new ViolatedAssumptionAnswer());
      Injector.inject(userComponentManager0, (Class<?>) UserComponentManager.class, "documentAccessBridge", (Object) documentAccessBridge0);
      EmbeddableComponentManager embeddableComponentManager0 = new EmbeddableComponentManager();
      Injector.inject(userComponentManager0, (Class<?>) UserComponentManager.class, "documentComponentManager", (Object) embeddableComponentManager0);
      EntityReferenceSerializer<XHTMLParser> entityReferenceSerializer0 = (EntityReferenceSerializer<XHTMLParser>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      Injector.inject(userComponentManager0, (Class<?>) UserComponentManager.class, "referenceSerializer", (Object) entityReferenceSerializer0);
      Execution execution0 = mock(Execution.class, new ViolatedAssumptionAnswer());
      Injector.inject(userComponentManager0, (Class<?>) AbstractEntityComponentManager.class, "execution", (Object) execution0);
      EntityReferenceSerializer<JLabel> entityReferenceSerializer1 = (EntityReferenceSerializer<JLabel>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      Injector.inject(userComponentManager0, (Class<?>) AbstractEntityComponentManager.class, "serializer", (Object) entityReferenceSerializer1);
      ComponentManagerManager componentManagerManager0 = mock(ComponentManagerManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(userComponentManager0, (Class<?>) AbstractGenericComponentManager.class, "componentManagerManager", (Object) componentManagerManager0);
      Injector.validateBean(userComponentManager0, (Class<?>) UserComponentManager.class);
      Provider<UserComponentManager> provider0 = (Provider<UserComponentManager>) mock(Provider.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultContentParser0, (Class<?>) DefaultContentParser.class, "componentManagerProvider", (Object) provider0);
      EntityReferenceSerializer<WikiComponentManager> entityReferenceSerializer2 = (EntityReferenceSerializer<WikiComponentManager>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultContentParser0, (Class<?>) DefaultContentParser.class, "serializer", (Object) entityReferenceSerializer2);
      Injector.validateBean(defaultContentParser0, (Class<?>) DefaultContentParser.class);
      DefaultContentParser defaultContentParser1 = new DefaultContentParser();
      Provider<DocumentComponentManager> provider1 = (Provider<DocumentComponentManager>) mock(Provider.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(provider1).get();
      Injector.inject(defaultContentParser1, (Class<?>) DefaultContentParser.class, "componentManagerProvider", (Object) provider1);
      EntityReferenceSerializer<XDOMXMLParser> entityReferenceSerializer3 = (EntityReferenceSerializer<XDOMXMLParser>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultContentParser1, (Class<?>) DefaultContentParser.class, "serializer", (Object) entityReferenceSerializer3);
      Injector.validateBean(defaultContentParser1, (Class<?>) DefaultContentParser.class);
      // Undeclared exception!
      defaultContentParser1.parse((String) null, (Syntax) null);
  }
}
