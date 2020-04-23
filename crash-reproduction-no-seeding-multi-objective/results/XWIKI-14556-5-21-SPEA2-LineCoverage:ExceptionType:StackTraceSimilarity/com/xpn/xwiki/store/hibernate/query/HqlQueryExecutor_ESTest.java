/*

 * Wed Apr 22 17:43:45 UTC 2020
 */

package com.xpn.xwiki.store.hibernate.query;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.doc.merge.MergeResult;
import com.xpn.xwiki.store.XWikiHibernateStore;
import com.xpn.xwiki.store.hibernate.HibernateSessionFactory;
import com.xpn.xwiki.store.hibernate.query.HqlQueryExecutor;
import com.xpn.xwiki.web.XWikiServletRequest;
import com.xpn.xwiki.web.XWikiServletRequestStub;
import com.xpn.xwiki.web.XWikiServletResponse;
import com.xpn.xwiki.web.XWikiServletResponseStub;
import javax.inject.Provider;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.chain.web.servlet.ServletWebContext;
import org.apache.struts.chain.contexts.ServletActionContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.hibernate.FlushMode;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.engine.query.OrdinalParameterDescriptor;
import org.hibernate.engine.query.ParameterMetadata;
import org.hibernate.impl.CollectionFilterImpl;
import org.hibernate.type.UUIDBinaryType;
import org.junit.runner.RunWith;
import org.xwiki.component.embed.EmbeddableComponentManager;
import org.xwiki.component.internal.DocumentComponentManager;
import org.xwiki.context.Execution;
import org.xwiki.job.event.status.JobProgressManager;
import org.xwiki.logging.LogQueue;
import org.xwiki.query.Query;
import org.xwiki.query.internal.UniqueDocumentFilter;
import org.xwiki.security.authorization.ContextualAuthorizationManager;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class HqlQueryExecutor_ESTest extends HqlQueryExecutor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ContextualAuthorizationManager contextualAuthorizationManager0 = mock(ContextualAuthorizationManager.class, new ViolatedAssumptionAnswer());
      Provider<EmbeddableComponentManager> provider0 = (Provider<EmbeddableComponentManager>) mock(Provider.class, new ViolatedAssumptionAnswer());
      Execution execution0 = mock(Execution.class, new ViolatedAssumptionAnswer());
      JobProgressManager jobProgressManager0 = mock(JobProgressManager.class, new ViolatedAssumptionAnswer());
      HibernateSessionFactory hibernateSessionFactory0 = mock(HibernateSessionFactory.class, new ViolatedAssumptionAnswer());
      FlushMode flushMode0 = FlushMode.ALWAYS;
      SessionImplementor sessionImplementor0 = mock(SessionImplementor.class, new ViolatedAssumptionAnswer());
      UUIDBinaryType uUIDBinaryType0 = UUIDBinaryType.INSTANCE;
      HqlQueryExecutor.isSafeSelect("Ifxb+6tTGdn9-BO");
      HqlQueryExecutor hqlQueryExecutor0 = new HqlQueryExecutor();
      ContextualAuthorizationManager contextualAuthorizationManager1 = mock(ContextualAuthorizationManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "authorization", (Object) contextualAuthorizationManager1);
      Provider<DocumentComponentManager> provider1 = (Provider<DocumentComponentManager>) mock(Provider.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "componentManagerProvider", (Object) provider1);
      Execution execution1 = mock(Execution.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "execution", (Object) execution1);
      JobProgressManager jobProgressManager1 = mock(JobProgressManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "progress", (Object) jobProgressManager1);
      HibernateSessionFactory hibernateSessionFactory1 = mock(HibernateSessionFactory.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "sessionFactory", (Object) hibernateSessionFactory1);
      Injector.validateBean(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class);
      hqlQueryExecutor0.checkAllowed((Query) null);
      XWikiHibernateStore xWikiHibernateStore0 = new XWikiHibernateStore();
      HqlQueryExecutor.isSafeSelect("order by kspe");
      UniqueDocumentFilter uniqueDocumentFilter0 = new UniqueDocumentFilter();
      MergeResult mergeResult0 = new MergeResult();
      LogQueue logQueue0 = mergeResult0.getLog();
      Injector.inject(uniqueDocumentFilter0, (Class<?>) UniqueDocumentFilter.class, "logger", (Object) logQueue0);
      Injector.validateBean(uniqueDocumentFilter0, (Class<?>) UniqueDocumentFilter.class);
      OrdinalParameterDescriptor[] ordinalParameterDescriptorArray0 = new OrdinalParameterDescriptor[2];
      OrdinalParameterDescriptor ordinalParameterDescriptor0 = new OrdinalParameterDescriptor((-5), uUIDBinaryType0, (-1233101627));
      ordinalParameterDescriptorArray0[0] = ordinalParameterDescriptor0;
      OrdinalParameterDescriptor ordinalParameterDescriptor1 = new OrdinalParameterDescriptor((-137190182), uUIDBinaryType0, (-5));
      ordinalParameterDescriptorArray0[1] = ordinalParameterDescriptor1;
      XWikiServletRequestStub xWikiServletRequestStub0 = new XWikiServletRequestStub();
      HttpServletRequestWrapper httpServletRequestWrapper0 = new HttpServletRequestWrapper(xWikiServletRequestStub0);
      XWikiServletRequest xWikiServletRequest0 = new XWikiServletRequest(httpServletRequestWrapper0);
      xWikiServletRequest0.getServletContext();
      XWikiServletResponseStub xWikiServletResponseStub0 = new XWikiServletResponseStub();
      xWikiServletResponseStub0.getHttpServletResponse();
      XWikiServletResponse xWikiServletResponse0 = new XWikiServletResponse((HttpServletResponse) null);
      ServletWebContext servletWebContext0 = new ServletWebContext((ServletContext) null, xWikiServletRequest0, xWikiServletResponse0);
      ServletActionContext servletActionContext0 = new ServletActionContext(servletWebContext0);
      ParameterMetadata parameterMetadata0 = new ParameterMetadata(ordinalParameterDescriptorArray0, servletActionContext0);
      CollectionFilterImpl collectionFilterImpl0 = new CollectionFilterImpl("The query requires programming right", uniqueDocumentFilter0, sessionImplementor0, parameterMetadata0);
      org.hibernate.Query query0 = collectionFilterImpl0.setTimeout((-1233101627));
      // Undeclared exception!
      hqlQueryExecutor0.setNamedParameter(query0, "order by kspe", xWikiServletResponse0);
  }
}
