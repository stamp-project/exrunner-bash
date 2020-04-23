/*

 * Mon Apr 20 15:41:24 UTC 2020
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
import org.xwiki.model.reference.EntityReference;
import org.xwiki.search.solr.internal.reference.SolrEntityReferenceResolver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class SolrEntityReferenceResolver_ESTest extends SolrEntityReferenceResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SolrEntityReferenceResolver solrEntityReferenceResolver0 = new SolrEntityReferenceResolver();
      EntityType entityType0 = EntityType.DOCUMENT;
      String string0 = "wiki";
      EntityReference entityReference0 = new EntityReference("wiki", entityType0);
      SolrEntityReferenceResolver solrEntityReferenceResolver1 = new SolrEntityReferenceResolver();
      Injector.inject(solrEntityReferenceResolver1, (Class<?>) SolrEntityReferenceResolver.class, "explicitReferenceEntityReferenceResolver", (Object) solrEntityReferenceResolver0);
      Injector.validateBean(solrEntityReferenceResolver1, (Class<?>) SolrEntityReferenceResolver.class);
      EntityType entityType1 = EntityType.WIKI;
      EntityReference entityReference1 = new EntityReference(entityReference0, entityReference0);
      entityReference0.replaceParent(entityReference1, entityReference1);
      EntityType entityType2 = EntityType.OBJECT;
      SolrDocument solrDocument0 = new SolrDocument();
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) "eV<_]T6ceq,:A{CZm";
      objectArray0[1] = (Object) entityReference0;
      objectArray0[2] = (Object) entityType0;
      objectArray0[3] = (Object) "eV<_]T6ceq,:A{CZm";
      objectArray0[4] = (Object) solrEntityReferenceResolver0;
      objectArray0[5] = (Object) "wiki";
      Object object0 = new Object();
      solrDocument0.put("wiki", object0);
      objectArray0[6] = (Object) entityType1;
      EntityType entityType3 = EntityType.OBJECT;
      // Undeclared exception!
      solrEntityReferenceResolver1.resolve(solrDocument0, entityType3, objectArray0);
  }
}
