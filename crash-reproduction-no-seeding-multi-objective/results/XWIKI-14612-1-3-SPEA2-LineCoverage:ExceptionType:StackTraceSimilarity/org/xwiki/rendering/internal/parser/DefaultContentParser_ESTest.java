/*

 * Mon Apr 20 19:08:43 UTC 2020
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
import org.xwiki.bridge.DocumentAccessBridge;
import org.xwiki.component.embed.EmbeddableComponentManager;
import org.xwiki.component.internal.ContextComponentManager;
import org.xwiki.component.internal.UserComponentManager;
import org.xwiki.context.Execution;
import org.xwiki.context.ExecutionContext;
import org.xwiki.rendering.internal.parser.DefaultContentParser;
import org.xwiki.rendering.syntax.Syntax;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DefaultContentParser_ESTest extends DefaultContentParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultContentParser defaultContentParser0 = new DefaultContentParser();
      ContextComponentManager contextComponentManager0 = new ContextComponentManager();
      ExecutionContext executionContext0 = new ExecutionContext();
      Execution execution0 = mock(Execution.class, new ViolatedAssumptionAnswer());
      doReturn(executionContext0).when(execution0).getContext();
      Injector.inject(contextComponentManager0, (Class<?>) ContextComponentManager.class, "execution", (Object) execution0);
      EmbeddableComponentManager embeddableComponentManager0 = new EmbeddableComponentManager();
      Injector.inject(contextComponentManager0, (Class<?>) ContextComponentManager.class, "rootComponentManager", (Object) embeddableComponentManager0);
      UserComponentManager userComponentManager0 = new UserComponentManager();
      DocumentAccessBridge documentAccessBridge0 = mock(DocumentAccessBridge.class, new ViolatedAssumptionAnswer());
      Injector.inject(userComponentManager0, (Class<?>) UserComponentManager.class, "documentAccessBridge", (Object) documentAccessBridge0);
      contextComponentManager0.getComponentManager();
      Syntax syntax0 = Syntax.MARKDOWN_1_0;
      // Undeclared exception!
      defaultContentParser0.parse("", syntax0);
  }
}
