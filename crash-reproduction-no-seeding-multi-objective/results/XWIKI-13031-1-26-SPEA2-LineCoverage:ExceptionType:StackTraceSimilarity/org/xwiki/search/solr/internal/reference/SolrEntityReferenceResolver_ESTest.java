/*

 * Mon Apr 20 15:40:16 UTC 2020
 */

package org.xwiki.search.solr.internal.reference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.solr.common.SolrDocument;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.model.EntityType;
import org.xwiki.model.reference.EntityReferenceResolver;
import org.xwiki.search.solr.internal.reference.SolrEntityReferenceResolver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class SolrEntityReferenceResolver_ESTest extends SolrEntityReferenceResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SolrEntityReferenceResolver solrEntityReferenceResolver0 = new SolrEntityReferenceResolver();
      EntityReferenceResolver<Object> entityReferenceResolver0 = (EntityReferenceResolver<Object>) mock(EntityReferenceResolver.class, new ViolatedAssumptionAnswer());
      SolrDocument solrDocument0 = new SolrDocument();
      Object object0 = new Object();
      Integer integer0 = new Integer(901);
      solrDocument0.put("wiki", (Object) solrEntityReferenceResolver0);
      Object object1 = new Object();
      EntityType entityType0 = EntityType.BLOCK;
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) entityReferenceResolver0;
      objectArray0[1] = (Object) entityType0;
      objectArray0[2] = (Object) solrDocument0;
      Object object2 = new Object();
      objectArray0[3] = object2;
      // Undeclared exception!
      solrEntityReferenceResolver0.resolve(solrDocument0, entityType0, objectArray0);
  }
}
