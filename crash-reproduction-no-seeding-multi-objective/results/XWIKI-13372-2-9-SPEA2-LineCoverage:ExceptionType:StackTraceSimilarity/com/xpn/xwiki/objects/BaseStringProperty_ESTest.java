/*

 * Tue Apr 21 04:23:22 UTC 2020
 */

package com.xpn.xwiki.objects;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.BaseCollection;
import com.xpn.xwiki.objects.LargeStringProperty;
import org.apache.commons.collections.ExtendedProperties;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.model.reference.ObjectReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseStringProperty_ESTest extends BaseStringProperty_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LargeStringProperty largeStringProperty0 = new LargeStringProperty();
      BaseCollection<ObjectReference> baseCollection0 = (BaseCollection<ObjectReference>) mock(BaseCollection.class, new ViolatedAssumptionAnswer());
      doReturn((-1588L)).when(baseCollection0).getId();
      largeStringProperty0.setObject(baseCollection0);
      ExtendedProperties extendedProperties0 = new ExtendedProperties();
      extendedProperties0.put(largeStringProperty0, "?");
      extendedProperties0.getInteger("?", (Integer) null);
      // Undeclared exception!
      largeStringProperty0.equals((Object) null);
  }
}
