/*

 * Mon Apr 20 13:46:45 UTC 2020
 */

package org.xwiki.model.reference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xwiki.model.EntityType;
import org.xwiki.model.reference.WikiReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class WikiReference_ESTest extends WikiReference_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "!B";
      WikiReference wikiReference0 = new WikiReference("!B");
      EntityType entityType0 = EntityType.WIKI;
      wikiReference0.extractReference(entityType0);
      WikiReference wikiReference1 = new WikiReference(wikiReference0);
      WikiReference wikiReference2 = new WikiReference("");
  }
}
