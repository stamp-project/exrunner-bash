/*

 * Mon Apr 20 15:40:41 UTC 2020
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
import org.xwiki.model.internal.reference.ExplicitReferenceEntityReferenceResolver;
import org.xwiki.model.reference.EntityReferenceResolver;
import org.xwiki.search.solr.internal.reference.SolrEntityReferenceResolver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class SolrEntityReferenceResolver_ESTest extends SolrEntityReferenceResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SolrEntityReferenceResolver solrEntityReferenceResolver0 = new SolrEntityReferenceResolver();
      SolrDocument solrDocument0 = new SolrDocument();
      EntityType entityType0 = EntityType.DOCUMENT;
      Object object0 = new Object();
      solrDocument0.put("wiki", (Object) solrEntityReferenceResolver0);
      EntityType entityType1 = EntityType.WIKI;
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) entityType0;
      objectArray0[1] = (Object) entityType1;
      SolrEntityReferenceResolver solrEntityReferenceResolver1 = new SolrEntityReferenceResolver();
      EntityReferenceResolver<ExplicitReferenceEntityReferenceResolver> entityReferenceResolver0 = (EntityReferenceResolver<ExplicitReferenceEntityReferenceResolver>) mock(EntityReferenceResolver.class, new ViolatedAssumptionAnswer());
      Injector.inject(solrEntityReferenceResolver1, (Class<?>) SolrEntityReferenceResolver.class, "explicitReferenceEntityReferenceResolver", (Object) entityReferenceResolver0);
      // Undeclared exception!
      solrEntityReferenceResolver1.resolve(solrDocument0, entityType1, objectArray0);
  }
}
