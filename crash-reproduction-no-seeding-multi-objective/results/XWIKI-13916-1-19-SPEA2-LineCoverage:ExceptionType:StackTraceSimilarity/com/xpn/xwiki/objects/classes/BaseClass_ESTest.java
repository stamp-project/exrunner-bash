/*

 * Mon Apr 20 16:06:48 UTC 2020
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
      baseClass0.getSortedIterator();
      String string0 = "$-yj:;{6PEocH";
      String string1 = "jSLWVu+ ,";
      baseClass0.addTextField("$-yj:;{6PEocH", "jSLWVu+ ,", (-2890));
      // Undeclared exception!
      baseClass0.addTextAreaField("$-yj:;{6PEocH", "$-yj:;{6PEocH", 0, 0, "$-yj:;{6PEocH", "$-yj:;{6PEocH");
  }
}
