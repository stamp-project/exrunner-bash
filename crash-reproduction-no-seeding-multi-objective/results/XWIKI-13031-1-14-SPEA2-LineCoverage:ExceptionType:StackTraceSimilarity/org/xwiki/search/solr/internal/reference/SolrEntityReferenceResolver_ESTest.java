/*

 * Mon Apr 20 15:35:12 UTC 2020
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
import org.evosuite.runtime.javaee.injection.Injector;
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
      Injector.inject(solrEntityReferenceResolver0, (Class<?>) SolrEntityReferenceResolver.class, "explicitReferenceEntityReferenceResolver", (Object) entityReferenceResolver0);
      SolrEntityReferenceResolver solrEntityReferenceResolver1 = new SolrEntityReferenceResolver();
      Injector.inject(solrEntityReferenceResolver1, (Class<?>) SolrEntityReferenceResolver.class, "explicitReferenceEntityReferenceResolver", (Object) solrEntityReferenceResolver0);
      Injector.validateBean(solrEntityReferenceResolver1, (Class<?>) SolrEntityReferenceResolver.class);
      SolrDocument solrDocument0 = new SolrDocument();
      EntityType entityType0 = EntityType.OBJECT_PROPERTY;
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) entityType0;
      objectArray0[1] = (Object) entityReferenceResolver0;
      objectArray0[2] = (Object) entityType0;
      Object object0 = new Object();
      objectArray0[3] = object0;
      SolrDocument solrDocument1 = new SolrDocument();
      solrDocument0.put("wiki", (Object) solrDocument1);
      SolrDocument solrDocument2 = new SolrDocument();
      solrDocument0.put("wiki", (Object) solrDocument2);
      objectArray0[4] = (Object) solrEntityReferenceResolver1;
      objectArray0[5] = (Object) solrEntityReferenceResolver1;
      // Undeclared exception!
      solrEntityReferenceResolver1.resolve(solrDocument0, entityType0, objectArray0);
  }
}
