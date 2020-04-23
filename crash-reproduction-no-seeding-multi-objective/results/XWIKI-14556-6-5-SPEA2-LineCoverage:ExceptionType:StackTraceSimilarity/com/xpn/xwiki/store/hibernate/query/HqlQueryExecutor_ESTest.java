/*

 * Wed Apr 22 17:31:10 UTC 2020
 */

package com.xpn.xwiki.store.hibernate.query;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.store.hibernate.query.HqlQueryExecutor;
import java.util.Map;
import javax.inject.Provider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.hibernate.LockMode;
import org.hibernate.LockOptions;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.engine.query.OrdinalParameterDescriptor;
import org.hibernate.engine.query.ParameterMetadata;
import org.hibernate.impl.CollectionFilterImpl;
import org.junit.runner.RunWith;
import org.xwiki.component.embed.EmbeddableComponentManager;
import org.xwiki.query.internal.DefaultQuery;
import org.xwiki.security.authorization.ContextualAuthorizationManager;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class HqlQueryExecutor_ESTest extends HqlQueryExecutor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HqlQueryExecutor hqlQueryExecutor0 = new HqlQueryExecutor();
      ContextualAuthorizationManager contextualAuthorizationManager0 = mock(ContextualAuthorizationManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "authorization", (Object) contextualAuthorizationManager0);
      Provider<EmbeddableComponentManager> provider0 = (Provider<EmbeddableComponentManager>) mock(Provider.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "componentManagerProvider", (Object) provider0);
      DefaultQuery defaultQuery0 = new DefaultQuery("mP", "escapeLikeParameters", hqlQueryExecutor0);
      defaultQuery0.bindValue("83", (Object) "mP");
      ParameterMetadata parameterMetadata0 = new ParameterMetadata((OrdinalParameterDescriptor[]) null, (Map) null);
      SessionImplementor sessionImplementor0 = mock(SessionImplementor.class, new ViolatedAssumptionAnswer());
      CollectionFilterImpl collectionFilterImpl0 = new CollectionFilterImpl("qQ+#AK6a", (Object) null, sessionImplementor0, parameterMetadata0);
      LockOptions lockOptions0 = LockOptions.READ;
      LockOptions lockOptions1 = lockOptions0.setTimeOut(31);
      LockMode lockMode0 = LockMode.FORCE;
      lockOptions1.setLockMode(lockMode0);
      LockOptions lockOptions2 = collectionFilterImpl0.getLockOptions();
      collectionFilterImpl0.setLockOptions(lockOptions2);
      // Undeclared exception!
      hqlQueryExecutor0.populateParameters(collectionFilterImpl0, defaultQuery0);
  }
}
