/*

 * Mon Apr 20 14:33:02 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.objects.BaseCollection;
import com.xpn.xwiki.objects.BaseObject;
import com.xpn.xwiki.objects.classes.BaseClass;
import com.xpn.xwiki.objects.meta.NumberMetaClass;
import com.xpn.xwiki.objects.meta.PropertyMetaClass;
import java.util.Hashtable;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BaseClass baseClass0 = new BaseClass();
      String string0 = "Connections could not be acquired from the underlying database!";
      baseClass0.setDefaultEditSheet("Connections could not be acquired from the underlying database!");
      PropertyMetaClass propertyMetaClass0 = new PropertyMetaClass();
      Hashtable<String, NumberMetaClass> hashtable0 = new Hashtable<String, NumberMetaClass>();
      BaseCollection baseCollection0 = propertyMetaClass0.fromMap((Map<String, ?>) hashtable0, (BaseCollection) baseClass0);
      String string1 = "8Hk'-1=97DEaG";
      baseClass0.addGroupsField("Connections could not be acquired from the underlying database!", "Connections could not be acquired from the underlying database!", (-1982292596));
      propertyMetaClass0.getOwnerDocument();
      XWikiContext xWikiContext0 = new XWikiContext();
      BaseObject baseObject0 = baseClass0.newCustomClassInstance(xWikiContext0);
      baseObject0.clone();
      propertyMetaClass0.getDeprecatedObjectProperties(baseObject0);
      NumberMetaClass numberMetaClass0 = new NumberMetaClass();
      hashtable0.put("Connections could not be acquired from the underlying database!", numberMetaClass0);
      Hashtable<String, NumberMetaClass> hashtable1 = new Hashtable<String, NumberMetaClass>();
      // Undeclared exception!
      baseClass0.fromMap((Map<String, ?>) hashtable0, (BaseCollection) baseCollection0);
  }
}
