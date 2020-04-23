/*

 * Mon Apr 20 19:16:57 UTC 2020
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
import org.junit.runner.RunWith;
import org.xwiki.model.reference.EntityReference;
import org.xwiki.rendering.internal.parser.DefaultContentParser;
import org.xwiki.rendering.syntax.Syntax;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DefaultContentParser_ESTest extends DefaultContentParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultContentParser defaultContentParser0 = new DefaultContentParser();
      Provider<Integer> provider0 = (Provider<Integer>) mock(Provider.class, new ViolatedAssumptionAnswer());
      String string0 = "  7'0Nif%Ax!9k";
      Syntax syntax0 = Syntax.HTML_5_0;
      EntityReference entityReference0 = null;
      // Undeclared exception!
      defaultContentParser0.parse("  7'0Nif%Ax!9k", syntax0, (EntityReference) null);
  }
}
