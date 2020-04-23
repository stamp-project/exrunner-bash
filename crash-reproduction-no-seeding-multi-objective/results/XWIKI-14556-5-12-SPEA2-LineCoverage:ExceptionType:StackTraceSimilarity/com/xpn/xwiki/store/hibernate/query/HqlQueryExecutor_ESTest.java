/*

 * Wed Apr 22 17:34:44 UTC 2020
 */

package com.xpn.xwiki.store.hibernate.query;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.store.hibernate.query.HqlQueryExecutor;
import org.apache.commons.chain.web.servlet.ServletWebContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.engine.query.OrdinalParameterDescriptor;
import org.hibernate.engine.query.ParameterMetadata;
import org.hibernate.impl.CollectionFilterImpl;
import org.hibernate.type.LongType;
import org.junit.runner.RunWith;
import org.xwiki.security.authorization.ContextualAuthorizationManager;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class HqlQueryExecutor_ESTest extends HqlQueryExecutor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HqlQueryExecutor hqlQueryExecutor0 = new HqlQueryExecutor();
      ContextualAuthorizationManager contextualAuthorizationManager0 = mock(ContextualAuthorizationManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "authorization", (Object) contextualAuthorizationManager0);
      SessionImplementor sessionImplementor0 = mock(SessionImplementor.class, new ViolatedAssumptionAnswer());
      String string0 = "/}<#|j\\excW0!SMK";
      OrdinalParameterDescriptor[] ordinalParameterDescriptorArray0 = new OrdinalParameterDescriptor[1];
      LongType longType0 = new LongType();
      OrdinalParameterDescriptor ordinalParameterDescriptor0 = new OrdinalParameterDescriptor((-1), longType0, (-463604944));
      ordinalParameterDescriptorArray0[0] = ordinalParameterDescriptor0;
      ServletWebContext servletWebContext0 = new ServletWebContext();
      ParameterMetadata parameterMetadata0 = new ParameterMetadata(ordinalParameterDescriptorArray0, servletWebContext0);
      CollectionFilterImpl collectionFilterImpl0 = new CollectionFilterImpl("strategy", sessionImplementor0, sessionImplementor0, parameterMetadata0);
      XWikiContext xWikiContext0 = new XWikiContext();
      xWikiContext0.clone();
      // Undeclared exception!
      hqlQueryExecutor0.setNamedParameter(collectionFilterImpl0, " POaRX~V=:aD4", servletWebContext0);
  }
}
