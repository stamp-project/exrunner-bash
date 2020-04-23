/*

 * Mon Apr 20 15:37:27 UTC 2020
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
import org.xwiki.model.internal.reference.ExplicitStringEntityReferenceResolver;
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
      SolrDocument solrDocument0 = new SolrDocument();
      EntityType entityType0 = EntityType.OBJECT;
      Object[] objectArray0 = new Object[8];
      Object object0 = new Object();
      objectArray0[0] = object0;
      objectArray0[1] = (Object) entityReferenceResolver0;
      objectArray0[2] = (Object) entityType0;
      objectArray0[3] = (Object) entityType0;
      Object object1 = new Object();
      Object object2 = new Object();
      ExplicitStringEntityReferenceResolver explicitStringEntityReferenceResolver0 = new ExplicitStringEntityReferenceResolver();
      solrDocument0.put("wiki", (Object) explicitStringEntityReferenceResolver0);
      SolrEntityReferenceResolver solrEntityReferenceResolver2 = new SolrEntityReferenceResolver();
      EntityReferenceResolver<ExplicitStringEntityReferenceResolver> entityReferenceResolver1 = (EntityReferenceResolver<ExplicitStringEntityReferenceResolver>) mock(EntityReferenceResolver.class, new ViolatedAssumptionAnswer());
      Injector.inject(solrEntityReferenceResolver2, (Class<?>) SolrEntityReferenceResolver.class, "explicitReferenceEntityReferenceResolver", (Object) entityReferenceResolver1);
      Injector.validateBean(solrEntityReferenceResolver2, (Class<?>) SolrEntityReferenceResolver.class);
      EntityType entityType1 = EntityType.CLASS_PROPERTY;
      // Undeclared exception!
      solrEntityReferenceResolver2.resolve(solrDocument0, entityType1, objectArray0);
  }
}
