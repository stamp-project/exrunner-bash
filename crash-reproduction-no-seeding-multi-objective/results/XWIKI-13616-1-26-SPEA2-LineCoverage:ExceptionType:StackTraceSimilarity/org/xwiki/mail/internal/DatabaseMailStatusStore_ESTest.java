/*

 * Mon Apr 20 20:46:10 UTC 2020
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
import org.apache.commons.collections.ExtendedProperties;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;
import org.xwiki.context.ExecutionContext;
import org.xwiki.mail.MailStoreException;
import org.xwiki.mail.internal.DatabaseMailStatusStore;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class DatabaseMailStatusStore_ESTest extends DatabaseMailStatusStore_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DatabaseMailStatusStore databaseMailStatusStore0 = new DatabaseMailStatusStore();
      XWikiContext xWikiContext0 = new XWikiContext();
      XWikiContext xWikiContext1 = xWikiContext0.clone();
      xWikiContext0.setOriginalWikiId("v; !3!JzD.O");
      XWikiContext xWikiContext2 = xWikiContext1.clone();
      Provider<Object> provider0 = (Provider<Object>) mock(Provider.class, new ViolatedAssumptionAnswer());
      doReturn(xWikiContext2).when(provider0).get();
      Injector.inject(databaseMailStatusStore0, (Class<?>) DatabaseMailStatusStore.class, "contextProvider", (Object) provider0);
      ExecutionContext executionContext0 = new ExecutionContext();
      Map<String, Object> map0 = executionContext0.getProperties();
      databaseMailStatusStore0.computeCountQueryString(map0);
      String string0 = "Alg.Alias.AlgorithmParameters.SHA256withRSA/PSS";
      FacesWebContext facesWebContext0 = new FacesWebContext();
      ExtendedProperties extendedProperties0 = new ExtendedProperties();
      try { 
        databaseMailStatusStore0.load((Map<String, Object>) extendedProperties0, 8, 1281, "*SKf", false);
        fail("Expecting exception: MailStoreException");
      
      } catch(MailStoreException e) {
         //
         // Failed to load mail statuses matching the filter [{}] from the database.
         //
         verifyException("org.xwiki.mail.internal.DatabaseMailStatusStore", e);
      }
  }
}
