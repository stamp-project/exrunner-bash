/*

 * Mon Apr 20 19:27:01 UTC 2020
 */

package org.xwiki.notifications.internal.email;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import java.util.function.Consumer;
import javax.mail.internet.MimeMessage;
import javax.swing.JTree;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.hibernate.collection.PersistentSortedMap;
import org.hibernate.engine.SessionImplementor;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.xwiki.bridge.DocumentAccessBridge;
import org.xwiki.mail.MailSenderConfiguration;
import org.xwiki.mail.MimeMessageFactory;
import org.xwiki.model.reference.DocumentReference;
import org.xwiki.model.reference.EntityReferenceSerializer;
import org.xwiki.model.reference.LocalDocumentReference;
import org.xwiki.model.reference.ObjectReference;
import org.xwiki.model.reference.WikiReference;
import org.xwiki.notifications.NotificationManager;
import org.xwiki.notifications.email.NotificationEmailRenderer;
import org.xwiki.notifications.internal.email.AbstractMimeMessageIterator;
import org.xwiki.notifications.internal.email.NotificationUserIterator;
import org.xwiki.notifications.internal.email.PeriodicMimeMessageIterator;
import org.xwiki.wiki.descriptor.WikiDescriptor;
import org.xwiki.wiki.descriptor.WikiDescriptorManager;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractMimeMessageIterator_ESTest extends AbstractMimeMessageIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NotificationEmailRenderer notificationEmailRenderer0 = mock(NotificationEmailRenderer.class, new ViolatedAssumptionAnswer());
      DocumentAccessBridge documentAccessBridge0 = mock(DocumentAccessBridge.class, new ViolatedAssumptionAnswer());
      MimeMessageFactory<ObjectReference> mimeMessageFactory0 = (MimeMessageFactory<ObjectReference>) mock(MimeMessageFactory.class, new ViolatedAssumptionAnswer());
      Logger logger0 = mock(Logger.class, new ViolatedAssumptionAnswer());
      MailSenderConfiguration mailSenderConfiguration0 = mock(MailSenderConfiguration.class, new ViolatedAssumptionAnswer());
      WikiDescriptorManager wikiDescriptorManager0 = mock(WikiDescriptorManager.class, new ViolatedAssumptionAnswer());
      Consumer<MimeMessage> consumer0 = (Consumer<MimeMessage>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      NotificationUserIterator notificationUserIterator0 = mock(NotificationUserIterator.class, new ViolatedAssumptionAnswer());
      SessionImplementor sessionImplementor0 = mock(SessionImplementor.class, new ViolatedAssumptionAnswer());
      PersistentSortedMap persistentSortedMap0 = new PersistentSortedMap(sessionImplementor0);
      Locale locale0 = Locale.JAPANESE;
      LocalDocumentReference localDocumentReference0 = new LocalDocumentReference("T{HmN%oM", "T{HmN%oM", locale0);
      WikiDescriptor wikiDescriptor0 = new WikiDescriptor("i#t)``o @J)c/Jq", "!v: <W,");
      wikiDescriptor0.getReference();
      WikiReference wikiReference0 = wikiDescriptor0.getReference();
      DocumentReference documentReference0 = new DocumentReference(localDocumentReference0, wikiReference0);
      PeriodicMimeMessageIterator periodicMimeMessageIterator0 = new PeriodicMimeMessageIterator();
      NotificationManager notificationManager0 = mock(NotificationManager.class, new ViolatedAssumptionAnswer());
      Injector.inject(periodicMimeMessageIterator0, (Class<?>) PeriodicMimeMessageIterator.class, "notificationManager", (Object) notificationManager0);
      EntityReferenceSerializer<JTree> entityReferenceSerializer0 = (EntityReferenceSerializer<JTree>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      Injector.inject(periodicMimeMessageIterator0, (Class<?>) PeriodicMimeMessageIterator.class, "serializer", (Object) entityReferenceSerializer0);
      NotificationEmailRenderer notificationEmailRenderer1 = mock(NotificationEmailRenderer.class, new ViolatedAssumptionAnswer());
      Injector.inject(periodicMimeMessageIterator0, (Class<?>) AbstractMimeMessageIterator.class, "defaultNotificationEmailRenderer", (Object) notificationEmailRenderer1);
      DocumentAccessBridge documentAccessBridge1 = mock(DocumentAccessBridge.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      periodicMimeMessageIterator0.next();
  }
}
