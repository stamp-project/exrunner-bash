/*

 * Mon Apr 20 15:34:16 UTC 2020
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
import org.xwiki.model.internal.reference.RelativeStringEntityReferenceResolver;
import org.xwiki.model.reference.EntityReferenceResolver;
import org.xwiki.search.solr.internal.reference.SolrEntityReferenceResolver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class SolrEntityReferenceResolver_ESTest extends SolrEntityReferenceResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SolrEntityReferenceResolver solrEntityReferenceResolver0 = new SolrEntityReferenceResolver();
      EntityReferenceResolver<DefaultStringEntityReferenceResolver> entityReferenceResolver0 = (EntityReferenceResolver<DefaultStringEntityReferenceResolver>) mock(EntityReferenceResolver.class, new ViolatedAssumptionAnswer());
      Injector.inject(solrEntityReferenceResolver0, (Class<?>) SolrEntityReferenceResolver.class, "explicitReferenceEntityReferenceResolver", (Object) entityReferenceResolver0);
      Injector.validateBean(solrEntityReferenceResolver0, (Class<?>) SolrEntityReferenceResolver.class);
      SolrEntityReferenceResolver solrEntityReferenceResolver1 = new SolrEntityReferenceResolver();
      Injector.inject(solrEntityReferenceResolver1, (Class<?>) SolrEntityReferenceResolver.class, "explicitReferenceEntityReferenceResolver", (Object) solrEntityReferenceResolver0);
      Injector.validateBean(solrEntityReferenceResolver1, (Class<?>) SolrEntityReferenceResolver.class);
      SolrDocument solrDocument0 = new SolrDocument();
      RelativeStringEntityReferenceResolver relativeStringEntityReferenceResolver0 = new RelativeStringEntityReferenceResolver();
      EntityType entityType0 = EntityType.DOCUMENT;
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) "wiki";
      objectArray0[1] = (Object) solrEntityReferenceResolver1;
      objectArray0[2] = (Object) solrEntityReferenceResolver0;
      Object object0 = new Object();
      objectArray0[3] = object0;
      objectArray0[4] = (Object) solrDocument0;
      objectArray0[5] = (Object) entityReferenceResolver0;
      objectArray0[6] = (Object) entityReferenceResolver0;
      objectArray0[7] = (Object) entityReferenceResolver0;
      relativeStringEntityReferenceResolver0.resolve("wiki", entityType0, objectArray0);
      solrDocument0.put("wiki", (Object) relativeStringEntityReferenceResolver0);
      Object[] objectArray1 = new Object[1];
      EntityType entityType1 = EntityType.CLASS_PROPERTY;
      // Undeclared exception!
      solrEntityReferenceResolver1.resolve(solrDocument0, entityType1, objectArray1);
  }
}
