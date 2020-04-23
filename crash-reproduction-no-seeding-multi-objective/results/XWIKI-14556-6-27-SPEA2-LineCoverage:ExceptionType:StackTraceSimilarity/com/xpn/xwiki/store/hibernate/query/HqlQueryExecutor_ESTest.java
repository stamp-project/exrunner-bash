/*

 * Wed Apr 22 17:48:07 UTC 2020
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
import org.hibernate.engine.SessionImplementor;
import org.hibernate.engine.query.OrdinalParameterDescriptor;
import org.hibernate.engine.query.ParameterMetadata;
import org.hibernate.impl.CollectionFilterImpl;
import org.hibernate.impl.SQLQueryImpl;
import org.hibernate.type.MaterializedBlobType;
import org.junit.runner.RunWith;
import org.xwiki.query.Query;
import org.xwiki.query.internal.DefaultQuery;
import org.xwiki.query.internal.EscapeLikeParametersFilter;
import org.xwiki.security.authorization.ContextualAuthorizationManager;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class HqlQueryExecutor_ESTest extends HqlQueryExecutor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HqlQueryExecutor hqlQueryExecutor0 = new HqlQueryExecutor();
      ContextualAuthorizationManager contextualAuthorizationManager0 = mock(ContextualAuthorizationManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "authorization", (Object) contextualAuthorizationManager0);
      Provider<SQLQueryImpl> provider0 = (Provider<SQLQueryImpl>) mock(Provider.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "componentManagerProvider", (Object) provider0);
      DefaultQuery defaultQuery0 = new DefaultQuery("A! AD$7[0&M", (String) null, hqlQueryExecutor0);
      Query query0 = defaultQuery0.bindValue((String) null, (Object) "A! AD$7[0&M");
      EscapeLikeParametersFilter escapeLikeParametersFilter0 = new EscapeLikeParametersFilter();
      Query query1 = escapeLikeParametersFilter0.filterQuery(query0);
      SessionImplementor sessionImplementor0 = mock(SessionImplementor.class, new ViolatedAssumptionAnswer());
      OrdinalParameterDescriptor[] ordinalParameterDescriptorArray0 = new OrdinalParameterDescriptor[3];
      MaterializedBlobType materializedBlobType0 = MaterializedBlobType.INSTANCE;
      OrdinalParameterDescriptor ordinalParameterDescriptor0 = new OrdinalParameterDescriptor((-105), materializedBlobType0, (-105));
      ordinalParameterDescriptorArray0[0] = ordinalParameterDescriptor0;
      OrdinalParameterDescriptor ordinalParameterDescriptor1 = new OrdinalParameterDescriptor((-105), materializedBlobType0, (-105));
      ordinalParameterDescriptorArray0[1] = ordinalParameterDescriptor1;
      OrdinalParameterDescriptor ordinalParameterDescriptor2 = new OrdinalParameterDescriptor((-105), materializedBlobType0, 258);
      ordinalParameterDescriptorArray0[2] = ordinalParameterDescriptor2;
      ParameterMetadata parameterMetadata0 = new ParameterMetadata(ordinalParameterDescriptorArray0, (Map) null);
      CollectionFilterImpl collectionFilterImpl0 = new CollectionFilterImpl("[z[.X-S 9&1", query1, sessionImplementor0, parameterMetadata0);
      org.hibernate.Query query2 = collectionFilterImpl0.setReadOnly(true);
      // Undeclared exception!
      hqlQueryExecutor0.populateParameters(query2, query1);
  }
}
