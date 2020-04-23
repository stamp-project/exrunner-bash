/*

 * Wed Apr 22 19:42:37 UTC 2020
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
import org.joda.time.chrono.CopticChronology;
import org.joda.time.field.DividedDateTimeField;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.OffsetDateTimeField;
import org.joda.time.field.RemainderDateTimeField;
import org.joda.time.field.TestOffsetDateTimeField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class FieldUtils_ESTest extends FieldUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FieldUtils.verifyValueBounds("BZp`6%,,v7SrlGn", Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      copticChronology0.withUTC();
      FieldUtils.safeMultiplyToInt(2650L, 2650L);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      TestOffsetDateTimeField.MockOffsetDateTimeField testOffsetDateTimeField_MockOffsetDateTimeField0 = new TestOffsetDateTimeField.MockOffsetDateTimeField();
      OffsetDateTimeField offsetDateTimeField0 = new OffsetDateTimeField(testOffsetDateTimeField_MockOffsetDateTimeField0, dateTimeFieldType0, Integer.MIN_VALUE);
      DividedDateTimeField dividedDateTimeField0 = mock(DividedDateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dividedDateTimeField0).getType();
      doReturn(offsetDateTimeField0).when(dividedDateTimeField0).getWrappedField();
      RemainderDateTimeField remainderDateTimeField0 = new RemainderDateTimeField(dividedDateTimeField0);
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.dayOfYear();
      RemainderDateTimeField remainderDateTimeField1 = new RemainderDateTimeField(remainderDateTimeField0, dateTimeFieldType1, 7022500);
      DateTimeFieldType dateTimeFieldType2 = DateTimeFieldType.yearOfCentury();
      DividedDateTimeField dividedDateTimeField1 = new DividedDateTimeField(remainderDateTimeField1, dateTimeFieldType2);
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) dividedDateTimeField1, 490, 490, (-3606));
  }
}
