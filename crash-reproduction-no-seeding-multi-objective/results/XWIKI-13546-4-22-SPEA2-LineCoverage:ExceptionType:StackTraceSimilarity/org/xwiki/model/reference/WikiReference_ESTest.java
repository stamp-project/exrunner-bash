/*

 * Mon Apr 20 14:11:14 UTC 2020
 */

package org.xwiki.model.reference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Serializable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.infinispan.atomic.impl.AtomicHashMap;
import org.junit.runner.RunWith;
import org.xwiki.model.reference.EntityReference;
import org.xwiki.model.reference.LocalDocumentReference;
import org.xwiki.model.reference.WikiReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class WikiReference_ESTest extends WikiReference_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WikiReference wikiReference0 = new WikiReference("H|A|XR/[jbcEt[F\"5");
      wikiReference0.setName("zL [p:$`dGa.)i79/~");
      LocalDocumentReference localDocumentReference0 = new LocalDocumentReference("BK*%tT; Hd;`U[F", wikiReference0);
      wikiReference0.compareTo((EntityReference) localDocumentReference0);
      AtomicHashMap<String, Serializable> atomicHashMap0 = new AtomicHashMap<String, Serializable>();
      AtomicHashMap<String, Serializable> atomicHashMap1 = atomicHashMap0.copy();
      wikiReference0.setParameters(atomicHashMap1);
      wikiReference0.setParameters(atomicHashMap0);
      wikiReference0.getParent();
      wikiReference0.getType();
      wikiReference0.getParameter("BK*%tT; Hd;`U[F");
      WikiReference wikiReference1 = new WikiReference("");
  }
}
