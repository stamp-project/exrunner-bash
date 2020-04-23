/*

 * Mon Apr 20 15:42:28 UTC 2020
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
      EntityReferenceResolver<String> entityReferenceResolver0 = (EntityReferenceResolver<String>) mock(EntityReferenceResolver.class, new ViolatedAssumptionAnswer());
      Injector.inject(solrEntityReferenceResolver0, (Class<?>) SolrEntityReferenceResolver.class, "explicitReferenceEntityReferenceResolver", (Object) entityReferenceResolver0);
      Injector.validateBean(solrEntityReferenceResolver0, (Class<?>) SolrEntityReferenceResolver.class);
      SolrEntityReferenceResolver solrEntityReferenceResolver1 = new SolrEntityReferenceResolver();
      Injector.inject(solrEntityReferenceResolver1, (Class<?>) SolrEntityReferenceResolver.class, "explicitReferenceEntityReferenceResolver", (Object) solrEntityReferenceResolver0);
      Injector.validateBean(solrEntityReferenceResolver1, (Class<?>) SolrEntityReferenceResolver.class);
      SolrDocument solrDocument0 = new SolrDocument();
      EntityType entityType0 = EntityType.DOCUMENT;
      solrDocument0.put("wiki", (Object) solrEntityReferenceResolver0);
      SolrDocument solrDocument1 = new SolrDocument();
      solrDocument1.put("", (Object) solrEntityReferenceResolver0);
      solrDocument0.put("", (Object) solrDocument1);
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) solrDocument0;
      objectArray0[1] = (Object) solrDocument0;
      EntityType entityType1 = EntityType.CLASS_PROPERTY;
      Object[] objectArray1 = new Object[2];
      objectArray1[0] = (Object) null;
      objectArray1[1] = (Object) entityType0;
      // Undeclared exception!
      solrEntityReferenceResolver1.resolve(solrDocument0, entityType1, objectArray1);
  }
}
