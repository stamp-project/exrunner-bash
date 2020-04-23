/*

 * Mon Apr 20 15:28:17 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.BaseCollection;
import com.xpn.xwiki.objects.meta.DBListMetaClass;
import com.xpn.xwiki.objects.meta.DBTreeListMetaClass;
import com.xpn.xwiki.objects.meta.PasswordMetaClass;
import java.util.Hashtable;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.infinispan.cache.impl.AbstractDelegatingAdvancedCache;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AbstractDelegatingAdvancedCache.AdvancedCacheWrapper<String, String> abstractDelegatingAdvancedCache_AdvancedCacheWrapper0 = (AbstractDelegatingAdvancedCache.AdvancedCacheWrapper<String, String>) mock(AbstractDelegatingAdvancedCache.AdvancedCacheWrapper.class, new ViolatedAssumptionAnswer());
      PasswordMetaClass passwordMetaClass0 = new PasswordMetaClass();
      DBTreeListMetaClass dBTreeListMetaClass0 = new DBTreeListMetaClass();
      Hashtable<String, DBListMetaClass> hashtable0 = new Hashtable<String, DBListMetaClass>();
      hashtable0.put("displayType", dBTreeListMetaClass0);
      // Undeclared exception!
      dBTreeListMetaClass0.fromMap((Map<String, ?>) hashtable0, (BaseCollection) dBTreeListMetaClass0);
  }
}
