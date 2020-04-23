/*

 * Mon Apr 20 15:38:08 UTC 2020
 */

package org.xwiki.search.solr.internal.reference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.solr.common.SolrDocument;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.xwiki.model.EntityType;
import org.xwiki.search.solr.internal.reference.SolrEntityReferenceResolver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class SolrEntityReferenceResolver_ESTest extends SolrEntityReferenceResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SolrEntityReferenceResolver solrEntityReferenceResolver0 = new SolrEntityReferenceResolver();
      Injector.inject(solrEntityReferenceResolver0, (Class<?>) SolrEntityReferenceResolver.class, "explicitReferenceEntityReferenceResolver", (Object) solrEntityReferenceResolver0);
      SolrDocument solrDocument0 = new SolrDocument();
      EntityType entityType0 = EntityType.BLOCK;
      Object[] objectArray0 = new Object[9];
      objectArray0[1] = (Object) solrDocument0;
      Object object0 = new Object();
      objectArray0[2] = (Object) entityType0;
      objectArray0[3] = (Object) solrDocument0;
      Object object1 = new Object();
      SolrDocument solrDocument1 = new SolrDocument();
      Object object2 = new Object();
      solrDocument0.put("wiki", object2);
      Object object3 = new Object();
      Object object4 = new Object();
      solrDocument1.put("R!p_:5E*gt-H6ed", object4);
      Object object5 = new Object();
      solrDocument1.put("wiki", (Object) entityType0);
      Object object6 = new Object();
      EntityType entityType1 = EntityType.DOCUMENT;
      // Undeclared exception!
      solrEntityReferenceResolver0.resolve(solrDocument0, entityType1, objectArray0);
  }
}
