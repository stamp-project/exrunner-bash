/*

 * Mon Apr 20 20:35:20 UTC 2020
 */

package org.xwiki.mail.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.store.XWikiStoreInterface;
import javax.inject.Provider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.xwiki.mail.MailStatus;
import org.xwiki.mail.MailStoreException;
import org.xwiki.mail.internal.DatabaseMailStatusStore;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DatabaseMailStatusStore_ESTest extends DatabaseMailStatusStore_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DatabaseMailStatusStore databaseMailStatusStore0 = new DatabaseMailStatusStore();
      XWikiContext xWikiContext0 = new XWikiContext();
      Provider<Object> provider0 = (Provider<Object>) mock(Provider.class, new ViolatedAssumptionAnswer());
      doReturn(xWikiContext0).when(provider0).get();
      Injector.inject(databaseMailStatusStore0, (Class<?>) DatabaseMailStatusStore.class, "contextProvider", (Object) provider0);
      XWikiStoreInterface xWikiStoreInterface0 = mock(XWikiStoreInterface.class, new ViolatedAssumptionAnswer());
      String string0 = "failed notifying %s: %s";
      MailStatus mailStatus0 = new MailStatus();
      try { 
        databaseMailStatusStore0.load("failed notifying %s: %s");
        fail("Expecting exception: MailStoreException");
      
      } catch(MailStoreException e) {
         //
         // Failed to load mail statuses matching the filter [{id=failed notifying %s: %s}] from the database.
         //
         verifyException("org.xwiki.mail.internal.DatabaseMailStatusStore", e);
      }
  }
}
