/*

 * Wed Apr 22 17:48:45 UTC 2020
 */

package com.xpn.xwiki.store.hibernate.query;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ch.qos.logback.classic.Logger;
import com.xpn.xwiki.store.hibernate.HibernateSessionFactory;
import com.xpn.xwiki.store.hibernate.query.HqlQueryExecutor;
import java.util.Map;
import javax.inject.Provider;
import org.dom4j.dom.DOMDocument;
import org.dom4j.dom.DOMDocumentType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.engine.query.OrdinalParameterDescriptor;
import org.hibernate.engine.query.ParameterMetadata;
import org.hibernate.impl.CollectionFilterImpl;
import org.hibernate.loader.custom.sql.SQLCustomQuery;
import org.junit.runner.RunWith;
import org.xwiki.context.Execution;
import org.xwiki.job.event.status.JobProgressManager;
import org.xwiki.query.internal.CountDocumentFilter;
import org.xwiki.query.internal.ScriptQueryParameter;
import org.xwiki.query.internal.UniqueDocumentFilter;
import org.xwiki.security.authorization.ContextualAuthorizationManager;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class HqlQueryExecutor_ESTest extends HqlQueryExecutor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ContextualAuthorizationManager contextualAuthorizationManager0 = mock(ContextualAuthorizationManager.class, new ViolatedAssumptionAnswer());
      Provider<ScriptQueryParameter> provider0 = (Provider<ScriptQueryParameter>) mock(Provider.class, new ViolatedAssumptionAnswer());
      Execution execution0 = mock(Execution.class, new ViolatedAssumptionAnswer());
      JobProgressManager jobProgressManager0 = mock(JobProgressManager.class, new ViolatedAssumptionAnswer());
      Configuration configuration0 = new Configuration();
      DOMDocumentType dOMDocumentType0 = new DOMDocumentType();
      DOMDocument dOMDocument0 = new DOMDocument(dOMDocumentType0);
      HqlQueryExecutor hqlQueryExecutor0 = new HqlQueryExecutor();
      ContextualAuthorizationManager contextualAuthorizationManager1 = mock(ContextualAuthorizationManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "authorization", (Object) contextualAuthorizationManager1);
      Provider<CountDocumentFilter> provider1 = (Provider<CountDocumentFilter>) mock(Provider.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "componentManagerProvider", (Object) provider1);
      Execution execution1 = mock(Execution.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "execution", (Object) execution1);
      JobProgressManager jobProgressManager1 = mock(JobProgressManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "progress", (Object) jobProgressManager1);
      HibernateSessionFactory hibernateSessionFactory0 = mock(HibernateSessionFactory.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "sessionFactory", (Object) hibernateSessionFactory0);
      Injector.validateBean(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class);
      UniqueDocumentFilter uniqueDocumentFilter0 = new UniqueDocumentFilter();
      Logger logger0 = (Logger)SQLCustomQuery.log;
      Injector.inject(uniqueDocumentFilter0, (Class<?>) UniqueDocumentFilter.class, "logger", (Object) logger0);
      Injector.validateBean(uniqueDocumentFilter0, (Class<?>) UniqueDocumentFilter.class);
      SessionImplementor sessionImplementor0 = mock(SessionImplementor.class, new ViolatedAssumptionAnswer());
      OrdinalParameterDescriptor[] ordinalParameterDescriptorArray0 = new OrdinalParameterDescriptor[0];
      ParameterMetadata parameterMetadata0 = new ParameterMetadata(ordinalParameterDescriptorArray0, (Map) null);
      CollectionFilterImpl collectionFilterImpl0 = new CollectionFilterImpl("^", uniqueDocumentFilter0, sessionImplementor0, parameterMetadata0);
      LockMode lockMode0 = LockMode.PESSIMISTIC_FORCE_INCREMENT;
      Query query0 = collectionFilterImpl0.setLockMode("rErR/L1", lockMode0);
      Object object0 = new Object();
      // Undeclared exception!
      hqlQueryExecutor0.setNamedParameter(query0, (String) null, object0);
  }
}
