/*

 * Wed Apr 22 17:45:41 UTC 2020
 */

package com.xpn.xwiki.store.hibernate.query;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.store.hibernate.HibernateSessionFactory;
import com.xpn.xwiki.store.hibernate.query.HqlQueryExecutor;
import javax.inject.Provider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.hibernate.FlushMode;
import org.hibernate.Query;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.engine.query.OrdinalParameterDescriptor;
import org.hibernate.engine.query.ParameterMetadata;
import org.hibernate.impl.QueryImpl;
import org.infinispan.atomic.impl.AtomicHashMap;
import org.infinispan.cache.impl.SimpleCacheImpl;
import org.junit.runner.RunWith;
import org.xwiki.component.internal.ContextRootComponentManager;
import org.xwiki.context.Execution;
import org.xwiki.job.event.status.JobProgressManager;
import org.xwiki.query.internal.DefaultQuery;
import org.xwiki.query.internal.EscapeLikeParametersFilter;
import org.xwiki.query.internal.HiddenDocumentFilter;
import org.xwiki.query.internal.LanguageQueryFilter;
import org.xwiki.query.internal.UniqueDocumentFilter;
import org.xwiki.security.authorization.ContextualAuthorizationManager;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class HqlQueryExecutor_ESTest extends HqlQueryExecutor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HqlQueryExecutor hqlQueryExecutor0 = new HqlQueryExecutor();
      ContextualAuthorizationManager contextualAuthorizationManager0 = mock(ContextualAuthorizationManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "authorization", (Object) contextualAuthorizationManager0);
      Provider<ContextRootComponentManager> provider0 = (Provider<ContextRootComponentManager>) mock(Provider.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "componentManagerProvider", (Object) provider0);
      Execution execution0 = mock(Execution.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "execution", (Object) execution0);
      JobProgressManager jobProgressManager0 = mock(JobProgressManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "progress", (Object) jobProgressManager0);
      HibernateSessionFactory hibernateSessionFactory0 = mock(HibernateSessionFactory.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "sessionFactory", (Object) hibernateSessionFactory0);
      Injector.validateBean(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class);
      Query query0 = mock(Query.class, new ViolatedAssumptionAnswer());
      String string0 = "1qhpq{";
      SimpleCacheImpl<String, Object> simpleCacheImpl0 = new SimpleCacheImpl<String, Object>("1qhpq{");
      DefaultQuery defaultQuery0 = new DefaultQuery("n", "1qhpq{", hqlQueryExecutor0);
      LanguageQueryFilter languageQueryFilter0 = new LanguageQueryFilter();
      EscapeLikeParametersFilter escapeLikeParametersFilter0 = new EscapeLikeParametersFilter();
      defaultQuery0.bindValue("1qhpq{", (Object) escapeLikeParametersFilter0);
      defaultQuery0.addFilter(escapeLikeParametersFilter0);
      org.xwiki.query.Query query1 = defaultQuery0.bindValue("IujS}U-4a}~>b", (Object) hqlQueryExecutor0);
      FlushMode flushMode0 = FlushMode.NEVER;
      SessionImplementor sessionImplementor0 = mock(SessionImplementor.class, new ViolatedAssumptionAnswer());
      AtomicHashMap.ProxyMode atomicHashMap_ProxyMode0 = AtomicHashMap.ProxyMode.COARSE;
      AtomicHashMap<HiddenDocumentFilter, UniqueDocumentFilter> atomicHashMap0 = new AtomicHashMap<HiddenDocumentFilter, UniqueDocumentFilter>(true, atomicHashMap_ProxyMode0);
      ParameterMetadata parameterMetadata0 = new ParameterMetadata((OrdinalParameterDescriptor[]) null, atomicHashMap0);
      QueryImpl queryImpl0 = new QueryImpl("Yd<:a", flushMode0, sessionImplementor0, parameterMetadata0);
      // Undeclared exception!
      hqlQueryExecutor0.populateParameters(queryImpl0, query1);
  }
}
