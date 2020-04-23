/*

 * Wed Apr 22 17:28:50 UTC 2020
 */

package com.xpn.xwiki.store.hibernate.query;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ch.qos.logback.classic.Logger;
import com.xpn.xwiki.store.hibernate.query.HqlQueryExecutor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.engine.query.OrdinalParameterDescriptor;
import org.hibernate.engine.query.ParameterMetadata;
import org.hibernate.impl.CollectionFilterImpl;
import org.infinispan.atomic.impl.AtomicHashMap;
import org.junit.runner.RunWith;
import org.slf4j.event.SubstituteLoggingEvent;
import org.xwiki.configuration.ConfigurationSource;
import org.xwiki.query.Query;
import org.xwiki.query.internal.AbstractHiddenFilter;
import org.xwiki.query.internal.AbstractWhereQueryFilter;
import org.xwiki.query.internal.DefaultQuery;
import org.xwiki.query.internal.HiddenDocumentFilter;
import org.xwiki.query.internal.LanguageQueryFilter;
import org.xwiki.query.internal.NoOpQueryFilter;
import org.xwiki.security.authorization.ContextualAuthorizationManager;
import ucar.nc2.util.net.URLStreamHandlerFactory;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class HqlQueryExecutor_ESTest extends HqlQueryExecutor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HqlQueryExecutor hqlQueryExecutor0 = new HqlQueryExecutor();
      ContextualAuthorizationManager contextualAuthorizationManager0 = mock(ContextualAuthorizationManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "authorization", (Object) contextualAuthorizationManager0);
      DefaultQuery defaultQuery0 = new DefaultQuery("", "6?!uWQt<)`[8", hqlQueryExecutor0);
      DefaultQuery defaultQuery1 = new DefaultQuery("", hqlQueryExecutor0);
      LanguageQueryFilter languageQueryFilter0 = new LanguageQueryFilter();
      HiddenDocumentFilter hiddenDocumentFilter0 = new HiddenDocumentFilter();
      ConfigurationSource configurationSource0 = mock(ConfigurationSource.class, new ViolatedAssumptionAnswer());
      Injector.inject(hiddenDocumentFilter0, (Class<?>) AbstractHiddenFilter.class, "userPreferencesSource", (Object) configurationSource0);
      Logger logger0 = (Logger)URLStreamHandlerFactory.log;
      Injector.inject(hiddenDocumentFilter0, (Class<?>) AbstractWhereQueryFilter.class, "logger", (Object) logger0);
      Injector.validateBean(hiddenDocumentFilter0, (Class<?>) HiddenDocumentFilter.class);
      Query query0 = defaultQuery1.bindValue((String) null, (Object) hiddenDocumentFilter0);
      SubstituteLoggingEvent substituteLoggingEvent0 = new SubstituteLoggingEvent();
      SessionImplementor sessionImplementor0 = mock(SessionImplementor.class, new ViolatedAssumptionAnswer());
      OrdinalParameterDescriptor[] ordinalParameterDescriptorArray0 = new OrdinalParameterDescriptor[0];
      AtomicHashMap<NoOpQueryFilter, DefaultQuery> atomicHashMap0 = new AtomicHashMap<NoOpQueryFilter, DefaultQuery>();
      AtomicHashMap<NoOpQueryFilter, DefaultQuery> atomicHashMap1 = atomicHashMap0.copy();
      AtomicHashMap<NoOpQueryFilter, DefaultQuery> atomicHashMap2 = atomicHashMap1.copy();
      NoOpQueryFilter noOpQueryFilter0 = new NoOpQueryFilter();
      atomicHashMap1.put(noOpQueryFilter0, (DefaultQuery) query0);
      ParameterMetadata parameterMetadata0 = new ParameterMetadata(ordinalParameterDescriptorArray0, atomicHashMap2);
      CollectionFilterImpl collectionFilterImpl0 = new CollectionFilterImpl("win", substituteLoggingEvent0, sessionImplementor0, parameterMetadata0);
      atomicHashMap2.replace(noOpQueryFilter0, (DefaultQuery) null);
      org.hibernate.Query query1 = collectionFilterImpl0.setFetchSize((-4708));
      query1.setFetchSize((-4708));
      // Undeclared exception!
      hqlQueryExecutor0.populateParameters(query1, query0);
  }
}
