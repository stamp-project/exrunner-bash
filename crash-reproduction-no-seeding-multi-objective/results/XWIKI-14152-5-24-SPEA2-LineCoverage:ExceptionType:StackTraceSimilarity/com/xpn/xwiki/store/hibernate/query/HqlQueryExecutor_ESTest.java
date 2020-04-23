/*

 * Mon Apr 20 12:17:06 UTC 2020
 */

package com.xpn.xwiki.store.hibernate.query;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ch.qos.logback.classic.Logger;
import com.xpn.xwiki.store.hibernate.query.HqlQueryExecutor;
import java.util.ArrayDeque;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.hibernate.Session;
import org.hibernate.collection.PersistentList;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.loader.custom.sql.SQLCustomQuery;
import org.junit.runner.RunWith;
import org.slf4j.event.EventRecodingLogger;
import org.slf4j.event.SubstituteLoggingEvent;
import org.slf4j.helpers.SubstituteLogger;
import org.xwiki.component.embed.EmbeddableComponentManager;
import org.xwiki.context.Execution;
import org.xwiki.context.ExecutionContext;
import org.xwiki.job.event.status.JobProgressManager;
import org.xwiki.query.internal.CountDocumentFilter;
import org.xwiki.query.internal.DefaultQuery;
import org.xwiki.query.internal.ScriptQuery;
import org.xwiki.security.authorization.ContextualAuthorizationManager;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class HqlQueryExecutor_ESTest extends HqlQueryExecutor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HqlQueryExecutor hqlQueryExecutor0 = new HqlQueryExecutor();
      ContextualAuthorizationManager contextualAuthorizationManager0 = mock(ContextualAuthorizationManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "authorization", (Object) contextualAuthorizationManager0);
      ExecutionContext executionContext0 = new ExecutionContext();
      HqlQueryExecutor hqlQueryExecutor1 = new HqlQueryExecutor();
      ContextualAuthorizationManager contextualAuthorizationManager1 = mock(ContextualAuthorizationManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor1, (Class<?>) HqlQueryExecutor.class, "authorization", (Object) contextualAuthorizationManager1);
      Execution execution0 = mock(Execution.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor1, (Class<?>) HqlQueryExecutor.class, "execution", (Object) execution0);
      JobProgressManager jobProgressManager0 = mock(JobProgressManager.class, new ViolatedAssumptionAnswer());
      PersistentList persistentList0 = new PersistentList((SessionImplementor) null);
      HqlQueryExecutor hqlQueryExecutor2 = new HqlQueryExecutor();
      ContextualAuthorizationManager contextualAuthorizationManager2 = mock(ContextualAuthorizationManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor2, (Class<?>) HqlQueryExecutor.class, "authorization", (Object) contextualAuthorizationManager2);
      Execution execution1 = mock(Execution.class, new ViolatedAssumptionAnswer());
      DefaultQuery defaultQuery0 = new DefaultQuery("[xwikicon", "Binding type definition: {}", hqlQueryExecutor2);
      CountDocumentFilter countDocumentFilter0 = new CountDocumentFilter();
      ArrayDeque<SubstituteLoggingEvent> arrayDeque0 = new ArrayDeque<SubstituteLoggingEvent>();
      SubstituteLogger substituteLogger0 = new SubstituteLogger("[xwikicon", arrayDeque0, true);
      EventRecodingLogger eventRecodingLogger0 = new EventRecodingLogger(substituteLogger0, arrayDeque0);
      Injector.inject(countDocumentFilter0, (Class<?>) CountDocumentFilter.class, "logger", (Object) eventRecodingLogger0);
      Injector.validateBean(countDocumentFilter0, (Class<?>) CountDocumentFilter.class);
      Logger logger0 = (Logger)SQLCustomQuery.log;
      defaultQuery0.addFilter(countDocumentFilter0);
      EmbeddableComponentManager embeddableComponentManager0 = new EmbeddableComponentManager();
      ScriptQuery scriptQuery0 = new ScriptQuery(defaultQuery0, embeddableComponentManager0);
      scriptQuery0.checkCurrentAuthor(false);
      // Undeclared exception!
      hqlQueryExecutor1.createHibernateQuery((Session) null, defaultQuery0);
  }
}
