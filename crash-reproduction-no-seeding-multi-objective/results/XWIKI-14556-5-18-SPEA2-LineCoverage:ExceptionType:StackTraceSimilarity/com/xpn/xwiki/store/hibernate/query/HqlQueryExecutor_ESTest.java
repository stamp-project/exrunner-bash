/*

 * Wed Apr 22 17:39:24 UTC 2020
 */

package com.xpn.xwiki.store.hibernate.query;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.store.hibernate.query.HqlQueryExecutor;
import java.util.HashMap;
import javax.inject.Provider;
import javax.swing.table.DefaultTableModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.hibernate.FlushMode;
import org.hibernate.Query;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.engine.query.OrdinalParameterDescriptor;
import org.hibernate.engine.query.ParameterMetadata;
import org.hibernate.impl.CollectionFilterImpl;
import org.junit.runner.RunWith;
import org.xwiki.component.embed.EmbeddableComponentManager;
import org.xwiki.component.internal.UserComponentManager;
import org.xwiki.context.Execution;
import org.xwiki.job.event.status.JobProgressManager;
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
      Execution execution0 = mock(Execution.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "execution", (Object) execution0);
      JobProgressManager jobProgressManager0 = mock(JobProgressManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "progress", (Object) jobProgressManager0);
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) execution0;
      objectArray0[1] = (Object) provider0;
      objectArray0[2] = (Object) contextualAuthorizationManager0;
      objectArray0[3] = (Object) provider0;
      objectArray0[4] = (Object) execution0;
      objectArray0[5] = (Object) hqlQueryExecutor0;
      objectArray0[6] = (Object) execution0;
      objectArray0[7] = (Object) provider0;
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(objectArray0, 3128);
      String string0 = null;
      XWikiContext xWikiContext0 = new XWikiContext();
      SessionImplementor sessionImplementor0 = mock(SessionImplementor.class, new ViolatedAssumptionAnswer());
      HashMap<UserComponentManager, String> hashMap0 = new HashMap<UserComponentManager, String>();
      ParameterMetadata parameterMetadata0 = new ParameterMetadata((OrdinalParameterDescriptor[]) null, hashMap0);
      CollectionFilterImpl collectionFilterImpl0 = new CollectionFilterImpl((String) null, xWikiContext0, sessionImplementor0, parameterMetadata0);
      FlushMode flushMode0 = FlushMode.COMMIT;
      Query query0 = collectionFilterImpl0.setFlushMode(flushMode0);
      query0.setFirstResult((-71));
      String string1 = "tx_{";
      // Undeclared exception!
      hqlQueryExecutor0.setNamedParameter(query0, "tx_{", flushMode0);
  }
}
