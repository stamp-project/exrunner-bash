/*

 * Wed Apr 22 17:31:14 UTC 2020
 */

package com.xpn.xwiki.store.hibernate.query;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.store.hibernate.HibernateSessionFactory;
import com.xpn.xwiki.store.hibernate.query.HqlQueryExecutor;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.inject.Provider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.hibernate.Query;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.engine.query.OrdinalParameterDescriptor;
import org.hibernate.engine.query.ParameterMetadata;
import org.hibernate.impl.CollectionFilterImpl;
import org.hibernate.type.CalendarDateType;
import org.junit.runner.RunWith;
import org.xwiki.component.embed.EmbeddableComponentManager;
import org.xwiki.context.Execution;
import org.xwiki.context.ExecutionContext;
import org.xwiki.job.event.status.JobProgressManager;
import org.xwiki.query.internal.LanguageQueryFilter;
import org.xwiki.query.internal.ScriptQueryParameter;
import org.xwiki.security.authorization.ContextualAuthorizationManager;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class HqlQueryExecutor_ESTest extends HqlQueryExecutor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HqlQueryExecutor hqlQueryExecutor0 = new HqlQueryExecutor();
      ContextualAuthorizationManager contextualAuthorizationManager0 = mock(ContextualAuthorizationManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "authorization", (Object) contextualAuthorizationManager0);
      Provider<ScriptQueryParameter> provider0 = (Provider<ScriptQueryParameter>) mock(Provider.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "componentManagerProvider", (Object) provider0);
      ExecutionContext executionContext0 = new ExecutionContext();
      executionContext0.removeProperty("sql");
      Execution execution0 = mock(Execution.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "execution", (Object) execution0);
      JobProgressManager jobProgressManager0 = mock(JobProgressManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "progress", (Object) jobProgressManager0);
      HibernateSessionFactory hibernateSessionFactory0 = mock(HibernateSessionFactory.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "sessionFactory", (Object) hibernateSessionFactory0);
      Injector.validateBean(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class);
      SessionImplementor sessionImplementor0 = mock(SessionImplementor.class, new ViolatedAssumptionAnswer());
      OrdinalParameterDescriptor[] ordinalParameterDescriptorArray0 = new OrdinalParameterDescriptor[5];
      CalendarDateType calendarDateType0 = new CalendarDateType();
      OrdinalParameterDescriptor ordinalParameterDescriptor0 = new OrdinalParameterDescriptor(424, calendarDateType0, 3236);
      OrdinalParameterDescriptor ordinalParameterDescriptor1 = new OrdinalParameterDescriptor(260, calendarDateType0, 0);
      ordinalParameterDescriptorArray0[1] = ordinalParameterDescriptor1;
      OrdinalParameterDescriptor ordinalParameterDescriptor2 = new OrdinalParameterDescriptor(424, calendarDateType0, 1686);
      ordinalParameterDescriptorArray0[2] = ordinalParameterDescriptor2;
      OrdinalParameterDescriptor ordinalParameterDescriptor3 = new OrdinalParameterDescriptor(3236, calendarDateType0, 3011);
      ordinalParameterDescriptorArray0[3] = ordinalParameterDescriptor3;
      OrdinalParameterDescriptor ordinalParameterDescriptor4 = new OrdinalParameterDescriptor(537270292, calendarDateType0, 3011);
      ordinalParameterDescriptorArray0[4] = ordinalParameterDescriptor4;
      ConcurrentHashMap<LanguageQueryFilter, XWikiContext> concurrentHashMap0 = new ConcurrentHashMap<LanguageQueryFilter, XWikiContext>();
      ParameterMetadata parameterMetadata0 = new ParameterMetadata(ordinalParameterDescriptorArray0, concurrentHashMap0);
      CollectionFilterImpl collectionFilterImpl0 = new CollectionFilterImpl("sql", hqlQueryExecutor0, sessionImplementor0, parameterMetadata0);
      Query query0 = collectionFilterImpl0.setProperties((Map) concurrentHashMap0);
      EmbeddableComponentManager embeddableComponentManager0 = new EmbeddableComponentManager();
      // Undeclared exception!
      hqlQueryExecutor0.setNamedParameter(query0, "sql", embeddableComponentManager0);
  }
}
