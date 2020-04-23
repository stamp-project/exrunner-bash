/*

 * Mon Apr 20 20:17:53 UTC 2020
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
import org.xwiki.mail.MailStoreException;
import org.xwiki.mail.internal.DatabaseMailStatusStore;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DatabaseMailStatusStore_ESTest extends DatabaseMailStatusStore_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DatabaseMailStatusStore databaseMailStatusStore0 = new DatabaseMailStatusStore();
      XWikiContext xWikiContext0 = new XWikiContext();
      XWikiContext xWikiContext1 = xWikiContext0.clone();
      XWikiContext xWikiContext2 = xWikiContext1.clone();
      XWikiContext xWikiContext3 = xWikiContext2.clone();
      XWikiContext xWikiContext4 = xWikiContext3.clone();
      XWikiContext xWikiContext5 = xWikiContext4.clone();
      XWikiContext xWikiContext6 = xWikiContext5.clone();
      Provider<XWikiContext> provider0 = (Provider<XWikiContext>) mock(Provider.class, new ViolatedAssumptionAnswer());
      doReturn(xWikiContext6).when(provider0).get();
      Injector.inject(databaseMailStatusStore0, (Class<?>) DatabaseMailStatusStore.class, "contextProvider", (Object) provider0);
      XWikiStoreInterface xWikiStoreInterface0 = mock(XWikiStoreInterface.class, new ViolatedAssumptionAnswer());
      try { 
        databaseMailStatusStore0.load("done deleting collection rows: ");
        fail("Expecting exception: MailStoreException");
      
      } catch(MailStoreException e) {
         //
         // Failed to load mail statuses matching the filter [{id=done deleting collection rows: }] from the database.
         //
         verifyException("org.xwiki.mail.internal.DatabaseMailStatusStore", e);
      }
  }
}
