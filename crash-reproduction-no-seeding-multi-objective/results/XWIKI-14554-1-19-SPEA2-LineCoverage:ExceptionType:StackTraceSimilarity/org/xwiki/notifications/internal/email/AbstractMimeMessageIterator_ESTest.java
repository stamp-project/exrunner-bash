/*

 * Mon Apr 20 19:28:10 UTC 2020
 */

package org.xwiki.notifications.internal.email;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.jfree.data.xy.XYDatasetTableModel;
import org.junit.runner.RunWith;
import org.slf4j.helpers.NOPLogger;
import org.xwiki.bridge.DocumentAccessBridge;
import org.xwiki.configuration.ConfigurationSource;
import org.xwiki.mail.MimeMessageFactory;
import org.xwiki.mail.internal.configuration.DefaultMailSenderConfiguration;
import org.xwiki.model.reference.EntityReferenceSerializer;
import org.xwiki.notifications.NotificationManager;
import org.xwiki.notifications.email.NotificationEmailRenderer;
import org.xwiki.notifications.internal.email.PeriodicMimeMessageIterator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractMimeMessageIterator_ESTest extends AbstractMimeMessageIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PeriodicMimeMessageIterator periodicMimeMessageIterator0 = new PeriodicMimeMessageIterator();
      NotificationManager notificationManager0 = mock(NotificationManager.class, new ViolatedAssumptionAnswer());
      EntityReferenceSerializer<Integer> entityReferenceSerializer0 = (EntityReferenceSerializer<Integer>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      NotificationEmailRenderer notificationEmailRenderer0 = mock(NotificationEmailRenderer.class, new ViolatedAssumptionAnswer());
      DocumentAccessBridge documentAccessBridge0 = mock(DocumentAccessBridge.class, new ViolatedAssumptionAnswer());
      MimeMessageFactory<XYDatasetTableModel> mimeMessageFactory0 = (MimeMessageFactory<XYDatasetTableModel>) mock(MimeMessageFactory.class, new ViolatedAssumptionAnswer());
      NOPLogger nOPLogger0 = NOPLogger.NOP_LOGGER;
      DefaultMailSenderConfiguration defaultMailSenderConfiguration0 = new DefaultMailSenderConfiguration();
      ConfigurationSource configurationSource0 = mock(ConfigurationSource.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultMailSenderConfiguration0, (Class<?>) DefaultMailSenderConfiguration.class, "documentsSource", (Object) configurationSource0);
      // Undeclared exception!
      periodicMimeMessageIterator0.next();
  }
}
