/*

 * Mon Apr 20 19:32:06 UTC 2020
 */

package org.xwiki.notifications.internal.email;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ch.qos.logback.classic.Logger;
import java.sql.Timestamp;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.hibernate.loader.custom.sql.SQLCustomQuery;
import org.junit.runner.RunWith;
import org.slf4j.helpers.NOPLogger;
import org.xwiki.bridge.DocumentAccessBridge;
import org.xwiki.configuration.ConfigurationSource;
import org.xwiki.eventstream.internal.DefaultEvent;
import org.xwiki.model.reference.EntityReferenceSerializer;
import org.xwiki.model.reference.WikiReference;
import org.xwiki.notifications.NotificationManager;
import org.xwiki.notifications.email.NotificationEmailRenderer;
import org.xwiki.notifications.internal.email.PeriodicMimeMessageIterator;
import org.xwiki.wiki.descriptor.WikiDescriptorManager;
import ucar.nc2.util.net.URLStreamHandlerFactory;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractMimeMessageIterator_ESTest extends AbstractMimeMessageIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PeriodicMimeMessageIterator periodicMimeMessageIterator0 = new PeriodicMimeMessageIterator();
      NotificationManager notificationManager0 = mock(NotificationManager.class, new ViolatedAssumptionAnswer());
      EntityReferenceSerializer<WikiReference> entityReferenceSerializer0 = (EntityReferenceSerializer<WikiReference>) mock(EntityReferenceSerializer.class, new ViolatedAssumptionAnswer());
      NotificationEmailRenderer notificationEmailRenderer0 = mock(NotificationEmailRenderer.class, new ViolatedAssumptionAnswer());
      DocumentAccessBridge documentAccessBridge0 = mock(DocumentAccessBridge.class, new ViolatedAssumptionAnswer());
      Logger logger0 = (Logger)SQLCustomQuery.log;
      ConfigurationSource configurationSource0 = mock(ConfigurationSource.class, new ViolatedAssumptionAnswer());
      Logger logger1 = (Logger)URLStreamHandlerFactory.log;
      ConfigurationSource configurationSource1 = mock(ConfigurationSource.class, new ViolatedAssumptionAnswer());
      WikiDescriptorManager wikiDescriptorManager0 = mock(WikiDescriptorManager.class, new ViolatedAssumptionAnswer());
      DocumentAccessBridge documentAccessBridge1 = mock(DocumentAccessBridge.class, new ViolatedAssumptionAnswer());
      NOPLogger nOPLogger0 = NOPLogger.NOP_LOGGER;
      WikiDescriptorManager wikiDescriptorManager1 = mock(WikiDescriptorManager.class, new ViolatedAssumptionAnswer());
      Timestamp timestamp0 = new Timestamp((-1110));
      DefaultEvent defaultEvent0 = new DefaultEvent();
      defaultEvent0.getUser();
      // Undeclared exception!
      periodicMimeMessageIterator0.next();
  }
}
