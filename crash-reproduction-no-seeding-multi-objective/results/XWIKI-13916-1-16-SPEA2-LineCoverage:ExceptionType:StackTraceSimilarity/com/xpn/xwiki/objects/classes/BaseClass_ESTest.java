/*

 * Mon Apr 20 16:02:19 UTC 2020
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
      baseClass0.addTextAreaField(" does not support sequences", " does not support sequences", 0, 0, "defaultEditSheet", " does not support sequences");
      String string0 = ".b 4rUM1S7+GQSF[ ";
      baseClass0.addStaticListField("defaultEditSheet", ".b 4rUM1S7+GQSF[ ", "");
      baseClass0.getDateValue(".b 4rUM1S7+GQSF[ ");
      baseClass0.addTextAreaField("", "", 3402, 0, "", ",BJ$i;nihzK8mT");
      // Undeclared exception!
      baseClass0.addTextAreaField("defaultEditSheet", ",BJ$i;nihzK8mT", 3402, 0, ",BJ$i;nihzK8mT", "Hj8@*");
  }
}
