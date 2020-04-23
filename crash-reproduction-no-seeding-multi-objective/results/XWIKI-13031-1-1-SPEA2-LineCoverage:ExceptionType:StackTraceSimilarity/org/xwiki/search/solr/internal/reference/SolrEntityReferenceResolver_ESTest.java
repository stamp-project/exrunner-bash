/*

 * Mon Apr 20 15:30:33 UTC 2020
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
      Injector.validateBean(solrEntityReferenceResolver0, (Class<?>) SolrEntityReferenceResolver.class);
      SolrDocument solrDocument0 = new SolrDocument();
      EntityType entityType0 = EntityType.CLASS_PROPERTY;
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) solrDocument0;
      objectArray0[2] = (Object) solrDocument0;
      EntityType entityType1 = EntityType.BLOCK;
      EntityType entityType2 = EntityType.WIKI;
      Object[] objectArray1 = new Object[8];
      objectArray1[0] = (Object) entityType0;
      objectArray1[1] = (Object) entityType0;
      Object object0 = new Object();
      String string0 = "wiki";
      solrDocument0.put("wiki", objectArray0[2]);
      objectArray0[3] = object0;
      objectArray1[3] = (Object) entityType1;
      objectArray1[4] = (Object) entityType2;
      objectArray1[5] = (Object) entityType1;
      objectArray1[7] = (Object) solrEntityReferenceResolver0;
      // Undeclared exception!
      solrEntityReferenceResolver0.resolve(solrDocument0, entityType2, objectArray1);
  }
}
