/*

 * Mon Apr 20 16:10:40 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
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
      baseClass0.getDisabledProperties();
      String string0 = "";
      int int0 = 321;
      String string1 = "\" failed";
      baseClass0.addNumberField("", "", 321, "\" failed");
      baseClass0.getCustomClass();
      String string2 = null;
      int int1 = (-461);
      String string3 = "";
      baseClass0.hasInternalCustomMapping();
      int int2 = 141;
      TextAreaClass.ContentType textAreaClass_ContentType0 = TextAreaClass.ContentType.WIKI_TEXT;
      // Undeclared exception!
      baseClass0.addTextAreaField("", "", 321, 141, textAreaClass_ContentType0);
  }
}
