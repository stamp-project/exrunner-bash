/*

 * Tue Apr 21 13:01:03 UTC 2020
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.field.FieldUtils;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class FieldUtils_ESTest extends FieldUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 4224;
      FieldUtils.safeMultiply((-2358), 4224);
      FieldUtils.safeMultiply((-362L), 4301L);
      FieldUtils.safeNegate(4224);
      Object object0 = new Object();
      FieldUtils.equals(object0, object0);
      long long0 = 2590L;
      FieldUtils.safeMultiply((-1556962L), 2590L);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 4224, 604800, (-2147483647));
  }
}
