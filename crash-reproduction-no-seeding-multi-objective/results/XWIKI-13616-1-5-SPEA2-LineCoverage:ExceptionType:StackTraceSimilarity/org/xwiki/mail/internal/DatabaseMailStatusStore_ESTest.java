/*

 * Mon Apr 20 20:21:58 UTC 2020
 */

package org.xwiki.mail.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.XWikiContext;
import java.util.Map;
import javax.inject.Provider;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.infinispan.atomic.impl.AtomicHashMap;
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
      Provider<Object> provider0 = (Provider<Object>) mock(Provider.class, new ViolatedAssumptionAnswer());
      doReturn(xWikiContext2).when(provider0).get();
      Injector.inject(databaseMailStatusStore0, (Class<?>) DatabaseMailStatusStore.class, "contextProvider", (Object) provider0);
      AtomicHashMap<String, Object> atomicHashMap0 = new AtomicHashMap<String, Object>();
      AtomicHashMap<String, Object> atomicHashMap1 = atomicHashMap0.copy();
      AtomicHashMap<String, Object> atomicHashMap2 = atomicHashMap0.copy();
      SpinnerNumberModel spinnerNumberModel0 = new SpinnerNumberModel();
      JSpinner jSpinner0 = new JSpinner(spinnerNumberModel0);
      atomicHashMap2.putIfAbsent("HhCN", atomicHashMap1);
      atomicHashMap2.copy();
      try { 
        databaseMailStatusStore0.load((Map<String, Object>) atomicHashMap1, (-615), (-1), (String) null, false);
        fail("Expecting exception: MailStoreException");
      
      } catch(MailStoreException e) {
         //
         // Failed to load mail statuses matching the filter [AtomicHashMap{size=0}] from the database.
         //
         verifyException("org.xwiki.mail.internal.DatabaseMailStatusStore", e);
      }
  }
}
