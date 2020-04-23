/*

 * Mon Apr 20 14:51:14 UTC 2020
 */

package com.xpn.xwiki.objects;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.BaseStringProperty;
import java.util.HashSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.xwiki.model.reference.LocalDocumentReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseStringProperty_ESTest extends BaseStringProperty_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BaseStringProperty baseStringProperty0 = new BaseStringProperty();
      HashSet<String> hashSet0 = new HashSet<String>();
      String string0 = "&>!V<qJ";
      LocalDocumentReference localDocumentReference0 = new LocalDocumentReference(hashSet0, "&>!V<qJ");
      LocalDocumentReference localDocumentReference1 = new LocalDocumentReference(hashSet0, "&>!V<qJ");
      Object object0 = new Object();
      // Undeclared exception!
      baseStringProperty0.setValue(object0);
  }
}
