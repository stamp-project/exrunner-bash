/*

 * Mon Apr 20 19:22:54 UTC 2020
 */

package org.xwiki.notifications.internal.email;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.function.Consumer;
import javax.mail.internet.MimeMessage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.slf4j.event.SubstituteLoggingEvent;
import org.slf4j.helpers.NOPLogger;
import org.slf4j.helpers.SubstituteLogger;
import org.xwiki.bridge.DocumentAccessBridge;
import org.xwiki.configuration.ConfigurationSource;
import org.xwiki.mail.internal.configuration.DefaultMailSenderConfiguration;
import org.xwiki.notifications.email.NotificationEmailRenderer;
import org.xwiki.notifications.internal.email.AbstractMimeMessageIterator;
import org.xwiki.notifications.internal.email.PeriodicMimeMessageIterator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractMimeMessageIterator_ESTest extends AbstractMimeMessageIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NotificationEmailRenderer notificationEmailRenderer0 = mock(NotificationEmailRenderer.class, new ViolatedAssumptionAnswer());
      Consumer<MimeMessage> consumer0 = (Consumer<MimeMessage>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      PeriodicMimeMessageIterator periodicMimeMessageIterator0 = new PeriodicMimeMessageIterator();
      NotificationEmailRenderer notificationEmailRenderer1 = mock(NotificationEmailRenderer.class, new ViolatedAssumptionAnswer());
      Injector.inject(periodicMimeMessageIterator0, (Class<?>) AbstractMimeMessageIterator.class, "defaultNotificationEmailRenderer", (Object) notificationEmailRenderer1);
      DocumentAccessBridge documentAccessBridge0 = mock(DocumentAccessBridge.class, new ViolatedAssumptionAnswer());
      DefaultMailSenderConfiguration defaultMailSenderConfiguration0 = new DefaultMailSenderConfiguration();
      ConfigurationSource configurationSource0 = mock(ConfigurationSource.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultMailSenderConfiguration0, (Class<?>) DefaultMailSenderConfiguration.class, "documentsSource", (Object) configurationSource0);
      NOPLogger nOPLogger0 = NOPLogger.NOP_LOGGER;
      Injector.inject(defaultMailSenderConfiguration0, (Class<?>) DefaultMailSenderConfiguration.class, "logger", (Object) nOPLogger0);
      ConfigurationSource configurationSource1 = mock(ConfigurationSource.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultMailSenderConfiguration0, (Class<?>) DefaultMailSenderConfiguration.class, "mailConfigSource", (Object) configurationSource1);
      ConfigurationSource configurationSource2 = mock(ConfigurationSource.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultMailSenderConfiguration0, (Class<?>) DefaultMailSenderConfiguration.class, "xwikiPropertiesSource", (Object) configurationSource2);
      Injector.validateBean(defaultMailSenderConfiguration0, (Class<?>) DefaultMailSenderConfiguration.class);
      PriorityBlockingQueue<SubstituteLoggingEvent> priorityBlockingQueue0 = new PriorityBlockingQueue<SubstituteLoggingEvent>();
      SubstituteLogger substituteLogger0 = new SubstituteLogger("Failed to generate an email for the user [{}].", priorityBlockingQueue0, true);
      // Undeclared exception!
      periodicMimeMessageIterator0.next();
  }
}
