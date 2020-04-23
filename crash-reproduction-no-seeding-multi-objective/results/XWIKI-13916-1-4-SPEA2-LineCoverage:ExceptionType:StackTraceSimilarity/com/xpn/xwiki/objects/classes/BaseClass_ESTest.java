/*

 * Mon Apr 20 15:47:46 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.classes.BaseClass;
import com.xpn.xwiki.objects.classes.PropertyClass;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BaseClass baseClass0 = new BaseClass();
      List<PropertyClass> list0 = baseClass0.getEnabledProperties();
      baseClass0.getDateValue("f#");
      baseClass0.setFieldsToRemove(list0);
      baseClass0.addLevelsField(",=w%PG$", "f#", 1640531527);
      baseClass0.getFieldList();
      String string0 = "";
      // Undeclared exception!
      baseClass0.addTextAreaField(",=w%PG$", "", (-1073), 1640531527, "", (String) null);
  }
}
