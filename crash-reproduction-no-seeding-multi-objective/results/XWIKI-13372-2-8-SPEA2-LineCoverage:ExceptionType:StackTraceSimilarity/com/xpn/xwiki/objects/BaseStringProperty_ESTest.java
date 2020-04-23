/*

 * Tue Apr 21 04:19:18 UTC 2020
 */

package com.xpn.xwiki.objects;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.BaseCollection;
import com.xpn.xwiki.objects.BaseStringProperty;
import com.xpn.xwiki.objects.LargeStringProperty;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.securityfilter.realm.SimplePrincipal;
import org.xwiki.model.reference.ObjectPropertyReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseStringProperty_ESTest extends BaseStringProperty_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LargeStringProperty largeStringProperty0 = new LargeStringProperty();
      largeStringProperty0.toXMLString();
      largeStringProperty0.toText();
      BaseCollection<ObjectPropertyReference> baseCollection0 = (BaseCollection<ObjectPropertyReference>) mock(BaseCollection.class, new ViolatedAssumptionAnswer());
      largeStringProperty0.setObject(baseCollection0);
      largeStringProperty0.setValue("");
      BaseStringProperty baseStringProperty0 = largeStringProperty0.clone();
      baseStringProperty0.getDocumentReference();
      baseStringProperty0.clone();
      SimplePrincipal simplePrincipal0 = new SimplePrincipal("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n\n<></>\n");
      // Undeclared exception!
      largeStringProperty0.equals((Object) null);
  }
}
