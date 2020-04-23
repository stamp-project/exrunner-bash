/*

 * Mon Apr 20 15:00:40 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.BaseCollection;
import com.xpn.xwiki.objects.meta.EmailMetaClass;
import com.xpn.xwiki.objects.meta.PasswordMetaClass;
import java.util.HashMap;
import java.util.Map;
import org.dom4j.util.NonLazyElement;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PasswordMetaClass passwordMetaClass0 = new PasswordMetaClass();
      String string0 = "";
      passwordMetaClass0.getStringValue("");
      passwordMetaClass0.getSetValue("");
      passwordMetaClass0.getNumber();
      EmailMetaClass emailMetaClass0 = new EmailMetaClass();
      passwordMetaClass0.fromXML((String) null);
      HashMap<String, NonLazyElement> hashMap0 = new HashMap<String, NonLazyElement>();
      NonLazyElement nonLazyElement0 = new NonLazyElement((String) null);
      hashMap0.put("validationRegExp", nonLazyElement0);
      // Undeclared exception!
      passwordMetaClass0.fromMap((Map<String, ?>) hashMap0, (BaseCollection) emailMetaClass0);
  }
}
