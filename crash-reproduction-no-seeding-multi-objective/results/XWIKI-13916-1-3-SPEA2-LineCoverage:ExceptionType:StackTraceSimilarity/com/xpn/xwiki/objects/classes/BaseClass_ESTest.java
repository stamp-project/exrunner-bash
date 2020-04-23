/*

 * Mon Apr 20 15:46:42 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.objects.classes.BaseClass;
import com.xpn.xwiki.objects.classes.TextAreaClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XWikiContext xWikiContext0 = new XWikiContext();
      BaseClass baseClass0 = new BaseClass();
      baseClass0.getNameField();
      baseClass0.getNameField();
      baseClass0.addTextField("Class", "aK82R9'|", (-121));
      TextAreaClass.EditorType textAreaClass_EditorType0 = TextAreaClass.EditorType.TEXT;
      xWikiContext0.put("", (Object) null);
      baseClass0.getOwnerDocument();
      String string0 = "]4\\sjt";
      // Undeclared exception!
      baseClass0.addTextAreaField("Class", (String) null, 1977, (-280), (String) null, "q+1 Lg/]");
  }
}
