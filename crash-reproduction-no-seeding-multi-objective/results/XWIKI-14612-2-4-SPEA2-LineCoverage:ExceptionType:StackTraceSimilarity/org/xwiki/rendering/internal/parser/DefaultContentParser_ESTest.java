/*

 * Mon Apr 20 19:09:48 UTC 2020
 */

package org.xwiki.rendering.internal.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.XWikiContext;
import javax.inject.Provider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.component.internal.DocumentComponentManager;
import org.xwiki.model.reference.EntityReference;
import org.xwiki.rendering.internal.parser.DefaultContentParser;
import org.xwiki.rendering.syntax.Syntax;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DefaultContentParser_ESTest extends DefaultContentParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultContentParser defaultContentParser0 = new DefaultContentParser();
      Provider<DocumentComponentManager> provider0 = (Provider<DocumentComponentManager>) mock(Provider.class, new ViolatedAssumptionAnswer());
      Syntax syntax0 = Syntax.CONFLUENCEXHTML_1_0;
      XWikiContext xWikiContext0 = new XWikiContext();
      Syntax syntax1 = Syntax.CONFLUENCE_1_0;
      Syntax syntax2 = Syntax.TWIKI_1_0;
      // Undeclared exception!
      defaultContentParser0.parse("Y$2[h|QU:De#KP", syntax2, (EntityReference) null);
  }
}
