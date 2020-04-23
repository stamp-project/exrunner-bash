/*

 * Mon Apr 20 19:09:12 UTC 2020
 */

package org.xwiki.rendering.internal.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import javax.inject.Provider;
import org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.xwiki.bridge.DocumentAccessBridge;
import org.xwiki.component.descriptor.DefaultComponentDescriptor;
import org.xwiki.component.embed.EmbeddableComponentManager;
import org.xwiki.component.internal.AbstractEntityComponentManager;
import org.xwiki.component.internal.DocumentComponentManager;
import org.xwiki.component.internal.SpaceComponentManager;
import org.xwiki.component.internal.UserComponentManager;
import org.xwiki.component.internal.WikiComponentManager;
import org.xwiki.component.internal.multi.AbstractGenericComponentManager;
import org.xwiki.component.internal.multi.ComponentManagerManager;
import org.xwiki.context.Execution;
import org.xwiki.model.reference.EntityReferenceSerializer;
import org.xwiki.rendering.block.IdBlock;
import org.xwiki.rendering.internal.parser.DefaultContentParser;
import org.xwiki.rendering.internal.parser.docbook.DocBookParser;
import org.xwiki.rendering.internal.parser.html.HTMLParser;
import org.xwiki.rendering.internal.parser.pygments.PygmentsParser;
import org.xwiki.rendering.internal.parser.xwiki21.XWiki21Parser;
import org.xwiki.rendering.syntax.Syntax;
import org.xwiki.wiki.descriptor.WikiDescriptorManager;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DefaultContentParser_ESTest extends DefaultContentParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultContentParser defaultContentParser0 = new DefaultContentParser();
      SpaceComponentManager spaceComponentManager0 = new SpaceComponentManager();
      Provider<Object> provider0 = (Provider<Object>) mock(Provider.class, new ViolatedAssumptionAnswer());
      Injector.inject(spaceComponentManager0, (Class<?>) SpaceComponentManager.class, "referenceProvider", (Object) provider0);
      DefaultComponentDescriptor<WikiComponentManager> defaultComponentDescriptor0 = new DefaultComponentDescriptor<WikiComponentManager>();
      DefaultComponentDescriptor<WikiComponentManager> defaultComponentDescriptor1 = new DefaultComponentDescriptor<WikiComponentManager>(defaultComponentDescriptor0);
      Execution execution0 = mock(Execution.class, new ViolatedAssumptionAnswer());
      EmbeddableComponentManager embeddableComponentManager0 = new EmbeddableComponentManager();
      EmbeddableComponentManager embeddableComponentManager1 = new EmbeddableComponentManager("@it");
      DocumentAccessBridge documentAccessBridge0 = mock(DocumentAccessBridge.class, new ViolatedAssumptionAnswer());
      Provider<SpaceComponentManager> provider1 = (Provider<SpaceComponentManager>) mock(Provider.class, new ViolatedAssumptionAnswer());
      SpaceComponentManager spaceComponentManager1 = new SpaceComponentManager();
      Provider<PDTransitionStyle> provider2 = (Provider<PDTransitionStyle>) mock(Provider.class, new ViolatedAssumptionAnswer());
      Injector.inject(spaceComponentManager1, (Class<?>) SpaceComponentManager.class, "referenceProvider", (Object) provider2);
      UserComponentManager userComponentManager0 = new UserComponentManager();
      Injector.inject(spaceComponentManager1, (Class<?>) SpaceComponentManager.class, "wikiComponentManager", (Object) userComponentManager0);
      Execution execution1 = mock(Execution.class, new ViolatedAssumptionAnswer());
      Injector.inject(spaceComponentManager1, (Class<?>) AbstractEntityComponentManager.class, "execution", (Object) execution1);
      EntityReferenceSerializer<DocBookParser> entityReferenceSerializer0 = (EntityReferenceSerializer<DocBookParser>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      Injector.inject(spaceComponentManager1, (Class<?>) AbstractEntityComponentManager.class, "serializer", (Object) entityReferenceSerializer0);
      ComponentManagerManager componentManagerManager0 = mock(ComponentManagerManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(spaceComponentManager1, (Class<?>) AbstractGenericComponentManager.class, "componentManagerManager", (Object) componentManagerManager0);
      Injector.validateBean(spaceComponentManager1, (Class<?>) SpaceComponentManager.class);
      EntityReferenceSerializer<IdBlock> entityReferenceSerializer1 = (EntityReferenceSerializer<IdBlock>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      ComponentManagerManager componentManagerManager1 = mock(ComponentManagerManager.class, new ViolatedAssumptionAnswer());
      EntityReferenceSerializer<PygmentsParser> entityReferenceSerializer2 = (EntityReferenceSerializer<PygmentsParser>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      Execution execution2 = mock(Execution.class, new ViolatedAssumptionAnswer());
      EntityReferenceSerializer<HTMLParser> entityReferenceSerializer3 = (EntityReferenceSerializer<HTMLParser>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      ComponentManagerManager componentManagerManager2 = mock(ComponentManagerManager.class, new ViolatedAssumptionAnswer());
      EmbeddableComponentManager embeddableComponentManager2 = new EmbeddableComponentManager();
      WikiDescriptorManager wikiDescriptorManager0 = mock(WikiDescriptorManager.class, new ViolatedAssumptionAnswer());
      Execution execution3 = mock(Execution.class, new ViolatedAssumptionAnswer());
      EntityReferenceSerializer<XWiki21Parser> entityReferenceSerializer4 = (EntityReferenceSerializer<XWiki21Parser>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      ComponentManagerManager componentManagerManager3 = mock(ComponentManagerManager.class, new ViolatedAssumptionAnswer());
      DocumentComponentManager documentComponentManager0 = new DocumentComponentManager();
      Syntax syntax0 = Syntax.EVENT_1_0;
      // Undeclared exception!
      defaultContentParser0.parse("", syntax0);
  }
}
