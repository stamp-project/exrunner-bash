/*

 * Wed Apr 22 17:27:29 UTC 2020
 */

package com.xpn.xwiki.store.hibernate.query;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.store.hibernate.query.HqlQueryExecutor;
import javax.print.attribute.standard.PDLOverrideSupported;
import org.apache.commons.collections.ExtendedProperties;
import org.apache.velocity.runtime.RuntimeInstance;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.engine.query.OrdinalParameterDescriptor;
import org.hibernate.engine.query.ParameterMetadata;
import org.hibernate.impl.QueryImpl;
import org.junit.runner.RunWith;
import org.xwiki.component.embed.EmbeddableComponentManager;
import org.xwiki.query.internal.NoOpQueryFilter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class HqlQueryExecutor_ESTest extends HqlQueryExecutor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HqlQueryExecutor hqlQueryExecutor0 = new HqlQueryExecutor();
      SessionImplementor sessionImplementor0 = mock(SessionImplementor.class, new ViolatedAssumptionAnswer());
      RuntimeInstance runtimeInstance0 = new RuntimeInstance();
      ExtendedProperties extendedProperties0 = runtimeInstance0.getConfiguration();
      ParameterMetadata parameterMetadata0 = new ParameterMetadata((OrdinalParameterDescriptor[]) null, extendedProperties0);
      QueryImpl queryImpl0 = new QueryImpl("CJ^]HU)AV0", sessionImplementor0, parameterMetadata0);
      NoOpQueryFilter noOpQueryFilter0 = new NoOpQueryFilter();
      EmbeddableComponentManager embeddableComponentManager0 = new EmbeddableComponentManager((String) null);
      PDLOverrideSupported pDLOverrideSupported0 = PDLOverrideSupported.NOT_ATTEMPTED;
      PDLOverrideSupported pDLOverrideSupported1 = PDLOverrideSupported.NOT_ATTEMPTED;
      pDLOverrideSupported1.getCategory();
      QueryImpl queryImpl1 = new QueryImpl("sql", (SessionImplementor) null, parameterMetadata0);
      NoOpQueryFilter noOpQueryFilter1 = new NoOpQueryFilter();
      Object object0 = new Object();
      // Undeclared exception!
      hqlQueryExecutor0.setNamedParameter(queryImpl1, " J,", object0);
  }
}
