/*

 * Mon Apr 20 15:53:26 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.classes.BaseClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xwiki.model.reference.EntityReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BaseClass baseClass0 = new BaseClass();
      String string0 = null;
      baseClass0.addGroupsField((String) null, (String) null);
      baseClass0.setCustomClass((String) null);
      String string1 = "insert into ";
      baseClass0.addUsersField((String) null, "insert into ", 0);
      baseClass0.setXClassReference((EntityReference) null);
      baseClass0.getDefaultViewSheet();
      baseClass0.getFloatValue("");
      String string2 = "x%W+?#0;;<EGQ9pn1";
      // Undeclared exception!
      baseClass0.addTextAreaField((String) null, "", 0, 0, "", "x%W+?#0;;<EGQ9pn1");
  }
}
