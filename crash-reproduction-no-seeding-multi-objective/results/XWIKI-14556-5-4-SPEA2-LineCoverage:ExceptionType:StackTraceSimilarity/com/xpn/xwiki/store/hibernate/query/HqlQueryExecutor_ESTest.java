/*

 * Wed Apr 22 17:27:24 UTC 2020
 */

package com.xpn.xwiki.store.hibernate.query;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.store.hibernate.HibernateSessionFactory;
import com.xpn.xwiki.store.hibernate.query.HqlQueryExecutor;
import java.time.LocalDate;
import java.time.chrono.JapaneseChronology;
import java.time.chrono.JapaneseDate;
import java.time.temporal.TemporalAccessor;
import java.util.Hashtable;
import javax.inject.Provider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.hibernate.Query;
import org.hibernate.collection.PersistentMap;
import org.hibernate.engine.NamedSQLQueryDefinition;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.engine.query.OrdinalParameterDescriptor;
import org.hibernate.engine.query.ParameterMetadata;
import org.hibernate.impl.CollectionFilterImpl;
import org.junit.runner.RunWith;
import org.xwiki.bridge.DocumentAccessBridge;
import org.xwiki.component.embed.EmbeddableComponentManager;
import org.xwiki.component.internal.ContextRootComponentManager;
import org.xwiki.component.internal.WikiComponentManager;
import org.xwiki.component.internal.multi.ComponentManagerManager;
import org.xwiki.context.Execution;
import org.xwiki.job.event.status.JobProgressManager;
import org.xwiki.model.reference.EntityReferenceSerializer;
import org.xwiki.query.internal.HiddenDocumentFilter;
import org.xwiki.query.internal.UniqueDocumentFilter;
import org.xwiki.security.authorization.ContextualAuthorizationManager;
import org.xwiki.wiki.descriptor.WikiDescriptorManager;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class HqlQueryExecutor_ESTest extends HqlQueryExecutor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JobProgressManager jobProgressManager0 = mock(JobProgressManager.class, new ViolatedAssumptionAnswer());
      WikiDescriptorManager wikiDescriptorManager0 = mock(WikiDescriptorManager.class, new ViolatedAssumptionAnswer());
      Execution execution0 = mock(Execution.class, new ViolatedAssumptionAnswer());
      EntityReferenceSerializer<ContextRootComponentManager> entityReferenceSerializer0 = (EntityReferenceSerializer<ContextRootComponentManager>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      ComponentManagerManager componentManagerManager0 = mock(ComponentManagerManager.class, new ViolatedAssumptionAnswer());
      Provider<EmbeddableComponentManager> provider0 = (Provider<EmbeddableComponentManager>) mock(Provider.class, new ViolatedAssumptionAnswer());
      DocumentAccessBridge documentAccessBridge0 = mock(DocumentAccessBridge.class, new ViolatedAssumptionAnswer());
      EntityReferenceSerializer<NamedSQLQueryDefinition> entityReferenceSerializer1 = (EntityReferenceSerializer<NamedSQLQueryDefinition>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      EntityReferenceSerializer<WikiComponentManager> entityReferenceSerializer2 = (EntityReferenceSerializer<WikiComponentManager>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      Execution execution1 = mock(Execution.class, new ViolatedAssumptionAnswer());
      EntityReferenceSerializer<Integer> entityReferenceSerializer3 = (EntityReferenceSerializer<Integer>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      ComponentManagerManager componentManagerManager1 = mock(ComponentManagerManager.class, new ViolatedAssumptionAnswer());
      HqlQueryExecutor.isSafeSelect("o");
      HqlQueryExecutor hqlQueryExecutor0 = new HqlQueryExecutor();
      ContextualAuthorizationManager contextualAuthorizationManager0 = mock(ContextualAuthorizationManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "authorization", (Object) contextualAuthorizationManager0);
      Provider<HiddenDocumentFilter> provider1 = (Provider<HiddenDocumentFilter>) mock(Provider.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "componentManagerProvider", (Object) provider1);
      Execution execution2 = mock(Execution.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "execution", (Object) execution2);
      JobProgressManager jobProgressManager1 = mock(JobProgressManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "progress", (Object) jobProgressManager1);
      HibernateSessionFactory hibernateSessionFactory0 = mock(HibernateSessionFactory.class, new ViolatedAssumptionAnswer());
      Injector.inject(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class, "sessionFactory", (Object) hibernateSessionFactory0);
      Injector.validateBean(hqlQueryExecutor0, (Class<?>) HqlQueryExecutor.class);
      Hashtable<UniqueDocumentFilter, EmbeddableComponentManager> hashtable0 = new Hashtable<UniqueDocumentFilter, EmbeddableComponentManager>();
      PersistentMap persistentMap0 = new PersistentMap((SessionImplementor) null, hashtable0);
      ParameterMetadata parameterMetadata0 = new ParameterMetadata((OrdinalParameterDescriptor[]) null, persistentMap0);
      CollectionFilterImpl collectionFilterImpl0 = new CollectionFilterImpl("o", entityReferenceSerializer1, (SessionImplementor) null, parameterMetadata0);
      Query query0 = collectionFilterImpl0.setTimeout((-2414));
      JapaneseChronology japaneseChronology0 = JapaneseChronology.INSTANCE;
      LocalDate localDate0 = LocalDate.MAX;
      JapaneseDate japaneseDate0 = japaneseChronology0.date((TemporalAccessor) localDate0);
      // Undeclared exception!
      hqlQueryExecutor0.setNamedParameter(query0, "o", japaneseDate0);
  }
}
