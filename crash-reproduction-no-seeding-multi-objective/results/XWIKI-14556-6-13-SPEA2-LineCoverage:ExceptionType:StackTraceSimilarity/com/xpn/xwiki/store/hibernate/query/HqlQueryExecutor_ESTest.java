/*

 * Wed Apr 22 17:36:58 UTC 2020
 */

package com.xpn.xwiki.store.hibernate.query;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ch.qos.logback.classic.Logger;
import com.xpn.xwiki.store.hibernate.query.HqlQueryExecutor;
import com.xpn.xwiki.web.DeleteVersionsForm;
import com.xpn.xwiki.web.XWikiServletRequest;
import com.xpn.xwiki.web.XWikiServletResponse;
import javax.inject.Provider;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.chain.web.servlet.ServletWebContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.engine.query.OrdinalParameterDescriptor;
import org.hibernate.engine.query.ParameterMetadata;
import org.hibernate.impl.CollectionFilterImpl;
import org.hibernate.loader.custom.sql.SQLCustomQuery;
import org.junit.runner.RunWith;
import org.xwiki.component.embed.EmbeddableComponentManager;
import org.xwiki.component.internal.SpaceComponentManager;
import org.xwiki.configuration.ConfigurationSource;
import org.xwiki.context.Execution;
import org.xwiki.job.event.status.JobProgressManager;
import org.xwiki.query.internal.AbstractHiddenFilter;
import org.xwiki.query.internal.DefaultQuery;
import org.xwiki.query.internal.HiddenSpaceFilter;
import org.xwiki.query.internal.ScriptQuery;
import org.xwiki.security.authorization.ContextualAuthorizationManager;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class HqlQueryExecutor_ESTest extends HqlQueryExecutor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HqlQueryExecutor hqlQueryExecutor0 = new HqlQueryExecutor();
      ContextualAuthorizationManager contextualAuthorizationManager0 = mock(ContextualAuthorizationManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "authorization", (Object) contextualAuthorizationManager0);
      Provider<SpaceComponentManager> provider0 = (Provider<SpaceComponentManager>) mock(Provider.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "componentManagerProvider", (Object) provider0);
      Execution execution0 = mock(Execution.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "execution", (Object) execution0);
      JobProgressManager jobProgressManager0 = mock(JobProgressManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "progress", (Object) jobProgressManager0);
      SessionImplementor sessionImplementor0 = mock(SessionImplementor.class, new ViolatedAssumptionAnswer());
      DeleteVersionsForm deleteVersionsForm0 = new DeleteVersionsForm();
      deleteVersionsForm0.getRequest();
      XWikiServletRequest xWikiServletRequest0 = new XWikiServletRequest((HttpServletRequest) null);
      XWikiServletResponse xWikiServletResponse0 = new XWikiServletResponse((HttpServletResponse) null);
      ServletWebContext servletWebContext0 = new ServletWebContext((ServletContext) null, xWikiServletRequest0, xWikiServletResponse0);
      ParameterMetadata parameterMetadata0 = new ParameterMetadata((OrdinalParameterDescriptor[]) null, servletWebContext0);
      CollectionFilterImpl collectionFilterImpl0 = new CollectionFilterImpl((String) null, (Object) null, sessionImplementor0, parameterMetadata0);
      HiddenSpaceFilter hiddenSpaceFilter0 = new HiddenSpaceFilter();
      ConfigurationSource configurationSource0 = mock(ConfigurationSource.class, new ViolatedAssumptionAnswer());
      Injector.inject(hiddenSpaceFilter0, (Class<?>) AbstractHiddenFilter.class, "userPreferencesSource", (Object) configurationSource0);
      Logger logger0 = (Logger)SQLCustomQuery.log;
      DefaultQuery defaultQuery0 = new DefaultQuery("", "`PBcSP|@)qN*L", hqlQueryExecutor0);
      defaultQuery0.addFilter(hiddenSpaceFilter0);
      EmbeddableComponentManager embeddableComponentManager0 = new EmbeddableComponentManager();
      ScriptQuery scriptQuery0 = new ScriptQuery(defaultQuery0, embeddableComponentManager0);
      scriptQuery0.checkCurrentUser(false);
      defaultQuery0.bindValue((String) null);
      // Undeclared exception!
      hqlQueryExecutor0.populateParameters(collectionFilterImpl0, defaultQuery0);
  }
}
