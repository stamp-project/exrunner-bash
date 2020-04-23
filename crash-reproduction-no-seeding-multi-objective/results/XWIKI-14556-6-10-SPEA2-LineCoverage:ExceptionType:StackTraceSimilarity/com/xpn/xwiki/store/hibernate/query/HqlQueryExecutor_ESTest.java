/*

 * Wed Apr 22 17:34:28 UTC 2020
 */

package com.xpn.xwiki.store.hibernate.query;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.store.hibernate.HibernateSessionFactory;
import com.xpn.xwiki.store.hibernate.query.HqlQueryExecutor;
import java.util.concurrent.ConcurrentHashMap;
import javax.inject.Provider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.engine.NamedSQLQueryDefinition;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.engine.query.OrdinalParameterDescriptor;
import org.hibernate.engine.query.ParameterMetadata;
import org.hibernate.impl.CollectionFilterImpl;
import org.jgroups.util.ExtendedUUID;
import org.junit.runner.RunWith;
import org.xwiki.context.Execution;
import org.xwiki.job.event.status.JobProgressManager;
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
      Provider<EscapeLikeParametersFilter> provider0 = (Provider<EscapeLikeParametersFilter>) mock(Provider.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "componentManagerProvider", (Object) provider0);
      Execution execution0 = mock(Execution.class, new ViolatedAssumptionAnswer());
      HqlQueryExecutor hqlQueryExecutor1 = new HqlQueryExecutor();
      ContextualAuthorizationManager contextualAuthorizationManager1 = mock(ContextualAuthorizationManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor1, (Class<?>) HqlQueryExecutor.class, "authorization", (Object) contextualAuthorizationManager1);
      Provider<Integer> provider1 = (Provider<Integer>) mock(Provider.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor1, (Class<?>) HqlQueryExecutor.class, "componentManagerProvider", (Object) provider1);
      Execution execution1 = mock(Execution.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor1, (Class<?>) HqlQueryExecutor.class, "execution", (Object) execution1);
      JobProgressManager jobProgressManager0 = mock(JobProgressManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor1, (Class<?>) HqlQueryExecutor.class, "progress", (Object) jobProgressManager0);
      HibernateSessionFactory hibernateSessionFactory0 = mock(HibernateSessionFactory.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor1, (Class<?>) HqlQueryExecutor.class, "sessionFactory", (Object) hibernateSessionFactory0);
      Injector.validateBean(hqlQueryExecutor1, (Class<?>) HqlQueryExecutor.class);
      SessionImplementor sessionImplementor0 = mock(SessionImplementor.class, new ViolatedAssumptionAnswer());
      ConcurrentHashMap<ExtendedUUID, NamedSQLQueryDefinition> concurrentHashMap0 = new ConcurrentHashMap<ExtendedUUID, NamedSQLQueryDefinition>();
      ParameterMetadata parameterMetadata0 = new ParameterMetadata((OrdinalParameterDescriptor[]) null, concurrentHashMap0);
      CollectionFilterImpl collectionFilterImpl0 = new CollectionFilterImpl(",q,ae<euxyE=ar;:h", ",q,ae<euxyE=ar;:h", sessionImplementor0, parameterMetadata0);
      LockMode lockMode0 = LockMode.UPGRADE_NOWAIT;
      Query query0 = collectionFilterImpl0.setLockMode("Named queries requires programming right", lockMode0);
      EscapeLikeParametersFilter escapeLikeParametersFilter0 = new EscapeLikeParametersFilter();
      DefaultQuery defaultQuery0 = new DefaultQuery("The query requires programming right", hqlQueryExecutor0);
      org.xwiki.query.Query query1 = defaultQuery0.setOffset((-1879631558));
      escapeLikeParametersFilter0.filterQuery(query1);
      DefaultQuery defaultQuery1 = new DefaultQuery(",q,ae<euxyE=ar;:h", "Named queries requires programming right", hqlQueryExecutor0);
      org.xwiki.query.Query query2 = defaultQuery1.bindValue((-1879631542), (Object) execution0);
      query2.bindValue("jsMX+xD]RPU`(ISv0");
      org.xwiki.query.Query query3 = escapeLikeParametersFilter0.filterQuery(query2);
      // Undeclared exception!
      hqlQueryExecutor1.populateParameters(query0, query3);
  }
}
