/*

 * Mon Apr 20 16:08:24 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.meta.GroupsMetaClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GroupsMetaClass groupsMetaClass0 = new GroupsMetaClass();
      groupsMetaClass0.hasInternalCustomMapping();
      groupsMetaClass0.addEmailField("YIV,Wu)Rj3hAmF}Q#O", "YIV,Wu)Rj3hAmF}Q#O", 0);
      // Undeclared exception!
      groupsMetaClass0.addTemplateField("YIV,Wu)Rj3hAmF}Q#O", "YIV,Wu)Rj3hAmF}Q#O");
  }
}
