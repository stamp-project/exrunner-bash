/*

 * Mon Apr 20 15:07:08 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.BaseCollection;
import com.xpn.xwiki.objects.classes.BaseClass;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BaseClass baseClass0 = new BaseClass();
      baseClass0.getNameField();
      baseClass0.hasExternalCustomMapping();
      baseClass0.addLevelsField(".", "");
      ConcurrentHashMap<String, BaseClass> concurrentHashMap0 = new ConcurrentHashMap<String, BaseClass>();
      concurrentHashMap0.keySet(baseClass0);
      concurrentHashMap0.mappingCount();
      concurrentHashMap0.put(".", baseClass0);
      // Undeclared exception!
      baseClass0.fromMap((Map<String, ?>) concurrentHashMap0, (BaseCollection) baseClass0);
  }
}
