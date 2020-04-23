/*

 * Mon Apr 20 19:23:29 UTC 2020
 */

package org.xwiki.notifications.internal.email;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.XWikiContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.slf4j.event.SubstituteLoggingEvent;
import org.xwiki.notifications.internal.email.PeriodicMimeMessageIterator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractMimeMessageIterator_ESTest extends AbstractMimeMessageIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PeriodicMimeMessageIterator periodicMimeMessageIterator0 = new PeriodicMimeMessageIterator();
      SubstituteLoggingEvent substituteLoggingEvent0 = new SubstituteLoggingEvent();
      XWikiContext xWikiContext0 = new XWikiContext();
      // Undeclared exception!
      periodicMimeMessageIterator0.next();
  }
}
