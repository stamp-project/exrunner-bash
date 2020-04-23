/*

 * Mon Apr 20 15:40:58 UTC 2020
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
import org.xwiki.model.internal.reference.DefaultStringEntityReferenceResolver;
import org.xwiki.model.reference.EntityReferenceProvider;
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
      Injector.validateBean(solrEntityReferenceResolver1, (Class<?>) SolrEntityReferenceResolver.class);
      SolrDocument solrDocument0 = new SolrDocument();
      Object[] objectArray0 = new Object[5];
      DefaultStringEntityReferenceResolver defaultStringEntityReferenceResolver0 = new DefaultStringEntityReferenceResolver();
      EntityReferenceProvider entityReferenceProvider0 = mock(EntityReferenceProvider.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultStringEntityReferenceResolver0, (Class<?>) DefaultStringEntityReferenceResolver.class, "provider", (Object) entityReferenceProvider0);
      Injector.validateBean(defaultStringEntityReferenceResolver0, (Class<?>) DefaultStringEntityReferenceResolver.class);
      solrDocument0.put("wiki", (Object) defaultStringEntityReferenceResolver0);
      solrDocument0.getFirstValue("FBvdsY:^If");
      objectArray0[0] = (Object) solrEntityReferenceResolver0;
      objectArray0[1] = (Object) solrDocument0;
      objectArray0[2] = (Object) solrEntityReferenceResolver0;
      DefaultStringEntityReferenceResolver defaultStringEntityReferenceResolver1 = new DefaultStringEntityReferenceResolver();
      EntityReferenceProvider entityReferenceProvider1 = mock(EntityReferenceProvider.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultStringEntityReferenceResolver1, (Class<?>) DefaultStringEntityReferenceResolver.class, "provider", (Object) entityReferenceProvider1);
      Injector.validateBean(defaultStringEntityReferenceResolver1, (Class<?>) DefaultStringEntityReferenceResolver.class);
      solrDocument0.put("FBvdsY:^If", (Object) "FBvdsY:^If");
      solrDocument0.getFirstValue("wiki");
      SolrEntityReferenceResolver solrEntityReferenceResolver2 = new SolrEntityReferenceResolver();
      Injector.inject(solrEntityReferenceResolver2, (Class<?>) SolrEntityReferenceResolver.class, "explicitReferenceEntityReferenceResolver", (Object) solrEntityReferenceResolver0);
      Injector.validateBean(solrEntityReferenceResolver2, (Class<?>) SolrEntityReferenceResolver.class);
      Object object0 = new Object();
      EntityType entityType0 = EntityType.OBJECT_PROPERTY;
      // Undeclared exception!
      solrEntityReferenceResolver2.resolve(solrDocument0, entityType0, objectArray0);
  }
}
