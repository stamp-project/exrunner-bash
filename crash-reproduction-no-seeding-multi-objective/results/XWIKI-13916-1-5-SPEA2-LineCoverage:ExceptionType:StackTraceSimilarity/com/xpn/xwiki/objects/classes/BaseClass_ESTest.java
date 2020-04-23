/*

 * Mon Apr 20 15:48:59 UTC 2020
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
      baseClass0.addTextAreaField("u", "u", 7004, 7004, "u", "nameField");
      baseClass0.addDBTreeListField("", "", 827, true, false, "B*/)<8$U$bHAS");
      baseClass0.getPropertyList();
      baseClass0.addLevelsField("B*/)<8$U$bHAS", "");
      baseClass0.hasCustomMapping();
      baseClass0.addStaticListField("", "u", 827, true, true, "nameField", "ZthS@v*Y a", "/\"0r *B`<VUMR8sZB~P");
      baseClass0.toString();
      // Undeclared exception!
      baseClass0.addTextAreaField("", "^zdZhhZ", 7004, 827, "", "");
  }
}
