/*

 * Tue Apr 21 05:27:04 UTC 2020
 */

package com.xpn.xwiki.objects;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.BaseCollection;
import com.xpn.xwiki.objects.BaseProperty;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.xwiki.model.reference.ObjectReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseProperty_ESTest extends BaseProperty_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BaseProperty baseProperty0 = new BaseProperty();
      BaseCollection<ObjectReference> baseCollection0 = (BaseCollection<ObjectReference>) mock(BaseCollection.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(baseCollection0).toString();
      baseProperty0.setObject(baseCollection0);
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) baseProperty0;
      objectArray0[1] = (Object) baseProperty0;
      objectArray0[4] = (Object) baseCollection0;
      objectArray0[5] = (Object) baseCollection0;
      objectArray0[6] = objectArray0[5];
      objectArray0[7] = (Object) baseProperty0;
      int int0 = 0;
      baseProperty0.setValue(objectArray0[7]);
      baseProperty0.getValue();
      baseProperty0.toXMLString();
      BaseProperty baseProperty1 = baseProperty0.clone();
      baseProperty1.getCustomMappingValue();
      baseProperty0.isValueDirty();
      // Undeclared exception!
      baseProperty1.equals((Object) null);
  }
}
