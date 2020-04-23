/*

 * Mon Apr 20 15:55:56 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.objects.BaseObject;
import com.xpn.xwiki.objects.classes.BaseClass;
import com.xpn.xwiki.objects.classes.TextAreaClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = null;
      XWikiContext xWikiContext0 = new XWikiContext();
      BaseObject baseObject0 = new BaseObject();
      BaseClass baseClass0 = new BaseClass();
      baseClass0.getDoubleValue("T");
      baseClass0.addTextField("T", "4FC4 7}^\"&S|", 0);
      baseClass0.clone();
      TextAreaClass.ContentType textAreaClass_ContentType0 = TextAreaClass.ContentType.WIKI_TEXT;
      // Undeclared exception!
      baseClass0.addTextAreaField("T", "connectionPoolDataSource -> ", 0, 0, textAreaClass_ContentType0);
  }
}
