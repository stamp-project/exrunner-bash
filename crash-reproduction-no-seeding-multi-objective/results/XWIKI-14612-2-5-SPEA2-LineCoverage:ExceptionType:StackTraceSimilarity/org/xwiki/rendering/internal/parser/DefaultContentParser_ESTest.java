/*

 * Mon Apr 20 19:09:54 UTC 2020
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
import org.xwiki.component.manager.ComponentManager;
import org.xwiki.model.reference.EntityReference;
import org.xwiki.rendering.internal.parser.AbstractBlockParser;
import org.xwiki.rendering.internal.parser.DefaultContentParser;
import org.xwiki.rendering.internal.parser.plain.PlainTextBlockParser;
import org.xwiki.rendering.syntax.Syntax;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DefaultContentParser_ESTest extends DefaultContentParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultContentParser defaultContentParser0 = new DefaultContentParser();
      PlainTextBlockParser plainTextBlockParser0 = new PlainTextBlockParser();
      ComponentManager componentManager0 = mock(ComponentManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(plainTextBlockParser0, (Class<?>) AbstractBlockParser.class, "componentManager", (Object) componentManager0);
      Injector.validateBean(plainTextBlockParser0, (Class<?>) PlainTextBlockParser.class);
      Provider<PlainTextBlockParser> provider0 = (Provider<PlainTextBlockParser>) mock(Provider.class, new ViolatedAssumptionAnswer());
      Syntax syntax0 = Syntax.ANNOTATED_HTML_5_0;
      // Undeclared exception!
      defaultContentParser0.parse("Hn^ki4D{&W", syntax0, (EntityReference) null);
  }
}
