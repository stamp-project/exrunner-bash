/*

 * Mon Apr 20 16:20:00 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.DoubleProperty;
import com.xpn.xwiki.objects.classes.BaseClass;
import com.xpn.xwiki.objects.classes.TextAreaClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BaseClass baseClass0 = new BaseClass();
      String string0 = ";5[7d";
      baseClass0.addTextAreaField(";5[7d", ";5[7d", 0, 0);
      baseClass0.addPasswordField(";5[7d", ";5[7d", 0);
      DoubleProperty doubleProperty0 = new DoubleProperty();
      baseClass0.safeput(";5[7d", doubleProperty0);
      String string1 = "zh.op \\pC00oETsg(q";
      int int0 = 2475;
      TextAreaClass.ContentType textAreaClass_ContentType0 = TextAreaClass.ContentType.PURE_TEXT;
      // Undeclared exception!
      baseClass0.addTextAreaField(";5[7d", "zh.op pC00oETsg(q", 2475, 0, textAreaClass_ContentType0);
  }
}
