/*

 * Mon Apr 20 19:19:58 UTC 2020
 */

package org.xwiki.rendering.internal.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import javax.inject.Provider;
import org.apache.commons.dbcp2.PoolableConnection;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.xwiki.component.internal.UserComponentManager;
import org.xwiki.model.reference.EntityReferenceSerializer;
import org.xwiki.rendering.internal.parser.DefaultContentParser;
import org.xwiki.rendering.internal.parser.pygments.PygmentsParser;
import org.xwiki.rendering.syntax.Syntax;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DefaultContentParser_ESTest extends DefaultContentParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultContentParser defaultContentParser0 = new DefaultContentParser();
      Provider<PoolableConnection> provider0 = (Provider<PoolableConnection>) mock(Provider.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultContentParser0, (Class<?>) DefaultContentParser.class, "componentManagerProvider", (Object) provider0);
      EntityReferenceSerializer<UserComponentManager> entityReferenceSerializer0 = (EntityReferenceSerializer<UserComponentManager>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultContentParser0, (Class<?>) DefaultContentParser.class, "serializer", (Object) entityReferenceSerializer0);
      Injector.validateBean(defaultContentParser0, (Class<?>) DefaultContentParser.class);
      Syntax syntax0 = Syntax.MARKDOWN_1_1;
      DefaultContentParser defaultContentParser1 = new DefaultContentParser();
      Provider<PygmentsParser> provider1 = (Provider<PygmentsParser>) mock(Provider.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(provider1).get();
      Injector.inject(defaultContentParser1, (Class<?>) DefaultContentParser.class, "componentManagerProvider", (Object) provider1);
      EntityReferenceSerializer<UserComponentManager> entityReferenceSerializer1 = (EntityReferenceSerializer<UserComponentManager>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultContentParser1, (Class<?>) DefaultContentParser.class, "serializer", (Object) entityReferenceSerializer1);
      Injector.validateBean(defaultContentParser1, (Class<?>) DefaultContentParser.class);
      // Undeclared exception!
      defaultContentParser1.parse("xoSc2B-G=%", syntax0);
  }
}
