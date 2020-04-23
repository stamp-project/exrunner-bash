/*

 * Mon Apr 20 15:35:23 UTC 2020
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
      EntityReferenceResolver<Object> entityReferenceResolver0 = (EntityReferenceResolver<Object>) mock(EntityReferenceResolver.class, new ViolatedAssumptionAnswer());
      Injector.inject(solrEntityReferenceResolver0, (Class<?>) SolrEntityReferenceResolver.class, "explicitReferenceEntityReferenceResolver", (Object) entityReferenceResolver0);
      Injector.validateBean(solrEntityReferenceResolver0, (Class<?>) SolrEntityReferenceResolver.class);
      SolrEntityReferenceResolver solrEntityReferenceResolver1 = new SolrEntityReferenceResolver();
      Injector.inject(solrEntityReferenceResolver1, (Class<?>) SolrEntityReferenceResolver.class, "explicitReferenceEntityReferenceResolver", (Object) solrEntityReferenceResolver0);
      EntityType entityType0 = EntityType.ATTACHMENT;
      SolrEntityReferenceResolver solrEntityReferenceResolver2 = new SolrEntityReferenceResolver();
      EntityReferenceResolver<DefaultReferenceEntityReferenceResolver> entityReferenceResolver1 = (EntityReferenceResolver<DefaultReferenceEntityReferenceResolver>) mock(EntityReferenceResolver.class, new ViolatedAssumptionAnswer());
      Injector.inject(solrEntityReferenceResolver2, (Class<?>) SolrEntityReferenceResolver.class, "explicitReferenceEntityReferenceResolver", (Object) entityReferenceResolver1);
      Injector.validateBean(solrEntityReferenceResolver2, (Class<?>) SolrEntityReferenceResolver.class);
      SolrDocument solrDocument0 = new SolrDocument();
      EntityType entityType1 = EntityType.SPACE;
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) entityType1;
      objectArray0[1] = (Object) solrEntityReferenceResolver2;
      solrDocument0.put("wiki", (Object) entityType0);
      objectArray0[2] = (Object) entityReferenceResolver0;
      EntityType entityType2 = EntityType.WIKI;
      SolrEntityReferenceResolver solrEntityReferenceResolver3 = new SolrEntityReferenceResolver();
      EntityReferenceResolver<Integer> entityReferenceResolver2 = (EntityReferenceResolver<Integer>) mock(EntityReferenceResolver.class, new ViolatedAssumptionAnswer());
      Injector.inject(solrEntityReferenceResolver3, (Class<?>) SolrEntityReferenceResolver.class, "explicitReferenceEntityReferenceResolver", (Object) entityReferenceResolver2);
      Injector.validateBean(solrEntityReferenceResolver3, (Class<?>) SolrEntityReferenceResolver.class);
      EntityType entityType3 = EntityType.WIKI;
      // Undeclared exception!
      solrEntityReferenceResolver3.resolve(solrDocument0, entityType3, objectArray0);
  }
}
