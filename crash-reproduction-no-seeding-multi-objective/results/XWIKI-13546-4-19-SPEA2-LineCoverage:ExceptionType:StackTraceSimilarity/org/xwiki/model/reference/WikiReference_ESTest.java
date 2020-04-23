/*

 * Mon Apr 20 14:07:40 UTC 2020
 */

package org.xwiki.model.reference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xwiki.model.reference.WikiReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class WikiReference_ESTest extends WikiReference_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "`4t))$_|?1aQs%5A*";
      WikiReference wikiReference0 = new WikiReference("`4t))$_|?1aQs%5A*");
      String string1 = "";
      WikiReference wikiReference1 = new WikiReference("");
  }
}
