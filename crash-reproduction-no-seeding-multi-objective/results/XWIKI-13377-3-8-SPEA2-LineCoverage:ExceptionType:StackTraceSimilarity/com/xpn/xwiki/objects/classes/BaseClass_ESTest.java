/*

 * Mon Apr 20 14:40:48 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.objects.BaseCollection;
import com.xpn.xwiki.objects.BaseObject;
import com.xpn.xwiki.objects.meta.NumberMetaClass;
import com.xpn.xwiki.objects.meta.PasswordMetaClass;
import com.xpn.xwiki.objects.meta.TimezoneMetaClass;
import java.util.Map;
import java.util.TreeMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.model.reference.DocumentReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DocumentReference documentReference0 = mock(DocumentReference.class, new ViolatedAssumptionAnswer());
      XWikiContext xWikiContext0 = new XWikiContext();
      BaseObject baseObject0 = new BaseObject();
      TimezoneMetaClass timezoneMetaClass0 = new TimezoneMetaClass();
      TreeMap<String, PasswordMetaClass> treeMap0 = new TreeMap<String, PasswordMetaClass>();
      timezoneMetaClass0.safeget("J*X#ant?");
      PasswordMetaClass passwordMetaClass0 = new PasswordMetaClass();
      treeMap0.put("numberType", passwordMetaClass0);
      XWikiContext xWikiContext1 = new XWikiContext();
      NumberMetaClass numberMetaClass0 = new NumberMetaClass();
      // Undeclared exception!
      numberMetaClass0.fromMap((Map<String, ?>) treeMap0, (BaseCollection) baseObject0);
  }
}
