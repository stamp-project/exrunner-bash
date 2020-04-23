/*

 * Mon Apr 20 12:11:52 UTC 2020
 */

package com.xpn.xwiki.store.hibernate.query;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ch.qos.logback.classic.Logger;
import com.xpn.xwiki.store.hibernate.query.HqlQueryExecutor;
import java.util.PriorityQueue;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.hibernate.Session;
import org.junit.runner.RunWith;
import org.slf4j.Marker;
import org.slf4j.event.SubstituteLoggingEvent;
import org.slf4j.helpers.SubstituteLogger;
import org.xwiki.context.Execution;
import org.xwiki.query.internal.CountDocumentFilter;
import org.xwiki.query.internal.DefaultQuery;
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
      Logger logger0 = (Logger)URLStreamHandlerFactory.log;
      String string0 = "wj;9dg0:Cdb9Kp";
      logger0.debug((Marker) null, "wj;9dg0:Cdb9Kp", (Object[]) null);
      DefaultQuery defaultQuery0 = new DefaultQuery("wj;9dg0:Cdb9Kp", "wj;9dg0:Cdb9Kp", hqlQueryExecutor0);
      CountDocumentFilter countDocumentFilter0 = new CountDocumentFilter();
      PriorityQueue<SubstituteLoggingEvent> priorityQueue0 = new PriorityQueue<SubstituteLoggingEvent>();
      SubstituteLogger substituteLogger0 = new SubstituteLogger("wj;9dg0:Cdb9Kp", priorityQueue0, false);
      Injector.inject(countDocumentFilter0, (Class<?>) CountDocumentFilter.class, "logger", (Object) substituteLogger0);
      Injector.validateBean(countDocumentFilter0, (Class<?>) CountDocumentFilter.class);
      defaultQuery0.addFilter(countDocumentFilter0);
      hqlQueryExecutor0.checkAllowed(defaultQuery0);
      Session session0 = null;
      // Undeclared exception!
      hqlQueryExecutor0.createHibernateQuery((Session) null, defaultQuery0);
  }
}
