/*

 * Mon Apr 20 16:07:19 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.PropertyInterface;
import com.xpn.xwiki.objects.classes.BaseClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BaseClass baseClass0 = new BaseClass();
      String string0 = "defaultViewSheet";
      baseClass0.addPropertyForRemoval((PropertyInterface) null);
      String string1 = "actions";
      baseClass0.addBooleanField("", "defaultViewSheet", "actions");
      // Undeclared exception!
      baseClass0.addTextAreaField("", "actions", 0, (-1944), "actions", "jQ|FW");
  }
}
