/*

 * Mon Apr 20 15:49:59 UTC 2020
 */

package com.xpn.xwiki.objects.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.objects.PropertyInterface;
import com.xpn.xwiki.objects.classes.BaseClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseClass_ESTest extends BaseClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BaseClass baseClass0 = new BaseClass();
      baseClass0.addStaticListField("", "", "");
      baseClass0.getXClassReference();
      baseClass0.addField("", (PropertyInterface) null);
      baseClass0.hasExternalCustomMapping();
      baseClass0.addDBListField("", "5~Yaneo/uu3k", (-978), true, true, "");
      baseClass0.setDefaultEditSheet("");
      baseClass0.getValidationScript();
      BaseClass baseClass1 = baseClass0.clone();
      XWikiContext xWikiContext0 = new XWikiContext();
      XWikiContext xWikiContext1 = xWikiContext0.clone();
      XWikiContext xWikiContext2 = xWikiContext1.clone();
      baseClass0.getCustomMappingPropertyList(xWikiContext2);
      baseClass1.addUsersField("5~Yaneo/uu3k", "r2Y3b#N", 80, true);
      baseClass1.addDateField("h(", ":/^~,C@AacNY!", "");
      baseClass1.getStringValue("*tkXP%o3<Rr[e[");
      // Undeclared exception!
      baseClass1.addTextAreaField("", ":/^~,C@AacNY!", 80, 0, "", "`,X]{RW&(!Ey89q");
  }
}
