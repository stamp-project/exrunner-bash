/*

 * Mon Apr 20 19:25:26 UTC 2020
 */

package org.xwiki.notifications.internal.email;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ch.qos.logback.classic.Logger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.hibernate.loader.custom.sql.SQLCustomQuery;
import org.junit.runner.RunWith;
import org.xwiki.notifications.email.NotificationEmailRenderer;
import org.xwiki.notifications.internal.email.PeriodicMimeMessageIterator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractMimeMessageIterator_ESTest extends AbstractMimeMessageIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PeriodicMimeMessageIterator periodicMimeMessageIterator0 = new PeriodicMimeMessageIterator();
      NotificationEmailRenderer notificationEmailRenderer0 = mock(NotificationEmailRenderer.class, new ViolatedAssumptionAnswer());
      Logger logger0 = (Logger)SQLCustomQuery.log;
      // Undeclared exception!
      periodicMimeMessageIterator0.next();
  }
}
