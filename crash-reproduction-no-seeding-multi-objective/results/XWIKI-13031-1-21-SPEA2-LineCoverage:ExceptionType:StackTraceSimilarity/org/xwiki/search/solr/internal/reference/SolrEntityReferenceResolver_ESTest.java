/*

 * Mon Apr 20 15:38:22 UTC 2020
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
import org.xwiki.model.internal.reference.DefaultStringEntityReferenceResolver;
import org.xwiki.model.reference.EntityReference;
import org.xwiki.model.reference.EntityReferenceProvider;
import org.xwiki.search.solr.internal.reference.SolrEntityReferenceResolver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class SolrEntityReferenceResolver_ESTest extends SolrEntityReferenceResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SolrEntityReferenceResolver solrEntityReferenceResolver0 = new SolrEntityReferenceResolver();
      DefaultStringEntityReferenceResolver defaultStringEntityReferenceResolver0 = new DefaultStringEntityReferenceResolver();
      EntityReferenceProvider entityReferenceProvider0 = mock(EntityReferenceProvider.class, new ViolatedAssumptionAnswer());
      doReturn((EntityReference) null).when(entityReferenceProvider0).getDefaultReference(any(org.xwiki.model.EntityType.class));
      Injector.inject(defaultStringEntityReferenceResolver0, (Class<?>) DefaultStringEntityReferenceResolver.class, "provider", (Object) entityReferenceProvider0);
      EntityType entityType0 = EntityType.SPACE;
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) entityReferenceProvider0;
      Object object0 = new Object();
      objectArray0[1] = object0;
      objectArray0[2] = (Object) "_ojK";
      objectArray0[3] = (Object) entityReferenceProvider0;
      objectArray0[4] = (Object) entityType0;
      defaultStringEntityReferenceResolver0.resolve("_ojK", entityType0, objectArray0);
      SolrDocument solrDocument0 = new SolrDocument();
      EntityType entityType1 = EntityType.SPACE;
      DefaultReferenceEntityReferenceResolver defaultReferenceEntityReferenceResolver0 = new DefaultReferenceEntityReferenceResolver();
      EntityReferenceProvider entityReferenceProvider1 = mock(EntityReferenceProvider.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultReferenceEntityReferenceResolver0, (Class<?>) DefaultReferenceEntityReferenceResolver.class, "provider", (Object) entityReferenceProvider1);
      Injector.validateBean(defaultReferenceEntityReferenceResolver0, (Class<?>) DefaultReferenceEntityReferenceResolver.class);
      solrDocument0.put("wiki", (Object) defaultReferenceEntityReferenceResolver0);
      // Undeclared exception!
      solrEntityReferenceResolver0.resolve(solrDocument0, entityType1, (Object[]) null);
  }
}
