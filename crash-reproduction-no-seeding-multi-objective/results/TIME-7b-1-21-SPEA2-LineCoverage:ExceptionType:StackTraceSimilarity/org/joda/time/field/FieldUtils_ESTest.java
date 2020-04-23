/*

 * Wed Apr 22 19:48:13 UTC 2020
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.field.FieldUtils;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class FieldUtils_ESTest extends FieldUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = (-949);
      FieldUtils.safeNegate((-949));
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField((Chronology) null);
      DateTimeField dateTimeField1 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField1).getType();
      FieldUtils.verifyValueBounds(dateTimeField0, (-949), (-1781), 1);
      int int1 = 31;
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField1, (-949), 31, (-949));
  }
}
