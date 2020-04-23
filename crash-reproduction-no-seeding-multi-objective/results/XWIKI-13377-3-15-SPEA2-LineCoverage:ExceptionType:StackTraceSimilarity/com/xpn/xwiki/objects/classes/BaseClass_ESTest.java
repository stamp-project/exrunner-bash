/*

 * Mon Apr 20 14:58:37 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.BaseCollection;
import com.xpn.xwiki.objects.meta.GroupsMetaClass;
import com.xpn.xwiki.objects.meta.StaticListMetaClass;
import java.util.HashMap;
import java.util.Map;
import org.apache.batik.gvt.text.GVTAttributedCharacterIterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GroupsMetaClass groupsMetaClass0 = new GroupsMetaClass();
      String string0 = "defaultWeb";
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      groupsMetaClass0.setId(0L);
      Integer integer0 = GVTAttributedCharacterIterator.TextAttribute.ADJUST_ALL;
      hashMap0.put("QOWu[M$", integer0);
      groupsMetaClass0.setValidationScript((String) null);
      Integer integer1 = GVTAttributedCharacterIterator.TextAttribute.ORIENTATION_AUTO;
      String string1 = "name";
      Integer integer2 = GVTAttributedCharacterIterator.TextAttribute.ARABIC_ISOLATED;
      hashMap0.put("name", integer2);
      String string2 = "A'QQ5(9<\"y&FI";
      Boolean boolean0 = new Boolean((String) null);
      StaticListMetaClass staticListMetaClass0 = new StaticListMetaClass();
      // Undeclared exception!
      staticListMetaClass0.fromMap((Map<String, ?>) hashMap0, (BaseCollection) groupsMetaClass0);
  }
}
