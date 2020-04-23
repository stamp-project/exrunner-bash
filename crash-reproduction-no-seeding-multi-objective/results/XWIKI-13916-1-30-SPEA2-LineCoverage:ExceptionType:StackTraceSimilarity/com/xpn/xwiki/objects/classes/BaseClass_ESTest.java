/*

 * Mon Apr 20 16:20:03 UTC 2020
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
      baseClass0.addGroupsField("v-MLe[#Mp{@-&B", "v-MLe[#Mp{@-&B");
      baseClass0.hasCustomMapping();
      baseClass0.addDBTreeListField("Passivating %s", "Passivating %s", 1572, true, "v-MLe[#Mp{@-&B");
      String string0 = null;
      // Undeclared exception!
      baseClass0.addTextAreaField("Passivating %s", "v-MLe[#Mp{@-&B", 1611, 1611, "v-MLe[#Mp{@-&B", (String) null);
  }
}
