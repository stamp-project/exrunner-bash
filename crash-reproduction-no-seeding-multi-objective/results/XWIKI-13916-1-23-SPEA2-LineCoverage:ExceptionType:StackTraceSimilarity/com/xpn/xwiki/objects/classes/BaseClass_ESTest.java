/*

 * Mon Apr 20 16:11:10 UTC 2020
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
      BaseClass baseClass1 = baseClass0.clone();
      baseClass1.addStaticListField("Hb?G=Xe|q", "Hb?G=Xe|q", "Hb?G=Xe|q");
      // Undeclared exception!
      baseClass1.addTextAreaField("Hb?G=Xe|q", "", 237, 237, "q", "RFS1P");
  }
}
