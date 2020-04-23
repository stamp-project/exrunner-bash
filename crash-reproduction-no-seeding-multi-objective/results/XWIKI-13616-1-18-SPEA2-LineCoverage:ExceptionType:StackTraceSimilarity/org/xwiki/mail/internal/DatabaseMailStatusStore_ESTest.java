/*

 * Mon Apr 20 20:39:27 UTC 2020
 */

package org.xwiki.mail.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.XWikiContext;
import java.util.Map;
import javax.inject.Provider;
import org.apache.commons.chain.web.faces.FacesWebContext;
import org.apache.struts.chain.contexts.WebActionContext;
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
      Provider<XWikiContext> provider0 = (Provider<XWikiContext>) mock(Provider.class, new ViolatedAssumptionAnswer());
      doReturn(xWikiContext0).when(provider0).get();
      Injector.inject(databaseMailStatusStore0, (Class<?>) DatabaseMailStatusStore.class, "contextProvider", (Object) provider0);
      FacesWebContext facesWebContext0 = new FacesWebContext();
      WebActionContext webActionContext0 = new WebActionContext(facesWebContext0);
      try { 
        databaseMailStatusStore0.load((Map<String, Object>) webActionContext0, (-2), 98, (String) null, false);
        fail("Expecting exception: MailStoreException");
      
      } catch(MailStoreException e) {
         //
         // Failed to load mail statuses matching the filter [org.apache.struts.chain.contexts.WebActionContext@2ba38f51] from the database.
         //
         verifyException("org.xwiki.mail.internal.DatabaseMailStatusStore", e);
      }
  }
}
