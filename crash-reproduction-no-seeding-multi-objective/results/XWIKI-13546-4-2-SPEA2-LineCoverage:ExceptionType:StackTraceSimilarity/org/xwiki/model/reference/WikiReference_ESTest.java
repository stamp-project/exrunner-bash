/*

 * Mon Apr 20 13:45:44 UTC 2020
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
      WikiReference wikiReference0 = new WikiReference("b=TO");
      wikiReference0.getType();
      WikiReference wikiReference1 = new WikiReference(wikiReference0);
      EntityType entityType0 = EntityType.BLOCK;
      wikiReference1.extractReference(entityType0);
      wikiReference0.hasParent(wikiReference1);
      wikiReference0.getRoot();
      WikiReference wikiReference2 = new WikiReference("");
  }
}
