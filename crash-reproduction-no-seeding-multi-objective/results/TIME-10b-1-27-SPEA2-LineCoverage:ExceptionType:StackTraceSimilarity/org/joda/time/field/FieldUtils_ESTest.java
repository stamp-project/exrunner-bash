/*

 * Tue Apr 21 13:07:58 UTC 2020
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
      FieldUtils.safeAdd((-60L), 0L);
      FieldUtils.safeMultiplyToInt((-60L), (-60L));
      FieldUtils.verifyValueBounds("", 3600, 3600, 3600);
      Integer integer0 = new Integer(3600);
      FieldUtils.equals((Object) integer0, (Object) integer0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      int int0 = 2657;
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 2657, 2657, 0);
  }
}
