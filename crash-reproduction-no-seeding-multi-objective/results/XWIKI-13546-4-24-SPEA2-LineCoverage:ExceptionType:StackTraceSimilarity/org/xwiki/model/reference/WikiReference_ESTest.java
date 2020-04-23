/*

 * Mon Apr 20 14:14:05 UTC 2020
 */

package org.xwiki.model.reference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xwiki.model.reference.EntityReference;
import org.xwiki.model.reference.WikiReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class WikiReference_ESTest extends WikiReference_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WikiReference wikiReference0 = new WikiReference("<&|PM??#@Hz(qVjY$");
      EntityReference entityReference0 = new EntityReference(wikiReference0);
      WikiReference wikiReference1 = new WikiReference("Invalid type [");
      wikiReference1.getType();
      WikiReference wikiReference2 = new WikiReference((String) null);
  }
}
