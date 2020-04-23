/*

 * Mon Apr 20 15:44:01 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.meta.LevelsMetaClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LevelsMetaClass levelsMetaClass0 = new LevelsMetaClass();
      levelsMetaClass0.addDateField("<>", "<>", "<>", (-1627));
      levelsMetaClass0.addPasswordField("<>", "<>", 221);
      levelsMetaClass0.getEnabledProperties();
      // Undeclared exception!
      levelsMetaClass0.addTextAreaField("<>", "", (-1627), 221, "ONc 3|?QQq=", "<>");
  }
}
