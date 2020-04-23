/*

 * Tue Apr 21 04:32:40 UTC 2020
 */

package com.xpn.xwiki.objects;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.BaseStringProperty;
import com.xpn.xwiki.objects.LargeStringProperty;
import com.xpn.xwiki.objects.classes.PropertyClass;
import com.xpn.xwiki.objects.meta.PropertyMetaClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseStringProperty_ESTest extends BaseStringProperty_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BaseStringProperty baseStringProperty0 = new BaseStringProperty();
      PropertyMetaClass propertyMetaClass0 = new PropertyMetaClass();
      baseStringProperty0.setObject(propertyMetaClass0);
      propertyMetaClass0.clone();
      propertyMetaClass0.addTemplateField("_3qs,+{..p,EDQuE^", "_3qs,+{..p,EDQuE^");
      PropertyMetaClass propertyMetaClass1 = new PropertyMetaClass();
      propertyMetaClass0.clone();
      PropertyClass propertyClass0 = new PropertyClass();
      LargeStringProperty largeStringProperty0 = new LargeStringProperty();
      // Undeclared exception!
      baseStringProperty0.equals((Object) null);
  }
}
