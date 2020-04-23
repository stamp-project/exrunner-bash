/*

 * Wed Apr 22 17:44:57 UTC 2020
 */

package com.xpn.xwiki.store.hibernate.query;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.classes.TextAreaClass;
import com.xpn.xwiki.store.hibernate.HibernateSessionFactory;
import com.xpn.xwiki.store.hibernate.query.HqlQueryExecutor;
import java.util.TreeMap;
import javax.inject.Provider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.engine.query.OrdinalParameterDescriptor;
import org.hibernate.engine.query.ParameterMetadata;
import org.hibernate.impl.CollectionFilterImpl;
import org.junit.runner.RunWith;
import org.xwiki.component.embed.EmbeddableComponentManager;
import org.xwiki.component.internal.SpaceComponentManager;
import org.xwiki.context.Execution;
import org.xwiki.context.ExecutionContext;
import org.xwiki.job.event.status.JobProgressManager;
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
      Provider<EscapeLikeParametersFilter> provider0 = (Provider<EscapeLikeParametersFilter>) mock(Provider.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "componentManagerProvider", (Object) provider0);
      ExecutionContext executionContext0 = new ExecutionContext();
      Execution execution0 = mock(Execution.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "execution", (Object) execution0);
      JobProgressManager jobProgressManager0 = mock(JobProgressManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "progress", (Object) jobProgressManager0);
      OrdinalParameterDescriptor[] ordinalParameterDescriptorArray0 = new OrdinalParameterDescriptor[0];
      hqlQueryExecutor0.completeShortFormStatement("g\u0007^Kx]r");
      TextAreaClass.ContentType textAreaClass_ContentType0 = TextAreaClass.ContentType.VELOCITY_CODE;
      HibernateSessionFactory hibernateSessionFactory0 = mock(HibernateSessionFactory.class, new ViolatedAssumptionAnswer());
      DefaultQuery defaultQuery0 = new DefaultQuery("Execute HQL query [{}]", hqlQueryExecutor0);
      defaultQuery0.bindValue("Execute HQL query [{}]", (Object) "xwikicontext");
      ExecutionContext executionContext1 = new ExecutionContext();
      TreeMap<SpaceComponentManager, SpaceComponentManager> treeMap0 = new TreeMap<SpaceComponentManager, SpaceComponentManager>();
      ParameterMetadata parameterMetadata0 = new ParameterMetadata(ordinalParameterDescriptorArray0, treeMap0);
      CollectionFilterImpl collectionFilterImpl0 = new CollectionFilterImpl("g\u0007^Kx]r", "g\u0007^Kx]r", (SessionImplementor) null, parameterMetadata0);
      DefaultQuery defaultQuery1 = new DefaultQuery("@w<yBEc", hqlQueryExecutor0);
      EmbeddableComponentManager embeddableComponentManager0 = new EmbeddableComponentManager("g\u0007^Kx]r");
      EscapeLikeParametersFilter escapeLikeParametersFilter0 = new EscapeLikeParametersFilter();
      defaultQuery0.bindValue(91, (Object) escapeLikeParametersFilter0);
      // Undeclared exception!
      hqlQueryExecutor0.populateParameters(collectionFilterImpl0, defaultQuery0);
  }
}
