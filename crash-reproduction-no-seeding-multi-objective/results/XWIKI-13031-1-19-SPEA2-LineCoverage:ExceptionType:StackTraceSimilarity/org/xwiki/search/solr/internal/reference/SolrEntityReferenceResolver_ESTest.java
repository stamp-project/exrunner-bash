/*

 * Mon Apr 20 15:40:04 UTC 2020
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
import org.xwiki.model.reference.EntityReferenceProvider;
import org.xwiki.search.solr.internal.reference.SolrEntityReferenceResolver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class SolrEntityReferenceResolver_ESTest extends SolrEntityReferenceResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SolrEntityReferenceResolver solrEntityReferenceResolver0 = new SolrEntityReferenceResolver();
      DefaultStringEntityReferenceResolver defaultStringEntityReferenceResolver0 = new DefaultStringEntityReferenceResolver();
      EntityReferenceProvider entityReferenceProvider0 = mock(EntityReferenceProvider.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultStringEntityReferenceResolver0, (Class<?>) DefaultStringEntityReferenceResolver.class, "provider", (Object) entityReferenceProvider0);
      Injector.validateBean(defaultStringEntityReferenceResolver0, (Class<?>) DefaultStringEntityReferenceResolver.class);
      EntityType entityType0 = EntityType.WIKI;
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) ")y3R`i";
      objectArray0[1] = (Object) entityReferenceProvider0;
      objectArray0[2] = (Object) ")y3R`i";
      objectArray0[3] = (Object) ")y3R`i";
      objectArray0[4] = (Object) entityReferenceProvider0;
      objectArray0[5] = (Object) solrEntityReferenceResolver0;
      defaultStringEntityReferenceResolver0.resolve(")y3R`i", entityType0, objectArray0);
      SolrDocument solrDocument0 = new SolrDocument();
      SolrEntityReferenceResolver solrEntityReferenceResolver1 = new SolrEntityReferenceResolver();
      Injector.inject(solrEntityReferenceResolver1, (Class<?>) SolrEntityReferenceResolver.class, "explicitReferenceEntityReferenceResolver", (Object) solrEntityReferenceResolver0);
      Injector.validateBean(solrEntityReferenceResolver1, (Class<?>) SolrEntityReferenceResolver.class);
      EntityType entityType1 = EntityType.SPACE;
      EntityType entityType2 = EntityType.SPACE;
      RelativeStringEntityReferenceResolver relativeStringEntityReferenceResolver0 = new RelativeStringEntityReferenceResolver();
      relativeStringEntityReferenceResolver0.resolve(")y3R`i", entityType1, objectArray0);
      relativeStringEntityReferenceResolver0.resolve("wiki", entityType0, objectArray0);
      solrDocument0.putIfAbsent("wiki", relativeStringEntityReferenceResolver0);
      // Undeclared exception!
      solrEntityReferenceResolver1.resolve(solrDocument0, entityType2, objectArray0);
  }
}
