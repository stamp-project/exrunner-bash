/*

 * Mon Apr 20 15:33:45 UTC 2020
 */

package org.xwiki.search.solr.internal.reference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.solr.common.SolrDocument;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xwiki.model.EntityType;
import org.xwiki.search.solr.internal.reference.SolrEntityReferenceResolver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class SolrEntityReferenceResolver_ESTest extends SolrEntityReferenceResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SolrEntityReferenceResolver solrEntityReferenceResolver0 = new SolrEntityReferenceResolver();
      SolrDocument solrDocument0 = new SolrDocument();
      EntityType entityType0 = EntityType.SPACE;
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) solrEntityReferenceResolver0;
      objectArray0[1] = (Object) entityType0;
      objectArray0[6] = (Object) entityType0;
      objectArray0[4] = (Object) entityType0;
      SolrDocument solrDocument1 = new SolrDocument();
      solrDocument0.put("wiki", (Object) solrDocument1);
      objectArray0[5] = (Object) solrEntityReferenceResolver0;
      Object object0 = new Object();
      objectArray0[6] = object0;
      objectArray0[7] = (Object) entityType0;
      // Undeclared exception!
      solrEntityReferenceResolver0.resolve(solrDocument0, entityType0, objectArray0);
  }
}
