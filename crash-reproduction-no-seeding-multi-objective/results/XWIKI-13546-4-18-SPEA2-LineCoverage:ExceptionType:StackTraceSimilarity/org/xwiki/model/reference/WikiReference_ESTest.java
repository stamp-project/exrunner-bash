/*

 * Mon Apr 20 14:06:28 UTC 2020
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
      WikiDescriptor wikiDescriptor0 = new WikiDescriptor("Invalid type [", "J3hl]BsRC){");
      WikiReference wikiReference0 = wikiDescriptor0.getReference();
      EntityType entityType0 = EntityType.BLOCK;
      wikiReference0.extractReference(entityType0);
      wikiReference0.getParent();
      wikiReference0.size();
      EntityType entityType1 = EntityType.BLOCK;
      wikiReference0.extractFirstReference(entityType1);
      wikiReference0.getRoot();
      EntityType entityType2 = EntityType.OBJECT_PROPERTY;
      WikiReference wikiReference1 = new WikiReference("");
  }
}
