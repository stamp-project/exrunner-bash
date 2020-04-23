/*

 * Mon Apr 20 15:55:35 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.meta.PasswordMetaClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PasswordMetaClass passwordMetaClass0 = new PasswordMetaClass();
      passwordMetaClass0.getProperties();
      String string0 = "H5rD";
      String string1 = "DRO|-Q_DwL5.^-zT|";
      String string2 = "storageType";
      String string3 = "SGxc4qfpq";
      // Undeclared exception!
      passwordMetaClass0.addTextAreaField("storageType", "storageType", 9001, (-4280), "storageType", "SGxc4qfpq");
  }
}
