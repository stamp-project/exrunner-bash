/*

 * Mon Apr 20 19:30:17 UTC 2020
 */

package org.xwiki.notifications.internal.email;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ch.qos.logback.classic.Logger;
import java.time.chrono.MinguoDate;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.jfree.data.xy.XYDatasetTableModel;
import org.junit.runner.RunWith;
import org.xwiki.bridge.DocumentAccessBridge;
import org.xwiki.component.manager.ComponentManager;
import org.xwiki.configuration.ConfigurationSource;
import org.xwiki.mail.MimeMessageFactory;
import org.xwiki.model.reference.DocumentReference;
import org.xwiki.model.reference.DocumentReferenceResolver;
import org.xwiki.model.reference.EntityReferenceSerializer;
import org.xwiki.notifications.CompositeEvent;
import org.xwiki.notifications.NotificationManager;
import org.xwiki.notifications.email.NotificationEmailRenderer;
import org.xwiki.notifications.internal.email.AbstractMimeMessageIterator;
import org.xwiki.notifications.internal.email.PeriodicMimeMessageIterator;
import org.xwiki.wiki.descriptor.WikiDescriptorManager;
import ucar.nc2.util.net.URLStreamHandlerFactory;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractMimeMessageIterator_ESTest extends AbstractMimeMessageIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NotificationManager notificationManager0 = mock(NotificationManager.class, new ViolatedAssumptionAnswer());
      EntityReferenceSerializer<CompositeEvent> entityReferenceSerializer0 = (EntityReferenceSerializer<CompositeEvent>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      NotificationEmailRenderer notificationEmailRenderer0 = mock(NotificationEmailRenderer.class, new ViolatedAssumptionAnswer());
      MimeMessageFactory<XYDatasetTableModel> mimeMessageFactory0 = (MimeMessageFactory<XYDatasetTableModel>) mock(MimeMessageFactory.class, new ViolatedAssumptionAnswer());
      ConfigurationSource configurationSource0 = mock(ConfigurationSource.class, new ViolatedAssumptionAnswer());
      ConfigurationSource configurationSource1 = mock(ConfigurationSource.class, new ViolatedAssumptionAnswer());
      ConfigurationSource configurationSource2 = mock(ConfigurationSource.class, new ViolatedAssumptionAnswer());
      WikiDescriptorManager wikiDescriptorManager0 = mock(WikiDescriptorManager.class, new ViolatedAssumptionAnswer());
      DocumentAccessBridge documentAccessBridge0 = mock(DocumentAccessBridge.class, new ViolatedAssumptionAnswer());
      Logger logger0 = (Logger)URLStreamHandlerFactory.log;
      DocumentReferenceResolver<MinguoDate> documentReferenceResolver0 = (DocumentReferenceResolver<MinguoDate>) mock(DocumentReferenceResolver.class, new ViolatedAssumptionAnswer());
      DocumentReferenceResolver<String> documentReferenceResolver1 = (DocumentReferenceResolver<String>) mock(DocumentReferenceResolver.class, new ViolatedAssumptionAnswer());
      EntityReferenceSerializer<MinguoDate> entityReferenceSerializer1 = (EntityReferenceSerializer<MinguoDate>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      EntityReferenceSerializer<XYDatasetTableModel> entityReferenceSerializer2 = (EntityReferenceSerializer<XYDatasetTableModel>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      ComponentManager componentManager0 = mock(ComponentManager.class, new ViolatedAssumptionAnswer());
      PeriodicMimeMessageIterator periodicMimeMessageIterator0 = new PeriodicMimeMessageIterator();
      NotificationManager notificationManager1 = mock(NotificationManager.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(notificationManager1).getEvents(anyString() , any(org.xwiki.notifications.NotificationFormat.class) , anyBoolean() , anyInt() , any(java.util.Date.class) , any(java.util.Date.class) , anyList());
      Injector.inject(periodicMimeMessageIterator0, (Class<?>) PeriodicMimeMessageIterator.class, "notificationManager", (Object) notificationManager1);
      EntityReferenceSerializer<CompositeEvent> entityReferenceSerializer3 = (EntityReferenceSerializer<CompositeEvent>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(entityReferenceSerializer3).serialize(any(org.xwiki.model.reference.EntityReference.class) , any(java.lang.Object[].class));
      Injector.inject(periodicMimeMessageIterator0, (Class<?>) PeriodicMimeMessageIterator.class, "serializer", (Object) entityReferenceSerializer3);
      NotificationEmailRenderer notificationEmailRenderer1 = mock(NotificationEmailRenderer.class, new ViolatedAssumptionAnswer());
      Injector.inject(periodicMimeMessageIterator0, (Class<?>) AbstractMimeMessageIterator.class, "defaultNotificationEmailRenderer", (Object) notificationEmailRenderer1);
      DocumentAccessBridge documentAccessBridge1 = mock(DocumentAccessBridge.class, new ViolatedAssumptionAnswer());
      Injector.inject(periodicMimeMessageIterator0, (Class<?>) AbstractMimeMessageIterator.class, "documentAccessBridge", (Object) documentAccessBridge1);
      MimeMessageFactory<Object> mimeMessageFactory1 = (MimeMessageFactory<Object>) mock(MimeMessageFactory.class, new ViolatedAssumptionAnswer());
      Injector.inject(periodicMimeMessageIterator0, (Class<?>) AbstractMimeMessageIterator.class, "factory", (Object) mimeMessageFactory1);
      periodicMimeMessageIterator0.retrieveCompositeEventList((DocumentReference) null);
      // Undeclared exception!
      periodicMimeMessageIterator0.next();
  }
}
