/*

 * Wed Apr 22 17:32:11 UTC 2020
 */

package com.xpn.xwiki.store.hibernate.query;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.store.hibernate.query.HqlQueryExecutor;
import javax.inject.Provider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.hibernate.CacheMode;
import org.hibernate.engine.NamedQueryDefinition;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.engine.query.OrdinalParameterDescriptor;
import org.hibernate.engine.query.ParameterMetadata;
import org.hibernate.impl.CollectionFilterImpl;
import org.infinispan.atomic.impl.AtomicHashMap;
import org.junit.runner.RunWith;
import org.xwiki.query.Query;
import org.xwiki.query.internal.DefaultQuery;
import org.xwiki.query.internal.EscapeLikeParametersFilter;
import org.xwiki.security.authorization.ContextualAuthorizationManager;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class HqlQueryExecutor_ESTest extends HqlQueryExecutor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HqlQueryExecutor hqlQueryExecutor0 = new HqlQueryExecutor();
      ContextualAuthorizationManager contextualAuthorizationManager0 = mock(ContextualAuthorizationManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "authorization", (Object) contextualAuthorizationManager0);
      Provider<NamedQueryDefinition> provider0 = (Provider<NamedQueryDefinition>) mock(Provider.class, new ViolatedAssumptionAnswer());
      AtomicHashMap.ProxyMode atomicHashMap_ProxyMode0 = AtomicHashMap.ProxyMode.FINE;
      AtomicHashMap<Integer, Object> atomicHashMap0 = new AtomicHashMap<Integer, Object>(false, atomicHashMap_ProxyMode0);
      OrdinalParameterDescriptor[] ordinalParameterDescriptorArray0 = new OrdinalParameterDescriptor[9];
      ParameterMetadata parameterMetadata0 = new ParameterMetadata(ordinalParameterDescriptorArray0, atomicHashMap0);
      CollectionFilterImpl collectionFilterImpl0 = new CollectionFilterImpl("order by ", provider0, (SessionImplementor) null, parameterMetadata0);
      CacheMode cacheMode0 = CacheMode.IGNORE;
      collectionFilterImpl0.setCacheMode(cacheMode0);
      DefaultQuery defaultQuery0 = new DefaultQuery("order by ", hqlQueryExecutor0);
      EscapeLikeParametersFilter escapeLikeParametersFilter0 = new EscapeLikeParametersFilter();
      Query query0 = defaultQuery0.bindValue((-1571), (Object) escapeLikeParametersFilter0);
      defaultQuery0.bindValue("where a!sx)b}");
      // Undeclared exception!
      hqlQueryExecutor0.populateParameters(collectionFilterImpl0, query0);
  }
}
