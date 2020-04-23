/*

 * Mon Apr 20 19:17:33 UTC 2020
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
import org.xwiki.component.internal.WikiComponentManager;
import org.xwiki.model.reference.AttachmentReference;
import org.xwiki.model.reference.EntityReference;
import org.xwiki.model.reference.EntityReferenceSerializer;
import org.xwiki.rendering.internal.parser.DefaultContentParser;
import org.xwiki.rendering.internal.parser.html.HTMLParser;
import org.xwiki.rendering.internal.parser.xwiki21.XWiki21Parser;
import org.xwiki.rendering.syntax.Syntax;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DefaultContentParser_ESTest extends DefaultContentParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultContentParser defaultContentParser0 = new DefaultContentParser();
      Provider<AttachmentReference> provider0 = (Provider<AttachmentReference>) mock(Provider.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultContentParser0, (Class<?>) DefaultContentParser.class, "componentManagerProvider", (Object) provider0);
      EntityReferenceSerializer<WikiComponentManager> entityReferenceSerializer0 = (EntityReferenceSerializer<WikiComponentManager>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultContentParser0, (Class<?>) DefaultContentParser.class, "serializer", (Object) entityReferenceSerializer0);
      Injector.validateBean(defaultContentParser0, (Class<?>) DefaultContentParser.class);
      EntityReference entityReference0 = mock(EntityReference.class, new ViolatedAssumptionAnswer());
      DefaultContentParser defaultContentParser1 = new DefaultContentParser();
      Provider<XWiki21Parser> provider1 = (Provider<XWiki21Parser>) mock(Provider.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(provider1).get();
      Injector.inject(defaultContentParser1, (Class<?>) DefaultContentParser.class, "componentManagerProvider", (Object) provider1);
      EntityReferenceSerializer<HTMLParser> entityReferenceSerializer1 = (EntityReferenceSerializer<HTMLParser>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultContentParser1, (Class<?>) DefaultContentParser.class, "serializer", (Object) entityReferenceSerializer1);
      Injector.validateBean(defaultContentParser1, (Class<?>) DefaultContentParser.class);
      EntityReference entityReference1 = mock(EntityReference.class, new ViolatedAssumptionAnswer());
      Syntax syntax0 = mock(Syntax.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(syntax0).toIdString();
      EntityReference entityReference2 = mock(EntityReference.class, new ViolatedAssumptionAnswer());
      String string0 = "";
      // Undeclared exception!
      defaultContentParser1.parse("", syntax0, entityReference2);
  }
}
