/*

 * Mon Apr 20 15:51:29 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.objects.classes.BaseClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BaseClass baseClass0 = new BaseClass();
      baseClass0.addTemplateField("defaultViewSheet", "defaultViewSheet");
      String string0 = "T=>DAVsbe-kO7-{Qi+";
      baseClass0.setCustomClass("T=>DAVsbe-kO7-{Qi+");
      String string1 = null;
      baseClass0.addDateField((String) null, (String) null);
      baseClass0.getDefaultWeb();
      int int0 = 3321;
      baseClass0.addTextAreaField("", "", 7, 3321, "", "collection index mapping has wrong number of columns: ");
      XWikiContext xWikiContext0 = new XWikiContext();
      baseClass0.getCustomMappingPropertyList(xWikiContext0);
      baseClass0.getDisabledProperties();
      int int1 = (-1013);
      String string2 = "ePi/1koC";
      // Undeclared exception!
      baseClass0.addTextAreaField((String) null, "", (-340), (-1013), "ePi/1koC", "ePi/1koC");
  }
}
