/*

 * Mon Apr 20 15:39:43 UTC 2020
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
import org.xwiki.model.reference.EntityReferenceProvider;
import org.xwiki.search.solr.internal.reference.SolrEntityReferenceResolver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class SolrEntityReferenceResolver_ESTest extends SolrEntityReferenceResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SolrEntityReferenceResolver solrEntityReferenceResolver0 = new SolrEntityReferenceResolver();
      SolrDocument solrDocument0 = new SolrDocument();
      EntityType entityType0 = EntityType.OBJECT_PROPERTY;
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) entityType0;
      objectArray0[1] = (Object) solrDocument0;
      objectArray0[2] = (Object) solrEntityReferenceResolver0;
      objectArray0[3] = (Object) entityType0;
      DefaultReferenceEntityReferenceResolver defaultReferenceEntityReferenceResolver0 = new DefaultReferenceEntityReferenceResolver();
      EntityReferenceProvider entityReferenceProvider0 = mock(EntityReferenceProvider.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultReferenceEntityReferenceResolver0, (Class<?>) DefaultReferenceEntityReferenceResolver.class, "provider", (Object) entityReferenceProvider0);
      solrDocument0.getFieldValueMap();
      Injector.validateBean(defaultReferenceEntityReferenceResolver0, (Class<?>) DefaultReferenceEntityReferenceResolver.class);
      SolrDocument solrDocument1 = new SolrDocument();
      solrDocument0.put("%IsO{*)!w{E,w", (Object) solrDocument1);
      solrDocument0.put("wiki", (Object) defaultReferenceEntityReferenceResolver0);
      objectArray0[4] = objectArray0[1];
      objectArray0[5] = (Object) solrEntityReferenceResolver0;
      objectArray0[6] = (Object) entityType0;
      Object object0 = new Object();
      objectArray0[2] = object0;
      // Undeclared exception!
      solrEntityReferenceResolver0.resolve(solrDocument0, entityType0, objectArray0);
  }
}
