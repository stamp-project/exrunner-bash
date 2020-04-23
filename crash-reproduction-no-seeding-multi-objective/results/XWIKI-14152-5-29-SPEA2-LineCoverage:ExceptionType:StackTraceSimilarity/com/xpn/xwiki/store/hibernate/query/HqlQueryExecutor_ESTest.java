/*

 * Mon Apr 20 12:18:26 UTC 2020
 */

package com.xpn.xwiki.store.hibernate.query;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.store.hibernate.query.HqlQueryExecutor;
import java.util.concurrent.LinkedBlockingQueue;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.hibernate.Session;
import org.junit.runner.RunWith;
import org.slf4j.event.SubstituteLoggingEvent;
import org.slf4j.helpers.SubstituteLogger;
import org.xwiki.component.manager.ComponentManager;
import org.xwiki.context.Execution;
import org.xwiki.job.event.status.JobProgressManager;
import org.xwiki.query.Query;
import org.xwiki.query.QueryFilter;
import org.xwiki.query.internal.CountDocumentFilter;
import org.xwiki.query.internal.DefaultQuery;
import org.xwiki.query.internal.NoOpQueryFilter;
import org.xwiki.query.internal.ScriptQuery;
import org.xwiki.security.authorization.ContextualAuthorizationManager;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class HqlQueryExecutor_ESTest extends HqlQueryExecutor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HqlQueryExecutor.isSafeSelect("pHTm");
      HqlQueryExecutor hqlQueryExecutor0 = new HqlQueryExecutor();
      ContextualAuthorizationManager contextualAuthorizationManager0 = mock(ContextualAuthorizationManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "authorization", (Object) contextualAuthorizationManager0);
      Execution execution0 = mock(Execution.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "execution", (Object) execution0);
      JobProgressManager jobProgressManager0 = mock(JobProgressManager.class, new ViolatedAssumptionAnswer());
      String string0 = ",4#'le\")v9x";
      String string1 = "Execute HQL query [{}]";
      DefaultQuery defaultQuery0 = new DefaultQuery("Execute HQL query [{}]", "pHTm", hqlQueryExecutor0);
      Query query0 = defaultQuery0.setOffset((-211));
      CountDocumentFilter countDocumentFilter0 = new CountDocumentFilter();
      LinkedBlockingQueue<SubstituteLoggingEvent> linkedBlockingQueue0 = new LinkedBlockingQueue<SubstituteLoggingEvent>();
      linkedBlockingQueue0.stream();
      query0.bindValue("pHTm", (Object) hqlQueryExecutor0);
      SubstituteLogger substituteLogger0 = new SubstituteLogger("pHTm", linkedBlockingQueue0, true);
      Injector.inject(countDocumentFilter0, (Class<?>) CountDocumentFilter.class, "logger", (Object) substituteLogger0);
      Injector.validateBean(countDocumentFilter0, (Class<?>) CountDocumentFilter.class);
      defaultQuery0.addFilter(countDocumentFilter0);
      NoOpQueryFilter noOpQueryFilter0 = new NoOpQueryFilter();
      query0.addFilter((QueryFilter) null);
      ScriptQuery scriptQuery0 = new ScriptQuery(defaultQuery0, (ComponentManager) null);
      ScriptQuery scriptQuery1 = new ScriptQuery(defaultQuery0, (ComponentManager) null);
      scriptQuery1.checkCurrentAuthor(true);
      // Undeclared exception!
      hqlQueryExecutor0.createHibernateQuery((Session) null, scriptQuery0);
  }
}
