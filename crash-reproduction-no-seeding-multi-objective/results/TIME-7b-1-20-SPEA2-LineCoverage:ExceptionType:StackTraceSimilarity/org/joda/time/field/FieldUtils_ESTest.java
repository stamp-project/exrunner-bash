/*

 * Wed Apr 22 19:47:56 UTC 2020
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
      int int0 = 244;
      FieldUtils.safeNegate(244);
      int int1 = 0;
      int int2 = (-1399);
      FieldUtils.safeMultiply(0, (-1399));
      Integer integer0 = new Integer(0);
      FieldUtils.equals((Object) integer0, (Object) integer0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      FieldUtils.safeAdd((long) 0, (-2215L));
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 64, (-244), 0);
  }
}
