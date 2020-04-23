/*

 * Mon Apr 20 19:13:43 UTC 2020
 */

package org.xwiki.rendering.internal.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xwiki.model.reference.EntityReference;
import org.xwiki.model.reference.LocalDocumentReference;
import org.xwiki.rendering.internal.parser.DefaultContentParser;
import org.xwiki.rendering.internal.parser.plain.PlainTextBlockParser;
import org.xwiki.rendering.syntax.Syntax;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DefaultContentParser_ESTest extends DefaultContentParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultContentParser defaultContentParser0 = new DefaultContentParser();
      PlainTextBlockParser plainTextBlockParser0 = new PlainTextBlockParser();
      String string0 = "source";
      Syntax syntax0 = Syntax.XWIKI_2_0;
      LocalDocumentReference localDocumentReference0 = new LocalDocumentReference("source", "source");
      // Undeclared exception!
      defaultContentParser0.parse("source", syntax0, (EntityReference) localDocumentReference0);
  }
}
