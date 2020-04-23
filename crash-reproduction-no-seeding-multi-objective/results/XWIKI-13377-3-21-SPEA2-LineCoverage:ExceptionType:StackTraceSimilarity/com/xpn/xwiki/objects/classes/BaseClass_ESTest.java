/*

 * Mon Apr 20 15:08:07 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.objects.BaseCollection;
import com.xpn.xwiki.objects.classes.BaseClass;
import com.xpn.xwiki.objects.classes.TextAreaClass;
import com.xpn.xwiki.objects.meta.NumberMetaClass;
import com.xpn.xwiki.objects.meta.StringMetaClass;
import com.xpn.xwiki.objects.meta.TextAreaMetaClass;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NumberMetaClass numberMetaClass0 = new NumberMetaClass();
      NumberMetaClass numberMetaClass1 = new NumberMetaClass();
      BaseClass baseClass0 = numberMetaClass1.clone();
      TextAreaClass textAreaClass0 = new TextAreaClass(numberMetaClass0);
      Boolean boolean0 = new Boolean(true);
      XWikiContext xWikiContext0 = new XWikiContext();
      ConcurrentHashMap<String, StringMetaClass> concurrentHashMap0 = new ConcurrentHashMap<String, StringMetaClass>();
      TextAreaMetaClass textAreaMetaClass0 = new TextAreaMetaClass();
      concurrentHashMap0.put("numberType", textAreaMetaClass0);
      // Undeclared exception!
      numberMetaClass0.fromMap((Map<String, ?>) concurrentHashMap0, (BaseCollection) baseClass0);
  }
}
