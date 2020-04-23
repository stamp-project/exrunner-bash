/*

 * Mon Apr 20 14:09:56 UTC 2020
 */

package org.xwiki.model.reference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import javax.swing.JComponent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xwiki.model.reference.WikiReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class WikiReference_ESTest extends WikiReference_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "l{7ja=n$:\\58M=#";
      WikiReference wikiReference0 = new WikiReference("l{7ja=n$:\u00058M=#");
      JComponent.getDefaultLocale();
      WikiReference wikiReference1 = new WikiReference((String) null);
  }
}
