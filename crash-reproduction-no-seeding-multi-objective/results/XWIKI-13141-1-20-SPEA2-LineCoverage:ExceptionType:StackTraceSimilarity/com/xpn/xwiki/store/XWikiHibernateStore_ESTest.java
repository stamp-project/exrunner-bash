/*

 * Wed Apr 22 16:14:18 UTC 2020
 */

package com.xpn.xwiki.store;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.XWikiException;
import com.xpn.xwiki.doc.XWikiDocument;
import com.xpn.xwiki.objects.DoubleProperty;
import com.xpn.xwiki.objects.classes.TextAreaClass;
import com.xpn.xwiki.store.XWikiHibernateBaseStore;
import com.xpn.xwiki.store.XWikiHibernateStore;
import com.xpn.xwiki.store.hibernate.HibernateSessionFactory;
import com.xpn.xwiki.store.migration.DataMigrationManager;
import javax.inject.Provider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.hibernate.SessionFactory;
import org.jgroups.util.TimeScheduler3;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.xwiki.context.Execution;
import org.xwiki.logging.LoggerManager;
import org.xwiki.model.reference.DocumentReference;
import org.xwiki.model.reference.DocumentReferenceResolver;
import org.xwiki.model.reference.EntityReferenceSerializer;
import org.xwiki.observation.ObservationManager;
import org.xwiki.query.QueryManager;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class XWikiHibernateStore_ESTest extends XWikiHibernateStore_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XWikiHibernateStore xWikiHibernateStore0 = new XWikiHibernateStore("YOO(3U");
      EntityReferenceSerializer<XWikiDocument> entityReferenceSerializer0 = (EntityReferenceSerializer<XWikiDocument>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      Injector.inject(xWikiHibernateStore0, (Class<?>) XWikiHibernateStore.class, "compactWikiEntityReferenceSerializer", (Object) entityReferenceSerializer0);
      DocumentReferenceResolver<TextAreaClass> documentReferenceResolver0 = (DocumentReferenceResolver<TextAreaClass>) mock(DocumentReferenceResolver.class, new ViolatedAssumptionAnswer());
      Injector.inject(xWikiHibernateStore0, (Class<?>) XWikiHibernateStore.class, "currentMixedDocumentReferenceResolver", (Object) documentReferenceResolver0);
      DocumentReferenceResolver<TimeScheduler3.Task> documentReferenceResolver1 = (DocumentReferenceResolver<TimeScheduler3.Task>) mock(DocumentReferenceResolver.class, new ViolatedAssumptionAnswer());
      Injector.inject(xWikiHibernateStore0, (Class<?>) XWikiHibernateStore.class, "defaultDocumentReferenceResolver", (Object) documentReferenceResolver1);
      EntityReferenceSerializer<String> entityReferenceSerializer1 = (EntityReferenceSerializer<String>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(entityReferenceSerializer1).serialize(any(org.xwiki.model.reference.EntityReference.class) , any(java.lang.Object[].class));
      Injector.inject(xWikiHibernateStore0, (Class<?>) XWikiHibernateStore.class, "defaultEntityReferenceSerializer", (Object) entityReferenceSerializer1);
      EntityReferenceSerializer<DoubleProperty> entityReferenceSerializer2 = (EntityReferenceSerializer<DoubleProperty>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      Injector.inject(xWikiHibernateStore0, (Class<?>) XWikiHibernateStore.class, "localEntityReferenceSerializer", (Object) entityReferenceSerializer2);
      Logger logger0 = mock(Logger.class, new ViolatedAssumptionAnswer());
      Injector.inject(xWikiHibernateStore0, (Class<?>) XWikiHibernateStore.class, "logger", (Object) logger0);
      ObservationManager observationManager0 = mock(ObservationManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(xWikiHibernateStore0, (Class<?>) XWikiHibernateStore.class, "observationManager", (Object) observationManager0);
      Provider<TimeScheduler3.Task> provider0 = (Provider<TimeScheduler3.Task>) mock(Provider.class, new ViolatedAssumptionAnswer());
      Injector.inject(xWikiHibernateStore0, (Class<?>) XWikiHibernateStore.class, "oldRenderingProvider", (Object) provider0);
      QueryManager queryManager0 = mock(QueryManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(xWikiHibernateStore0, (Class<?>) XWikiHibernateStore.class, "queryManager", (Object) queryManager0);
      DataMigrationManager dataMigrationManager0 = mock(DataMigrationManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(xWikiHibernateStore0, (Class<?>) XWikiHibernateBaseStore.class, "dataMigrationManager", (Object) dataMigrationManager0);
      Execution execution0 = mock(Execution.class, new ViolatedAssumptionAnswer());
      Injector.inject(xWikiHibernateStore0, (Class<?>) XWikiHibernateBaseStore.class, "execution", (Object) execution0);
      LoggerManager loggerManager0 = mock(LoggerManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(xWikiHibernateStore0, (Class<?>) XWikiHibernateBaseStore.class, "loggerManager", (Object) loggerManager0);
      HibernateSessionFactory hibernateSessionFactory0 = mock(HibernateSessionFactory.class, new ViolatedAssumptionAnswer());
      doReturn((SessionFactory) null).when(hibernateSessionFactory0).getSessionFactory();
      Injector.inject(xWikiHibernateStore0, (Class<?>) XWikiHibernateBaseStore.class, "sessionFactory", (Object) hibernateSessionFactory0);
      Injector.validateBean(xWikiHibernateStore0, (Class<?>) XWikiHibernateStore.class);
      xWikiHibernateStore0.getSessionFactory();
      XWikiDocument xWikiDocument0 = mock(XWikiDocument.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(xWikiDocument0).getComment();
      doReturn((DocumentReference) null).when(xWikiDocument0).getDocumentReference();
      XWikiContext xWikiContext0 = new XWikiContext();
      XWikiContext xWikiContext1 = xWikiContext0.clone();
      XWikiContext xWikiContext2 = xWikiContext1.clone();
      XWikiContext xWikiContext3 = xWikiContext2.clone();
      try { 
        xWikiHibernateStore0.saveXWikiDoc(xWikiDocument0, xWikiContext3, false);
        fail("Expecting exception: XWikiException");
      
      } catch(XWikiException e) {
         //
         // Error number 3201 in 3: Exception while saving document null
         //
         verifyException("com.xpn.xwiki.store.XWikiHibernateStore", e);
      }
  }
}
