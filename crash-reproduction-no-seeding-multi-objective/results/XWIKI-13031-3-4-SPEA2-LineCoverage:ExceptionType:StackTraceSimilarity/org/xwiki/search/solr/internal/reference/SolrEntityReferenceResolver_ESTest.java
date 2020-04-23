/*

 * Mon Apr 20 15:32:12 UTC 2020
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
import org.xwiki.model.internal.reference.DefaultReferenceEntityReferenceResolver;
import org.xwiki.model.reference.EntityReferenceResolver;
import org.xwiki.search.solr.internal.reference.SolrEntityReferenceResolver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class SolrEntityReferenceResolver_ESTest extends SolrEntityReferenceResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SolrEntityReferenceResolver solrEntityReferenceResolver0 = new SolrEntityReferenceResolver();
      EntityReferenceResolver<DefaultReferenceEntityReferenceResolver> entityReferenceResolver0 = (EntityReferenceResolver<DefaultReferenceEntityReferenceResolver>) mock(EntityReferenceResolver.class, new ViolatedAssumptionAnswer());
      Injector.inject(solrEntityReferenceResolver0, (Class<?>) SolrEntityReferenceResolver.class, "explicitReferenceEntityReferenceResolver", (Object) entityReferenceResolver0);
      Injector.validateBean(solrEntityReferenceResolver0, (Class<?>) SolrEntityReferenceResolver.class);
      SolrEntityReferenceResolver solrEntityReferenceResolver1 = new SolrEntityReferenceResolver();
      Injector.inject(solrEntityReferenceResolver1, (Class<?>) SolrEntityReferenceResolver.class, "explicitReferenceEntityReferenceResolver", (Object) solrEntityReferenceResolver0);
      Injector.validateBean(solrEntityReferenceResolver1, (Class<?>) SolrEntityReferenceResolver.class);
      SolrEntityReferenceResolver solrEntityReferenceResolver2 = new SolrEntityReferenceResolver();
      SolrDocument solrDocument0 = new SolrDocument();
      SolrDocument solrDocument1 = new SolrDocument();
      solrDocument0.put("wiki", (Object) solrDocument1);
      SolrEntityReferenceResolver solrEntityReferenceResolver3 = new SolrEntityReferenceResolver();
      EntityReferenceResolver<Object> entityReferenceResolver1 = (EntityReferenceResolver<Object>) mock(EntityReferenceResolver.class, new ViolatedAssumptionAnswer());
      Injector.inject(solrEntityReferenceResolver3, (Class<?>) SolrEntityReferenceResolver.class, "explicitReferenceEntityReferenceResolver", (Object) entityReferenceResolver1);
      Injector.validateBean(solrEntityReferenceResolver3, (Class<?>) SolrEntityReferenceResolver.class);
      EntityType entityType0 = EntityType.OBJECT;
      SolrDocument solrDocument2 = new SolrDocument();
      SolrEntityReferenceResolver solrEntityReferenceResolver4 = new SolrEntityReferenceResolver();
      EntityReferenceResolver<Integer> entityReferenceResolver2 = (EntityReferenceResolver<Integer>) mock(EntityReferenceResolver.class, new ViolatedAssumptionAnswer());
      Injector.inject(solrEntityReferenceResolver4, (Class<?>) SolrEntityReferenceResolver.class, "explicitReferenceEntityReferenceResolver", (Object) entityReferenceResolver2);
      Injector.validateBean(solrEntityReferenceResolver4, (Class<?>) SolrEntityReferenceResolver.class);
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = null;
      objectArray0[1] = (Object) solrDocument2;
      objectArray0[2] = (Object) entityReferenceResolver1;
      objectArray0[4] = (Object) solrEntityReferenceResolver0;
      objectArray0[4] = objectArray0[2];
      objectArray0[5] = (Object) solrDocument1;
      // Undeclared exception!
      solrEntityReferenceResolver4.resolve(solrDocument0, entityType0, objectArray0);
  }
}
