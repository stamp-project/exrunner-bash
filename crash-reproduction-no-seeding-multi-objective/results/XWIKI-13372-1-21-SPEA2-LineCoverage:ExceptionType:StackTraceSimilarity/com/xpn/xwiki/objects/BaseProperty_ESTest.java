/*

 * Tue Apr 21 05:04:56 UTC 2020
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
import org.securityfilter.filter.SecurityFilter;
import org.xwiki.model.reference.ObjectReference;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseProperty_ESTest extends BaseProperty_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BaseProperty baseProperty0 = new BaseProperty();
      SecurityFilter securityFilter0 = new SecurityFilter();
      baseProperty0.equals(securityFilter0);
      BaseCollection<ObjectReference> baseCollection0 = (BaseCollection<ObjectReference>) mock(BaseCollection.class, new ViolatedAssumptionAnswer());
      baseProperty0.setObject(baseCollection0);
      Object object0 = new Object();
      baseProperty0.getCustomMappingValue();
      // Undeclared exception!
      baseProperty0.equals((Object) null);
  }
}
