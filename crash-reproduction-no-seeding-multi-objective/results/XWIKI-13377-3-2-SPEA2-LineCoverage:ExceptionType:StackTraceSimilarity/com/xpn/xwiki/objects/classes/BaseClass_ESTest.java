/*

 * Mon Apr 20 14:28:53 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.objects.BaseCollection;
import com.xpn.xwiki.objects.classes.BaseClass;
import com.xpn.xwiki.objects.classes.PropertyClass;
import java.util.ArrayList;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.hibernate.collection.PersistentMap;
import org.hibernate.engine.SessionImplementor;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BaseClass baseClass0 = new BaseClass();
      ArrayList<PropertyClass> arrayList0 = new ArrayList<PropertyClass>();
      XWikiContext xWikiContext0 = new XWikiContext();
      BaseClass baseClass1 = new BaseClass();
      String string0 = "apr?";
      baseClass1.setFields(xWikiContext0);
      baseClass0.getListValue("Cache looku}: ");
      String string1 = "`B+.lT;xH[GVyzgzYcU";
      baseClass1.addUsersField("`B+.lT;xH[GVyzgzYcU", "");
      SessionImplementor sessionImplementor0 = mock(SessionImplementor.class, new ViolatedAssumptionAnswer());
      PersistentMap persistentMap0 = new PersistentMap(sessionImplementor0, xWikiContext0);
      // Undeclared exception!
      baseClass1.fromMap((Map<String, ?>) persistentMap0, (BaseCollection) baseClass0);
  }
}
