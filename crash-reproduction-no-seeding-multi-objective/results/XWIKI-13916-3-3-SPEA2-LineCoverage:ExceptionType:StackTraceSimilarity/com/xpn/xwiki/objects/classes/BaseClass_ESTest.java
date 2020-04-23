/*

 * Mon Apr 20 15:47:03 UTC 2020
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
      BaseClass baseClass0 = new BaseClass();
      baseClass0.merge(baseClass0);
      baseClass0.getPrettyName();
      baseClass0.addLevelsField("1z@zh73095pz y", "1z@zh73095pz y");
      baseClass0.getFieldList();
      baseClass0.setDefaultEditSheet("1z@zh73095pz y");
      XWikiContext xWikiContext0 = new XWikiContext();
      XWikiContext xWikiContext1 = xWikiContext0.clone();
      XWikiContext xWikiContext2 = xWikiContext1.clone();
      xWikiContext2.clone();
      baseClass0.addPasswordField("validati`honScript", "validati`honScript", 7005);
      baseClass0.addDBTreeListField("Iogon", "XWiki.XWikiPreferences", "GOST");
      baseClass0.setDefaultViewSheet("IXW%!");
      String string0 = "";
      TextAreaClass.ContentType textAreaClass_ContentType0 = TextAreaClass.ContentType.WIKI_TEXT;
      // Undeclared exception!
      baseClass0.addTextAreaField("validati`honScript", "?X:SMca", 7005, (-2022023797), textAreaClass_ContentType0);
  }
}
