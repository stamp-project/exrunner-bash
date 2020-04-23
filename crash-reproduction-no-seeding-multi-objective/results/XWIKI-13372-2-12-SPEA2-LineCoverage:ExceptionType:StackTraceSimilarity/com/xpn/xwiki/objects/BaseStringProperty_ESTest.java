/*

 * Tue Apr 21 04:35:24 UTC 2020
 */

package com.xpn.xwiki.objects;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.doc.XWikiDocument;
import com.xpn.xwiki.objects.BaseStringProperty;
import com.xpn.xwiki.objects.classes.BaseClass;
import javax.swing.JLabel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.infinispan.atomic.impl.AtomicHashMap;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseStringProperty_ESTest extends BaseStringProperty_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BaseStringProperty baseStringProperty0 = new BaseStringProperty();
      XWikiDocument xWikiDocument0 = baseStringProperty0.ownerDocument;
      BaseClass baseClass0 = new BaseClass();
      AtomicHashMap<BaseStringProperty, JLabel> atomicHashMap0 = new AtomicHashMap<BaseStringProperty, JLabel>(true);
      XWikiDocument xWikiDocument1 = baseStringProperty0.ownerDocument;
      BaseClass baseClass1 = new BaseClass();
      AtomicHashMap<BaseStringProperty, JLabel> atomicHashMap1 = new AtomicHashMap<BaseStringProperty, JLabel>(true);
      baseClass0.setFields(atomicHashMap0);
      baseStringProperty0.setObject(baseClass1);
      // Undeclared exception!
      baseStringProperty0.equals((Object) null);
  }
}
