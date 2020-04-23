/*

 * Mon Apr 20 14:24:23 UTC 2020
 */

package com.xpn.xwiki.objects;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.BaseStringProperty;
import com.xpn.xwiki.objects.StringProperty;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseStringProperty_ESTest extends BaseStringProperty_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BaseStringProperty baseStringProperty0 = new BaseStringProperty();
      baseStringProperty0.getCustomMappingValue();
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) objectArray0;
      objectArray0[1] = (Object) "";
      objectArray0[2] = (Object) baseStringProperty0;
      objectArray0[3] = (Object) "lA3;.5-!M";
      StringProperty stringProperty0 = new StringProperty();
      stringProperty0.isValueDirty();
      stringProperty0.isValueDirty();
      BaseStringProperty baseStringProperty1 = new BaseStringProperty();
      baseStringProperty1.getCustomMappingValue();
      StringProperty stringProperty1 = new StringProperty();
      StringProperty stringProperty2 = new StringProperty();
      BaseStringProperty baseStringProperty2 = stringProperty0.clone();
      // Undeclared exception!
      stringProperty2.setValue(baseStringProperty2);
  }
}
