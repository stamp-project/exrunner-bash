/*

 * Mon Apr 20 15:40:47 UTC 2020
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
      EntityReferenceResolver<ExplicitReferenceEntityReferenceResolver> entityReferenceResolver0 = (EntityReferenceResolver<ExplicitReferenceEntityReferenceResolver>) mock(EntityReferenceResolver.class, new ViolatedAssumptionAnswer());
      Injector.inject(solrEntityReferenceResolver0, (Class<?>) SolrEntityReferenceResolver.class, "explicitReferenceEntityReferenceResolver", (Object) entityReferenceResolver0);
      Injector.validateBean(solrEntityReferenceResolver0, (Class<?>) SolrEntityReferenceResolver.class);
      SolrDocument solrDocument0 = null;
      EntityType entityType0 = EntityType.OBJECT;
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) solrEntityReferenceResolver0;
      objectArray0[1] = (Object) null;
      objectArray0[2] = (Object) null;
      objectArray0[3] = (Object) entityReferenceResolver0;
      objectArray0[4] = (Object) entityType0;
      objectArray0[5] = (Object) solrEntityReferenceResolver0;
      objectArray0[6] = (Object) entityType0;
      EntityType entityType1 = EntityType.OBJECT;
      SolrDocument solrDocument1 = new SolrDocument();
      String string0 = "wiki";
      solrDocument1.put("wiki", objectArray0[3]);
      // Undeclared exception!
      solrEntityReferenceResolver0.resolve(solrDocument1, entityType0, objectArray0);
  }
}
