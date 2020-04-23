/*

 * Tue Apr 21 04:26:39 UTC 2020
 */

package com.xpn.xwiki.objects;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.XWikiContext;
import com.xpn.xwiki.objects.LargeStringProperty;
import com.xpn.xwiki.objects.StringProperty;
import com.xpn.xwiki.objects.classes.PropertyClass;
import com.xpn.xwiki.objects.meta.PropertyMetaClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.infinispan.eviction.EvictionStrategy;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseStringProperty_ESTest extends BaseStringProperty_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LargeStringProperty largeStringProperty0 = new LargeStringProperty();
      PropertyMetaClass propertyMetaClass0 = new PropertyMetaClass();
      PropertyClass propertyClass0 = new PropertyClass("", "", propertyMetaClass0);
      propertyClass0.getClassType();
      propertyClass0.put("Property", largeStringProperty0);
      StringProperty stringProperty0 = new StringProperty();
      propertyClass0.getObject();
      XWikiContext xWikiContext0 = new XWikiContext();
      largeStringProperty0.getValue();
      StringProperty stringProperty1 = new StringProperty();
      propertyClass0.getObject();
      XWikiContext xWikiContext1 = new XWikiContext();
      largeStringProperty0.getValue();
      stringProperty0.toText();
      stringProperty0.toText();
      EvictionStrategy evictionStrategy0 = EvictionStrategy.LIRS;
      // Undeclared exception!
      largeStringProperty0.equals((Object) null);
  }
}
