/*

 * Wed Apr 22 17:46:21 UTC 2020
 */

package com.xpn.xwiki.store.hibernate.query;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.store.hibernate.query.HqlQueryExecutor;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.SynchronousQueue;
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
import org.slf4j.event.SubstituteLoggingEvent;
import org.slf4j.helpers.SubstituteLogger;
import org.xwiki.component.internal.WikiComponentManager;
import org.xwiki.configuration.ConfigurationSource;
import org.xwiki.context.Execution;
import org.xwiki.job.event.status.JobProgressManager;
import org.xwiki.model.reference.ClassPropertyReference;
import org.xwiki.model.reference.DocumentReferenceResolver;
import org.xwiki.model.reference.EntityReferenceSerializer;
import org.xwiki.query.Query;
import org.xwiki.query.internal.AbstractHiddenFilter;
import org.xwiki.query.internal.AbstractWhereQueryFilter;
import org.xwiki.query.internal.DefaultQuery;
import org.xwiki.query.internal.HiddenSpaceFilter;
import org.xwiki.query.internal.ScriptQueryParameter;
import org.xwiki.rendering.block.RawBlock;
import org.xwiki.security.authorization.ContextualAuthorizationManager;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class HqlQueryExecutor_ESTest extends HqlQueryExecutor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Execution execution0 = mock(Execution.class, new ViolatedAssumptionAnswer());
      JobProgressManager jobProgressManager0 = mock(JobProgressManager.class, new ViolatedAssumptionAnswer());
      EntityReferenceSerializer<RawBlock> entityReferenceSerializer0 = (EntityReferenceSerializer<RawBlock>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      DocumentReferenceResolver<ScriptQueryParameter> documentReferenceResolver0 = (DocumentReferenceResolver<ScriptQueryParameter>) mock(DocumentReferenceResolver.class, new ViolatedAssumptionAnswer());
      HqlQueryExecutor hqlQueryExecutor0 = new HqlQueryExecutor();
      ContextualAuthorizationManager contextualAuthorizationManager0 = mock(ContextualAuthorizationManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "authorization", (Object) contextualAuthorizationManager0);
      Provider<ClassPropertyReference> provider0 = (Provider<ClassPropertyReference>) mock(Provider.class, new ViolatedAssumptionAnswer());
      DefaultQuery defaultQuery0 = new DefaultQuery("]b\"jcq=mOUQnfo", "s!", hqlQueryExecutor0);
      DefaultQuery defaultQuery1 = new DefaultQuery("-w", hqlQueryExecutor0);
      Query query0 = defaultQuery1.bindValue("5u", (Object) jobProgressManager0);
      hqlQueryExecutor0.populateParameters((org.hibernate.Query) null, defaultQuery0);
      ConcurrentHashMap<WikiComponentManager, SubstituteLoggingEvent> concurrentHashMap0 = new ConcurrentHashMap<WikiComponentManager, SubstituteLoggingEvent>();
      ParameterMetadata parameterMetadata0 = new ParameterMetadata((OrdinalParameterDescriptor[]) null, concurrentHashMap0);
      HiddenSpaceFilter hiddenSpaceFilter0 = new HiddenSpaceFilter();
      ConfigurationSource configurationSource0 = mock(ConfigurationSource.class, new ViolatedAssumptionAnswer());
      Injector.inject(hiddenSpaceFilter0, (Class<?>) AbstractHiddenFilter.class, "userPreferencesSource", (Object) configurationSource0);
      SynchronousQueue<SubstituteLoggingEvent> synchronousQueue0 = new SynchronousQueue<SubstituteLoggingEvent>();
      SubstituteLogger substituteLogger0 = new SubstituteLogger("-w", synchronousQueue0, true);
      Injector.inject(hiddenSpaceFilter0, (Class<?>) AbstractWhereQueryFilter.class, "logger", (Object) substituteLogger0);
      Injector.validateBean(hiddenSpaceFilter0, (Class<?>) HiddenSpaceFilter.class);
      ParameterMetadata parameterMetadata1 = new ParameterMetadata((OrdinalParameterDescriptor[]) null, concurrentHashMap0);
      CollectionFilterImpl collectionFilterImpl0 = new CollectionFilterImpl("", hiddenSpaceFilter0, (SessionImplementor) null, parameterMetadata1);
      collectionFilterImpl0.setProperties((Map) concurrentHashMap0);
      // Undeclared exception!
      hqlQueryExecutor0.populateParameters(collectionFilterImpl0, query0);
  }
}
