/*

 * Tue Apr 21 04:31:45 UTC 2020
 */

package com.xpn.xwiki.objects;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.BaseObject;
import com.xpn.xwiki.objects.BaseProperty;
import com.xpn.xwiki.objects.BaseStringProperty;
import com.xpn.xwiki.objects.LargeStringProperty;
import org.apache.struts.action.Action;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseProperty_ESTest extends BaseProperty_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BaseProperty baseProperty0 = new BaseProperty();
      LargeStringProperty largeStringProperty0 = new LargeStringProperty();
      BaseStringProperty baseStringProperty0 = largeStringProperty0.clone();
      baseStringProperty0.setValueDirty(false);
      BaseObject baseObject0 = new BaseObject();
      baseStringProperty0.setObject(baseObject0);
      boolean boolean0 = true;
      BaseStringProperty baseStringProperty1 = new BaseStringProperty();
      boolean boolean1 = false;
      baseStringProperty0.setValueDirty(false);
      BaseObject baseObject1 = new BaseObject();
      baseStringProperty1.setObject(baseObject0);
      Action action0 = new Action();
      action0.getServlet();
      // Undeclared exception!
      baseStringProperty0.equals((Object) null);
  }
}
