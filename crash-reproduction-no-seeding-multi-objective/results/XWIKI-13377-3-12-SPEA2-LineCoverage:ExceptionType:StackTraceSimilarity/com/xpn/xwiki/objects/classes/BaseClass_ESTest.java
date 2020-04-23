/*

 * Mon Apr 20 14:51:00 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.BaseCollection;
import com.xpn.xwiki.objects.classes.BaseClass;
import com.xpn.xwiki.objects.meta.DBTreeListMetaClass;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BaseClass baseClass0 = new BaseClass();
      baseClass0.addStaticListField("", "", (-2294), false, "x*TRhaYh{0rD{", "");
      baseClass0.getDefaultEditSheet();
      BaseClass baseClass1 = baseClass0.clone();
      ConcurrentSkipListMap<String, DBTreeListMetaClass> concurrentSkipListMap0 = new ConcurrentSkipListMap<String, DBTreeListMetaClass>();
      baseClass1.fromMap((Map<String, ?>) concurrentSkipListMap0, (BaseCollection) baseClass0);
      DBTreeListMetaClass dBTreeListMetaClass0 = new DBTreeListMetaClass();
      concurrentSkipListMap0.put("", dBTreeListMetaClass0);
      baseClass1.getNameField();
      // Undeclared exception!
      baseClass1.fromMap((Map<String, ?>) concurrentSkipListMap0, (BaseCollection) baseClass0);
  }
}
