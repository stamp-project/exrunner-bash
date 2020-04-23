/*

 * Tue Apr 21 13:00:39 UTC 2020
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
      FieldUtils.safeSubtract((-24L), 495L);
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      int int0 = 0;
      FieldUtils.verifyValueBounds(dateTimeField0, 0, 0, 1248);
      FieldUtils.safeSubtract(218L, 0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      DateTimeField dateTimeField1 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField1).getType();
      int int1 = 0;
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField1, 0, 1248, 0);
  }
}
