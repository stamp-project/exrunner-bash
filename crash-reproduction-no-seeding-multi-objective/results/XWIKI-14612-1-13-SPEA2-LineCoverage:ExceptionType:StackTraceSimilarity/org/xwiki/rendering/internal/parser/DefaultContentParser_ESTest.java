/*

 * Mon Apr 20 19:13:24 UTC 2020
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
import org.xwiki.component.internal.RootComponentManager;
import org.xwiki.component.internal.SpaceComponentManager;
import org.xwiki.context.Execution;
import org.xwiki.rendering.internal.parser.DefaultContentParser;
import org.xwiki.rendering.internal.parser.xwiki20.XWiki20Parser;
import org.xwiki.rendering.syntax.Syntax;
import org.xwiki.rendering.syntax.SyntaxType;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DefaultContentParser_ESTest extends DefaultContentParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultContentParser defaultContentParser0 = new DefaultContentParser();
      RootComponentManager rootComponentManager0 = new RootComponentManager();
      Execution execution0 = mock(Execution.class, new ViolatedAssumptionAnswer());
      String string0 = "initializing lazy properties from datastore";
      EmbeddableComponentManager embeddableComponentManager0 = new EmbeddableComponentManager("initializing lazy properties from datastore");
      SpaceComponentManager spaceComponentManager0 = new SpaceComponentManager();
      Provider<XWiki20Parser> provider0 = (Provider<XWiki20Parser>) mock(Provider.class, new ViolatedAssumptionAnswer());
      Injector.inject(spaceComponentManager0, (Class<?>) SpaceComponentManager.class, "referenceProvider", (Object) provider0);
      EmbeddableComponentManager embeddableComponentManager1 = new EmbeddableComponentManager();
      SyntaxType syntaxType0 = SyntaxType.DOCBOOK;
      Syntax syntax0 = new Syntax(syntaxType0, "initializing lazy properties from datastore");
      // Undeclared exception!
      defaultContentParser0.parse("initializing lazy properties from datastore", syntax0);
  }
}
