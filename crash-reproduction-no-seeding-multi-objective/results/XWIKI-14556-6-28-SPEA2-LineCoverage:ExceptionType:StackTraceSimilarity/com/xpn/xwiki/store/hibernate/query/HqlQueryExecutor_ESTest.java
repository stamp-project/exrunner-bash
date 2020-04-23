/*

 * Wed Apr 22 17:50:36 UTC 2020
 */

package com.xpn.xwiki.store.hibernate.query;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.doc.merge.MergeResult;
import com.xpn.xwiki.store.hibernate.query.HqlQueryExecutor;
import javax.inject.Provider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.engine.query.OrdinalParameterDescriptor;
import org.hibernate.engine.query.ParameterMetadata;
import org.hibernate.impl.CollectionFilterImpl;
import org.infinispan.atomic.impl.AtomicHashMap;
import org.junit.runner.RunWith;
import org.xwiki.component.internal.ContextComponentManager;
import org.xwiki.component.internal.ContextRootComponentManager;
import org.xwiki.component.internal.RootComponentManager;
import org.xwiki.configuration.ConfigurationSource;
import org.xwiki.logging.LogQueue;
import org.xwiki.query.internal.AbstractHiddenFilter;
import org.xwiki.query.internal.AbstractWhereQueryFilter;
import org.xwiki.query.internal.DefaultQuery;
import org.xwiki.query.internal.HiddenSpaceFilter;
import org.xwiki.security.authorization.ContextualAuthorizationManager;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class HqlQueryExecutor_ESTest extends HqlQueryExecutor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HqlQueryExecutor hqlQueryExecutor0 = new HqlQueryExecutor();
      ContextualAuthorizationManager contextualAuthorizationManager0 = mock(ContextualAuthorizationManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "authorization", (Object) contextualAuthorizationManager0);
      Provider<ContextComponentManager> provider0 = (Provider<ContextComponentManager>) mock(Provider.class, new ViolatedAssumptionAnswer());
      LockOptions lockOptions0 = LockOptions.UPGRADE;
      HiddenSpaceFilter hiddenSpaceFilter0 = new HiddenSpaceFilter();
      ConfigurationSource configurationSource0 = mock(ConfigurationSource.class, new ViolatedAssumptionAnswer());
      Injector.inject(hiddenSpaceFilter0, (Class<?>) AbstractHiddenFilter.class, "userPreferencesSource", (Object) configurationSource0);
      MergeResult mergeResult0 = new MergeResult();
      LogQueue logQueue0 = mergeResult0.getLog();
      Injector.inject(hiddenSpaceFilter0, (Class<?>) AbstractWhereQueryFilter.class, "logger", (Object) logQueue0);
      Injector.validateBean(hiddenSpaceFilter0, (Class<?>) HiddenSpaceFilter.class);
      SessionImplementor sessionImplementor0 = mock(SessionImplementor.class, new ViolatedAssumptionAnswer());
      AtomicHashMap.ProxyMode atomicHashMap_ProxyMode0 = AtomicHashMap.ProxyMode.COARSE;
      AtomicHashMap<ContextRootComponentManager, RootComponentManager> atomicHashMap0 = new AtomicHashMap<ContextRootComponentManager, RootComponentManager>(false, atomicHashMap_ProxyMode0);
      ParameterMetadata parameterMetadata0 = new ParameterMetadata((OrdinalParameterDescriptor[]) null, atomicHashMap0);
      CollectionFilterImpl collectionFilterImpl0 = new CollectionFilterImpl((String) null, hiddenSpaceFilter0, sessionImplementor0, parameterMetadata0);
      LockOptions lockOptions1 = LockOptions.NONE;
      Query query0 = collectionFilterImpl0.setLockOptions(lockOptions1);
      String string0 = null;
      DefaultQuery defaultQuery0 = new DefaultQuery((String) null, (String) null, hqlQueryExecutor0);
      defaultQuery0.bindValue((String) null);
      defaultQuery0.checkCurrentAuthor(false);
      // Undeclared exception!
      hqlQueryExecutor0.populateParameters(query0, defaultQuery0);
  }
}
