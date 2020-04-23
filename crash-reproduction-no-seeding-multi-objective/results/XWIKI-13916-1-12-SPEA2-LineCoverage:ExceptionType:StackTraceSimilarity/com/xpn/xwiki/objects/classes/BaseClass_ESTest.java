/*

 * Mon Apr 20 15:57:06 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.meta.GroupsMetaClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GroupsMetaClass groupsMetaClass0 = new GroupsMetaClass();
      groupsMetaClass0.getDefaultViewSheet();
      groupsMetaClass0.addDBListField("", "XWiki.XWikiPreferences", 0, false, "");
      groupsMetaClass0.getLongValue("XWiki.XWikiPreferences");
      String string0 = "";
      groupsMetaClass0.addDBTreeListField("XWiki.XWikiPreferences", "", 0, true, true, "");
      // Undeclared exception!
      groupsMetaClass0.addTextAreaField("", "", 0, 8827, "XWiki.XWikiPreferences", "XWiki.XWikiPreferences");
  }
}
