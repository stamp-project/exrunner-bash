/*

 * Tue Apr 21 05:28:56 UTC 2020
 */

package com.xpn.xwiki.objects;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.BaseCollection;
import com.xpn.xwiki.objects.LargeStringProperty;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.model.reference.ObjectReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseProperty_ESTest extends BaseProperty_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LargeStringProperty largeStringProperty0 = new LargeStringProperty();
      String string0 = "s%$hEgB%=&q+r";
      BaseCollection<ObjectReference> baseCollection0 = (BaseCollection<ObjectReference>) mock(BaseCollection.class, new ViolatedAssumptionAnswer());
      doReturn("s%$hEgB%=&q+r").when(baseCollection0).toString();
      doReturn((ObjectReference) null).when(baseCollection0).getReference();
      largeStringProperty0.setObject(baseCollection0);
      largeStringProperty0.isValueDirty();
      largeStringProperty0.getObject();
      largeStringProperty0.createReference();
      largeStringProperty0.getClassType();
      // Undeclared exception!
      largeStringProperty0.equals((Object) null);
  }
}
