/*

 * Mon Apr 20 14:03:39 UTC 2020
 */

package org.xwiki.model.reference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Serializable;
import java.util.concurrent.ConcurrentSkipListMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xwiki.model.reference.WikiReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class WikiReference_ESTest extends WikiReference_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WikiReference wikiReference0 = new WikiReference("@|N3[");
      ConcurrentSkipListMap<String, Serializable> concurrentSkipListMap0 = new ConcurrentSkipListMap<String, Serializable>();
      wikiReference0.setParameters(concurrentSkipListMap0);
      wikiReference0.toString();
      WikiReference wikiReference1 = new WikiReference("");
  }
}
