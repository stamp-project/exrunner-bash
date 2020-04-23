/*

 * Mon Apr 20 19:16:49 UTC 2020
 */

package org.xwiki.rendering.internal.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xwiki.rendering.internal.parser.DefaultContentParser;
import org.xwiki.rendering.syntax.Syntax;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DefaultContentParser_ESTest extends DefaultContentParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultContentParser defaultContentParser0 = new DefaultContentParser();
      Syntax syntax0 = null;
      String string0 = "\\smAjn0/o]1D-\"";
      // Undeclared exception!
      defaultContentParser0.parse("smAjn0/o]1D-\"", (Syntax) null);
  }
}
