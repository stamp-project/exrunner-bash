/*

 * Mon Apr 20 15:09:16 UTC 2020
 */

package com.xpn.xwiki.objects;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.xpn.xwiki.objects.BaseStringProperty;
import java.time.LocalDate;
import java.time.temporal.TemporalQuery;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseStringProperty_ESTest extends BaseStringProperty_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BaseStringProperty baseStringProperty0 = new BaseStringProperty();
      LocalDate localDate0 = LocalDate.MAX;
      TemporalQuery<Integer> temporalQuery0 = (TemporalQuery<Integer>) mock(TemporalQuery.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(temporalQuery0).queryFrom(any(java.time.temporal.TemporalAccessor.class));
      localDate0.query(temporalQuery0);
      // Undeclared exception!
      baseStringProperty0.setValue(localDate0);
  }
}
