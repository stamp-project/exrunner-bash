/*

 * Mon Apr 20 15:58:42 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.classes.BaseClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BaseClass baseClass0 = new BaseClass();
      baseClass0.getEnabledProperties();
      baseClass0.addStaticListField("</unknown>", "removed", 2, false, (String) null, (String) null, "</unknown>");
      baseClass0.setDirty(false);
      baseClass0.addTextAreaField("</>", "org.dom4j.DocumentFactory", 78, 349, "<@]QrIXR%%", "</unknown>");
      baseClass0.addNumberField("org.dom4j.DocumentFactory", (String) null, 2, (String) null);
      baseClass0.hasInternalCustomMapping();
      // Undeclared exception!
      baseClass0.addTextAreaField("org.dom4j.DocumentFactory", (String) null, 349, 1447, "defaultEditSheet", (String) null);
  }
}
