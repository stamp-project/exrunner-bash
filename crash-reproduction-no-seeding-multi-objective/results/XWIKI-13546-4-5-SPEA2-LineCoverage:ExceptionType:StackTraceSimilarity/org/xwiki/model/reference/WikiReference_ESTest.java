/*

 * Mon Apr 20 13:49:20 UTC 2020
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
import org.xwiki.wiki.descriptor.WikiDescriptor;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class WikiReference_ESTest extends WikiReference_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "]m\"|f9}b06J";
      WikiDescriptor wikiDescriptor0 = new WikiDescriptor("]m\"|f9}b06J", "]m\"|f9}b06J");
      WikiReference wikiReference0 = wikiDescriptor0.getReference();
      EntityType entityType0 = EntityType.DOCUMENT;
      wikiReference0.extractReference(entityType0);
      WikiReference wikiReference1 = new WikiReference("");
  }
}
