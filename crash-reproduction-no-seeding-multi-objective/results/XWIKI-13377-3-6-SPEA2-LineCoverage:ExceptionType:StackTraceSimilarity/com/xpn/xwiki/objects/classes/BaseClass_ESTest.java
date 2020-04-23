/*

 * Mon Apr 20 14:38:08 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.objects.BaseCollection;
import com.xpn.xwiki.objects.classes.BaseClass;
import com.xpn.xwiki.objects.meta.DBListMetaClass;
import com.xpn.xwiki.objects.meta.DateMetaClass;
import java.util.Map;
import java.util.TreeMap;
import org.dom4j.tree.BaseElement;
import org.dom4j.util.NonLazyElement;
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
      DBListMetaClass dBListMetaClass0 = new DBListMetaClass();
      String string0 = "bhdGU";
      dBListMetaClass0.addDateField("bhdGU", "bhdGU", "bhdGU");
      dBListMetaClass0.addNumberField("picker", "picker", (-254), "");
      dBListMetaClass0.addLevelsField("C5@j{cnqS<v0q", "picker");
      dBListMetaClass0.toXML((BaseClass) dBListMetaClass0);
      Boolean boolean0 = new Boolean(true);
      DateMetaClass dateMetaClass0 = new DateMetaClass();
      TreeMap<String, BaseElement> treeMap0 = new TreeMap<String, BaseElement>();
      NonLazyElement nonLazyElement0 = new NonLazyElement("dateFormat");
      treeMap0.put("dateFormat", nonLazyElement0);
      // Undeclared exception!
      dateMetaClass0.fromMap((Map<String, ?>) treeMap0, (BaseCollection) dBListMetaClass0);
  }
}
