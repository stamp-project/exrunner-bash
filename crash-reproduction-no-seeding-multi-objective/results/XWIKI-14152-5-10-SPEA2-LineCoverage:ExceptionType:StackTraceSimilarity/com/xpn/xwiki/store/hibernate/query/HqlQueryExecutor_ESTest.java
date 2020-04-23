/*

 * Mon Apr 20 12:07:03 UTC 2020
 */

package com.xpn.xwiki.store.hibernate.query;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ch.qos.logback.classic.Logger;
import com.xpn.xwiki.store.hibernate.query.HqlQueryExecutor;
import java.util.PriorityQueue;
import javax.inject.Provider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.hibernate.Session;
import org.hibernate.collection.PersistentBag;
import org.hibernate.engine.NamedSQLQueryDefinition;
import org.hibernate.engine.SessionImplementor;
import org.junit.runner.RunWith;
import org.slf4j.event.EventRecodingLogger;
import org.slf4j.event.SubstituteLoggingEvent;
import org.slf4j.helpers.SubstituteLogger;
import org.xwiki.context.Execution;
import org.xwiki.job.event.status.JobProgressManager;
import org.xwiki.query.Query;
import org.xwiki.query.internal.CountDocumentFilter;
import org.xwiki.query.internal.DefaultQuery;
import org.xwiki.query.internal.DefaultQueryExecutorManager;
import org.xwiki.query.internal.HiddenDocumentFilter;
import org.xwiki.query.internal.UniqueDocumentFilter;
import org.xwiki.security.authorization.ContextualAuthorizationManager;
import ucar.nc2.util.net.URLStreamHandlerFactory;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class HqlQueryExecutor_ESTest extends HqlQueryExecutor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HqlQueryExecutor hqlQueryExecutor0 = new HqlQueryExecutor();
      ContextualAuthorizationManager contextualAuthorizationManager0 = mock(ContextualAuthorizationManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "authorization", (Object) contextualAuthorizationManager0);
      Execution execution0 = mock(Execution.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "execution", (Object) execution0);
      JobProgressManager jobProgressManager0 = mock(JobProgressManager.class, new ViolatedAssumptionAnswer());
      HqlQueryExecutor hqlQueryExecutor1 = new HqlQueryExecutor();
      DefaultQueryExecutorManager defaultQueryExecutorManager0 = new DefaultQueryExecutorManager();
      Provider<NamedSQLQueryDefinition> provider0 = (Provider<NamedSQLQueryDefinition>) mock(Provider.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultQueryExecutorManager0, (Class<?>) DefaultQueryExecutorManager.class, "componentManagerProvider", (Object) provider0);
      Provider<HiddenDocumentFilter> provider1 = (Provider<HiddenDocumentFilter>) mock(Provider.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultQueryExecutorManager0, (Class<?>) DefaultQueryExecutorManager.class, "namedQueryExecutorProvider", (Object) provider1);
      Injector.validateBean(defaultQueryExecutorManager0, (Class<?>) DefaultQueryExecutorManager.class);
      DefaultQuery defaultQuery0 = new DefaultQuery("-ot/ul~(#", "-ot/ul~(#", defaultQueryExecutorManager0);
      UniqueDocumentFilter uniqueDocumentFilter0 = new UniqueDocumentFilter();
      Logger logger0 = (Logger)URLStreamHandlerFactory.log;
      Injector.inject(uniqueDocumentFilter0, (Class<?>) UniqueDocumentFilter.class, "logger", (Object) logger0);
      Injector.validateBean(uniqueDocumentFilter0, (Class<?>) UniqueDocumentFilter.class);
      PriorityQueue<SubstituteLoggingEvent> priorityQueue0 = new PriorityQueue<SubstituteLoggingEvent>();
      SubstituteLogger substituteLogger0 = new SubstituteLogger("O`x?k{Jq5QqC:&4!G", priorityQueue0, false);
      EventRecodingLogger eventRecodingLogger0 = new EventRecodingLogger(substituteLogger0, priorityQueue0);
      CountDocumentFilter countDocumentFilter0 = new CountDocumentFilter();
      Logger logger1 = (Logger)URLStreamHandlerFactory.log;
      Injector.inject(countDocumentFilter0, (Class<?>) CountDocumentFilter.class, "logger", (Object) logger1);
      Injector.validateBean(countDocumentFilter0, (Class<?>) CountDocumentFilter.class);
      defaultQuery0.addFilter(countDocumentFilter0);
      Query query0 = defaultQuery0.setWiki("[?Zdu2N87");
      PersistentBag persistentBag0 = new PersistentBag((SessionImplementor) null);
      // Undeclared exception!
      hqlQueryExecutor1.createHibernateQuery((Session) null, query0);
  }
}
