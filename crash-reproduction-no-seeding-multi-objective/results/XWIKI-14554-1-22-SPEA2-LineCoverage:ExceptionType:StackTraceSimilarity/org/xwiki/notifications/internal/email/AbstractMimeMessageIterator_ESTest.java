/*

 * Mon Apr 20 19:29:07 UTC 2020
 */

package org.xwiki.notifications.internal.email;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.doc.XWikiDocument;
import com.xpn.xwiki.doc.merge.MergeResult;
import java.sql.SQLTransactionRollbackException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.slf4j.helpers.NOPLogger;
import org.xwiki.configuration.ConfigurationSource;
import org.xwiki.logging.LogQueue;
import org.xwiki.mail.internal.configuration.DefaultMailSenderConfiguration;
import org.xwiki.model.reference.LocalDocumentReference;
import org.xwiki.notifications.internal.email.PeriodicMimeMessageIterator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractMimeMessageIterator_ESTest extends AbstractMimeMessageIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PeriodicMimeMessageIterator periodicMimeMessageIterator0 = new PeriodicMimeMessageIterator();
      LocalDocumentReference localDocumentReference0 = (LocalDocumentReference)XWikiDocument.COMMENTSCLASS_REFERENCE;
      NOPLogger nOPLogger0 = NOPLogger.NOP_LOGGER;
      SQLTransactionRollbackException sQLTransactionRollbackException0 = new SQLTransactionRollbackException("events", "Xx^xc_5*", 2711);
      nOPLogger0.debug("events", (Throwable) sQLTransactionRollbackException0);
      NOPLogger nOPLogger1 = NOPLogger.NOP_LOGGER;
      nOPLogger1.getName();
      DefaultMailSenderConfiguration defaultMailSenderConfiguration0 = new DefaultMailSenderConfiguration();
      ConfigurationSource configurationSource0 = mock(ConfigurationSource.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultMailSenderConfiguration0, (Class<?>) DefaultMailSenderConfiguration.class, "documentsSource", (Object) configurationSource0);
      MergeResult mergeResult0 = new MergeResult();
      LogQueue logQueue0 = mergeResult0.getLog();
      Injector.inject(defaultMailSenderConfiguration0, (Class<?>) DefaultMailSenderConfiguration.class, "logger", (Object) logQueue0);
      ConfigurationSource configurationSource1 = mock(ConfigurationSource.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultMailSenderConfiguration0, (Class<?>) DefaultMailSenderConfiguration.class, "mailConfigSource", (Object) configurationSource1);
      ConfigurationSource configurationSource2 = mock(ConfigurationSource.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultMailSenderConfiguration0, (Class<?>) DefaultMailSenderConfiguration.class, "xwikiPropertiesSource", (Object) configurationSource2);
      Injector.validateBean(defaultMailSenderConfiguration0, (Class<?>) DefaultMailSenderConfiguration.class);
      DefaultMailSenderConfiguration defaultMailSenderConfiguration1 = new DefaultMailSenderConfiguration();
      ConfigurationSource configurationSource3 = mock(ConfigurationSource.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultMailSenderConfiguration1, (Class<?>) DefaultMailSenderConfiguration.class, "documentsSource", (Object) configurationSource3);
      Injector.inject(defaultMailSenderConfiguration1, (Class<?>) DefaultMailSenderConfiguration.class, "logger", (Object) nOPLogger0);
      ConfigurationSource configurationSource4 = mock(ConfigurationSource.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultMailSenderConfiguration1, (Class<?>) DefaultMailSenderConfiguration.class, "mailConfigSource", (Object) configurationSource4);
      ConfigurationSource configurationSource5 = mock(ConfigurationSource.class, new ViolatedAssumptionAnswer());
      Injector.inject(defaultMailSenderConfiguration1, (Class<?>) DefaultMailSenderConfiguration.class, "xwikiPropertiesSource", (Object) configurationSource5);
      Injector.validateBean(defaultMailSenderConfiguration1, (Class<?>) DefaultMailSenderConfiguration.class);
      NOPLogger nOPLogger2 = NOPLogger.NOP_LOGGER;
      // Undeclared exception!
      periodicMimeMessageIterator0.next();
  }
}
