/*

 * Mon Apr 20 19:21:40 UTC 2020
 */

package org.xwiki.notifications.internal.email;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ch.qos.logback.classic.Logger;
import java.time.chrono.HijrahDate;
import java.util.ArrayDeque;
import javax.swing.JSeparator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.hibernate.loader.custom.sql.SQLCustomQuery;
import org.jgroups.util.ExtendedUUID;
import org.junit.runner.RunWith;
import org.slf4j.event.SubstituteLoggingEvent;
import org.xwiki.bridge.DocumentAccessBridge;
import org.xwiki.configuration.ConfigurationSource;
import org.xwiki.mail.MimeMessageFactory;
import org.xwiki.model.reference.EntityReferenceSerializer;
import org.xwiki.notifications.NotificationManager;
import org.xwiki.notifications.email.NotificationEmailRenderer;
import org.xwiki.notifications.internal.email.AbstractMimeMessageIterator;
import org.xwiki.notifications.internal.email.PeriodicMimeMessageIterator;
import org.xwiki.wiki.descriptor.WikiDescriptorManager;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractMimeMessageIterator_ESTest extends AbstractMimeMessageIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NotificationManager notificationManager0 = mock(NotificationManager.class, new ViolatedAssumptionAnswer());
      ConfigurationSource configurationSource0 = mock(ConfigurationSource.class, new ViolatedAssumptionAnswer());
      ArrayDeque<SubstituteLoggingEvent> arrayDeque0 = new ArrayDeque<SubstituteLoggingEvent>();
      SubstituteLoggingEvent substituteLoggingEvent0 = new SubstituteLoggingEvent();
      substituteLoggingEvent0.getMessage();
      WikiDescriptorManager wikiDescriptorManager0 = mock(WikiDescriptorManager.class, new ViolatedAssumptionAnswer());
      NotificationManager notificationManager1 = mock(NotificationManager.class, new ViolatedAssumptionAnswer());
      NotificationEmailRenderer notificationEmailRenderer0 = mock(NotificationEmailRenderer.class, new ViolatedAssumptionAnswer());
      MimeMessageFactory<ExtendedUUID> mimeMessageFactory0 = (MimeMessageFactory<ExtendedUUID>) mock(MimeMessageFactory.class, new ViolatedAssumptionAnswer());
      ConfigurationSource configurationSource1 = mock(ConfigurationSource.class, new ViolatedAssumptionAnswer());
      ConfigurationSource configurationSource2 = mock(ConfigurationSource.class, new ViolatedAssumptionAnswer());
      ConfigurationSource configurationSource3 = mock(ConfigurationSource.class, new ViolatedAssumptionAnswer());
      NotificationManager notificationManager2 = mock(NotificationManager.class, new ViolatedAssumptionAnswer());
      EntityReferenceSerializer<ExtendedUUID> entityReferenceSerializer0 = (EntityReferenceSerializer<ExtendedUUID>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      NotificationEmailRenderer notificationEmailRenderer1 = mock(NotificationEmailRenderer.class, new ViolatedAssumptionAnswer());
      DocumentAccessBridge documentAccessBridge0 = mock(DocumentAccessBridge.class, new ViolatedAssumptionAnswer());
      Logger logger0 = (Logger)SQLCustomQuery.log;
      ConfigurationSource configurationSource4 = mock(ConfigurationSource.class, new ViolatedAssumptionAnswer());
      ConfigurationSource configurationSource5 = mock(ConfigurationSource.class, new ViolatedAssumptionAnswer());
      ConfigurationSource configurationSource6 = mock(ConfigurationSource.class, new ViolatedAssumptionAnswer());
      PeriodicMimeMessageIterator periodicMimeMessageIterator0 = new PeriodicMimeMessageIterator();
      NotificationManager notificationManager3 = mock(NotificationManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(periodicMimeMessageIterator0, (Class<?>) PeriodicMimeMessageIterator.class, "notificationManager", (Object) notificationManager3);
      EntityReferenceSerializer<JSeparator> entityReferenceSerializer1 = (EntityReferenceSerializer<JSeparator>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      Injector.inject(periodicMimeMessageIterator0, (Class<?>) PeriodicMimeMessageIterator.class, "serializer", (Object) entityReferenceSerializer1);
      NotificationEmailRenderer notificationEmailRenderer2 = mock(NotificationEmailRenderer.class, new ViolatedAssumptionAnswer());
      Injector.inject(periodicMimeMessageIterator0, (Class<?>) AbstractMimeMessageIterator.class, "defaultNotificationEmailRenderer", (Object) notificationEmailRenderer2);
      DocumentAccessBridge documentAccessBridge1 = mock(DocumentAccessBridge.class, new ViolatedAssumptionAnswer());
      Injector.inject(periodicMimeMessageIterator0, (Class<?>) AbstractMimeMessageIterator.class, "documentAccessBridge", (Object) documentAccessBridge1);
      MimeMessageFactory<HijrahDate> mimeMessageFactory1 = (MimeMessageFactory<HijrahDate>) mock(MimeMessageFactory.class, new ViolatedAssumptionAnswer());
      Injector.inject(periodicMimeMessageIterator0, (Class<?>) AbstractMimeMessageIterator.class, "factory", (Object) mimeMessageFactory1);
      periodicMimeMessageIterator0.iterator();
      periodicMimeMessageIterator0.hasNext();
      periodicMimeMessageIterator0.iterator();
      periodicMimeMessageIterator0.iterator();
      // Undeclared exception!
      periodicMimeMessageIterator0.next();
  }
}
