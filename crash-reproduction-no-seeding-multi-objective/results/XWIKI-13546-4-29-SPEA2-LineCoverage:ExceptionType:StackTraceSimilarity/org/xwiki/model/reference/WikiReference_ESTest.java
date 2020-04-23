/*

 * Mon Apr 20 14:20:24 UTC 2020
 */

package org.xwiki.model.reference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Serializable;
import java.util.function.BiFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.infinispan.atomic.impl.AtomicHashMap;
import org.junit.runner.RunWith;
import org.xwiki.model.EntityType;
import org.xwiki.model.reference.EntityReference;
import org.xwiki.model.reference.WikiReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class WikiReference_ESTest extends WikiReference_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "[\u00C8\u00C9\u00CA\u00CB\u0112\u0114\u0116\u0118\u011A\u0204\u0228]";
      WikiReference wikiReference0 = new WikiReference("[\u00C8\u00C9\u00CA\u00CB\u0112\u0114\u0116\u0118\u011A\u0204\u0228]");
      wikiReference0.getType();
      AtomicHashMap<String, Serializable> atomicHashMap0 = new AtomicHashMap<String, Serializable>(true);
      BiFunction<String, Object, Integer> biFunction0 = (BiFunction<String, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      atomicHashMap0.computeIfPresent("", biFunction0);
      wikiReference0.setParameters(atomicHashMap0);
      EntityReference entityReference0 = wikiReference0.getRoot();
      wikiReference0.setParameter("select ", entityReference0);
      wikiReference0.getParent();
      EntityType entityType0 = EntityType.SPACE;
      wikiReference0.equals((EntityReference) null, entityType0, entityType0);
      WikiReference wikiReference1 = new WikiReference("select ");
      wikiReference0.size();
      entityReference0.size();
      String string1 = "";
      WikiReference wikiReference2 = new WikiReference("");
  }
}
