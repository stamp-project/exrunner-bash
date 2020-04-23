/*

 * Mon Apr 20 14:12:45 UTC 2020
 */

package org.xwiki.model.reference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xwiki.crypto.internal.DefaultSecureRandomProvider;
import org.xwiki.model.EntityType;
import org.xwiki.model.reference.WikiReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class WikiReference_ESTest extends WikiReference_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WikiReference wikiReference0 = new WikiReference("xc =SpWRV/U=jD");
      wikiReference0.toString();
      EntityType entityType0 = EntityType.OBJECT_PROPERTY;
      wikiReference0.extractReference(entityType0);
      DefaultSecureRandomProvider defaultSecureRandomProvider0 = new DefaultSecureRandomProvider();
      defaultSecureRandomProvider0.initialize();
      wikiReference0.equals((Object) defaultSecureRandomProvider0);
      WikiReference wikiReference1 = new WikiReference((String) null);
  }
}
