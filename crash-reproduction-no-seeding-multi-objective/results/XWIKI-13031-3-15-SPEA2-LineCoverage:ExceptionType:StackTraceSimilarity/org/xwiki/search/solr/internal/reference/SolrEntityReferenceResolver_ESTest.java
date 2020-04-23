/*

 * Mon Apr 20 15:36:08 UTC 2020
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
import org.junit.runner.RunWith;
import org.xwiki.model.EntityType;
import org.xwiki.model.internal.reference.ExplicitStringEntityReferenceResolver;
import org.xwiki.model.internal.reference.RelativeStringEntityReferenceResolver;
import org.xwiki.model.reference.EntityReferenceResolver;
import org.xwiki.search.solr.internal.reference.SolrEntityReferenceResolver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class SolrEntityReferenceResolver_ESTest extends SolrEntityReferenceResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SolrEntityReferenceResolver solrEntityReferenceResolver0 = new SolrEntityReferenceResolver();
      EntityReferenceResolver<ExplicitStringEntityReferenceResolver> entityReferenceResolver0 = (EntityReferenceResolver<ExplicitStringEntityReferenceResolver>) mock(EntityReferenceResolver.class, new ViolatedAssumptionAnswer());
      SolrDocument solrDocument0 = new SolrDocument();
      solrDocument0.put("wiki", (Object) solrEntityReferenceResolver0);
      RelativeStringEntityReferenceResolver relativeStringEntityReferenceResolver0 = new RelativeStringEntityReferenceResolver();
      EntityType entityType0 = EntityType.DOCUMENT;
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) solrDocument0;
      objectArray0[1] = (Object) entityType0;
      objectArray0[2] = (Object) solrDocument0;
      relativeStringEntityReferenceResolver0.resolve("wiki", entityType0, objectArray0);
      objectArray0[3] = (Object) "spacqes";
      relativeStringEntityReferenceResolver0.resolve("spacqes", entityType0, objectArray0);
      solrDocument0.put("wiki", (Object) relativeStringEntityReferenceResolver0);
      Object[] objectArray1 = new Object[6];
      objectArray1[0] = (Object) solrEntityReferenceResolver0;
      Object object0 = new Object();
      objectArray1[1] = object0;
      objectArray1[2] = (Object) "wiki";
      EntityType entityType1 = EntityType.OBJECT;
      Object[] objectArray2 = new Object[2];
      objectArray2[0] = (Object) entityReferenceResolver0;
      objectArray2[1] = object0;
      // Undeclared exception!
      solrEntityReferenceResolver0.resolve(solrDocument0, entityType1, objectArray2);
  }
}
