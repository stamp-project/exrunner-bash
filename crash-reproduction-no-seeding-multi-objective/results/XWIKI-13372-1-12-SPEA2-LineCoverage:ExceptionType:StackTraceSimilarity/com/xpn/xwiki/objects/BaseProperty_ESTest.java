/*

 * Tue Apr 21 04:36:26 UTC 2020
 */

package com.xpn.xwiki.objects;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.doc.XWikiDocument;
import com.xpn.xwiki.objects.BaseProperty;
import com.xpn.xwiki.objects.meta.PropertyMetaClass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xwiki.model.reference.ObjectReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseProperty_ESTest extends BaseProperty_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      PropertyMetaClass propertyMetaClass0 = new PropertyMetaClass();
      BaseProperty<ObjectReference> baseProperty0 = new BaseProperty<ObjectReference>();
      baseProperty0.setObject(propertyMetaClass0);
      baseProperty0.setOwnerDocument((XWikiDocument) null);
      // Undeclared exception!
      baseProperty0.equals((Object) null);
  }
}
