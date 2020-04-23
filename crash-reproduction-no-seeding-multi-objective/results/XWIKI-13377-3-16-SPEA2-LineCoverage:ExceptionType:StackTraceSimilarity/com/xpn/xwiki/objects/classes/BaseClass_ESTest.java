/*

 * Mon Apr 20 14:58:16 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.BaseCollection;
import com.xpn.xwiki.objects.classes.PropertyClass;
import com.xpn.xwiki.objects.meta.BooleanMetaClass;
import com.xpn.xwiki.objects.meta.PropertyMetaClass;
import com.xpn.xwiki.objects.meta.StringMetaClass;
import com.xpn.xwiki.objects.meta.TimezoneMetaClass;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.infinispan.cache.impl.CacheImpl;
import org.infinispan.security.impl.SecureCacheImpl;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BooleanMetaClass booleanMetaClass0 = new BooleanMetaClass();
      PropertyMetaClass propertyMetaClass0 = booleanMetaClass0.clone();
      String string0 = "";
      propertyMetaClass0.addDateField("RJ3.YO8+-igKvkW9", "");
      int int0 = 18;
      booleanMetaClass0.addUsersField("", ";", 18);
      propertyMetaClass0.addDateField("", ";", "");
      ArrayList<PropertyClass> arrayList0 = new ArrayList<PropertyClass>();
      CacheImpl<String, TimezoneMetaClass> cacheImpl0 = new CacheImpl<String, TimezoneMetaClass>("");
      SecureCacheImpl<String, TimezoneMetaClass> secureCacheImpl0 = new SecureCacheImpl<String, TimezoneMetaClass>(cacheImpl0);
      propertyMetaClass0.getFloatValue("");
      StringMetaClass stringMetaClass0 = new StringMetaClass();
      ConcurrentSkipListMap<String, Object> concurrentSkipListMap0 = new ConcurrentSkipListMap<String, Object>();
      stringMetaClass0.addStaticListField(";", "", 246, false, true, "", "FkM{", "FkM{");
      concurrentSkipListMap0.put("validationMessage", stringMetaClass0);
      // Undeclared exception!
      stringMetaClass0.fromMap((Map<String, ?>) concurrentSkipListMap0, (BaseCollection) booleanMetaClass0);
  }
}
