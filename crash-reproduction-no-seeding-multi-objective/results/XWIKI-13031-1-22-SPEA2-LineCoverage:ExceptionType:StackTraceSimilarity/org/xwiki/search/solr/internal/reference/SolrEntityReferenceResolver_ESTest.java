/*

 * Mon Apr 20 15:38:57 UTC 2020
 */

package org.xwiki.search.solr.internal.reference;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.solr.common.SolrDocument;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.xwiki.model.EntityType;
import org.xwiki.model.internal.reference.ExplicitStringEntityReferenceResolver;
import org.xwiki.search.solr.internal.reference.SolrEntityReferenceResolver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class SolrEntityReferenceResolver_ESTest extends SolrEntityReferenceResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SolrEntityReferenceResolver solrEntityReferenceResolver0 = new SolrEntityReferenceResolver();
      ExplicitStringEntityReferenceResolver explicitStringEntityReferenceResolver0 = new ExplicitStringEntityReferenceResolver();
      Injector.inject(solrEntityReferenceResolver0, (Class<?>) SolrEntityReferenceResolver.class, "explicitReferenceEntityReferenceResolver", (Object) explicitStringEntityReferenceResolver0);
      EntityType entityType0 = EntityType.BLOCK;
      Object[] objectArray0 = new Object[0];
      explicitStringEntityReferenceResolver0.resolve("A1r_g", entityType0, objectArray0);
      Injector.validateBean(solrEntityReferenceResolver0, (Class<?>) SolrEntityReferenceResolver.class);
      EntityType entityType1 = EntityType.OBJECT_PROPERTY;
      Object[] objectArray1 = new Object[9];
      objectArray1[0] = (Object) explicitStringEntityReferenceResolver0;
      objectArray1[1] = (Object) solrEntityReferenceResolver0;
      EntityType entityType2 = EntityType.CLASS_PROPERTY;
      EntityType entityType3 = EntityType.OBJECT;
      SolrDocument solrDocument0 = null;
      Object[] objectArray2 = null;
      SolrDocument solrDocument1 = new SolrDocument();
      Object object0 = new Object();
      solrDocument1.put("wiki", object0);
      EntityType entityType4 = EntityType.WIKI;
      // Undeclared exception!
      solrEntityReferenceResolver0.resolve(solrDocument1, entityType3, (Object[]) null);
  }
}
