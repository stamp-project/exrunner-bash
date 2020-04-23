/*

 * Wed Apr 22 17:29:52 UTC 2020
 */

package com.xpn.xwiki.store.hibernate.query;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.store.hibernate.query.HqlQueryExecutor;
import javatests.DiamondIterableMapMRO;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.engine.query.OrdinalParameterDescriptor;
import org.hibernate.engine.query.ParameterMetadata;
import org.hibernate.impl.CollectionFilterImpl;
import org.junit.runner.RunWith;
import org.slf4j.helpers.NOPLogger;
import org.xwiki.query.Query;
import org.xwiki.query.internal.DefaultQuery;
import org.xwiki.query.internal.DefaultQueryParameter;
import org.xwiki.query.internal.UniqueDocumentFilter;
import org.xwiki.security.authorization.ContextualAuthorizationManager;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class HqlQueryExecutor_ESTest extends HqlQueryExecutor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HqlQueryExecutor.isSafeSelect("MIo");
      HqlQueryExecutor hqlQueryExecutor0 = new HqlQueryExecutor();
      ContextualAuthorizationManager contextualAuthorizationManager0 = mock(ContextualAuthorizationManager.class, new ViolatedAssumptionAnswer());
      DefaultQuery defaultQuery0 = new DefaultQuery("MIo", "3,.", hqlQueryExecutor0);
      Query query0 = defaultQuery0.setOffset(382);
      DefaultQueryParameter defaultQueryParameter0 = new DefaultQueryParameter(defaultQuery0);
      DefaultQueryParameter defaultQueryParameter1 = new DefaultQueryParameter(query0);
      SessionImplementor sessionImplementor0 = mock(SessionImplementor.class, new ViolatedAssumptionAnswer());
      OrdinalParameterDescriptor[] ordinalParameterDescriptorArray0 = new OrdinalParameterDescriptor[0];
      DiamondIterableMapMRO diamondIterableMapMRO0 = new DiamondIterableMapMRO();
      ParameterMetadata parameterMetadata0 = new ParameterMetadata(ordinalParameterDescriptorArray0, diamondIterableMapMRO0);
      defaultQueryParameter1.like("MIo");
      CollectionFilterImpl collectionFilterImpl0 = new CollectionFilterImpl("listener ", defaultQueryParameter1, sessionImplementor0, parameterMetadata0);
      UniqueDocumentFilter uniqueDocumentFilter0 = new UniqueDocumentFilter();
      NOPLogger nOPLogger0 = NOPLogger.NOP_LOGGER;
      Injector.inject(uniqueDocumentFilter0, (Class<?>) UniqueDocumentFilter.class, "logger", (Object) nOPLogger0);
      Injector.validateBean(uniqueDocumentFilter0, (Class<?>) UniqueDocumentFilter.class);
      // Undeclared exception!
      hqlQueryExecutor0.setNamedParameter(collectionFilterImpl0, "\"bDs=|msM_{", uniqueDocumentFilter0);
  }
}
