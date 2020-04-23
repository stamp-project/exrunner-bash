/*

 * Wed Apr 22 19:43:40 UTC 2020
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
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.field.FieldUtils;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class FieldUtils_ESTest extends FieldUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FieldUtils.safeSubtract(0L, (-1604L));
      FieldUtils.safeToInt((-2348L));
      FieldUtils.safeMultiply((-2348), (-2348));
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      dateTimeFieldType0.getRangeDurationType();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(ethiopicChronology0, dateTimeZone0);
      Chronology chronology0 = zonedChronology0.withZone(dateTimeZone0);
      dateTimeFieldType0.getField(chronology0);
      int int0 = (-866);
      int int1 = 665;
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 5513104, (-866), 665);
  }
}
