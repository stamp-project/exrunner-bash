/*

 * Mon Apr 20 15:48:32 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.classes.TextAreaClass;
import com.xpn.xwiki.objects.meta.StaticListMetaClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StaticListMetaClass staticListMetaClass0 = new StaticListMetaClass();
      staticListMetaClass0.addStaticListField("Mc5[#{7HpWV,8C3bo", "Mc5[#{7HpWV,8C3bo", "Mc5[#{7HpWV,8C3bo");
      TextAreaClass.ContentType textAreaClass_ContentType0 = TextAreaClass.ContentType.VELOCITY_CODE;
      // Undeclared exception!
      staticListMetaClass0.addTextAreaField("Mc5[#{7HpWV,8C3bo", "Mc5[#{7HpWV,8C3bo", (-3933), (-3933), textAreaClass_ContentType0);
  }
}
